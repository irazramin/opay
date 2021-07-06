package com.example.opay.ui.ui.onboarding.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.opay.R
import kotlinx.android.synthetic.main.fragment_second_screen.view.*


class SecondScreenFragment : Fragment() {
    private lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_second_screen, container, false)

        val vp = activity?.findViewById<ViewPager2>(R.id.onBoardingViewPager)

        //this listener work for inside viewPaper i have add a button
        // 'vp?.currentItem'  work for own page button
        mView.secondScreenNext.setOnClickListener {
            vp?.currentItem = 2
        }

        mView.secondScreenSkip.setOnClickListener {
            findNavController().navigate(R.id.signInFragment)
        }

        //in this page, no need to write code(if you customize anything from your side
        //then write code here)

        return mView
    }
}