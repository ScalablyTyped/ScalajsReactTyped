package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.Exclamationmark
import typingsJapgolly.babelTypes.babelTypesStrings.Plussign
import typingsJapgolly.babelTypes.babelTypesStrings.Tilde
import typingsJapgolly.babelTypes.babelTypesStrings.UnaryExpression
import typingsJapgolly.babelTypes.babelTypesStrings.`-_`
import typingsJapgolly.babelTypes.babelTypesStrings.delete
import typingsJapgolly.babelTypes.babelTypesStrings.typeof
import typingsJapgolly.babelTypes.babelTypesStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression_
  extends Node
     with Expression
     with UnaryLike {
  var argument: Expression
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  var prefix: Boolean
  @JSName("type")
  var type_UnaryExpression_ : UnaryExpression
}

object UnaryExpression_ {
  @scala.inline
  def apply(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    start: Double,
    `type`: UnaryExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression_]
  }
}

