package typingsJapgolly.solidityParserAntlr.mod

import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.days
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ether
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.finney
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.hours
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.minutes
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.seconds
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.szabo
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.weeks
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.wei
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLiteral
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  var number: String
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years
  @JSName("type")
  var type_NumberLiteral: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral
}

object NumberLiteral {
  @scala.inline
  def apply(
    number: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteral]
  }
}

