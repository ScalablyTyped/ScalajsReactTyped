package typingsJapgolly.unimodulesReactNativeAdapter.eventEmitterMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  def remove(): Unit
}

object Subscription {
  @scala.inline
  def apply(remove: Callback): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[Subscription]
  }
}

