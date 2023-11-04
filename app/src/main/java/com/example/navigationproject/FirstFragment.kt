package com.example.navigationproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationproject.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {


    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        // Handle clicks on button1
        binding.button1.setOnClickListener {
            val imageResourceId = R.drawable.android_image_1 // Replace with your image resource
            val imageTitle = "Image 1"
            navigateToSecondFragment(imageResourceId, imageTitle)
        }

        // Handle clicks on button2
        binding.button2.setOnClickListener {
            val imageResourceId = R.drawable.android_image_2 // Replace with your image resource
            val imageTitle = "Image 2"
            navigateToSecondFragment(imageResourceId, imageTitle)
        }

        // Handle clicks on button3
        binding.button3.setOnClickListener {
            val imageResourceId = R.drawable.android_image_3 // Replace with your image resource
            val imageTitle = "Image 3"
            navigateToSecondFragment(imageResourceId, imageTitle)
        }

        return binding.root
    }

    private fun navigateToSecondFragment(imageResourceId: Int, imageTitle: String) {
        val action = FirstFragmentDirections.mainToSecond()
        findNavController().navigate(action)
    }
}





