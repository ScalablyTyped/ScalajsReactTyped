package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.Ampersand
import typingsJapgolly.astTypes.astTypesStrings.Asterisk
import typingsJapgolly.astTypes.astTypesStrings.AsteriskAsterisk
import typingsJapgolly.astTypes.astTypesStrings.EqualssignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typingsJapgolly.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.Greaterthansign
import typingsJapgolly.astTypes.astTypesStrings.GreaterthansignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typingsJapgolly.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsJapgolly.astTypes.astTypesStrings.Lessthansign
import typingsJapgolly.astTypes.astTypesStrings.LessthansignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.LessthansignLessthansign
import typingsJapgolly.astTypes.astTypesStrings.Percentsign
import typingsJapgolly.astTypes.astTypesStrings.Plussign
import typingsJapgolly.astTypes.astTypesStrings.Slash
import typingsJapgolly.astTypes.astTypesStrings.Verticalline
import typingsJapgolly.astTypes.astTypesStrings.^
import typingsJapgolly.astTypes.astTypesStrings.`-_`
import typingsJapgolly.astTypes.astTypesStrings.in
import typingsJapgolly.astTypes.astTypesStrings.instanceof
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait BinaryExpression extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof
  var right: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    right: ExpressionKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.BinaryExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
}

