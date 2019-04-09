package com.eharoldreyes.banana.data.dagger

import com.eharoldreyes.banana.CarActivity
import com.eharoldreyes.banana.data.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(carActivity: CarActivity)

    @Component.Builder
    interface Builder {

        fun build(): CarComponent

        @BindsInstance
        fun horsePower(@Named("hp") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("cc") engineCapacity: Int): Builder

    }


}