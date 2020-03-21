package typingsJapgolly.relayRuntime.relayObservableMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  val closed: Boolean
  def unsubscribe(): Unit
}

object Subscription {
  @scala.inline
  def apply(closed: Boolean, unsubscribe: Callback): Subscription = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any])
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[Subscription]
  }
}

