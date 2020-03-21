package typingsJapgolly.tarn.utilsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[T] extends js.Object {
  var promise: js.Promise[T]
  def reject[T](err: T): js.Any
  def resolve(`val`: T): js.Any
}

object Deferred {
  @scala.inline
  def apply[T](promise: js.Promise[T], reject: js.Any => CallbackTo[js.Any], resolve: T => CallbackTo[js.Any]): Deferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: js.Any) => reject(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: T) => resolve(t0).runNow()))
    __obj.asInstanceOf[Deferred[T]]
  }
}

