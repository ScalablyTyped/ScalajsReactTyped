package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGyrometer extends js.Object {
  var minimumReportInterval: Double
  var onreadingchanged: js.Any
  var reportInterval: Double
  def getCurrentReading(): GyrometerReading
}

object IGyrometer {
  @scala.inline
  def apply(
    getCurrentReading: CallbackTo[GyrometerReading],
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    reportInterval: Double
  ): IGyrometer = {
    val __obj = js.Dynamic.literal(minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("getCurrentReading")(getCurrentReading.toJsFn)
    __obj.asInstanceOf[IGyrometer]
  }
}

