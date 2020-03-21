package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.ASTNode
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "locatedError")
@js.native
object locatedError extends js.Object {
  def apply(
    originalError: typingsJapgolly.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typingsJapgolly.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typingsJapgolly.graphql.graphQLErrorMod.GraphQLError = js.native
}

