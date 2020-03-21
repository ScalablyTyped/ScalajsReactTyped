package typingsJapgolly.kefir.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kefir.AnonUnsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESObservable[T, S] extends js.Object {
  def subscribe(callbacks: ESObserver[T, S]): AnonUnsubscribe
}

object ESObservable {
  @scala.inline
  def apply[T, S](subscribe: ESObserver[T, S] => CallbackTo[AnonUnsubscribe]): ESObservable[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: typingsJapgolly.kefir.mod.ESObserver[T, S]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[ESObservable[T, S]]
  }
}

