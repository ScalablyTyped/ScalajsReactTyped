package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.ASTNode
import typingsJapgolly.graphql.coerceValueMod.CoercedValue
import typingsJapgolly.graphql.definitionMod.GraphQLInputType
import typingsJapgolly.graphql.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "coerceValue")
@js.native
object coerceValue extends js.Object {
  def apply(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def apply(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def apply(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
}

