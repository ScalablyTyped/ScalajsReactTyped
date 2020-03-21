package typingsJapgolly.firefoxWebextBrowser.browser.urlbar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlbarOnBehaviorRequestedEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, providerName: String): Unit
  def hasListener(cb: TCallback): Boolean
  def removeListener(cb: TCallback): Unit
}

object UrlbarOnBehaviorRequestedEvent {
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, String) => Callback,
    hasListener: TCallback => CallbackTo[Boolean],
    removeListener: TCallback => Callback
  ): UrlbarOnBehaviorRequestedEvent[TCallback] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: TCallback, t1: java.lang.String) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: TCallback) => hasListener(t0).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
    __obj.asInstanceOf[UrlbarOnBehaviorRequestedEvent[TCallback]]
  }
}

