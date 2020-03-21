package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSliderMethods extends js.Object {
  def clearBookmarks(): Unit
  def destroy(): Unit
  def value(newValue: js.Object): Unit
  def widget(): Unit
}

object IgSliderMethods {
  @scala.inline
  def apply(clearBookmarks: Callback, destroy: Callback, value: js.Object => Callback, widget: Callback): IgSliderMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearBookmarks")(clearBookmarks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("value")(js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    __obj.updateDynamic("widget")(widget.toJsFn)
    __obj.asInstanceOf[IgSliderMethods]
  }
}

