package com.fstudios.navigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.fstudios.navigationcomponentdemo.databinding.FragmentSendCashBinding

class SendCashFragment : Fragment(R.layout.fragment_send_cash){

    private val args : SendCashFragmentArgs by navArgs()
    private lateinit var sendCashBinding: FragmentSendCashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        sendCashBinding = FragmentSendCashBinding.inflate(inflater, container, false)
        return sendCashBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val receiverName = args.receiverName

        sendCashBinding.tvReceiver.text = "Send cash to $receiverName"
        sendCashBinding.btnSend.setOnClickListener{
            if(sendCashBinding.etAmount.text.toString().isEmpty()) {
                Toast.makeText(requireContext(), "Enter some amount", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val amount = sendCashBinding.etAmount.text.toString().toLong()
            val action = SendCashFragmentDirections
                .actionSendCashFragmentToConfirmDialogFragment(receiverName, amount)
            findNavController().navigate(action)
        }

    }

}