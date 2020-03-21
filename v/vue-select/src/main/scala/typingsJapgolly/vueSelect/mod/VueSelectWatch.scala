package typingsJapgolly.vueSelect.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectWatch extends js.Object {
  def created(): Unit
  def multiple(reset: Boolean): Unit
  def mutableOptions(): Unit
  def mutableValue(`val`: js.Any, old: js.Any): Unit
  def options(`val`: js.Any): Unit
  def value(`val`: js.Any): Unit
}

object VueSelectWatch {
  @scala.inline
  def apply(
    created: Callback,
    multiple: Boolean => Callback,
    mutableOptions: Callback,
    mutableValue: (js.Any, js.Any) => Callback,
    options: js.Any => Callback,
    value: js.Any => Callback
  ): VueSelectWatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created")(created.toJsFn)
    __obj.updateDynamic("multiple")(js.Any.fromFunction1((t0: scala.Boolean) => multiple(t0).runNow()))
    __obj.updateDynamic("mutableOptions")(mutableOptions.toJsFn)
    __obj.updateDynamic("mutableValue")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => mutableValue(t0, t1).runNow()))
    __obj.updateDynamic("options")(js.Any.fromFunction1((t0: js.Any) => options(t0).runNow()))
    __obj.updateDynamic("value")(js.Any.fromFunction1((t0: js.Any) => value(t0).runNow()))
    __obj.asInstanceOf[VueSelectWatch]
  }
}

