package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.Ampersand
import typingsJapgolly.babelTypes.babelTypesStrings.AmpersandAmpersand
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
import typingsJapgolly.babelTypes.babelTypesStrings.LogicalExpression
import typingsJapgolly.babelTypes.babelTypesStrings.Percentsign
import typingsJapgolly.babelTypes.babelTypesStrings.Plussign
import typingsJapgolly.babelTypes.babelTypesStrings.QuestionmarkQuestionmark
import typingsJapgolly.babelTypes.babelTypesStrings.Slash
import typingsJapgolly.babelTypes.babelTypesStrings.Verticalline
import typingsJapgolly.babelTypes.babelTypesStrings.VerticallineVerticalline
import typingsJapgolly.babelTypes.babelTypesStrings.^
import typingsJapgolly.babelTypes.babelTypesStrings.`-_`
import typingsJapgolly.babelTypes.babelTypesStrings.in
import typingsJapgolly.babelTypes.babelTypesStrings.instanceof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.BinaryExpression_
  - typingsJapgolly.babelTypes.mod.LogicalExpression_
*/
trait Binary extends _Node

object Binary {
  @scala.inline
  def BinaryExpression_(
    left: Expression,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    `type`: BinaryExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Binary = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  def LogicalExpression_(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression,
    `type`: LogicalExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Binary = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
}

