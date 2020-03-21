package typingsJapgolly.eslintPluginReact.mod._Global_

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.estree.mod.BaseNode
import typingsJapgolly.estree.mod.Comment
import typingsJapgolly.estree.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTNode
  extends BaseNode
     with /* _ */ StringDictionary[js.Any]

object ASTNode {
  @scala.inline
  def apply(
    `type`: String,
    StringDictionary: /* _ */ StringDictionary[js.Any] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
}

