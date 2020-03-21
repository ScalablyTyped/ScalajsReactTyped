package typingsJapgolly.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompassReading extends js.Object {
  var headingMagneticNorth: Double
  var headingTrueNorth: Double
  var timestamp: js.Date
}

object ICompassReading {
  @scala.inline
  def apply(headingMagneticNorth: Double, headingTrueNorth: Double, timestamp: js.Date): ICompassReading = {
    val __obj = js.Dynamic.literal(headingMagneticNorth = headingMagneticNorth.asInstanceOf[js.Any], headingTrueNorth = headingTrueNorth.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICompassReading]
  }
}

