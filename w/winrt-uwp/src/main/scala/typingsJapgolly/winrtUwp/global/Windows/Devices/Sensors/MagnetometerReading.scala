package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a magnetometer reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.MagnetometerReading")
@js.native
open class MagnetometerReading ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.MagnetometerReading {
  
  /** Gets the magnetometer's directional accuracy. */
  /* CompleteClass */
  var directionalAccuracy: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
  
  /** Gets the magnetic field strength in microteslas along the X axis. */
  /* CompleteClass */
  var magneticFieldX: Double = js.native
  
  /** Gets the magnetic field strength in microteslas along the Y axis. */
  /* CompleteClass */
  var magneticFieldY: Double = js.native
  
  /** Gets the magnetic field strength in microteslas along the Z axis. */
  /* CompleteClass */
  var magneticFieldZ: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
