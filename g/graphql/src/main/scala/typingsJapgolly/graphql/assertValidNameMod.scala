package typingsJapgolly.graphql

import typingsJapgolly.graphql.astMod.ASTNode
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/assertValidName", JSImport.Namespace)
@js.native
object assertValidNameMod extends js.Object {
  def assertValidName(name: String): String = js.native
  def isValidNameError(name: String): js.UndefOr[GraphQLError] = js.native
  def isValidNameError(name: String, node: ASTNode): js.UndefOr[GraphQLError] = js.native
}

