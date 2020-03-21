package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var text: String
  def callback(): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: Callback, text: String): AnonCallback = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[AnonCallback]
  }
}

