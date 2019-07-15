package co.spl.rodionov.pavel.smsender.model

class SMSListModel {
    private val smsList = arrayListOf<SMSModel>()

    fun size() = smsList.size

    fun smsModel(position: Int) = smsList[position]
}