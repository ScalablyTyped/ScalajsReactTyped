package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometer extends js.Object {
  var minimumReportInterval: Double
  var onreadingchanged: js.Any
  var onshaken: js.Any
  var reportInterval: Double
  def getCurrentReading(): AccelerometerReading
}

object IAccelerometer {
  @scala.inline
  def apply(
    getCurrentReading: CallbackTo[AccelerometerReading],
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    onshaken: js.Any,
    reportInterval: Double
  ): IAccelerometer = {
    val __obj = js.Dynamic.literal(minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], onshaken = onshaken.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("getCurrentReading")(getCurrentReading.toJsFn)
    __obj.asInstanceOf[IAccelerometer]
  }
}

