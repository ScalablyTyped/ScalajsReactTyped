package typingsJapgolly.graphql.astMod

import typingsJapgolly.graphql.graphqlStrings.ListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTypeNode
  extends ASTNode
     with TypeNode {
  val kind: ListType
  val loc: js.UndefOr[Location] = js.undefined
  val `type`: TypeNode
}

object ListTypeNode {
  @scala.inline
  def apply(kind: ListType, `type`: TypeNode, loc: Location = null): ListTypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypeNode]
  }
}

