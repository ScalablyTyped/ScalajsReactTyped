package typingsJapgolly.reduxSagaDeferred.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[R] extends js.Object {
  var promise: js.Promise[R]
  def reject(error: js.Any): Unit
  def resolve(result: R): Unit
}

object Deferred {
  @scala.inline
  def apply[R](promise: js.Promise[R], reject: js.Any => Callback, resolve: R => Callback): Deferred[R] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: js.Any) => reject(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: R) => resolve(t0).runNow()))
    __obj.asInstanceOf[Deferred[R]]
  }
}

