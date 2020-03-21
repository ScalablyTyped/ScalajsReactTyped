package typingsJapgolly.juiCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIEvent extends UICore {
  /**
    * Get the child element of the root element
    */
  def find(selector: js.Any): JQuery_[HTMLElement]
}

object UIEvent {
  @scala.inline
  def apply(
    addValid: (String, js.Array[js.Any]) => Callback,
    callAfter: (String, js.Function0[Unit]) => Callback,
    callBefore: (String, js.Function0[Unit]) => Callback,
    callDelay: (String, js.Function0[Unit]) => Callback,
    destroy: Callback,
    emit: (String, js.Function0[Unit]) => CallbackTo[js.Any],
    find: js.Any => CallbackTo[JQuery_[HTMLElement]],
    off: String => Callback,
    on: (String, js.Function0[Unit]) => Callback,
    setOption: (String, js.Any) => Callback,
    setTpl: (String, String) => Callback,
    event: js.Any = null,
    root: js.Any = null,
    tpl: js.Any = null
  ): UIEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addValid")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => addValid(t0, t1).runNow()))
    __obj.updateDynamic("callAfter")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => callAfter(t0, t1).runNow()))
    __obj.updateDynamic("callBefore")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => callBefore(t0, t1).runNow()))
    __obj.updateDynamic("callDelay")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => callDelay(t0, t1).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => emit(t0, t1).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: js.Any) => find(t0).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction1((t0: java.lang.String) => off(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("setOption")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setOption(t0, t1).runNow()))
    __obj.updateDynamic("setTpl")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setTpl(t0, t1).runNow()))
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIEvent]
  }
}

