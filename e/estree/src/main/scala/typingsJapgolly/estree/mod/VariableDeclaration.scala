package typingsJapgolly.estree.mod

import typingsJapgolly.estree.estreeStrings.`var`
import typingsJapgolly.estree.estreeStrings.const
import typingsJapgolly.estree.estreeStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends Declaration
     with BaseNode {
  var declarations: js.Array[VariableDeclarator]
  var kind: `var` | let | const
  @JSName("type")
  var type_VariableDeclaration: typingsJapgolly.estree.estreeStrings.VariableDeclaration
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator],
    kind: `var` | let | const,
    `type`: typingsJapgolly.estree.estreeStrings.VariableDeclaration,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration]
  }
}

