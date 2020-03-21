package typingsJapgolly.winrt.Windows.Devices.Enumeration

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceWatcher extends js.Object {
  var onadded: js.Any
  var onenumerationcompleted: js.Any
  var onremoved: js.Any
  var onstopped: js.Any
  var onupdated: js.Any
  var status: DeviceWatcherStatus
  def start(): Unit
  def stop(): Unit
}

object IDeviceWatcher {
  @scala.inline
  def apply(
    onadded: js.Any,
    onenumerationcompleted: js.Any,
    onremoved: js.Any,
    onstopped: js.Any,
    onupdated: js.Any,
    start: Callback,
    status: DeviceWatcherStatus,
    stop: Callback
  ): IDeviceWatcher = {
    val __obj = js.Dynamic.literal(onadded = onadded.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onremoved = onremoved.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], onupdated = onupdated.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[IDeviceWatcher]
  }
}

