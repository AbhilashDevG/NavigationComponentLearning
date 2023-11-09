package com.fstudios.navigationcomponentdemo

import android.Manifest
import android.app.PendingIntent
import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fstudios.navigationcomponentdemo.databinding.FragmentChooseReceiverBinding

class ChooseReceiverFragment : Fragment(R.layout.fragment_choose_receiver) {
    private lateinit var chooseReceiverBinding: FragmentChooseReceiverBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        chooseReceiverBinding = FragmentChooseReceiverBinding.inflate(inflater, container, false)
        return chooseReceiverBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chooseReceiverBinding.btnNext.setOnClickListener {
            val receiverName = chooseReceiverBinding.etReceiverName.text.toString()

            val pendingIntent = findNavController()
                .createDeepLink()
                .setGraph(R.navigation.main_nav_graph)
                .setDestination(R.id.sendCashFragment)
                .setArguments(SendCashFragmentArgs(receiverName,"").toBundle())
                .createPendingIntent()

            showNotification(pendingIntent,receiverName)

            val action = ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashFragment(receiverName, "")
            findNavController().navigate(action)
        }

        chooseReceiverBinding.btnCancel.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun showNotification(pendingIntent: PendingIntent, receiverName: String) {
        val notification = NotificationCompat.Builder(requireContext(), CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_notifications)
            .setContentTitle("Complete Transaction")
            .setContentText("Send money to $receiverName")
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()

        if (ActivityCompat.checkSelfPermission(
                context as Context,
                Manifest.permission.POST_NOTIFICATIONS
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        NotificationManagerCompat.from(requireContext()).notify(1002,notification)
    }
}