package typingsJapgolly.jqueryColorpicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryColorpickerInstance extends js.Object {
  def close(): Unit
  def destroy(): Unit
  def open(): Unit
  def setColor(color: js.Any): Unit
}

object JQueryColorpickerInstance {
  @scala.inline
  def apply(close: Callback, destroy: Callback, open: Callback, setColor: js.Any => Callback): JQueryColorpickerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("setColor")(js.Any.fromFunction1((t0: js.Any) => setColor(t0).runNow()))
    __obj.asInstanceOf[JQueryColorpickerInstance]
  }
}

