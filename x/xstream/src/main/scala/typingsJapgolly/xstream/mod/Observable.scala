package typingsJapgolly.xstream.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def subscribe(listener: Listener[T]): Subscription
}

object Observable {
  @scala.inline
  def apply[T](subscribe: Listener[T] => CallbackTo[Subscription]): Observable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: typingsJapgolly.xstream.mod.Listener[T]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[Observable[T]]
  }
}

