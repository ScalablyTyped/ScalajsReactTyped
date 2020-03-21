package typingsJapgolly.apolloLinkWs.webSocketLinkMod

import typingsJapgolly.apolloLink.mod.ApolloLink
import typingsJapgolly.apolloLinkWs.webSocketLinkMod.WebSocketLink.Configuration
import typingsJapgolly.subscriptionsTransportWs.mod.SubscriptionClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-ws/lib/webSocketLink", "WebSocketLink")
@js.native
class WebSocketLink_ protected () extends ApolloLink {
  def this(paramsOrClient: Configuration) = this()
  def this(paramsOrClient: SubscriptionClient) = this()
  var subscriptionClient: js.Any = js.native
}

