package typingsJapgolly.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.solidityParserAntlr.mod.ASTNode because Already inherited */ trait ElementaryTypeNameExpression
  extends PrimaryExpression
     with BaseASTNode {
  var typeName: ElementaryTypeName
  @JSName("type")
  var type_ElementaryTypeNameExpression: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression
}

object ElementaryTypeNameExpression {
  @scala.inline
  def apply(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementaryTypeNameExpression]
  }
}

