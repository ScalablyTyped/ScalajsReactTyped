package typingsJapgolly.uifabricUtilities.asyncMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICancelable[T] extends js.Object {
  def cancel(): Unit
  def flush(): T
  def pending(): Boolean
}

object ICancelable {
  @scala.inline
  def apply[T](cancel: Callback, flush: CallbackTo[T], pending: CallbackTo[Boolean]): ICancelable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("pending")(pending.toJsFn)
    __obj.asInstanceOf[ICancelable[T]]
  }
}

