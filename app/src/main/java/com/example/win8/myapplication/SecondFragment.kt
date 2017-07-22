package com.example.win8.myapplication
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class SecondFragment:Fragment() {
    public override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                                     savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_second2, container, false)

        Toast.makeText(context, "$getUsername $getPassword", Toast.LENGTH_LONG).show()
        return view
    }

     val getUsername get() = arguments.getString(EXTRA_USERNAME)
     val getPassword get() = arguments.getString(EXTRA_PASSWORD)

     companion object {
         val EXTRA_USERNAME = "EXTRA_USERNAME"
         val EXTRA_PASSWORD = "EXTRA_PASSWORD"

        fun newInstance(username : String, password : String ) : SecondFragment {
            val bundle = Bundle()
            val fragment = SecondFragment()
            fragment.arguments = bundle

            bundle.putString(EXTRA_USERNAME, username)
            bundle.putString(EXTRA_PASSWORD, password)

            fragment.arguments = bundle
            return fragment
        }
    }

}
