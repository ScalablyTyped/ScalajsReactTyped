package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an altimeter reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.AltimeterReading")
@js.native
open class AltimeterReading ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.AltimeterReading {
  
  /** Gets the current altitude determined by the altimeter sensor. */
  /* CompleteClass */
  var altitudeChangeInMeters: Double = js.native
  
  /** Gets the time for the most recent altimeter reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
