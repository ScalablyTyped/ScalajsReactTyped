package typingsJapgolly.apolloServerCore.runHttpQueryMod

import typingsJapgolly.apolloServerCore.AnonContext
import typingsJapgolly.apolloServerCore.apolloServerCoreStrings.cache
import typingsJapgolly.apolloServerCore.apolloServerCoreStrings.plugins
import typingsJapgolly.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsJapgolly.apolloServerTypes.mod.WithRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "processHTTPRequest")
@js.native
object processHTTPRequest extends js.Object {
  def apply[TContext](
    options: (WithRequired[GraphQLServerOptions[TContext, _], cache | plugins]) with AnonContext[TContext],
    httpRequest: HttpQueryRequest
  ): js.Promise[HttpQueryResponse] = js.native
}

