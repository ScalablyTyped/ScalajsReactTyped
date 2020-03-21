package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait BindExpression extends ASTNode {
  var callee: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `object`: ExpressionKind | Null
  var `type`: typingsJapgolly.astTypes.astTypesStrings.BindExpression
}

object BindExpression {
  @scala.inline
  def apply(
    callee: ExpressionKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.BindExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    `object`: ExpressionKind = null
  ): BindExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindExpression]
  }
}

