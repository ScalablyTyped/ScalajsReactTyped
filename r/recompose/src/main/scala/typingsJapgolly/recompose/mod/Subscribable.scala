package typingsJapgolly.recompose.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscribable[T] extends js.Object {
  def subscribe(observer: Observer[T]): Subscription
}

object Subscribable {
  @scala.inline
  def apply[T](subscribe: Observer[T] => CallbackTo[Subscription]): Subscribable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: typingsJapgolly.recompose.mod.Observer[T]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[Subscribable[T]]
  }
}

