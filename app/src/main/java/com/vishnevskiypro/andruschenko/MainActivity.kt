package com.vishnevskiypro.andruschenko

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide
import com.vishnevskiypro.andruschenko.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private val listOnlineImages: List<String> = listOf(
        "https://mir-s3-cdn-cf.behance.net/project_modules/disp/ea7a3c32163929.567197ac70bda.png",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTc69RDFfMriqDCCmLHcpIvM9HoUlMJM8TzrenLiisKRXrVTJxBd8YNWSpC9h1fCSNxzPg&usqp=CAU",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkFD7rVDIsj77R6CBhfwmiidoHUQY76Ze4ShORloVE-_ECfbYnDCVri9odpInT7eHXyHw&usqp=CAU",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTze-2AbWgVO2gec7MY8iqNNg8wq-EQHAfX_X8gb7TR-znW5qTS0cWvHQl8BpRH3Up0Sic&usqp=CAU",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpKhAad0x694NNPVBMBmHINWhnivu_SsqvKp96BZ_QBc7TjjNXxqc2FIjTwLO6WX4w5LQ&usqp=CAU",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFTxv9syQ-OwvJTazeYMvyo4DMYpSxj_Ow8ljpI4VmKNmr5tigXtJWAx0ZHVec91hlKpc&usqp=CAU"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.helloWorldTextView.setTextColor(Color.RED)



        binding.btn.setOnClickListener {
            Glide.with(this)
                .load(listOnlineImages[binding.editTextField.text.toString().toInt()])
                .into(binding.testImageView)

        }


    }

}