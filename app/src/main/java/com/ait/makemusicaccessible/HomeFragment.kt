package com.ait.makemusicaccessible

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Mock data
        val tracks = listOf("Track 1", "Track 2", "Track 3")

        // Setup RecyclerView or ListView here

        return view
    }
}