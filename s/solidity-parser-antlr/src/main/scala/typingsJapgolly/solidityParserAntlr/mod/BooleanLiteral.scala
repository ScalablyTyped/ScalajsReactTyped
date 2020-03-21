package typingsJapgolly.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral
  extends PrimaryExpression
     with BaseASTNode {
  @JSName("type")
  var type_BooleanLiteral: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral
  var value: Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral,
    value: Boolean,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteral]
  }
}

