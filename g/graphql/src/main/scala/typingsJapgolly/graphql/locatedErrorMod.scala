package typingsJapgolly.graphql

import typingsJapgolly.graphql.astMod.ASTNode
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/locatedError", JSImport.Namespace)
@js.native
object locatedErrorMod extends js.Object {
  def locatedError(originalError: GraphQLError, nodes: js.Array[ASTNode], path: js.Array[String | Double]): GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): GraphQLError = js.native
}

