package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebExtEvent[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  def addListener(cb: TCallback): Unit
  def hasListener(cb: TCallback): Boolean
  def removeListener(cb: TCallback): Unit
}

object WebExtEvent {
  @scala.inline
  def apply[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */](
    addListener: TCallback => Callback,
    hasListener: TCallback => CallbackTo[Boolean],
    removeListener: TCallback => Callback
  ): WebExtEvent[TCallback] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: TCallback) => addListener(t0).runNow()))
    __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: TCallback) => hasListener(t0).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
    __obj.asInstanceOf[WebExtEvent[TCallback]]
  }
}

