package typingsJapgolly.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.solidityParserAntlr.mod.ASTNode because Already inherited */ trait AssemblyStackAssignment
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_AssemblyStackAssignment: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment
}

object AssemblyStackAssignment {
  @scala.inline
  def apply(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyStackAssignment]
  }
}

