package typingsJapgolly.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGyrometerReadingChangedEventArgs extends js.Object {
  var reading: GyrometerReading
}

object IGyrometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: GyrometerReading): IGyrometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGyrometerReadingChangedEventArgs]
  }
}

