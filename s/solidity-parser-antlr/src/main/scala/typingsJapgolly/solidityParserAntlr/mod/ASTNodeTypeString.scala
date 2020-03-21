package typingsJapgolly.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.PragmaName
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EnumValue
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Mapping
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StateMutability
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Block
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ForStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Break
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Continue
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Identifier
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Conditional
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.HexNumber
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess
  - typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess
*/
trait ASTNodeTypeString extends js.Object

object ASTNodeTypeString {
  @scala.inline
  def ArrayTypeName: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName = this.cast("ArrayTypeName")
  @scala.inline
  def AssemblyAssignment: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment = this.cast("AssemblyAssignment")
  @scala.inline
  def AssemblyBlock: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock = this.cast("AssemblyBlock")
  @scala.inline
  def AssemblyCall: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall = this.cast("AssemblyCall")
  @scala.inline
  def AssemblyCase: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase = this.cast("AssemblyCase")
  @scala.inline
  def AssemblyFor: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor = this.cast("AssemblyFor")
  @scala.inline
  def AssemblyFunctionDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition = this.cast("AssemblyFunctionDefinition")
  @scala.inline
  def AssemblyFunctionReturns: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns = this.cast("AssemblyFunctionReturns")
  @scala.inline
  def AssemblyIf: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf = this.cast("AssemblyIf")
  @scala.inline
  def AssemblyItem: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem = this.cast("AssemblyItem")
  @scala.inline
  def AssemblyLiteral: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral = this.cast("AssemblyLiteral")
  @scala.inline
  def AssemblyLocalDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition = this.cast("AssemblyLocalDefinition")
  @scala.inline
  def AssemblyStackAssignment: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment = this.cast("AssemblyStackAssignment")
  @scala.inline
  def AssemblySwitch: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch = this.cast("AssemblySwitch")
  @scala.inline
  def BinaryOperation: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation = this.cast("BinaryOperation")
  @scala.inline
  def Block: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Block = this.cast("Block")
  @scala.inline
  def BooleanLiteral: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral = this.cast("BooleanLiteral")
  @scala.inline
  def Break: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Break = this.cast("Break")
  @scala.inline
  def BreakStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement = this.cast("BreakStatement")
  @scala.inline
  def Conditional: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Conditional = this.cast("Conditional")
  @scala.inline
  def Continue: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Continue = this.cast("Continue")
  @scala.inline
  def ContinueStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement = this.cast("ContinueStatement")
  @scala.inline
  def ContractDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition = this.cast("ContractDefinition")
  @scala.inline
  def DecimalNumber: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber = this.cast("DecimalNumber")
  @scala.inline
  def DoWhileStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement = this.cast("DoWhileStatement")
  @scala.inline
  def ElementaryTypeName: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName = this.cast("ElementaryTypeName")
  @scala.inline
  def ElementaryTypeNameExpression: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression = this.cast("ElementaryTypeNameExpression")
  @scala.inline
  def EmitStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement = this.cast("EmitStatement")
  @scala.inline
  def EnumDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition = this.cast("EnumDefinition")
  @scala.inline
  def EnumValue: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EnumValue = this.cast("EnumValue")
  @scala.inline
  def EventDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition = this.cast("EventDefinition")
  @scala.inline
  def ExpressionStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement = this.cast("ExpressionStatement")
  @scala.inline
  def ForStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ForStatement = this.cast("ForStatement")
  @scala.inline
  def FunctionCall: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall = this.cast("FunctionCall")
  @scala.inline
  def FunctionDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition = this.cast("FunctionDefinition")
  @scala.inline
  def FunctionTypeName: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName = this.cast("FunctionTypeName")
  @scala.inline
  def HexLiteral: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral = this.cast("HexLiteral")
  @scala.inline
  def HexNumber: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.HexNumber = this.cast("HexNumber")
  @scala.inline
  def Identifier: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Identifier = this.cast("Identifier")
  @scala.inline
  def IdentifierList: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList = this.cast("IdentifierList")
  @scala.inline
  def IfStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.IfStatement = this.cast("IfStatement")
  @scala.inline
  def ImportDirective: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective = this.cast("ImportDirective")
  @scala.inline
  def IndexAccess: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess = this.cast("IndexAccess")
  @scala.inline
  def InheritanceSpecifier: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier = this.cast("InheritanceSpecifier")
  @scala.inline
  def InlineAssemblyStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement = this.cast("InlineAssemblyStatement")
  @scala.inline
  def LabelDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition = this.cast("LabelDefinition")
  @scala.inline
  def Mapping: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.Mapping = this.cast("Mapping")
  @scala.inline
  def MemberAccess: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess = this.cast("MemberAccess")
  @scala.inline
  def ModifierDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition = this.cast("ModifierDefinition")
  @scala.inline
  def ModifierInvocation: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation = this.cast("ModifierInvocation")
  @scala.inline
  def NumberLiteral: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral = this.cast("NumberLiteral")
  @scala.inline
  def PragmaDirective: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective = this.cast("PragmaDirective")
  @scala.inline
  def PragmaName: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.PragmaName = this.cast("PragmaName")
  @scala.inline
  def PragmaValue: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue = this.cast("PragmaValue")
  @scala.inline
  def ReturnStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement = this.cast("ReturnStatement")
  @scala.inline
  def SourceUnit: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit = this.cast("SourceUnit")
  @scala.inline
  def StateMutability: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StateMutability = this.cast("StateMutability")
  @scala.inline
  def StateVariableDeclaration: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration = this.cast("StateVariableDeclaration")
  @scala.inline
  def StorageLocation: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation = this.cast("StorageLocation")
  @scala.inline
  def StringLiteral: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral = this.cast("StringLiteral")
  @scala.inline
  def StructDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition = this.cast("StructDefinition")
  @scala.inline
  def SubAssembly: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly = this.cast("SubAssembly")
  @scala.inline
  def ThrowStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement = this.cast("ThrowStatement")
  @scala.inline
  def TupleExpression: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression = this.cast("TupleExpression")
  @scala.inline
  def UserDefinedTypeName: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName = this.cast("UserDefinedTypeName")
  @scala.inline
  def UsingForDeclaration: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration = this.cast("UsingForDeclaration")
  @scala.inline
  def VariableDeclaration: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration = this.cast("VariableDeclaration")
  @scala.inline
  def VariableDeclarationStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement = this.cast("VariableDeclarationStatement")
  @scala.inline
  def WhileStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement = this.cast("WhileStatement")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

