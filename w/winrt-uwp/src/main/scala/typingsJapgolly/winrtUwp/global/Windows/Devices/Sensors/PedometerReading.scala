package typingsJapgolly.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a pedometer reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.PedometerReading")
@js.native
open class PedometerReading ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Sensors.PedometerReading {
  
  /** Gets the total number of steps taken for this pedometer reading. */
  /* CompleteClass */
  var cumulativeSteps: Double = js.native
  
  /** Gets the amount of time that has elapsed for this pedometer reading. */
  /* CompleteClass */
  var cumulativeStepsDuration: Double = js.native
  
  /** Indicates the type of steps taken for this pedometer reading. */
  /* CompleteClass */
  var stepKind: typingsJapgolly.winrtUwp.Windows.Devices.Sensors.PedometerStepKind = js.native
  
  /** Gets the time for the most recent pedometer reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
