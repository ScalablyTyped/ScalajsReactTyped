package typingsJapgolly.apolloServerExpress

import typingsJapgolly.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsJapgolly.apolloServerExpress.expressApolloMod.ExpressGraphQLOptionsFunction
import typingsJapgolly.express.mod.Handler
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/connectApollo", JSImport.Namespace)
@js.native
object connectApolloMod extends js.Object {
  val graphqlConnect: js.Function1[
    /* options */ (GraphQLServerOptions[Record[String, js.Any], js.Any]) | ExpressGraphQLOptionsFunction, 
    Handler
  ] = js.native
}

