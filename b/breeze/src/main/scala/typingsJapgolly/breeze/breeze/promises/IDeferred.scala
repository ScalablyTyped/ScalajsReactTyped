package typingsJapgolly.breeze.breeze.promises

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeferred[T] extends js.Object {
  var promise: js.Promise[T]
  def reject(reason: js.Any): Unit
  def resolve(value: T): Unit
}

object IDeferred {
  @scala.inline
  def apply[T](promise: js.Promise[T], reject: js.Any => Callback, resolve: T => Callback): IDeferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: js.Any) => reject(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: T) => resolve(t0).runNow()))
    __obj.asInstanceOf[IDeferred[T]]
  }
}

