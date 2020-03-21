package typingsJapgolly.subscriptionsTransportWs

import typingsJapgolly.subscriptionsTransportWs.clientMod.ClientOptions
import typingsJapgolly.subscriptionsTransportWs.serverMod.ServerOptions
import typingsJapgolly.subscriptionsTransportWs.subscriptionsTransportWsStrings.`graphql-subscriptions`
import typingsJapgolly.subscriptionsTransportWs.subscriptionsTransportWsStrings.`graphql-ws`
import typingsJapgolly.ws.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SubscriptionClient protected ()
    extends typingsJapgolly.subscriptionsTransportWs.clientMod.SubscriptionClient {
    def this(url: String) = this()
    def this(url: String, options: ClientOptions) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: String) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: js.Array[String]) = this()
  }
  
  @js.native
  class SubscriptionServer protected ()
    extends typingsJapgolly.subscriptionsTransportWs.serverMod.SubscriptionServer {
    def this(options: ServerOptions, socketOptionsOrServer: Server) = this()
    def this(options: ServerOptions, socketOptionsOrServer: typingsJapgolly.ws.mod.ServerOptions) = this()
  }
  
  val GRAPHQL_SUBSCRIPTIONS: `graphql-subscriptions` = js.native
  val GRAPHQL_WS: `graphql-ws` = js.native
  /* static members */
  @js.native
  object SubscriptionServer extends js.Object {
    def create(options: ServerOptions, socketOptionsOrServer: Server): typingsJapgolly.subscriptionsTransportWs.serverMod.SubscriptionServer = js.native
    def create(options: ServerOptions, socketOptionsOrServer: typingsJapgolly.ws.mod.ServerOptions): typingsJapgolly.subscriptionsTransportWs.serverMod.SubscriptionServer = js.native
  }
  
}

