package typingsJapgolly.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStatement
  extends BaseNode
     with Statement {
  var body: Statement
  var `object`: Expression
  @JSName("type")
  var type_WithStatement: typingsJapgolly.estree.estreeStrings.WithStatement
}

object WithStatement {
  @scala.inline
  def apply(
    body: Statement,
    `object`: Expression,
    `type`: typingsJapgolly.estree.estreeStrings.WithStatement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStatement]
  }
}

