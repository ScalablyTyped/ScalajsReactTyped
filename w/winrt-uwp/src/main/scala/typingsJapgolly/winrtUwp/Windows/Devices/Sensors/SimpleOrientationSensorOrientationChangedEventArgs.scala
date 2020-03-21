package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the sensor reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensorOrientationChangedEventArgs")
@js.native
abstract class SimpleOrientationSensorOrientationChangedEventArgs () extends js.Object {
  /** Gets the current sensor orientation. */
  var orientation: SimpleOrientation = js.native
  /** Gets the time of the current sensor reading. */
  var timestamp: js.Date = js.native
}

