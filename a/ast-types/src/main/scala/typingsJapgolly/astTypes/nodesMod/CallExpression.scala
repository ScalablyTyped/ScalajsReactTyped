package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.SpreadElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait CallExpression extends ASTNode {
  var arguments: js.Array[ExpressionKind | SpreadElementKind]
  var callee: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.CallExpression
}

object CallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.CallExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallExpression]
  }
}

