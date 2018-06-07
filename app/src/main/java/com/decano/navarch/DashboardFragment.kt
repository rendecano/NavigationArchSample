package com.decano.navarch

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlin.LazyThreadSafetyMode.NONE

class DashboardFragment : Fragment() {

    private val title by lazy(NONE) { arguments?.getString("title") ?: "" }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dashboardFragmentLabel.text = title
        Toast.makeText(activity, "DashboardFragment", Toast.LENGTH_SHORT).show()
    }
}
