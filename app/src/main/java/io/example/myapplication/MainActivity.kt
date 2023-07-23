package io.example.cameraapp

import io.example.cameraapp.CameraXActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openCameraButton = findViewById<View>(R.id.btnOpenCamera)
        openCameraButton.setOnClickListener {
            val intent = Intent(this, MyCameraActivity::class.java)
            startActivity(intent)
        }

        val openCameraXButton = findViewById<View>(R.id.btnCameraX)
        openCameraXButton.setOnClickListener {
            val intent = Intent(this, CameraXActivity::class.java)
            startActivity(intent)
        }
    }
}
