package typingsJapgolly.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTime extends js.Object {
  /** The inclusive start of the event. It will be present. */
  var startTime: js.UndefOr[String] = js.undefined
  /** The exclusive end of the event. It will be present. */
  var stopTime: js.UndefOr[String] = js.undefined
}

object EventTime {
  @scala.inline
  def apply(startTime: String = null, stopTime: String = null): EventTime = {
    val __obj = js.Dynamic.literal()
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTime]
  }
}

