package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the magnetometer reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.MagnetometerReadingChangedEventArgs")
@js.native
abstract class MagnetometerReadingChangedEventArgs () extends js.Object {
  /** Gets the current magnetometer reading. */
  var reading: MagnetometerReading = js.native
}

