package typingsJapgolly.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventSubscriptionsResponse extends js.Object {
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Details of the returned event subscriptions.
    */
  var subscriptions: SubscriptionList = js.native
}

object ListEventSubscriptionsResponse {
  @scala.inline
  def apply(subscriptions: SubscriptionList, nextToken: PaginationToken = null): ListEventSubscriptionsResponse = {
    val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventSubscriptionsResponse]
  }
}

