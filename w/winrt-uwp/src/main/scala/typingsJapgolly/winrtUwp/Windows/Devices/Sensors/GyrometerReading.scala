package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a gyrometer reading. */
@JSGlobal("Windows.Devices.Sensors.GyrometerReading")
@js.native
abstract class GyrometerReading () extends js.Object {
  /** Gets the angular velocity, in degrees per second, about the x-axis. */
  var angularVelocityX: Double = js.native
  /** Gets the angular velocity, in degrees per second, about the y-axis. */
  var angularVelocityY: Double = js.native
  /** Gets the angular velocity, in degrees per second, about the z-axis. */
  var angularVelocityZ: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date = js.native
}

