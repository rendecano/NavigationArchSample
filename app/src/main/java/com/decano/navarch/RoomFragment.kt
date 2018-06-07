package com.decano.navarch

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_room.*
import kotlin.LazyThreadSafetyMode.NONE

class RoomFragment : Fragment() {

    private val title by lazy(NONE) { arguments?.getString("title") ?: "" }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_room, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        homeFragmentLabel.text = title
        Toast.makeText(activity, "RoomFragment", Toast.LENGTH_SHORT).show()
    }
}
