package co.spl.rodionov.pavel.smsender.view.recyclerView

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.spl.rodionov.pavel.smsender.model.SMSListModel
import co.spl.rodionov.pavel.smsender.model.SMSModel

/**
 * Created by Pavel Rodionov on 08.07.2019.
 */
class SMSRecyclerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?= null,
    defStyleAttr: Int=0): RecyclerView(context, attrs, defStyleAttr) {

    init {
        layoutManager = LinearLayoutManager(context, VERTICAL, false)
        adapter = SMSRecyclerViewAdapter(SMSListModel())
    }

    fun update(smsListModel: SMSListModel) {
        (adapter as SMSRecyclerViewAdapter).update(smsListModel)
    }
}