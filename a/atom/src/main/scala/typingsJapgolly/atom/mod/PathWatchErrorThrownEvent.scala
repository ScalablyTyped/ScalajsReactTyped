package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathWatchErrorThrownEvent extends js.Object {
  /** The error object. */
  var error: js.Error
  /**
    *  Call this function to indicate you have handled the error.
    *  The error will not be thrown if this function is called.
    */
  def handle(): Unit
}

object PathWatchErrorThrownEvent {
  @scala.inline
  def apply(error: js.Error, handle: Callback): PathWatchErrorThrownEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("handle")(handle.toJsFn)
    __obj.asInstanceOf[PathWatchErrorThrownEvent]
  }
}

