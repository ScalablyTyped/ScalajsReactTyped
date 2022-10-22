package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the orientation-sensor reading-changed event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.OrientationSensorReadingChangedEventArgs")
@js.native
open class OrientationSensorReadingChangedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.OrientationSensorReadingChangedEventArgs {
  
  /** Gets the current reading which includes a Quaternion, a RotationMatrix, and a timestamp. */
  /* CompleteClass */
  var reading: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.OrientationSensorReading = js.native
}
