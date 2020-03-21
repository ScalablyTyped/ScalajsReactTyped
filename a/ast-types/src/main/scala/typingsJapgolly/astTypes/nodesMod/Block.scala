package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block
  extends Comment
     with ASTNode {
  var `type`: typingsJapgolly.astTypes.astTypesStrings.Block
}

object Block {
  @scala.inline
  def apply(
    leading: Boolean,
    trailing: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.Block,
    value: String,
    loc: SourceLocationKind = null
  ): Block = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

