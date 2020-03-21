package typingsJapgolly.elm

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortToElm[V] extends js.Object {
  def send(value: V): Unit
}

object PortToElm {
  @scala.inline
  def apply[V](send: V => Callback): PortToElm[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: V) => send(t0).runNow()))
    __obj.asInstanceOf[PortToElm[V]]
  }
}

