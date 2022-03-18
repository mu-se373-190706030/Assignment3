package xyz.scoca.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import xyz.scoca.assignment3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var numberValue = 0 //initial value of number

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            ActivityMainBinding.inflate(layoutInflater) // initialize binding object to interact with views.
        setContentView(binding.root)

        binding.ibShowMessage.setOnClickListener {  //when ImageButton Clicked, show Snackbar message.
            showMessage()
        }
        binding.btnIncrease.setOnClickListener {  //when button clicked, increase number.
            increase()
            binding.btnIncrease.text = getString(R.string.btn_clicked)
        }
    }

    private fun increase() {
        ++numberValue
        binding.tvNumber.text = numberValue.toString()
    }

    private fun showMessage() {
        Snackbar.make(binding.root, "Image Button Clicked.", Snackbar.LENGTH_SHORT).show()
    }
}