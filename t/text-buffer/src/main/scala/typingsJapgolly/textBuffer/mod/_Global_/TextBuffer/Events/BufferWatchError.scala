package typingsJapgolly.textBuffer.mod._Global_.TextBuffer.Events

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferWatchError extends js.Object {
  /** The error object. */
  var error: js.Error
  /**
    *  Call this function to indicate you have handled the error.
    *  The error will not be thrown if this function is called.
    */
  def handle(): Unit
}

object BufferWatchError {
  @scala.inline
  def apply(error: js.Error, handle: Callback): BufferWatchError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("handle")(handle.toJsFn)
    __obj.asInstanceOf[BufferWatchError]
  }
}

