package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.AmpersandEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.AssignmentExpression
import typingsJapgolly.babelTypes.babelTypesStrings.AsteriskEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.Equalssign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.LessthansignLessthansignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.PercentsignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.PlussignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.SlashEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.VerticallineEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.`-Equalssign`
import typingsJapgolly.babelTypes.babelTypesStrings.`^Equalssign`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentExpression_
  extends Node
     with Expression {
  var left: LVal
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: Expression
  @JSName("type")
  var type_AssignmentExpression_ : AssignmentExpression
}

object AssignmentExpression_ {
  @scala.inline
  def apply(
    end: Double,
    left: LVal,
    loc: SourceLocation,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: Expression,
    start: Double,
    `type`: AssignmentExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression_]
  }
}

