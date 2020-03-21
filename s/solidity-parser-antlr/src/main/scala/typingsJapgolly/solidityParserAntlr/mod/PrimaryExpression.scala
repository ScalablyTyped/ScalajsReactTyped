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

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral
  - typingsJapgolly.solidityParserAntlr.mod.NumberLiteral
  - typingsJapgolly.solidityParserAntlr.mod.Identifier
  - typingsJapgolly.solidityParserAntlr.mod.TupleExpression
  - typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression
*/
trait PrimaryExpression extends Expression

object PrimaryExpression {
  @scala.inline
  def NumberLiteral(
    number: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def ElementaryTypeNameExpression(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def BooleanLiteral(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral,
    value: Boolean,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def TupleExpression(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
}

