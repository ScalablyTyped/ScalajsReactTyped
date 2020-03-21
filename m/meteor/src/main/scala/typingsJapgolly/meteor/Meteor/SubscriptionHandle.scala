package typingsJapgolly.meteor.Meteor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** utils **/
/** Pub/Sub **/
trait SubscriptionHandle extends js.Object {
  def ready(): Boolean
  def stop(): Unit
}

object SubscriptionHandle {
  @scala.inline
  def apply(ready: CallbackTo[Boolean], stop: Callback): SubscriptionHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ready")(ready.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[SubscriptionHandle]
  }
}

