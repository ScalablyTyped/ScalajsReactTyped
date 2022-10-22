package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the reading of an activity sensor that provides readings for the sensor. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.ActivitySensorReading")
@js.native
open class ActivitySensorReading ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ActivitySensorReading {
  
  /** Gets the activity type for the sensor. */
  /* CompleteClass */
  var activity: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ActivityType = js.native
  
  /** Gets the reading confidence for the sensor. */
  /* CompleteClass */
  var confidence: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.ActivitySensorReadingConfidence = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
