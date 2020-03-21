package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait JSXExpressionContainer extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var expression: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.JSXExpressionContainer
}

object JSXExpressionContainer {
  @scala.inline
  def apply(
    expression: ExpressionKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.JSXExpressionContainer,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXExpressionContainer]
  }
}

