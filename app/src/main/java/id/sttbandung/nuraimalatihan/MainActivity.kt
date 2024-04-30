package id.sttbandung.nuraimalatihan

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showText(view: View?) {
        val editText = findViewById(R.id.editText_main) as EditText
        if (editText != null) {
            val showString = editText.getText().toString()
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickShowAlert(view: View) {
        val myAlertBuilder = AlertDialog.Builder(this@MainActivity)
        myAlertBuilder.setTitle(R.string.alert_title)
        myAlertBuilder.setMessage(R.string.alert_message)
        myAlertBuilder.setPositiveButton(R.string.ok) {
                                                                 dialog, which ->
            Toast.makeText(applicationContext, R.string.cancel, Toast.LENGTH_SHORT).show() }
        myAlertBuilder.show()
    }
}
