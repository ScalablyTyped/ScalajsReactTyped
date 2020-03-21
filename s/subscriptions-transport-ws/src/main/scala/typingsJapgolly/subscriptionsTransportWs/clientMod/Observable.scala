package typingsJapgolly.subscriptionsTransportWs.clientMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.subscriptionsTransportWs.AnonUnsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def subscribe(observer: Observer[T]): AnonUnsubscribe
}

object Observable {
  @scala.inline
  def apply[T](subscribe: Observer[T] => CallbackTo[AnonUnsubscribe]): Observable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: typingsJapgolly.subscriptionsTransportWs.clientMod.Observer[T]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[Observable[T]]
  }
}

