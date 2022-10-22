package typingsJapgolly.motionSensorsPolyfill

import typingsJapgolly.motionSensorsPolyfill.mod.AccelerometerLocalCoordinateSystem
import typingsJapgolly.motionSensorsPolyfill.mod.GyroscopeLocalCoordinateSystem
import typingsJapgolly.motionSensorsPolyfill.mod.OrientationSensorLocalCoordinateSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object motionSensorsPolyfillStrings {
  
  @js.native
  sealed trait device
    extends StObject
       with AccelerometerLocalCoordinateSystem
       with GyroscopeLocalCoordinateSystem
       with OrientationSensorLocalCoordinateSystem
  inline def device: device = "device".asInstanceOf[device]
  
  @js.native
  sealed trait screen
    extends StObject
       with AccelerometerLocalCoordinateSystem
       with GyroscopeLocalCoordinateSystem
       with OrientationSensorLocalCoordinateSystem
  inline def screen: screen = "screen".asInstanceOf[screen]
}
