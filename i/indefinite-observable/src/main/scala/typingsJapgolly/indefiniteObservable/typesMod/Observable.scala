package typingsJapgolly.indefiniteObservable.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def subscribe(observerOrNext: ObserverOrNext[T]): Subscription
}

object Observable {
  @scala.inline
  def apply[T](subscribe: ObserverOrNext[T] => CallbackTo[Subscription]): Observable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: typingsJapgolly.indefiniteObservable.typesMod.ObserverOrNext[T]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[Observable[T]]
  }
}

