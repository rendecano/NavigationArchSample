package com.decano.navarch

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_contact_support.*
import kotlin.LazyThreadSafetyMode.NONE

class ContactSupportFragment : Fragment() {

    private val title by lazy(NONE) { arguments?.getString("title") ?: "" }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_contact_support, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        notificationsFragmentLabel.text = title
        Toast.makeText(activity, "ContactSupportFragment", Toast.LENGTH_SHORT).show()
    }
}