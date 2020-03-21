package typingsJapgolly.wordpressNotices.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackAction extends Action {
  var label: String
  def callback(): Unit
}

object CallbackAction {
  @scala.inline
  def apply(callback: Callback, label: String): CallbackAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[CallbackAction]
  }
}

