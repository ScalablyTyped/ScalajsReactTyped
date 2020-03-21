package typingsJapgolly.flushable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushableOperation extends js.Object {
  /** Stops the callback from being executed */
  def cancel(): Unit
  /** Immediately executes the callback */
  def flush(): Unit
  /** Returns whether or not the callback has been executed */
  def pending(): Boolean
}

object FlushableOperation {
  @scala.inline
  def apply(cancel: Callback, flush: Callback, pending: CallbackTo[Boolean]): FlushableOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("pending")(pending.toJsFn)
    __obj.asInstanceOf[FlushableOperation]
  }
}

