package typingsJapgolly.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPattern
  extends BaseNode
     with Pattern {
  var properties: js.Array[AssignmentProperty]
  @JSName("type")
  var type_ObjectPattern: typingsJapgolly.estree.estreeStrings.ObjectPattern
}

object ObjectPattern {
  @scala.inline
  def apply(
    properties: js.Array[AssignmentProperty],
    `type`: typingsJapgolly.estree.estreeStrings.ObjectPattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
}

