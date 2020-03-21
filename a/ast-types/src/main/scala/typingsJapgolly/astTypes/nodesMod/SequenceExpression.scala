package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait SequenceExpression extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var expressions: js.Array[ExpressionKind]
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.SequenceExpression
}

object SequenceExpression {
  @scala.inline
  def apply(
    expressions: js.Array[ExpressionKind],
    `type`: typingsJapgolly.astTypes.astTypesStrings.SequenceExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceExpression]
  }
}

