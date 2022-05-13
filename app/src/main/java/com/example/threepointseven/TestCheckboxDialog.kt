package com.example.threepointseven

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager

class TestCheckboxDialog() : DialogFragment() {
    val langs = arrayOf("Луна и звезды ночью", "Солнце днем")
    val checked= booleanArrayOf(false, false)
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            AlertDialog.Builder(it)
                .setMultiChoiceItems(langs, checked){
                        _, which, isChecked ->
                    checked[which] = isChecked
                }
                .setPositiveButton("Ok") { _, _ ->
                    TestTimePickerDialog(checked.get(0), checked.get(1)).show(
                        parentFragmentManager,"tag")
                }.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}
