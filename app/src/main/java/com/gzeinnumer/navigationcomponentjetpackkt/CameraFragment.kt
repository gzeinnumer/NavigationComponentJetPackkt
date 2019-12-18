package com.gzeinnumer.navigationcomponentjetpackkt


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_camera.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class CameraFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_photos.setOnClickListener {
            val random = Random()

            //build to use this
            val nextAction = CameraFragmentDirections.nextActionToPhoto()
            nextAction.numOfPhoto = random.nextInt(100)

            //bsa lansung panggil id pada navigation untuk menuju fragment setting
//            Navigation.findNavController(it).navigate(R.id.detination_setting)
            Navigation.findNavController(it).navigate(nextAction)
        }
    }


}
