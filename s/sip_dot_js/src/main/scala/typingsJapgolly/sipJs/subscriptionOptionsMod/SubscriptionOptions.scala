package typingsJapgolly.sipJs.subscriptionOptionsMod

import typingsJapgolly.sipJs.subscriptionDelegateMod.SubscriptionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var delegate: js.UndefOr[SubscriptionDelegate] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(delegate: SubscriptionDelegate = null): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

