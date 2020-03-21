package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.10.1
trait WebCLUserEvent extends WebCLEvent {
  def setStatus(executionStatus: CommandExecutionStatus): Unit
}

object WebCLUserEvent {
  @scala.inline
  def apply(
    getInfo: EventInfo => CallbackTo[js.Any],
    getProfilingInfo: ProfilingInfo => CallbackTo[Double],
    release: Callback,
    setCallback: (CommandExecutionStatus, WebCLCallback) => Callback,
    setStatus: CommandExecutionStatus => Callback
  ): WebCLUserEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: typingsJapgolly.webcl.WEBCL.EventInfo) => getInfo(t0).runNow()))
    __obj.updateDynamic("getProfilingInfo")(js.Any.fromFunction1((t0: typingsJapgolly.webcl.WEBCL.ProfilingInfo) => getProfilingInfo(t0).runNow()))
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.updateDynamic("setCallback")(js.Any.fromFunction2((t0: typingsJapgolly.webcl.WEBCL.CommandExecutionStatus, t1: typingsJapgolly.webcl.WEBCL.WebCLCallback) => setCallback(t0, t1).runNow()))
    __obj.updateDynamic("setStatus")(js.Any.fromFunction1((t0: typingsJapgolly.webcl.WEBCL.CommandExecutionStatus) => setStatus(t0).runNow()))
    __obj.asInstanceOf[WebCLUserEvent]
  }
}

