package typingsJapgolly.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrowStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  @JSName("type")
  var type_ThrowStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement
}

object ThrowStatement {
  @scala.inline
  def apply(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrowStatement]
  }
}

