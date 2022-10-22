package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SensorValue3D
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SensorValueRotation
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2HookUseAnimatedSensorMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedSensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SensorType extends StObject
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedSensor", "SensorType")
  @js.native
  object SensorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SensorType & Double] = js.native
    
    @js.native
    sealed trait ACCELEROMETER
      extends StObject
         with SensorType
    /* 1 */ val ACCELEROMETER: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.ACCELEROMETER & Double = js.native
    
    @js.native
    sealed trait GRAVITY
      extends StObject
         with SensorType
    /* 3 */ val GRAVITY: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.GRAVITY & Double = js.native
    
    @js.native
    sealed trait GYROSCOPE
      extends StObject
         with SensorType
    /* 2 */ val GYROSCOPE: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.GYROSCOPE & Double = js.native
    
    @js.native
    sealed trait MAGNETIC_FIELD
      extends StObject
         with SensorType
    /* 4 */ val MAGNETIC_FIELD: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.MAGNETIC_FIELD & Double = js.native
    
    @js.native
    sealed trait ROTATION
      extends StObject
         with SensorType
    /* 5 */ val ROTATION: typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType.ROTATION & Double = js.native
  }
  
  inline def useAnimatedSensor(sensorType: SensorType): AnimatedSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any]).asInstanceOf[AnimatedSensor]
  inline def useAnimatedSensor(sensorType: SensorType, userConfig: SensorConfig): AnimatedSensor = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AnimatedSensor]
  
  trait AnimatedSensor extends StObject {
    
    var config: SensorConfig
    
    var isAvailable: Boolean
    
    var sensor: SensorValue3D | SensorValueRotation | Null
    
    def unregister(): Unit
  }
  object AnimatedSensor {
    
    inline def apply(config: SensorConfig, isAvailable: Boolean, unregister: Callback): AnimatedSensor = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], unregister = unregister.toJsFn, sensor = null)
      __obj.asInstanceOf[AnimatedSensor]
    }
    
    extension [Self <: AnimatedSensor](x: Self) {
      
      inline def setConfig(value: SensorConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      inline def setSensor(value: SensorValue3D | SensorValueRotation): Self = StObject.set(x, "sensor", value.asInstanceOf[js.Any])
      
      inline def setSensorNull: Self = StObject.set(x, "sensor", null)
      
      inline def setUnregister(value: Callback): Self = StObject.set(x, "unregister", value.toJsFn)
    }
  }
  
  trait SensorConfig extends StObject {
    
    var interval: Double | auto
  }
  object SensorConfig {
    
    inline def apply(interval: Double | auto): SensorConfig = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[SensorConfig]
    }
    
    extension [Self <: SensorConfig](x: Self) {
      
      inline def setInterval(value: Double | auto): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
}
