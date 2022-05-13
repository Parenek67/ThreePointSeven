package com.example.threepointseven

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import java.util.*

class TestTimePickerDialog(val moon: Boolean, val sun: Boolean): DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val c = Calendar.getInstance();
        val curHour = c.get(Calendar.HOUR_OF_DAY);
        val curMinute = c.get(Calendar.MINUTE);
        return TimePickerDialog(activity, {
                _, hour, minute ->
            val frag = parentFragmentManager.findFragmentById(R.id.fragment1) as TestFragment
            frag.setState(hour, minute, sun, moon)
        }, curHour, curMinute, false)
    }
}