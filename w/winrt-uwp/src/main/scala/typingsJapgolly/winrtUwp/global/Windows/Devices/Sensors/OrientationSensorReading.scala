package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an orientation-sensor reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.OrientationSensorReading")
@js.native
open class OrientationSensorReading ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.OrientationSensorReading {
  
  /** Gets the Quaternion for the current orientation-sensor reading. */
  /* CompleteClass */
  var quaternion: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.SensorQuaternion = js.native
  
  /** Gets the rotation matrix for the current orientation-sensor reading. */
  /* CompleteClass */
  var rotationMatrix: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.SensorRotationMatrix = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
  
  /** Gets the orientation sensor's z-axis accuracy. */
  /* CompleteClass */
  var yawAccuracy: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
}
