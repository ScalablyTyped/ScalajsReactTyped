package typingsJapgolly.solidityParserAntlr.mod

import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.default
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.external
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.internal
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait ASTNode extends StObject
object ASTNode {
  
  inline def ArrayTypeName(baseTypeName: TypeName): typingsJapgolly.solidityParserAntlr.mod.ArrayTypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeName")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ArrayTypeName]
  }
  
  inline def AssemblyAssignment(expression: AssemblyExpression, names: js.Array[Identifier]): typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyAssignment")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment]
  }
  
  inline def AssemblyBlock(operations: js.Array[AssemblyItem]): typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyBlock")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock]
  }
  
  inline def AssemblyCall(arguments: js.Array[AssemblyExpression], functionName: String): typingsJapgolly.solidityParserAntlr.mod.AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyCall")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyCall]
  }
  
  inline def AssemblyCase(): typingsJapgolly.solidityParserAntlr.mod.AssemblyCase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyCase")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyCase]
  }
  
  inline def AssemblyFor(): typingsJapgolly.solidityParserAntlr.mod.AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFor")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyFor]
  }
  
  inline def AssemblyFunctionDefinition(): typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFunctionDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition]
  }
  
  inline def AssemblyFunctionReturns(): typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionReturns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFunctionReturns")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionReturns]
  }
  
  inline def AssemblyIf(): typingsJapgolly.solidityParserAntlr.mod.AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyIf")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyIf]
  }
  
  inline def AssemblyLiteral(): typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral]
  }
  
  inline def AssemblyLocalDefinition(): typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLocalDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition]
  }
  
  inline def AssemblyStackAssignment(): typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyStackAssignment")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment]
  }
  
  inline def AssemblySwitch(): typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblySwitch")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch]
  }
  
  inline def BinaryOperation(left: Expression, operator: BinOp, right: Expression): typingsJapgolly.solidityParserAntlr.mod.BinaryOperation = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryOperation")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.BinaryOperation]
  }
  
  inline def Block(statements: js.Array[Statement]): typingsJapgolly.solidityParserAntlr.mod.Block = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Block]
  }
  
  inline def BooleanLiteral(value: Boolean): typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral]
  }
  
  inline def Break(): typingsJapgolly.solidityParserAntlr.mod.Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Break")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Break]
  }
  
  inline def BreakStatement(): typingsJapgolly.solidityParserAntlr.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.BreakStatement]
  }
  
  inline def Conditional(falseExpression: ASTNode, trueExpression: ASTNode): typingsJapgolly.solidityParserAntlr.mod.Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Conditional")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Conditional]
  }
  
  inline def Continue(): typingsJapgolly.solidityParserAntlr.mod.Continue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Continue")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Continue]
  }
  
  inline def ContinueStatement(): typingsJapgolly.solidityParserAntlr.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ContinueStatement]
  }
  
  inline def ContractDefinition(
    baseContracts: js.Array[InheritanceSpecifier],
    kind: String,
    name: String,
    subNodes: js.Array[ASTNode]
  ): typingsJapgolly.solidityParserAntlr.mod.ContractDefinition = {
    val __obj = js.Dynamic.literal(baseContracts = baseContracts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subNodes = subNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContractDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ContractDefinition]
  }
  
  inline def DecimalNumber(value: String): typingsJapgolly.solidityParserAntlr.mod.DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalNumber")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.DecimalNumber]
  }
  
  inline def DoWhileStatement(body: Statement, condition: Expression): typingsJapgolly.solidityParserAntlr.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.DoWhileStatement]
  }
  
  inline def ElementaryTypeName(name: String): typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeName")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeName]
  }
  
  inline def ElementaryTypeNameExpression(typeName: ElementaryTypeName): typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeNameExpression")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression]
  }
  
  inline def EmitStatement(eventCall: FunctionCall): typingsJapgolly.solidityParserAntlr.mod.EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmitStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.EmitStatement]
  }
  
  inline def EnumDefinition(members: js.Array[EnumValue], name: String): typingsJapgolly.solidityParserAntlr.mod.EnumDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.EnumDefinition]
  }
  
  inline def EnumValue(name: String): typingsJapgolly.solidityParserAntlr.mod.EnumValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumValue")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.EnumValue]
  }
  
  inline def EventDefinition(name: String, parameters: js.Array[VariableDeclaration]): typingsJapgolly.solidityParserAntlr.mod.EventDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EventDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.EventDefinition]
  }
  
  inline def ExpressionStatement(expression: Expression): typingsJapgolly.solidityParserAntlr.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ExpressionStatement]
  }
  
  inline def ForStatement(body: Statement): typingsJapgolly.solidityParserAntlr.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ForStatement]
  }
  
  inline def FunctionCall(arguments: js.Array[Expression], expression: Expression, names: js.Array[String]): typingsJapgolly.solidityParserAntlr.mod.FunctionCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionCall")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.FunctionCall]
  }
  
  inline def FunctionDefinition(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    visibility: default | external | internal | public | `private`
  ): typingsJapgolly.solidityParserAntlr.mod.FunctionDefinition = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.FunctionDefinition]
  }
  
  inline def FunctionTypeName(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    visibility: String
  ): typingsJapgolly.solidityParserAntlr.mod.FunctionTypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeName")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.FunctionTypeName]
  }
  
  inline def HexLiteral(value: String): typingsJapgolly.solidityParserAntlr.mod.HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.HexLiteral]
  }
  
  inline def HexNumber(value: String): typingsJapgolly.solidityParserAntlr.mod.HexNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexNumber")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.HexNumber]
  }
  
  inline def Identifier(name: String): typingsJapgolly.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Identifier]
  }
  
  inline def IfStatement(condition: Expression, trueBody: Statement): typingsJapgolly.solidityParserAntlr.mod.IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.IfStatement]
  }
  
  inline def ImportDirective(path: String, symbolAliases: js.Array[js.Tuple2[String, String]], unitAlias: String): typingsJapgolly.solidityParserAntlr.mod.ImportDirective = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDirective")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ImportDirective]
  }
  
  inline def IndexAccess(base: Expression, index: Expression): typingsJapgolly.solidityParserAntlr.mod.IndexAccess = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexAccess")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.IndexAccess]
  }
  
  inline def InheritanceSpecifier(arguments: js.Array[Expression], baseName: UserDefinedTypeName): typingsJapgolly.solidityParserAntlr.mod.InheritanceSpecifier = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InheritanceSpecifier")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.InheritanceSpecifier]
  }
  
  inline def InlineAssemblyStatement(body: AssemblyBlock, language: String): typingsJapgolly.solidityParserAntlr.mod.InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InlineAssemblyStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.InlineAssemblyStatement]
  }
  
  inline def LabelDefinition(): typingsJapgolly.solidityParserAntlr.mod.LabelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("LabelDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.LabelDefinition]
  }
  
  inline def Mapping(keyType: ElementaryTypeName, valueType: TypeName): typingsJapgolly.solidityParserAntlr.mod.Mapping = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Mapping")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Mapping]
  }
  
  inline def MemberAccess(expression: Expression, memberName: String): typingsJapgolly.solidityParserAntlr.mod.MemberAccess = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberAccess")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.MemberAccess]
  }
  
  inline def ModifierDefinition(name: String): typingsJapgolly.solidityParserAntlr.mod.ModifierDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ModifierDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ModifierDefinition]
  }
  
  inline def ModifierInvocation(name: String): typingsJapgolly.solidityParserAntlr.mod.ModifierInvocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], arguments = null)
    __obj.updateDynamic("type")("ModifierInvocation")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ModifierInvocation]
  }
  
  inline def NumberLiteral(number: String): typingsJapgolly.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], subdenomination = null)
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.NumberLiteral]
  }
  
  inline def PragmaDirective(name: String, value: String): typingsJapgolly.solidityParserAntlr.mod.PragmaDirective = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PragmaDirective")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.PragmaDirective]
  }
  
  inline def ReturnStatement(): typingsJapgolly.solidityParserAntlr.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal(expression = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ReturnStatement]
  }
  
  inline def SourceUnit(children: js.Array[ASTNode]): typingsJapgolly.solidityParserAntlr.mod.SourceUnit = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SourceUnit")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.SourceUnit]
  }
  
  inline def StateVariableDeclaration(variables: js.Array[VariableDeclaration]): typingsJapgolly.solidityParserAntlr.mod.StateVariableDeclaration = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StateVariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.StateVariableDeclaration]
  }
  
  inline def StringLiteral(value: String): typingsJapgolly.solidityParserAntlr.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.StringLiteral]
  }
  
  inline def StructDefinition(members: js.Array[VariableDeclaration], name: String): typingsJapgolly.solidityParserAntlr.mod.StructDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StructDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.StructDefinition]
  }
  
  inline def SubAssembly(): typingsJapgolly.solidityParserAntlr.mod.SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SubAssembly")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.SubAssembly]
  }
  
  inline def ThrowStatement(): typingsJapgolly.solidityParserAntlr.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.ThrowStatement]
  }
  
  inline def TupleExpression(components: js.Array[Expression], isArray: Boolean): typingsJapgolly.solidityParserAntlr.mod.TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.TupleExpression]
  }
  
  inline def UserDefinedTypeName(namePath: String): typingsJapgolly.solidityParserAntlr.mod.UserDefinedTypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UserDefinedTypeName")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.UserDefinedTypeName]
  }
  
  inline def UsingForDeclaration(libraryName: String, typeName: TypeName): typingsJapgolly.solidityParserAntlr.mod.UsingForDeclaration = {
    val __obj = js.Dynamic.literal(libraryName = libraryName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UsingForDeclaration")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.UsingForDeclaration]
  }
  
  inline def VariableDeclaration(isIndexed: Boolean, isStateVar: Boolean, name: String, typeName: TypeName): typingsJapgolly.solidityParserAntlr.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed.asInstanceOf[js.Any], isStateVar = isStateVar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.VariableDeclaration]
  }
  
  inline def VariableDeclarationStatement(variables: js.Array[ASTNode]): typingsJapgolly.solidityParserAntlr.mod.VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarationStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.VariableDeclarationStatement]
  }
  
  inline def WhileStatement(): typingsJapgolly.solidityParserAntlr.mod.WhileStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.WhileStatement]
  }
}
