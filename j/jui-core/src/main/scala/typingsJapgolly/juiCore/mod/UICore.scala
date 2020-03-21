package typingsJapgolly.juiCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UICore extends js.Object {
  var event: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[js.Any] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * Check the parameter type of a UI method and generates an alarm when a wrong value is entered
    *
    * @param name Method name
    * @param params Parameters
    */
  def addValid(name: String, params: js.Array[_]): Unit
  /**
    * Sets a callback function that is called after a UI method is run
    *
    * @param name Method name
    */
  def callAfter(name: String, callback: js.Function0[Unit]): Unit
  /**
    * Sets a callback function that is called before a UI method is run
    *
    * @param name Method name
    */
  def callBefore(name: String, callback: js.Function0[Unit]): Unit
  /**
    * Sets a callback function and the delay time before/after a UI method is run
    *
    * @param name Method name
    */
  def callDelay(name: String, callObj: js.Function0[Unit]): Unit
  def destroy(): Unit
  /**
    * Generates a custom event. The first parameter is the type of a custom event. A function defined as an option or on method is called
    *
    * @param type Event type
    * @param args Event Arguments
    */
  def emit(`type`: String, args: js.Function0[Unit]): js.Any
  /**
    * Removes a custom event of an applicable type or callback handler
    *
    * @param type Event type
    */
  def off(`type`: String): Unit
  /**
    * A callback function defined as an on method is run when an emit method is called
    *
    * @param type Event type
    */
  def on(`type`: String, callback: js.Function0[Unit]): Unit
  /**
    * Dynamically defines the options of a UI
    */
  def setOption(key: String, value: js.Any): Unit
  /**
    * Dynamically defines the template method of a UI
    *
    * @param name Template name
    * @param html Template markup
    */
  def setTpl(name: String, html: String): Unit
}

object UICore {
  @scala.inline
  def apply(
    addValid: (String, js.Array[js.Any]) => Callback,
    callAfter: (String, js.Function0[Unit]) => Callback,
    callBefore: (String, js.Function0[Unit]) => Callback,
    callDelay: (String, js.Function0[Unit]) => Callback,
    destroy: Callback,
    emit: (String, js.Function0[Unit]) => CallbackTo[js.Any],
    off: String => Callback,
    on: (String, js.Function0[Unit]) => Callback,
    setOption: (String, js.Any) => Callback,
    setTpl: (String, String) => Callback,
    event: js.Any = null,
    root: js.Any = null,
    tpl: js.Any = null
  ): UICore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addValid")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => addValid(t0, t1).runNow()))
    __obj.updateDynamic("callAfter")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => callAfter(t0, t1).runNow()))
    __obj.updateDynamic("callBefore")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => callBefore(t0, t1).runNow()))
    __obj.updateDynamic("callDelay")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => callDelay(t0, t1).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => emit(t0, t1).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction1((t0: java.lang.String) => off(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("setOption")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setOption(t0, t1).runNow()))
    __obj.updateDynamic("setTpl")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setTpl(t0, t1).runNow()))
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UICore]
  }
}

