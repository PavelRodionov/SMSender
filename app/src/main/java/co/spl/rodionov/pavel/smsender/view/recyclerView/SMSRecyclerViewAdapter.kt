package co.spl.rodionov.pavel.smsender.view.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import co.spl.rodionov.pavel.smsender.R
import co.spl.rodionov.pavel.smsender.model.SMSListModel
import co.spl.rodionov.pavel.smsender.model.SMSModel

/**
 * Created by Pavel Rodionov on 08.07.2019.
 */
class SMSRecyclerViewAdapter(var smsListModel: SMSListModel): RecyclerView.Adapter<SMSViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SMSViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_sms_recycler_layout, parent, false)
        return SMSViewHolder(view)
    }

    override fun getItemCount(): Int = smsListModel.size()

    override fun onBindViewHolder(holder: SMSViewHolder, position: Int) {
        holder.setup(smsListModel.smsModel(position))
    }

    internal fun update(smsListModel: SMSListModel) {
        this.smsListModel = smsListModel
        notifyDataSetChanged()
    }

}