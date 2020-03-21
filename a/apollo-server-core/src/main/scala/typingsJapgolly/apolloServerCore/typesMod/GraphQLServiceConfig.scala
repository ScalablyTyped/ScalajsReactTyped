package typingsJapgolly.apolloServerCore.typesMod

import typingsJapgolly.apolloServerCore.apolloServerCoreStrings.document
import typingsJapgolly.apolloServerCore.apolloServerCoreStrings.operation
import typingsJapgolly.apolloServerCore.apolloServerCoreStrings.operationName
import typingsJapgolly.apolloServerCore.apolloServerCoreStrings.queryHash
import typingsJapgolly.apolloServerTypes.mod.GraphQLExecutionResult
import typingsJapgolly.apolloServerTypes.mod.GraphQLExecutor
import typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext
import typingsJapgolly.apolloServerTypes.mod.ValueOrPromise
import typingsJapgolly.apolloServerTypes.mod.WithRequired
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLServiceConfig extends js.Object {
  @JSName("executor")
  var executor_Original: GraphQLExecutor[Record[String, _]] = js.native
  var schema: GraphQLSchema = js.native
  def executor(
    requestContext: WithRequired[
      GraphQLRequestContext[Record[String, _]], 
      document | operationName | operation | queryHash
    ]
  ): ValueOrPromise[GraphQLExecutionResult] = js.native
}

