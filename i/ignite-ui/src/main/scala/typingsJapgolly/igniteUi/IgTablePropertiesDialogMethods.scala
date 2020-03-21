package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTablePropertiesDialogMethods extends js.Object {
  def hide(): Unit
  def show(item: js.Object): Unit
}

object IgTablePropertiesDialogMethods {
  @scala.inline
  def apply(hide: Callback, show: js.Object => Callback): IgTablePropertiesDialogMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: js.Object) => show(t0).runNow()))
    __obj.asInstanceOf[IgTablePropertiesDialogMethods]
  }
}

