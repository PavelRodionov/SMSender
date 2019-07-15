package co.spl.rodionov.pavel.smsender.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import co.spl.rodionov.pavel.smsender.R
import co.spl.rodionov.pavel.smsender.model.SMSListModel
import co.spl.rodionov.pavel.smsender.view_model.SMSViewModel
import kotlinx.android.synthetic.main.fragment_main_layout.*

/**
 * Created by Pavel Rodionov on 08.07.2019.
 */
class MainFragment: Fragment() {

    lateinit var smsViewModel: SMSViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        smsViewModel = ViewModelProviders.of(this).get(SMSViewModel::class.java)
        smsViewModel.bind(::render)
    }

    fun render(smsListModel: SMSListModel) {
        smsList.update(smsListModel)
    }

}