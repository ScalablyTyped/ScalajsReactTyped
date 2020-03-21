package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var text: String
  def cancel(): Unit
}

object AnonCancel {
  @scala.inline
  def apply(cancel: Callback, text: String): AnonCancel = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[AnonCancel]
  }
}

