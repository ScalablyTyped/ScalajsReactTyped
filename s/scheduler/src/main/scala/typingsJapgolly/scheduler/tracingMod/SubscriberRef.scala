package typingsJapgolly.scheduler.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriberRef extends js.Object {
  var current: Subscriber | Null
}

object SubscriberRef {
  @scala.inline
  def apply(current: Subscriber = null): SubscriberRef = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberRef]
  }
}

