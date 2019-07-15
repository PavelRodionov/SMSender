package co.spl.rodionov.pavel.smsender.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import co.spl.rodionov.pavel.smsender.R
import co.spl.rodionov.pavel.smsender.model.SMSModel
import kotlinx.android.synthetic.main.fragment_main_layout.view.*

/**
 * Created by Pavel Rodionov on 08.07.2019.
 */
class MainFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_layout, container, false)
    }

}