package typingsJapgolly.xEditable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEditable extends js.Object {
  var options: XEditableOptions
  def activate(): Unit
  def destroy(): Unit
  def disable(): Unit
  def enable(): Unit
  def getValue(isSingle: Boolean): js.Any
  def hide(): Unit
  def option(key: js.Any, value: js.Any): Unit
  def setValue(value: js.Any, convertStr: Boolean): Unit
  def show(closeAll: Boolean): Unit
  def submit(options: XEditableSubmitOptions): Unit
  def toggle(closeAll: Boolean): Unit
  def toggleDisabled(): Unit
  def validate(): Unit
}

object XEditable {
  @scala.inline
  def apply(
    activate: Callback,
    destroy: Callback,
    disable: Callback,
    enable: Callback,
    getValue: Boolean => CallbackTo[js.Any],
    hide: Callback,
    option: (js.Any, js.Any) => Callback,
    options: XEditableOptions,
    setValue: (js.Any, Boolean) => Callback,
    show: Boolean => Callback,
    submit: XEditableSubmitOptions => Callback,
    toggle: Boolean => Callback,
    toggleDisabled: Callback,
    validate: Callback
  ): XEditable = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("activate")(activate.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: scala.Boolean) => getValue(t0).runNow()))
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("option")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => option(t0, t1).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: js.Any, t1: scala.Boolean) => setValue(t0, t1).runNow()))
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: scala.Boolean) => show(t0).runNow()))
    __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: typingsJapgolly.xEditable.XEditableSubmitOptions) => submit(t0).runNow()))
    __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: scala.Boolean) => toggle(t0).runNow()))
    __obj.updateDynamic("toggleDisabled")(toggleDisabled.toJsFn)
    __obj.updateDynamic("validate")(validate.toJsFn)
    __obj.asInstanceOf[XEditable]
  }
}

