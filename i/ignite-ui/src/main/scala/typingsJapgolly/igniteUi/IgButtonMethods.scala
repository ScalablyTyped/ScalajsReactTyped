package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgButtonMethods extends js.Object {
  def destroy(): Unit
  def setTitle(title: js.Object): Unit
  def widget(): Unit
}

object IgButtonMethods {
  @scala.inline
  def apply(destroy: Callback, setTitle: js.Object => Callback, widget: Callback): IgButtonMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: js.Object) => setTitle(t0).runNow()))
    __obj.updateDynamic("widget")(widget.toJsFn)
    __obj.asInstanceOf[IgButtonMethods]
  }
}

