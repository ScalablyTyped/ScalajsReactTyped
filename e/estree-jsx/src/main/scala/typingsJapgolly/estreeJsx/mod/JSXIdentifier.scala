package typingsJapgolly.estreeJsx.mod

import typingsJapgolly.estree.mod.BaseNode
import typingsJapgolly.estree.mod.Comment
import typingsJapgolly.estree.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXIdentifier extends BaseNode {
  var name: String
  @JSName("type")
  var type_JSXIdentifier: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXIdentifier
}

object JSXIdentifier {
  @scala.inline
  def apply(
    name: String,
    `type`: typingsJapgolly.estreeJsx.estreeJsxStrings.JSXIdentifier,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXIdentifier]
  }
}

