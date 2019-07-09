package co.spl.rodionov.pavel.smsender.view.recyclerView

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import co.spl.rodionov.pavel.smsender.model.SMSModel
import kotlinx.android.synthetic.main.item_sms_recycler_layout.view.*

/**
 * Created by Pavel Rodionov on 08.07.2019.
 */
class SMSViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    internal fun setup(smsModel: SMSModel) {
        itemView.smsText.text = smsModel.body
    }

}