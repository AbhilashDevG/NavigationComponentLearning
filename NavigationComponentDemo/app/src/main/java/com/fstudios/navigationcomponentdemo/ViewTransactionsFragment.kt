package com.fstudios.navigationcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fstudios.navigationcomponentdemo.databinding.FragmentViewTransactionsBinding

class ViewTransactionsFragment : Fragment(R.layout.fragment_view_transactions) {
    private lateinit var viewTransactionsBinding: FragmentViewTransactionsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewTransactionsBinding = FragmentViewTransactionsBinding.inflate(inflater, container, false)
        return viewTransactionsBinding.root
    }
}