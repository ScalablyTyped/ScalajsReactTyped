package typingsJapgolly.elm

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortFromElm[V] extends js.Object {
  def subscribe(handler: js.Function1[/* value */ V, Unit]): Unit
  def unsubscribe(handler: js.Function1[/* value */ V, Unit]): Unit
}

object PortFromElm {
  @scala.inline
  def apply[V](
    subscribe: js.Function1[/* value */ V, Unit] => Callback,
    unsubscribe: js.Function1[/* value */ V, Unit] => Callback
  ): PortFromElm[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function1[/* value */ V, scala.Unit]) => subscribe(t0).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1((t0: js.Function1[/* value */ V, scala.Unit]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[PortFromElm[V]]
  }
}

