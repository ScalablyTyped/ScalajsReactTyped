package typingsJapgolly.graphql.astMod

import typingsJapgolly.graphql.graphqlStrings.ListType
import typingsJapgolly.graphql.graphqlStrings.NamedType
import typingsJapgolly.graphql.graphqlStrings.NonNullType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.graphql.astMod.NamedTypeNode
  - typingsJapgolly.graphql.astMod.ListTypeNode
  - typingsJapgolly.graphql.astMod.NonNullTypeNode
*/
trait TypeNode extends js.Object

object TypeNode {
  @scala.inline
  def NamedTypeNode(kind: NamedType, name: NameNode, loc: Location = null): TypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeNode]
  }
  @scala.inline
  def ListTypeNode(kind: ListType, `type`: TypeNode, loc: Location = null): TypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeNode]
  }
  @scala.inline
  def NonNullTypeNode(kind: NonNullType, `type`: NamedTypeNode | ListTypeNode, loc: Location = null): TypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeNode]
  }
}

