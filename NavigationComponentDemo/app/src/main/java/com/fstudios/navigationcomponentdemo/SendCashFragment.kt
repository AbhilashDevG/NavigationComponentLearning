package com.fstudios.navigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
        val amount = args.amount

        sendCashBinding.tvReceiver.text = "Send cash to $receiverName"
        sendCashBinding.etAmount.setText(amount)

    }

}