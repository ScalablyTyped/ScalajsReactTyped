package typingsJapgolly.reactDataGrid.AdazzleReactDataGrid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButton extends js.Object {
  var icon: String
  def callback(): Unit
}

object ActionButton {
  @scala.inline
  def apply(callback: Callback, icon: String): ActionButton = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[ActionButton]
  }
}

