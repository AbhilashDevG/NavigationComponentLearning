package com.fstudios.navigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fstudios.navigationcomponentdemo.databinding.FragmentSettingsBinding
import com.fstudios.navigationcomponentdemo.model.SampleData

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private lateinit var fragmentSettingsBinding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentSettingsBinding = FragmentSettingsBinding.inflate(inflater, container, false)
        return fragmentSettingsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentSettingsBinding.etDefaultAmount.setText(SampleData.defaultAmount.value.toString())

        fragmentSettingsBinding.btnSaveDefaultAmount.setOnClickListener {
            val defaultAmount =  fragmentSettingsBinding.etDefaultAmount.text.toString().toLong()
            SampleData.defaultAmount.value = defaultAmount
        }

    }

}