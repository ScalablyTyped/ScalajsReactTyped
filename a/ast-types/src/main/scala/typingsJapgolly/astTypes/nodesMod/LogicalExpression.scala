package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.AmpersandAmpersand
import typingsJapgolly.astTypes.astTypesStrings.QuestionmarkQuestionmark
import typingsJapgolly.astTypes.astTypesStrings.VerticallineVerticalline
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait LogicalExpression extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark
  var right: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.LogicalExpression
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: ExpressionKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.LogicalExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression]
  }
}

