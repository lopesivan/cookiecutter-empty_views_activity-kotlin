package {{ cookiecutter.package_name }}

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class {{ cookiecutter.main_activity }} : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}