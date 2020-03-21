package typingsJapgolly.firefoxWebextBrowser.browser.webRequest

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestOnErrorOccurredEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, filter: RequestFilter): Unit
  def hasListener(cb: TCallback): Boolean
  def removeListener(cb: TCallback): Unit
}

object WebRequestOnErrorOccurredEvent {
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, RequestFilter) => Callback,
    hasListener: TCallback => CallbackTo[Boolean],
    removeListener: TCallback => Callback
  ): WebRequestOnErrorOccurredEvent[TCallback] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: TCallback, t1: typingsJapgolly.firefoxWebextBrowser.browser.webRequest.RequestFilter) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: TCallback) => hasListener(t0).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
    __obj.asInstanceOf[WebRequestOnErrorOccurredEvent[TCallback]]
  }
}

