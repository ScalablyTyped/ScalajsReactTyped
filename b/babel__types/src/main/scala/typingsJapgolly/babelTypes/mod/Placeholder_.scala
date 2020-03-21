package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.BlockStatement
import typingsJapgolly.babelTypes.babelTypesStrings.ClassBody
import typingsJapgolly.babelTypes.babelTypesStrings.Identifier
import typingsJapgolly.babelTypes.babelTypesStrings.Placeholder
import typingsJapgolly.babelTypes.babelTypesStrings.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder_
  extends BaseNode
     with _Node {
  var expectedNode: Identifier | StringLiteral | typingsJapgolly.babelTypes.babelTypesStrings.Expression | typingsJapgolly.babelTypes.babelTypesStrings.Statement | typingsJapgolly.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsJapgolly.babelTypes.babelTypesStrings.Pattern
  var name: Identifier_
  @JSName("type")
  var type_Placeholder_ : Placeholder
}

object Placeholder_ {
  @scala.inline
  def apply(
    expectedNode: Identifier | StringLiteral | typingsJapgolly.babelTypes.babelTypesStrings.Expression | typingsJapgolly.babelTypes.babelTypesStrings.Statement | typingsJapgolly.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsJapgolly.babelTypes.babelTypesStrings.Pattern,
    name: Identifier_,
    `type`: Placeholder,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder_]
  }
}

