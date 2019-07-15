package co.spl.rodionov.pavel.smsender.view_model

import androidx.lifecycle.ViewModel
import co.spl.rodionov.pavel.smsender.model.SMSListModel

class SMSViewModel: ViewModel() {

    fun bind(body: (SMSListModel) -> Unit) {
        body(SMSListModel())
    }

}