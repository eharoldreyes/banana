package com.eharoldreyes.banana

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eharoldreyes.banana.data.car.Car
import com.eharoldreyes.banana.data.dagger.DaggerCarComponent
import com.eharoldreyes.banana.data.dagger.DieselEngineModule
import javax.inject.Inject

class CarActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)

        var application  = application as BananaApplication

        application.getCarComponent()
            .inject(this)

        car1.drive()
        car2.drive()

    }
}
