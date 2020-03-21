package typingsJapgolly.angularNotify.mod.cgNotify

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotify extends js.Object {
  /**
    * The message to show.
    */
  var message: String
  /**
    * Close this open notifications.
    */
  def close(): Unit
}

object INotify {
  @scala.inline
  def apply(close: Callback, message: String): INotify = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[INotify]
  }
}

