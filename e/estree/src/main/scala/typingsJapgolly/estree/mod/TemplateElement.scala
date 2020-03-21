package typingsJapgolly.estree.mod

import typingsJapgolly.estree.AnonCooked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement
  extends BaseNode
     with Node {
  var tail: Boolean
  @JSName("type")
  var type_TemplateElement: typingsJapgolly.estree.estreeStrings.TemplateElement
  var value: AnonCooked
}

object TemplateElement {
  @scala.inline
  def apply(
    tail: Boolean,
    `type`: typingsJapgolly.estree.estreeStrings.TemplateElement,
    value: AnonCooked,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateElement]
  }
}

