package typingsJapgolly.rxjs.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionLike extends Unsubscribable {
  val closed: Boolean
}

object SubscriptionLike {
  @scala.inline
  def apply(closed: Boolean, unsubscribe: Callback): SubscriptionLike = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any])
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[SubscriptionLike]
  }
}

