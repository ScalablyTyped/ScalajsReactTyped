package typingsJapgolly.solidityParserAntlr.mod

import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.constant
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.days
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.default
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ether
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.external
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.finney
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.hours
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.internal
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.minutes
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.payable
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.public
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.pure
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.seconds
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.szabo
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.view
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.weeks
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.wei
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.solidityParserAntlr.mod.SourceUnit
  - typingsJapgolly.solidityParserAntlr.mod.PragmaDirective
  - typingsJapgolly.solidityParserAntlr.mod.ImportDirective
  - typingsJapgolly.solidityParserAntlr.mod.ContractDefinition
  - typingsJapgolly.solidityParserAntlr.mod.InheritanceSpecifier
  - typingsJapgolly.solidityParserAntlr.mod.StateVariableDeclaration
  - typingsJapgolly.solidityParserAntlr.mod.UsingForDeclaration
  - typingsJapgolly.solidityParserAntlr.mod.StructDefinition
  - typingsJapgolly.solidityParserAntlr.mod.ModifierDefinition
  - typingsJapgolly.solidityParserAntlr.mod.ModifierInvocation
  - typingsJapgolly.solidityParserAntlr.mod.FunctionDefinition
  - typingsJapgolly.solidityParserAntlr.mod.EventDefinition
  - typingsJapgolly.solidityParserAntlr.mod.EnumValue
  - typingsJapgolly.solidityParserAntlr.mod.EnumDefinition
  - typingsJapgolly.solidityParserAntlr.mod.VariableDeclaration
  - typingsJapgolly.solidityParserAntlr.mod.TypeName
  - typingsJapgolly.solidityParserAntlr.mod.UserDefinedTypeName
  - typingsJapgolly.solidityParserAntlr.mod.Mapping
  - typingsJapgolly.solidityParserAntlr.mod.FunctionTypeName
  - typingsJapgolly.solidityParserAntlr.mod.Block
  - typingsJapgolly.solidityParserAntlr.mod.ExpressionStatement
  - typingsJapgolly.solidityParserAntlr.mod.IfStatement
  - typingsJapgolly.solidityParserAntlr.mod.WhileStatement
  - typingsJapgolly.solidityParserAntlr.mod.ForStatement
  - typingsJapgolly.solidityParserAntlr.mod.InlineAssemblyStatement
  - typingsJapgolly.solidityParserAntlr.mod.DoWhileStatement
  - typingsJapgolly.solidityParserAntlr.mod.ContinueStatement
  - typingsJapgolly.solidityParserAntlr.mod.BreakStatement
  - typingsJapgolly.solidityParserAntlr.mod.ReturnStatement
  - typingsJapgolly.solidityParserAntlr.mod.EmitStatement
  - typingsJapgolly.solidityParserAntlr.mod.ThrowStatement
  - typingsJapgolly.solidityParserAntlr.mod.VariableDeclarationStatement
  - typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeName
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyCall
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment
  - typingsJapgolly.solidityParserAntlr.mod.LabelDefinition
  - typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyCase
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionReturns
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyFor
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyIf
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral
  - typingsJapgolly.solidityParserAntlr.mod.SubAssembly
  - typingsJapgolly.solidityParserAntlr.mod.TupleExpression
  - typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression
  - typingsJapgolly.solidityParserAntlr.mod.BinaryOperation
  - typingsJapgolly.solidityParserAntlr.mod.Conditional
  - typingsJapgolly.solidityParserAntlr.mod.IndexAccess
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyItem
  - typingsJapgolly.solidityParserAntlr.mod.Expression
*/
trait ASTNode extends js.Object

