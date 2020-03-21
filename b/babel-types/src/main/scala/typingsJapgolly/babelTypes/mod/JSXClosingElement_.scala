package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.JSXClosingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXClosingElement_
  extends Node
     with Immutable
     with JSX {
  var name: JSXIdentifier_ | JSXMemberExpression_
  @JSName("type")
  var type_JSXClosingElement_ : JSXClosingElement
}

object JSXClosingElement_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    start: Double,
    `type`: JSXClosingElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement_]
  }
}

