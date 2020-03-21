package typingsJapgolly.apolloServer.mod

import typingsJapgolly.apolloServer.ApolloServerExpressConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "ApolloServer")
@js.native
class ApolloServer protected ()
  extends typingsJapgolly.apolloServerExpress.mod.ApolloServer {
  def this(config: ApolloServerExpressConfig) = this()
  var cors: js.UndefOr[js.Any] = js.native
  var createServerInfo: js.Any = js.native
  var httpServer: js.UndefOr[js.Any] = js.native
  var onHealthCheck: js.UndefOr[js.Any] = js.native
  def applyMiddleware(): Unit = js.native
  def listen(opts: js.Any*): js.Promise[ServerInfo] = js.native
}