object ASTNode {
  @scala.inline
  def WhileStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InlineAssemblyStatement(
    body: AssemblyBlock,
    language: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def VariableDeclarationStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode],
    initialValue: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DecimalNumber(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ElementaryTypeName(
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ModifierInvocation(
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation,
    arguments: js.Array[Expression] = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SourceUnit(
    children: js.Array[ASTNode],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EmitStatement(
    eventCall: FunctionCall,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StateVariableDeclaration(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration,
    variables: js.Array[VariableDeclaration],
    initialValue: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Continue(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Continue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ContractDefinition(
    baseContracts: js.Array[InheritanceSpecifier],
    kind: String,
    name: String,
    subNodes: js.Array[ASTNode],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(baseContracts = baseContracts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subNodes = subNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def IndexAccess(
    base: Expression,
    index: Expression,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyIf(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyCase(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Break(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Break,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionTypeName(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName,
    visibility: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BinaryOperation(
    left: Expression,
    operator: BinOp,
    right: Expression,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Block(
    statements: js.Array[Statement],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Block,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ReturnStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement,
    expression: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyStackAssignment(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BreakStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def LabelDefinition(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def UsingForDeclaration(
    libraryName: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration,
    typeName: TypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(libraryName = libraryName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def HexNumber(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.HexNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ArrayTypeName(
    baseTypeName: TypeName,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName,
    length: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StructDefinition(
    members: js.Array[VariableDeclaration],
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EnumDefinition(
    members: js.Array[EnumValue],
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InheritanceSpecifier(
    arguments: js.Array[Expression],
    baseName: UserDefinedTypeName,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyFor(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ThrowStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblySwitch(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def VariableDeclaration(
    isIndexed: Boolean,
    isStateVar: Boolean,
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration,
    typeName: TypeName,
    expression: Expression = null,
    isDeclaredConst: js.UndefOr[Boolean] = js.undefined,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    storageLocation: String = null,
    visibility: public | `private` | internal | default = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed.asInstanceOf[js.Any], isStateVar = isStateVar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeclaredConst)) __obj.updateDynamic("isDeclaredConst")(isDeclaredConst.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (storageLocation != null) __obj.updateDynamic("storageLocation")(storageLocation.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ModifierDefinition(
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DoWhileStatement(
    body: Statement,
    condition: Expression,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ForStatement(
    body: Statement,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ForStatement,
    conditionExpression: Expression = null,
    initExpression: SimpleStatement = null,
    loc: Location = null,
    loopExpression: ExpressionStatement = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (conditionExpression != null) __obj.updateDynamic("conditionExpression")(conditionExpression.asInstanceOf[js.Any])
    if (initExpression != null) __obj.updateDynamic("initExpression")(initExpression.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (loopExpression != null) __obj.updateDynamic("loopExpression")(loopExpression.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyLocalDefinition(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NumberLiteral(
    number: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyLiteral(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def HexLiteral(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StringLiteral(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def PragmaDirective(
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ElementaryTypeNameExpression(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExpressionStatement(
    expression: Expression,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionDefinition(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition,
    visibility: default | external | internal | public | `private`,
    body: Block = null,
    loc: Location = null,
    name: String = null,
    range: js.Tuple2[Double, Double] = null,
    returnParameters: js.Array[VariableDeclaration] = null,
    stateMutability: pure | constant | payable | view = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (returnParameters != null) __obj.updateDynamic("returnParameters")(returnParameters.asInstanceOf[js.Any])
    if (stateMutability != null) __obj.updateDynamic("stateMutability")(stateMutability.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SubAssembly(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Mapping(
    keyType: ElementaryTypeName,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Mapping,
    valueType: TypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BooleanLiteral(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral,
    value: Boolean,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ImportDirective(
    path: String,
    symbolAliases: js.Array[js.Tuple2[String, String]],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective,
    unitAlias: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def MemberAccess(
    expression: Expression,
    memberName: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyFunctionReturns(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ContinueStatement(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def UserDefinedTypeName(
    namePath: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def IfStatement(
    condition: Expression,
    trueBody: Statement,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.IfStatement,
    falseBody: Statement = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (falseBody != null) __obj.updateDynamic("falseBody")(falseBody.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyFunctionDefinition(
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Conditional(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Conditional,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EnumValue(
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EnumValue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionCall(
    arguments: js.Array[Expression],
    expression: Expression,
    names: js.Array[String],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EventDefinition(
    name: String,
    parameters: js.Array[VariableDeclaration],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TupleExpression(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
}

