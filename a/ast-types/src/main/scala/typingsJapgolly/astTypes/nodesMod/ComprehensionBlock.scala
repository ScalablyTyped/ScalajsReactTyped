package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait ComprehensionBlock extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var each: Boolean
  var left: PatternKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ComprehensionBlock
}

object ComprehensionBlock {
  @scala.inline
  def apply(
    each: Boolean,
    left: PatternKind,
    right: ExpressionKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.ComprehensionBlock,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ComprehensionBlock = {
    val __obj = js.Dynamic.literal(each = each.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComprehensionBlock]
  }
}

