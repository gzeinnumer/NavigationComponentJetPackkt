package com.gzeinnumer.navigationcomponentjetpackkt


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_photo.*

/**
 * A simple [Fragment] subclass.
 */
class PhotoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photo, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_home.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.next_action_to_home)
        }

        arguments?.let{
            val safeArgs =PhotoFragmentArgs.fromBundle(it)
            textview_num.text = "Number Of photo ${safeArgs.numOfPhoto}"
        }
    }


}
