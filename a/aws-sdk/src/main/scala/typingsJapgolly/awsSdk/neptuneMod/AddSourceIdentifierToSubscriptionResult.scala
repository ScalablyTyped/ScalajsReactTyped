package typingsJapgolly.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddSourceIdentifierToSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[typingsJapgolly.awsSdk.neptuneMod.EventSubscription] = js.native
}

object AddSourceIdentifierToSubscriptionResult {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): AddSourceIdentifierToSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSourceIdentifierToSubscriptionResult]
  }
}

