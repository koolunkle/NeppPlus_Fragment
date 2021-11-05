package com.neppplus.fragment_20211105.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragment_20211105.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate( R.layout.fragment_first, container, false )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnLog.setOnClickListener {
            Log.d("첫프래그먼트", "테스트로그")
        }

        btnToast.setOnClickListener {
            Toast.makeText(requireContext(), "프래그먼트 토스트", Toast.LENGTH_SHORT).show()
        }

    }

}