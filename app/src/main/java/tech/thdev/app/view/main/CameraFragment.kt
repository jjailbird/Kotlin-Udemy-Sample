package tech.thdev.app.view.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_etc.*
import tech.thdev.app.R

/**
 * Created by record-tae on 10/21/17.
 */
class CameraFragment : Fragment() {

    companion object {
        val KEY_TITLE = "key-title"
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater?.inflate(R.layout.fragment_etc, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        message.setText(arguments?.getInt(KEY_TITLE) ?: 0)
    }
}