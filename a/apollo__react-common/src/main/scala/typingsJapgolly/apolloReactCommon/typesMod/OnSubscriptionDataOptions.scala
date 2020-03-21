package typingsJapgolly.apolloReactCommon.typesMod

import typingsJapgolly.apolloClient.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSubscriptionDataOptions[TData] extends js.Object {
  var client: default[js.Object]
  var subscriptionData: SubscriptionResult[TData]
}

object OnSubscriptionDataOptions {
  @scala.inline
  def apply[TData](client: default[js.Object], subscriptionData: SubscriptionResult[TData]): OnSubscriptionDataOptions[TData] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], subscriptionData = subscriptionData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnSubscriptionDataOptions[TData]]
  }
}

