package typingsJapgolly.agGrid.utilsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPromise[T] extends js.Object {
  var promise: Promise[T]
  def resolve(value: T): Unit
}

object ExternalPromise {
  @scala.inline
  def apply[T](promise: Promise[T], resolve: T => Callback): ExternalPromise[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: T) => resolve(t0).runNow()))
    __obj.asInstanceOf[ExternalPromise[T]]
  }
}

