package typingsJapgolly.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SensorType extends StObject
@JSImport("react-native-reanimated", "SensorType")
@js.native
object SensorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SensorType & Double] = js.native
  
  @js.native
  sealed trait ACCELEROMETER
    extends StObject
       with SensorType
  /* 1 */ val ACCELEROMETER: typingsJapgolly.reactNativeReanimated.mod.SensorType.ACCELEROMETER & Double = js.native
  
  @js.native
  sealed trait GRAVITY
    extends StObject
       with SensorType
  /* 3 */ val GRAVITY: typingsJapgolly.reactNativeReanimated.mod.SensorType.GRAVITY & Double = js.native
  
  @js.native
  sealed trait GYROSCOPE
    extends StObject
       with SensorType
  /* 2 */ val GYROSCOPE: typingsJapgolly.reactNativeReanimated.mod.SensorType.GYROSCOPE & Double = js.native
  
  @js.native
  sealed trait MAGNETIC_FIELD
    extends StObject
       with SensorType
  /* 4 */ val MAGNETIC_FIELD: typingsJapgolly.reactNativeReanimated.mod.SensorType.MAGNETIC_FIELD & Double = js.native
  
  @js.native
  sealed trait ROTATION
    extends StObject
       with SensorType
  /* 5 */ val ROTATION: typingsJapgolly.reactNativeReanimated.mod.SensorType.ROTATION & Double = js.native
}
