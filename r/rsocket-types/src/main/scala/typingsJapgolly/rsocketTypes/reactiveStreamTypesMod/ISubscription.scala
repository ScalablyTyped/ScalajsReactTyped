package typingsJapgolly.rsocketTypes.reactiveStreamTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscription extends js.Object {
  def cancel(): Unit
  def request(n: Double): Unit
}

object ISubscription {
  @scala.inline
  def apply(cancel: Callback, request: Double => Callback): ISubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("request")(js.Any.fromFunction1((t0: scala.Double) => request(t0).runNow()))
    __obj.asInstanceOf[ISubscription]
  }
}

