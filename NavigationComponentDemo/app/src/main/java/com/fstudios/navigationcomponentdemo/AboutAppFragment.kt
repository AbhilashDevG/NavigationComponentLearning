package com.fstudios.navigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fstudios.navigationcomponentdemo.databinding.FragmentAboutAppBinding
class AboutAppFragment : Fragment(R.layout.fragment_about_app) {
    private lateinit var fragmentAboutAppBinding: FragmentAboutAppBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentAboutAppBinding = FragmentAboutAppBinding.inflate(inflater, container, false)
        return fragmentAboutAppBinding.root
    }
}