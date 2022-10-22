package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.InclinometerReading")
@js.native
open class InclinometerReading ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.InclinometerReading {
  
  /** Gets the rotation in degrees around the x-axis. */
  /* CompleteClass */
  var pitchDegrees: Double = js.native
  
  /** Gets the rotation in degrees around the y-axis. */
  /* CompleteClass */
  var rollDegrees: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
  
  /** Gets the inclinometer's z-axis accuracy. */
  /* CompleteClass */
  var yawAccuracy: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
  
  /** Gets the rotation in degrees around the z-axis. */
  /* CompleteClass */
  var yawDegrees: Double = js.native
}
