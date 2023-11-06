package com.fstudios.navigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            val action = ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashFragment(receiverName, "0.00")
            findNavController().navigate(action)
        }
    }
}