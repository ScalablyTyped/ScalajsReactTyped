package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.PlussignPlussign
import typingsJapgolly.astTypes.astTypesStrings.`--`
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait UpdateExpression extends ASTNode {
  var argument: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var operator: PlussignPlussign | `--`
  var prefix: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.UpdateExpression
}

object UpdateExpression {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.UpdateExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpression]
  }
}

