package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.Ampersand
import typingsJapgolly.babelTypes.babelTypesStrings.Asterisk
import typingsJapgolly.babelTypes.babelTypesStrings.AsteriskAsterisk
import typingsJapgolly.babelTypes.babelTypesStrings.BinaryExpression
import typingsJapgolly.babelTypes.babelTypesStrings.EqualssignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.EqualssignEqualssignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.ExclamationmarkEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.Greaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignGreaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.Lessthansign
import typingsJapgolly.babelTypes.babelTypesStrings.LessthansignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.LessthansignLessthansign
import typingsJapgolly.babelTypes.babelTypesStrings.Percentsign
import typingsJapgolly.babelTypes.babelTypesStrings.Plussign
import typingsJapgolly.babelTypes.babelTypesStrings.Slash
import typingsJapgolly.babelTypes.babelTypesStrings.Verticalline
import typingsJapgolly.babelTypes.babelTypesStrings.^
import typingsJapgolly.babelTypes.babelTypesStrings.`-_`
import typingsJapgolly.babelTypes.babelTypesStrings.in
import typingsJapgolly.babelTypes.babelTypesStrings.instanceof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression_
  extends Node
     with Binary
     with Expression {
  var left: Expression
  var operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
  var right: Expression
  @JSName("type")
  var type_BinaryExpression_ : BinaryExpression
}

object BinaryExpression_ {
  @scala.inline
  def apply(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    start: Double,
    `type`: BinaryExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BinaryExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression_]
  }
}

