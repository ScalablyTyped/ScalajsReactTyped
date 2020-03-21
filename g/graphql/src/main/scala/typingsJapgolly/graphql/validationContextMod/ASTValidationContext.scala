package typingsJapgolly.graphql.validationContextMod

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.astMod.FragmentDefinitionNode
import typingsJapgolly.graphql.astMod.FragmentSpreadNode
import typingsJapgolly.graphql.astMod.OperationDefinitionNode
import typingsJapgolly.graphql.astMod.SelectionSetNode
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ASTValidationContext")
@js.native
class ASTValidationContext protected () extends js.Object {
  def this(ast: DocumentNode) = this()
  def getDocument(): DocumentNode = js.native
  def getErrors(): js.Array[GraphQLError] = js.native
  def getFragment(name: String): Maybe[FragmentDefinitionNode] = js.native
  def getFragmentSpreads(node: SelectionSetNode): js.Array[FragmentSpreadNode] = js.native
  def getRecursivelyReferencedFragments(operation: OperationDefinitionNode): js.Array[FragmentDefinitionNode] = js.native
  def reportError(error: GraphQLError): js.UndefOr[scala.Nothing] = js.native
}

