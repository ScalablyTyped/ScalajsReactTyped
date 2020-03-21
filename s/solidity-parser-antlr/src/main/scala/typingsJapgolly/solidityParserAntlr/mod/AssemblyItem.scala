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
  - typingsJapgolly.solidityParserAntlr.mod.Identifier
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyExpression
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment
  - typingsJapgolly.solidityParserAntlr.mod.LabelDefinition
  - typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyFor
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyIf
  - typingsJapgolly.solidityParserAntlr.mod.Break
  - typingsJapgolly.solidityParserAntlr.mod.Continue
  - typingsJapgolly.solidityParserAntlr.mod.SubAssembly
  - typingsJapgolly.solidityParserAntlr.mod.NumberLiteral
  - typingsJapgolly.solidityParserAntlr.mod.StringLiteral
  - typingsJapgolly.solidityParserAntlr.mod.HexNumber
  - typingsJapgolly.solidityParserAntlr.mod.HexLiteral
  - typingsJapgolly.solidityParserAntlr.mod.DecimalNumber
*/
trait AssemblyItem extends ASTNode

object AssemblyItem {
  @scala.inline
  def DecimalNumber(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def Continue(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Continue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyIf(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def Break(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Break,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyStackAssignment(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def LabelDefinition(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def HexNumber(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.HexNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyFor(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblySwitch(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyLocalDefinition(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def NumberLiteral(
    number: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyLiteral(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def HexLiteral(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def StringLiteral(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def SubAssembly(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyFunctionDefinition(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
}

