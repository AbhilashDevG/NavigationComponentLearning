package com.fstudios.navigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fstudios.navigationcomponentdemo.databinding.FragmentViewBalanceBinding

class ViewBalanceFragment : Fragment(R.layout.fragment_view_balance) {
    private lateinit var viewBalanceBinding: FragmentViewBalanceBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBalanceBinding = FragmentViewBalanceBinding.inflate(inflater, container, false)
        return viewBalanceBinding.root
    }
}