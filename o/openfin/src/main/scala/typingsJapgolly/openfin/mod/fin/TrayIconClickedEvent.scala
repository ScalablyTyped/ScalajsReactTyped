package typingsJapgolly.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrayIconClickedEvent extends ApplicationBaseEvent {
  var button: Double
   // 0 for left, 1 for middle, 2 for right
  var monitorInfo: MonitorInfo
  var x: Double
   // the cursor x coordinate
  var y: Double
}

object TrayIconClickedEvent {
  @scala.inline
  def apply(
    button: Double,
    monitorInfo: MonitorInfo,
    topic: String,
    `type`: OpenFinApplicationEventType,
    uuid: String,
    x: Double,
    y: Double
  ): TrayIconClickedEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayIconClickedEvent]
  }
}

