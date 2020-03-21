package typingsJapgolly.sipJs.libUtilsMod.Utils

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[T] extends js.Object {
  var promise: js.Promise[T]
  def reject(): T
  def resolve(): T
}

object Deferred {
  @scala.inline
  def apply[T](promise: js.Promise[T], reject: CallbackTo[T], resolve: CallbackTo[T]): Deferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("reject")(reject.toJsFn)
    __obj.updateDynamic("resolve")(resolve.toJsFn)
    __obj.asInstanceOf[Deferred[T]]
  }
}

