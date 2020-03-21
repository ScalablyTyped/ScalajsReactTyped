package typingsJapgolly.estreeJsx.mod

import typingsJapgolly.estree.mod.BaseNode
import typingsJapgolly.estree.mod.Comment
import typingsJapgolly.estree.mod.Expression
import typingsJapgolly.estree.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXSpreadChild extends BaseNode {
  var expression: Expression
  @JSName("type")
  var type_JSXSpreadChild: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXSpreadChild
}

object JSXSpreadChild {
  @scala.inline
  def apply(
    expression: Expression,
    `type`: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXSpreadChild,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXSpreadChild]
  }
}

