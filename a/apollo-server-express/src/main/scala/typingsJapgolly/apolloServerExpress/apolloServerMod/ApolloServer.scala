package typingsJapgolly.apolloServerExpress.apolloServerMod

import typingsJapgolly.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsJapgolly.apolloServerCore.mod.ApolloServerBase
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.express.mod.Router
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/ApolloServer", "ApolloServer")
@js.native
class ApolloServer protected () extends ApolloServerBase {
  def this(config: ApolloServerExpressConfig) = this()
  def applyMiddleware(hasAppRest: ServerRegistration): Unit = js.native
  def createGraphQLServerOptions(req: Request_[ParamsDictionary], res: Response_): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def getMiddleware(): Router = js.native
  def getMiddleware(hasPathCorsBodyParserConfigDisableHealthCheckOnHealthCheck: GetMiddlewareOptions): Router = js.native
}

