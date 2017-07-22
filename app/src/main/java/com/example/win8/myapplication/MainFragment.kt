package com.example.win8.myapplication


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


/**
   * A simple [Fragment] subclass.
  */
 class MainFragment:Fragment() {
    lateinit var editUsername : EditText
    lateinit var editPassword : EditText
    lateinit var btnSubmit: Button

public override fun onCreateView(inflater:LayoutInflater?, container:ViewGroup?,
savedInstanceState:Bundle?):View? {
    val view = inflater!!.inflate(R.layout.fragment_main2, container, false)

    editUsername = view.findViewById(R.id.editUsername) as EditText
    editPassword = view.findViewById(R.id.editPassword) as EditText
    btnSubmit = view.findViewById(R.id.btnSubmit) as Button

    btnSubmit.setOnClickListener {
        var username = editUsername.text.toString()
        var password = editPassword.text.toString()

        getMainActivity().changeFragment( fragment = SecondFragment.newInstance(username,password))
    }
    return view
}



    fun getMainActivity () : MainActivity {
        return activity as MainActivity
    }
    companion object {
        fun newInstance() : MainFragment {
            val bundle = Bundle()
            val fragment = MainFragment()
            fragment.arguments = bundle
            return fragment
        }
    }


}// Required empty public constructor
