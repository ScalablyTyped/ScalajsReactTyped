package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddTab extends js.Object {
  def addTab(id: js.Any): Unit
  def removeTab(id: js.Any): Unit
}

object AnonAddTab {
  @scala.inline
  def apply(addTab: js.Any => Callback, removeTab: js.Any => Callback): AnonAddTab = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addTab")(js.Any.fromFunction1((t0: js.Any) => addTab(t0).runNow()))
    __obj.updateDynamic("removeTab")(js.Any.fromFunction1((t0: js.Any) => removeTab(t0).runNow()))
    __obj.asInstanceOf[AnonAddTab]
  }
}

