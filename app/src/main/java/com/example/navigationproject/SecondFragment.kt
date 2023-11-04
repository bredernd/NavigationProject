package com.example.navigationproject

import android.os.Bundle
import android.widget.ImageView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationproject.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        val imageResourceId = args.imageResourceId
        val imageTitle = args.imageTitle

        // Use View Binding to set the image resource
        binding.fragTwoImage.setImageResource(imageResourceId)

        // Set the image title using View Binding
        binding.fragTwoTitle.text = imageTitle

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}




