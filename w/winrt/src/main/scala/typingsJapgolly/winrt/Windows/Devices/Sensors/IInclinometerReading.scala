package typingsJapgolly.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInclinometerReading extends js.Object {
  var pitchDegrees: Double
  var rollDegrees: Double
  var timestamp: js.Date
  var yawDegrees: Double
}

object IInclinometerReading {
  @scala.inline
  def apply(pitchDegrees: Double, rollDegrees: Double, timestamp: js.Date, yawDegrees: Double): IInclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IInclinometerReading]
  }
}

