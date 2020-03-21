package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccountWatcher extends js.Object {
  var onaccountadded: js.Any
  var onaccountremoved: js.Any
  var onaccountupdated: js.Any
  var onenumerationcompleted: js.Any
  var onstopped: js.Any
  var status: MobileBroadbandAccountWatcherStatus
  def start(): Unit
  def stop(): Unit
}

object IMobileBroadbandAccountWatcher {
  @scala.inline
  def apply(
    onaccountadded: js.Any,
    onaccountremoved: js.Any,
    onaccountupdated: js.Any,
    onenumerationcompleted: js.Any,
    onstopped: js.Any,
    start: Callback,
    status: MobileBroadbandAccountWatcherStatus,
    stop: Callback
  ): IMobileBroadbandAccountWatcher = {
    val __obj = js.Dynamic.literal(onaccountadded = onaccountadded.asInstanceOf[js.Any], onaccountremoved = onaccountremoved.asInstanceOf[js.Any], onaccountupdated = onaccountupdated.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[IMobileBroadbandAccountWatcher]
  }
}

