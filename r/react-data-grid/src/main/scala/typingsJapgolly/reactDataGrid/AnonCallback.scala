package typingsJapgolly.reactDataGrid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var icon: String
  var text: String
  def callback(): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: Callback, icon: String, text: String): AnonCallback = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[AnonCallback]
  }
}

