package typingsJapgolly.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInclinometerReadingChangedEventArgs extends js.Object {
  var reading: InclinometerReading
}

object IInclinometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: InclinometerReading): IInclinometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IInclinometerReadingChangedEventArgs]
  }
}

