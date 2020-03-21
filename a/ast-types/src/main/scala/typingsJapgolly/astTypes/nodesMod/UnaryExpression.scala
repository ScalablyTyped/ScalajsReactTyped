package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.Exclamationmark
import typingsJapgolly.astTypes.astTypesStrings.Plussign
import typingsJapgolly.astTypes.astTypesStrings.Tilde
import typingsJapgolly.astTypes.astTypesStrings.`-_`
import typingsJapgolly.astTypes.astTypesStrings.delete
import typingsJapgolly.astTypes.astTypesStrings.typeof
import typingsJapgolly.astTypes.astTypesStrings.void
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait UnaryExpression extends ASTNode {
  var argument: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  var prefix: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.UnaryExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
}

