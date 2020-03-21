package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventManager extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  def addEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event_, Unit]): js.Function0[Unit]
  def clear(): Unit
  def clearEvents(): Unit
  def destroy(): Unit
  def extendEvent(context: js.Object, event: Event_): js.Any
  def fireEvent(element: Element, eventName: String): Unit
  def removeEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event_, Unit]): Unit
}

object EventManager {
  @scala.inline
  def apply(
    addEventListener: (Element, String, js.Function1[/* event */ Event_, Unit]) => CallbackTo[js.Function0[Unit]],
    clear: Callback,
    clearEvents: Callback,
    destroy: Callback,
    extendEvent: (js.Object, Event_) => CallbackTo[js.Any],
    fireEvent: (Element, String) => Callback,
    removeEventListener: (Element, String, js.Function1[/* event */ Event_, Unit]) => Callback,
    context: js.Object = null
  ): EventManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.Element, t1: java.lang.String, t2: js.Function1[/* event */ typingsJapgolly.std.Event_, scala.Unit]) => addEventListener(t0, t1, t2).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("clearEvents")(clearEvents.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("extendEvent")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.std.Event_) => extendEvent(t0, t1).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: java.lang.String) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.Element, t1: java.lang.String, t2: js.Function1[/* event */ typingsJapgolly.std.Event_, scala.Unit]) => removeEventListener(t0, t1, t2).runNow()))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventManager]
  }
}

