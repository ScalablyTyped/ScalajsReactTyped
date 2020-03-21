package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddEventListener extends js.Object {
  def addEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event_], Unit],
    useCapture: Boolean
  ): js.Function1[/* event */ js.UndefOr[Event_], Unit]
  def preventDefault(event: Event_): Unit
  def removeEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event_], Unit],
    useCapture: Boolean
  ): Unit
  def stopPropagation(event: Event_): Unit
}

object AnonAddEventListener {
  @scala.inline
  def apply(
    addEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event_], Unit], Boolean) => CallbackTo[js.Function1[/* event */ js.UndefOr[Event_], Unit]],
    preventDefault: Event_ => Callback,
    removeEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event_], Unit], Boolean) => Callback,
    stopPropagation: Event_ => Callback
  ): AnonAddEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction4((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String, t2: js.Function1[/* event */ js.UndefOr[typingsJapgolly.std.Event_], scala.Unit], t3: scala.Boolean) => addEventListener(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("preventDefault")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => preventDefault(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction4((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String, t2: js.Function1[/* event */ js.UndefOr[typingsJapgolly.std.Event_], scala.Unit], t3: scala.Boolean) => removeEventListener(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("stopPropagation")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => stopPropagation(t0).runNow()))
    __obj.asInstanceOf[AnonAddEventListener]
  }
}

