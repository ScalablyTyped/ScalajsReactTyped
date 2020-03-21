package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStatement_
  extends Node
     with Statement {
  var body: BlockStatement_ | Statement
  var `object`: Expression
  @JSName("type")
  var type_WithStatement_ : WithStatement
}

object WithStatement_ {
  @scala.inline
  def apply(
    body: BlockStatement_ | Statement,
    end: Double,
    loc: SourceLocation,
    `object`: Expression,
    start: Double,
    `type`: WithStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStatement_]
  }
}

