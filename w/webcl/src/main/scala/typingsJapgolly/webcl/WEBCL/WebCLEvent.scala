package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.10
trait WebCLEvent extends js.Object {
  def getInfo(name: EventInfo): js.Any
  def getProfilingInfo(name: ProfilingInfo): Double
  def release(): Unit
  def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit
}

object WebCLEvent {
  @scala.inline
  def apply(
    getInfo: EventInfo => CallbackTo[js.Any],
    getProfilingInfo: ProfilingInfo => CallbackTo[Double],
    release: Callback,
    setCallback: (CommandExecutionStatus, WebCLCallback) => Callback
  ): WebCLEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: typingsJapgolly.webcl.WEBCL.EventInfo) => getInfo(t0).runNow()))
    __obj.updateDynamic("getProfilingInfo")(js.Any.fromFunction1((t0: typingsJapgolly.webcl.WEBCL.ProfilingInfo) => getProfilingInfo(t0).runNow()))
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.updateDynamic("setCallback")(js.Any.fromFunction2((t0: typingsJapgolly.webcl.WEBCL.CommandExecutionStatus, t1: typingsJapgolly.webcl.WEBCL.WebCLCallback) => setCallback(t0, t1).runNow()))
    __obj.asInstanceOf[WebCLEvent]
  }
}

