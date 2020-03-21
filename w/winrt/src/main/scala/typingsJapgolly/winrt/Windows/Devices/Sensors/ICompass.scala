package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompass extends js.Object {
  var minimumReportInterval: Double
  var onreadingchanged: js.Any
  var reportInterval: Double
  def getCurrentReading(): CompassReading
}

object ICompass {
  @scala.inline
  def apply(
    getCurrentReading: CallbackTo[CompassReading],
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    reportInterval: Double
  ): ICompass = {
    val __obj = js.Dynamic.literal(minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("getCurrentReading")(getCurrentReading.toJsFn)
    __obj.asInstanceOf[ICompass]
  }
}

