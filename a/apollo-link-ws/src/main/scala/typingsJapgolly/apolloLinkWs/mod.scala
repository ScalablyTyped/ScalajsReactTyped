package typingsJapgolly.apolloLinkWs

import typingsJapgolly.apolloLinkWs.webSocketLinkMod.WebSocketLink.Configuration
import typingsJapgolly.subscriptionsTransportWs.mod.SubscriptionClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-ws", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class WebSocketLink protected ()
    extends typingsJapgolly.apolloLinkWs.webSocketLinkMod.WebSocketLink {
    def this(paramsOrClient: Configuration) = this()
    def this(paramsOrClient: SubscriptionClient) = this()
  }
  
}

