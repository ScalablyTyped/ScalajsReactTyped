package typingsJapgolly.reactNativeSensorManager.mod

import typingsJapgolly.reactNative.mod.EmitterSubscription
import typingsJapgolly.reactNativeSensorManager.anon.Azimuth
import typingsJapgolly.reactNativeSensorManager.anon.IsNear
import typingsJapgolly.reactNativeSensorManager.anon.Light
import typingsJapgolly.reactNativeSensorManager.anon.Steps
import typingsJapgolly.reactNativeSensorManager.anon.Temp
import typingsJapgolly.reactNativeSensorManager.anon.X
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Accelerometer
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Gyroscope
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.LightSensor
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Magnetometer
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Orientation
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Proximity
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.StepCounter
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Thermometer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object reactNativeAugmentingMod {
  
  @js.native
  trait DeviceEventEmitterStatic extends StObject {
    
    def addListener(event: Accelerometer | Gyroscope | Magnetometer, callback: js.Function1[/* data */ X, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_LightSensor(event: LightSensor, callback: js.Function1[/* data */ Light, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_Orientation(event: Orientation, callback: js.Function1[/* data */ Azimuth, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_Proximity(event: Proximity, callback: js.Function1[/* data */ IsNear, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_StepCounter(event: StepCounter, callback: js.Function1[/* data */ Steps, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_Thermometer(event: Thermometer, callback: js.Function1[/* data */ Temp, Unit]): EmitterSubscription = js.native
  }
  
  trait NativeModulesStatic extends StObject {
    
    var SensorManager: typingsJapgolly.reactNativeSensorManager.mod.SensorManager
  }
  object NativeModulesStatic {
    
    inline def apply(SensorManager: SensorManager): NativeModulesStatic = {
      val __obj = js.Dynamic.literal(SensorManager = SensorManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeModulesStatic]
    }
    
    extension [Self <: NativeModulesStatic](x: Self) {
      
      inline def setSensorManager(value: SensorManager): Self = StObject.set(x, "SensorManager", value.asInstanceOf[js.Any])
    }
  }
}
