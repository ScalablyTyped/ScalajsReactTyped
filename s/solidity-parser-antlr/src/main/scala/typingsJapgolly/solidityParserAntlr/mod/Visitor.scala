package typingsJapgolly.solidityParserAntlr.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var ArrayTypeName: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ArrayTypeName, _]
  ] = js.undefined
  @JSName("ArrayTypeName:exit")
  var ArrayTypeNameColonexit: js.UndefOr[js.Function1[/* node */ ArrayTypeName, _]] = js.undefined
  var AssemblyAssignment: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment, _]
  ] = js.undefined
  @JSName("AssemblyAssignment:exit")
  var AssemblyAssignmentColonexit: js.UndefOr[js.Function1[/* node */ AssemblyAssignment, _]] = js.undefined
  var AssemblyBlock: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock, _]
  ] = js.undefined
  @JSName("AssemblyBlock:exit")
  var AssemblyBlockColonexit: js.UndefOr[js.Function1[/* node */ AssemblyBlock, _]] = js.undefined
  var AssemblyCall: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyCall, _]] = js.undefined
  @JSName("AssemblyCall:exit")
  var AssemblyCallColonexit: js.UndefOr[js.Function1[/* node */ AssemblyCall, _]] = js.undefined
  var AssemblyCase: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyCase, _]] = js.undefined
  @JSName("AssemblyCase:exit")
  var AssemblyCaseColonexit: js.UndefOr[js.Function1[/* node */ AssemblyCase, _]] = js.undefined
  var AssemblyFor: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyFor, _]] = js.undefined
  @JSName("AssemblyFor:exit")
  var AssemblyForColonexit: js.UndefOr[js.Function1[/* node */ AssemblyFor, _]] = js.undefined
  var AssemblyFunctionDefinition: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition, _]
  ] = js.undefined
  @JSName("AssemblyFunctionDefinition:exit")
  var AssemblyFunctionDefinitionColonexit: js.UndefOr[js.Function1[/* node */ AssemblyFunctionDefinition, _]] = js.undefined
  var AssemblyFunctionReturns: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionReturns, _]
  ] = js.undefined
  @JSName("AssemblyFunctionReturns:exit")
  var AssemblyFunctionReturnsColonexit: js.UndefOr[js.Function1[/* node */ AssemblyFunctionReturns, _]] = js.undefined
  var AssemblyIf: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyIf, _]] = js.undefined
  @JSName("AssemblyIf:exit")
  var AssemblyIfColonexit: js.UndefOr[js.Function1[/* node */ AssemblyIf, _]] = js.undefined
  var AssemblyLiteral: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral, _]
  ] = js.undefined
  @JSName("AssemblyLiteral:exit")
  var AssemblyLiteralColonexit: js.UndefOr[js.Function1[/* node */ AssemblyLiteral, _]] = js.undefined
  var AssemblyLocalDefinition: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition, _]
  ] = js.undefined
  @JSName("AssemblyLocalDefinition:exit")
  var AssemblyLocalDefinitionColonexit: js.UndefOr[js.Function1[/* node */ AssemblyLocalDefinition, _]] = js.undefined
  var AssemblyStackAssignment: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment, _]
  ] = js.undefined
  @JSName("AssemblyStackAssignment:exit")
  var AssemblyStackAssignmentColonexit: js.UndefOr[js.Function1[/* node */ AssemblyStackAssignment, _]] = js.undefined
  var AssemblySwitch: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch, _]
  ] = js.undefined
  @JSName("AssemblySwitch:exit")
  var AssemblySwitchColonexit: js.UndefOr[js.Function1[/* node */ AssemblySwitch, _]] = js.undefined
  var BinaryOperation: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.BinaryOperation, _]
  ] = js.undefined
  @JSName("BinaryOperation:exit")
  var BinaryOperationColonexit: js.UndefOr[js.Function1[/* node */ BinaryOperation, _]] = js.undefined
  var Block: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.Block, _]] = js.undefined
  @JSName("Block:exit")
  var BlockColonexit: js.UndefOr[js.Function1[/* node */ Block, _]] = js.undefined
  var BooleanLiteral: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral, _]
  ] = js.undefined
  @JSName("BooleanLiteral:exit")
  var BooleanLiteralColonexit: js.UndefOr[js.Function1[/* node */ BooleanLiteral, _]] = js.undefined
  var Break: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.Break, _]] = js.undefined
  @JSName("Break:exit")
  var BreakColonexit: js.UndefOr[js.Function1[/* node */ Break, _]] = js.undefined
  var BreakStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.BreakStatement, _]
  ] = js.undefined
  @JSName("BreakStatement:exit")
  var BreakStatementColonexit: js.UndefOr[js.Function1[/* node */ BreakStatement, _]] = js.undefined
  var Conditional: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.Conditional, _]] = js.undefined
  @JSName("Conditional:exit")
  var ConditionalColonexit: js.UndefOr[js.Function1[/* node */ Conditional, _]] = js.undefined
  var Continue: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.Continue, _]] = js.undefined
  @JSName("Continue:exit")
  var ContinueColonexit: js.UndefOr[js.Function1[/* node */ Continue, _]] = js.undefined
  var ContinueStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ContinueStatement, _]
  ] = js.undefined
  @JSName("ContinueStatement:exit")
  var ContinueStatementColonexit: js.UndefOr[js.Function1[/* node */ ContinueStatement, _]] = js.undefined
  var ContractDefinition: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ContractDefinition, _]
  ] = js.undefined
  @JSName("ContractDefinition:exit")
  var ContractDefinitionColonexit: js.UndefOr[js.Function1[/* node */ ContractDefinition, _]] = js.undefined
  var DecimalNumber: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.DecimalNumber, _]
  ] = js.undefined
  @JSName("DecimalNumber:exit")
  var DecimalNumberColonexit: js.UndefOr[js.Function1[/* node */ DecimalNumber, _]] = js.undefined
  var DoWhileStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.DoWhileStatement, _]
  ] = js.undefined
  @JSName("DoWhileStatement:exit")
  var DoWhileStatementColonexit: js.UndefOr[js.Function1[/* node */ DoWhileStatement, _]] = js.undefined
  var ElementaryTypeName: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeName, _]
  ] = js.undefined
  @JSName("ElementaryTypeName:exit")
  var ElementaryTypeNameColonexit: js.UndefOr[js.Function1[/* node */ ElementaryTypeName, _]] = js.undefined
  var ElementaryTypeNameExpression: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression, _]
  ] = js.undefined
  @JSName("ElementaryTypeNameExpression:exit")
  var ElementaryTypeNameExpressionColonexit: js.UndefOr[js.Function1[/* node */ ElementaryTypeNameExpression, _]] = js.undefined
  var EmitStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.EmitStatement, _]
  ] = js.undefined
  @JSName("EmitStatement:exit")
  var EmitStatementColonexit: js.UndefOr[js.Function1[/* node */ EmitStatement, _]] = js.undefined
  var EnumDefinition: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.EnumDefinition, _]
  ] = js.undefined
  @JSName("EnumDefinition:exit")
  var EnumDefinitionColonexit: js.UndefOr[js.Function1[/* node */ EnumDefinition, _]] = js.undefined
  var EnumValue: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.EnumValue, _]] = js.undefined
  @JSName("EnumValue:exit")
  var EnumValueColonexit: js.UndefOr[js.Function1[/* node */ EnumValue, _]] = js.undefined
  var EventDefinition: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.EventDefinition, _]
  ] = js.undefined
  @JSName("EventDefinition:exit")
  var EventDefinitionColonexit: js.UndefOr[js.Function1[/* node */ EventDefinition, _]] = js.undefined
  var ExpressionStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ExpressionStatement, _]
  ] = js.undefined
  @JSName("ExpressionStatement:exit")
  var ExpressionStatementColonexit: js.UndefOr[js.Function1[/* node */ ExpressionStatement, _]] = js.undefined
  var ForStatement: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ForStatement, _]] = js.undefined
  @JSName("ForStatement:exit")
  var ForStatementColonexit: js.UndefOr[js.Function1[/* node */ ForStatement, _]] = js.undefined
  var FunctionDefinition: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.FunctionDefinition, _]
  ] = js.undefined
  @JSName("FunctionDefinition:exit")
  var FunctionDefinitionColonexit: js.UndefOr[js.Function1[/* node */ FunctionDefinition, _]] = js.undefined
  var FunctionTypeName: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.FunctionTypeName, _]
  ] = js.undefined
  @JSName("FunctionTypeName:exit")
  var FunctionTypeNameColonexit: js.UndefOr[js.Function1[/* node */ FunctionTypeName, _]] = js.undefined
  var HexNumber: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.HexNumber, _]] = js.undefined
  @JSName("HexNumber:exit")
  var HexNumberColonexit: js.UndefOr[js.Function1[/* node */ HexNumber, _]] = js.undefined
  var Identifier: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.Identifier, _]] = js.undefined
  @JSName("Identifier:exit")
  var IdentifierColonexit: js.UndefOr[js.Function1[/* node */ Identifier, _]] = js.undefined
  var IfStatement: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.IfStatement, _]] = js.undefined
  @JSName("IfStatement:exit")
  var IfStatementColonexit: js.UndefOr[js.Function1[/* node */ IfStatement, _]] = js.undefined
  var ImportDirective: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ImportDirective, _]
  ] = js.undefined
  @JSName("ImportDirective:exit")
  var ImportDirectiveColonexit: js.UndefOr[js.Function1[/* node */ ImportDirective, _]] = js.undefined
  var IndexAccess: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.IndexAccess, _]] = js.undefined
  @JSName("IndexAccess:exit")
  var IndexAccessColonexit: js.UndefOr[js.Function1[/* node */ IndexAccess, _]] = js.undefined
  var InheritanceSpecifier: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.InheritanceSpecifier, _]
  ] = js.undefined
  @JSName("InheritanceSpecifier:exit")
  var InheritanceSpecifierColonexit: js.UndefOr[js.Function1[/* node */ InheritanceSpecifier, _]] = js.undefined
  var InlineAssemblyStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.InlineAssemblyStatement, _]
  ] = js.undefined
  @JSName("InlineAssemblyStatement:exit")
  var InlineAssemblyStatementColonexit: js.UndefOr[js.Function1[/* node */ InlineAssemblyStatement, _]] = js.undefined
  var LabelDefinition: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.LabelDefinition, _]
  ] = js.undefined
  @JSName("LabelDefinition:exit")
  var LabelDefinitionColonexit: js.UndefOr[js.Function1[/* node */ LabelDefinition, _]] = js.undefined
  var Mapping: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.Mapping, _]] = js.undefined
  @JSName("Mapping:exit")
  var MappingColonexit: js.UndefOr[js.Function1[/* node */ Mapping, _]] = js.undefined
  var MemberAccess: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.MemberAccess, _]] = js.undefined
  @JSName("MemberAccess:exit")
  var MemberAccessColonexit: js.UndefOr[js.Function1[/* node */ MemberAccess, _]] = js.undefined
  var ModifierDefinition: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ModifierDefinition, _]
  ] = js.undefined
  @JSName("ModifierDefinition:exit")
  var ModifierDefinitionColonexit: js.UndefOr[js.Function1[/* node */ ModifierDefinition, _]] = js.undefined
  var ModifierInvocation: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ModifierInvocation, _]
  ] = js.undefined
  @JSName("ModifierInvocation:exit")
  var ModifierInvocationColonexit: js.UndefOr[js.Function1[/* node */ ModifierInvocation, _]] = js.undefined
  var NumberLiteral: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.NumberLiteral, _]
  ] = js.undefined
  @JSName("NumberLiteral:exit")
  var NumberLiteralColonexit: js.UndefOr[js.Function1[/* node */ NumberLiteral, _]] = js.undefined
  var PragmaDirective: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.PragmaDirective, _]
  ] = js.undefined
  @JSName("PragmaDirective:exit")
  var PragmaDirectiveColonexit: js.UndefOr[js.Function1[/* node */ PragmaDirective, _]] = js.undefined
  var ReturnStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ReturnStatement, _]
  ] = js.undefined
  @JSName("ReturnStatement:exit")
  var ReturnStatementColonexit: js.UndefOr[js.Function1[/* node */ ReturnStatement, _]] = js.undefined
  var SourceUnit: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.SourceUnit, _]] = js.undefined
  // Start of :exit handler for each type. Must be consistent with above
  @JSName("SourceUnit:exit")
  var SourceUnitColonexit: js.UndefOr[js.Function1[/* node */ SourceUnit, _]] = js.undefined
  var StateVariableDeclaration: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.StateVariableDeclaration, _]
  ] = js.undefined
  @JSName("StateVariableDeclaration:exit")
  var StateVariableDeclarationColonexit: js.UndefOr[js.Function1[/* node */ StateVariableDeclaration, _]] = js.undefined
  var StructDefinition: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.StructDefinition, _]
  ] = js.undefined
  @JSName("StructDefinition:exit")
  var StructDefinitionColonexit: js.UndefOr[js.Function1[/* node */ StructDefinition, _]] = js.undefined
  var SubAssembly: js.UndefOr[js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.SubAssembly, _]] = js.undefined
  @JSName("SubAssembly:exit")
  var SubAssemblyColonexit: js.UndefOr[js.Function1[/* node */ SubAssembly, _]] = js.undefined
  var ThrowStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.ThrowStatement, _]
  ] = js.undefined
  @JSName("ThrowStatement:exit")
  var ThrowStatementColonexit: js.UndefOr[js.Function1[/* node */ ThrowStatement, _]] = js.undefined
  var TupleExpression: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.TupleExpression, _]
  ] = js.undefined
  @JSName("TupleExpression:exit")
  var TupleExpressionColonexit: js.UndefOr[js.Function1[/* node */ TupleExpression, _]] = js.undefined
  var UserDefinedTypeName: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.UserDefinedTypeName, _]
  ] = js.undefined
  @JSName("UserDefinedTypeName:exit")
  var UserDefinedTypeNameColonexit: js.UndefOr[js.Function1[/* node */ UserDefinedTypeName, _]] = js.undefined
  var UsingForDeclaration: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.UsingForDeclaration, _]
  ] = js.undefined
  @JSName("UsingForDeclaration:exit")
  var UsingForDeclarationColonexit: js.UndefOr[js.Function1[/* node */ UsingForDeclaration, _]] = js.undefined
  var VariableDeclaration: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.VariableDeclaration, _]
  ] = js.undefined
  @JSName("VariableDeclaration:exit")
  var VariableDeclarationColonexit: js.UndefOr[js.Function1[/* node */ VariableDeclaration, _]] = js.undefined
  var VariableDeclarationStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.VariableDeclarationStatement, _]
  ] = js.undefined
  @JSName("VariableDeclarationStatement:exit")
  var VariableDeclarationStatementColonexit: js.UndefOr[js.Function1[/* node */ VariableDeclarationStatement, _]] = js.undefined
  var WhileStatement: js.UndefOr[
    js.Function1[/* node */ typingsJapgolly.solidityParserAntlr.mod.WhileStatement, _]
  ] = js.undefined
  @JSName("WhileStatement:exit")
  var WhileStatementColonexit: js.UndefOr[js.Function1[/* node */ WhileStatement, _]] = js.undefined
}

object Visitor {
  @scala.inline
  def apply(
    ArrayTypeName: /* node */ ArrayTypeName => CallbackTo[js.Any] = null,
    ArrayTypeNameColonexit: /* node */ ArrayTypeName => CallbackTo[js.Any] = null,
    AssemblyAssignment: /* node */ AssemblyAssignment => CallbackTo[js.Any] = null,
    AssemblyAssignmentColonexit: /* node */ AssemblyAssignment => CallbackTo[js.Any] = null,
    AssemblyBlock: /* node */ AssemblyBlock => CallbackTo[js.Any] = null,
    AssemblyBlockColonexit: /* node */ AssemblyBlock => CallbackTo[js.Any] = null,
    AssemblyCall: /* node */ AssemblyCall => CallbackTo[js.Any] = null,
    AssemblyCallColonexit: /* node */ AssemblyCall => CallbackTo[js.Any] = null,
    AssemblyCase: /* node */ AssemblyCase => CallbackTo[js.Any] = null,
    AssemblyCaseColonexit: /* node */ AssemblyCase => CallbackTo[js.Any] = null,
    AssemblyFor: /* node */ AssemblyFor => CallbackTo[js.Any] = null,
    AssemblyForColonexit: /* node */ AssemblyFor => CallbackTo[js.Any] = null,
    AssemblyFunctionDefinition: /* node */ AssemblyFunctionDefinition => CallbackTo[js.Any] = null,
    AssemblyFunctionDefinitionColonexit: /* node */ AssemblyFunctionDefinition => CallbackTo[js.Any] = null,
    AssemblyFunctionReturns: /* node */ AssemblyFunctionReturns => CallbackTo[js.Any] = null,
    AssemblyFunctionReturnsColonexit: /* node */ AssemblyFunctionReturns => CallbackTo[js.Any] = null,
    AssemblyIf: /* node */ AssemblyIf => CallbackTo[js.Any] = null,
    AssemblyIfColonexit: /* node */ AssemblyIf => CallbackTo[js.Any] = null,
    AssemblyLiteral: /* node */ AssemblyLiteral => CallbackTo[js.Any] = null,
    AssemblyLiteralColonexit: /* node */ AssemblyLiteral => CallbackTo[js.Any] = null,
    AssemblyLocalDefinition: /* node */ AssemblyLocalDefinition => CallbackTo[js.Any] = null,
    AssemblyLocalDefinitionColonexit: /* node */ AssemblyLocalDefinition => CallbackTo[js.Any] = null,
    AssemblyStackAssignment: /* node */ AssemblyStackAssignment => CallbackTo[js.Any] = null,
    AssemblyStackAssignmentColonexit: /* node */ AssemblyStackAssignment => CallbackTo[js.Any] = null,
    AssemblySwitch: /* node */ AssemblySwitch => CallbackTo[js.Any] = null,
    AssemblySwitchColonexit: /* node */ AssemblySwitch => CallbackTo[js.Any] = null,
    BinaryOperation: /* node */ BinaryOperation => CallbackTo[js.Any] = null,
    BinaryOperationColonexit: /* node */ BinaryOperation => CallbackTo[js.Any] = null,
    Block: /* node */ Block => CallbackTo[js.Any] = null,
    BlockColonexit: /* node */ Block => CallbackTo[js.Any] = null,
    BooleanLiteral: /* node */ BooleanLiteral => CallbackTo[js.Any] = null,
    BooleanLiteralColonexit: /* node */ BooleanLiteral => CallbackTo[js.Any] = null,
    Break: /* node */ Break => CallbackTo[js.Any] = null,
    BreakColonexit: /* node */ Break => CallbackTo[js.Any] = null,
    BreakStatement: /* node */ BreakStatement => CallbackTo[js.Any] = null,
    BreakStatementColonexit: /* node */ BreakStatement => CallbackTo[js.Any] = null,
    Conditional: /* node */ Conditional => CallbackTo[js.Any] = null,
    ConditionalColonexit: /* node */ Conditional => CallbackTo[js.Any] = null,
    Continue: /* node */ Continue => CallbackTo[js.Any] = null,
    ContinueColonexit: /* node */ Continue => CallbackTo[js.Any] = null,
    ContinueStatement: /* node */ ContinueStatement => CallbackTo[js.Any] = null,
    ContinueStatementColonexit: /* node */ ContinueStatement => CallbackTo[js.Any] = null,
    ContractDefinition: /* node */ ContractDefinition => CallbackTo[js.Any] = null,
    ContractDefinitionColonexit: /* node */ ContractDefinition => CallbackTo[js.Any] = null,
    DecimalNumber: /* node */ DecimalNumber => CallbackTo[js.Any] = null,
    DecimalNumberColonexit: /* node */ DecimalNumber => CallbackTo[js.Any] = null,
    DoWhileStatement: /* node */ DoWhileStatement => CallbackTo[js.Any] = null,
    DoWhileStatementColonexit: /* node */ DoWhileStatement => CallbackTo[js.Any] = null,
    ElementaryTypeName: /* node */ ElementaryTypeName => CallbackTo[js.Any] = null,
    ElementaryTypeNameColonexit: /* node */ ElementaryTypeName => CallbackTo[js.Any] = null,
    ElementaryTypeNameExpression: /* node */ ElementaryTypeNameExpression => CallbackTo[js.Any] = null,
    ElementaryTypeNameExpressionColonexit: /* node */ ElementaryTypeNameExpression => CallbackTo[js.Any] = null,
    EmitStatement: /* node */ EmitStatement => CallbackTo[js.Any] = null,
    EmitStatementColonexit: /* node */ EmitStatement => CallbackTo[js.Any] = null,
    EnumDefinition: /* node */ EnumDefinition => CallbackTo[js.Any] = null,
    EnumDefinitionColonexit: /* node */ EnumDefinition => CallbackTo[js.Any] = null,
    EnumValue: /* node */ EnumValue => CallbackTo[js.Any] = null,
    EnumValueColonexit: /* node */ EnumValue => CallbackTo[js.Any] = null,
    EventDefinition: /* node */ EventDefinition => CallbackTo[js.Any] = null,
    EventDefinitionColonexit: /* node */ EventDefinition => CallbackTo[js.Any] = null,
    ExpressionStatement: /* node */ ExpressionStatement => CallbackTo[js.Any] = null,
    ExpressionStatementColonexit: /* node */ ExpressionStatement => CallbackTo[js.Any] = null,
    ForStatement: /* node */ ForStatement => CallbackTo[js.Any] = null,
    ForStatementColonexit: /* node */ ForStatement => CallbackTo[js.Any] = null,
    FunctionDefinition: /* node */ FunctionDefinition => CallbackTo[js.Any] = null,
    FunctionDefinitionColonexit: /* node */ FunctionDefinition => CallbackTo[js.Any] = null,
    FunctionTypeName: /* node */ FunctionTypeName => CallbackTo[js.Any] = null,
    FunctionTypeNameColonexit: /* node */ FunctionTypeName => CallbackTo[js.Any] = null,
    HexNumber: /* node */ HexNumber => CallbackTo[js.Any] = null,
    HexNumberColonexit: /* node */ HexNumber => CallbackTo[js.Any] = null,
    Identifier: /* node */ Identifier => CallbackTo[js.Any] = null,
    IdentifierColonexit: /* node */ Identifier => CallbackTo[js.Any] = null,
    IfStatement: /* node */ IfStatement => CallbackTo[js.Any] = null,
    IfStatementColonexit: /* node */ IfStatement => CallbackTo[js.Any] = null,
    ImportDirective: /* node */ ImportDirective => CallbackTo[js.Any] = null,
    ImportDirectiveColonexit: /* node */ ImportDirective => CallbackTo[js.Any] = null,
    IndexAccess: /* node */ IndexAccess => CallbackTo[js.Any] = null,
    IndexAccessColonexit: /* node */ IndexAccess => CallbackTo[js.Any] = null,
    InheritanceSpecifier: /* node */ InheritanceSpecifier => CallbackTo[js.Any] = null,
    InheritanceSpecifierColonexit: /* node */ InheritanceSpecifier => CallbackTo[js.Any] = null,
    InlineAssemblyStatement: /* node */ InlineAssemblyStatement => CallbackTo[js.Any] = null,
    InlineAssemblyStatementColonexit: /* node */ InlineAssemblyStatement => CallbackTo[js.Any] = null,
    LabelDefinition: /* node */ LabelDefinition => CallbackTo[js.Any] = null,
    LabelDefinitionColonexit: /* node */ LabelDefinition => CallbackTo[js.Any] = null,
    Mapping: /* node */ Mapping => CallbackTo[js.Any] = null,
    MappingColonexit: /* node */ Mapping => CallbackTo[js.Any] = null,
    MemberAccess: /* node */ MemberAccess => CallbackTo[js.Any] = null,
    MemberAccessColonexit: /* node */ MemberAccess => CallbackTo[js.Any] = null,
    ModifierDefinition: /* node */ ModifierDefinition => CallbackTo[js.Any] = null,
    ModifierDefinitionColonexit: /* node */ ModifierDefinition => CallbackTo[js.Any] = null,
    ModifierInvocation: /* node */ ModifierInvocation => CallbackTo[js.Any] = null,
    ModifierInvocationColonexit: /* node */ ModifierInvocation => CallbackTo[js.Any] = null,
    NumberLiteral: /* node */ NumberLiteral => CallbackTo[js.Any] = null,
    NumberLiteralColonexit: /* node */ NumberLiteral => CallbackTo[js.Any] = null,
    PragmaDirective: /* node */ PragmaDirective => CallbackTo[js.Any] = null,
    PragmaDirectiveColonexit: /* node */ PragmaDirective => CallbackTo[js.Any] = null,
    ReturnStatement: /* node */ ReturnStatement => CallbackTo[js.Any] = null,
    ReturnStatementColonexit: /* node */ ReturnStatement => CallbackTo[js.Any] = null,
    SourceUnit: /* node */ SourceUnit => CallbackTo[js.Any] = null,
    SourceUnitColonexit: /* node */ SourceUnit => CallbackTo[js.Any] = null,
    StateVariableDeclaration: /* node */ StateVariableDeclaration => CallbackTo[js.Any] = null,
    StateVariableDeclarationColonexit: /* node */ StateVariableDeclaration => CallbackTo[js.Any] = null,
    StructDefinition: /* node */ StructDefinition => CallbackTo[js.Any] = null,
    StructDefinitionColonexit: /* node */ StructDefinition => CallbackTo[js.Any] = null,
    SubAssembly: /* node */ SubAssembly => CallbackTo[js.Any] = null,
    SubAssemblyColonexit: /* node */ SubAssembly => CallbackTo[js.Any] = null,
    ThrowStatement: /* node */ ThrowStatement => CallbackTo[js.Any] = null,
    ThrowStatementColonexit: /* node */ ThrowStatement => CallbackTo[js.Any] = null,
    TupleExpression: /* node */ TupleExpression => CallbackTo[js.Any] = null,
    TupleExpressionColonexit: /* node */ TupleExpression => CallbackTo[js.Any] = null,
    UserDefinedTypeName: /* node */ UserDefinedTypeName => CallbackTo[js.Any] = null,
    UserDefinedTypeNameColonexit: /* node */ UserDefinedTypeName => CallbackTo[js.Any] = null,
    UsingForDeclaration: /* node */ UsingForDeclaration => CallbackTo[js.Any] = null,
    UsingForDeclarationColonexit: /* node */ UsingForDeclaration => CallbackTo[js.Any] = null,
    VariableDeclaration: /* node */ VariableDeclaration => CallbackTo[js.Any] = null,
    VariableDeclarationColonexit: /* node */ VariableDeclaration => CallbackTo[js.Any] = null,
    VariableDeclarationStatement: /* node */ VariableDeclarationStatement => CallbackTo[js.Any] = null,
    VariableDeclarationStatementColonexit: /* node */ VariableDeclarationStatement => CallbackTo[js.Any] = null,
    WhileStatement: /* node */ WhileStatement => CallbackTo[js.Any] = null,
    WhileStatementColonexit: /* node */ WhileStatement => CallbackTo[js.Any] = null
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    if (ArrayTypeName != null) __obj.updateDynamic("ArrayTypeName")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ArrayTypeName) => ArrayTypeName(t0).runNow()))
    if (ArrayTypeNameColonexit != null) __obj.updateDynamic("ArrayTypeNameColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ArrayTypeName) => ArrayTypeNameColonexit(t0).runNow()))
    if (AssemblyAssignment != null) __obj.updateDynamic("AssemblyAssignment")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment) => AssemblyAssignment(t0).runNow()))
    if (AssemblyAssignmentColonexit != null) __obj.updateDynamic("AssemblyAssignmentColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment) => AssemblyAssignmentColonexit(t0).runNow()))
    if (AssemblyBlock != null) __obj.updateDynamic("AssemblyBlock")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock) => AssemblyBlock(t0).runNow()))
    if (AssemblyBlockColonexit != null) __obj.updateDynamic("AssemblyBlockColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock) => AssemblyBlockColonexit(t0).runNow()))
    if (AssemblyCall != null) __obj.updateDynamic("AssemblyCall")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyCall) => AssemblyCall(t0).runNow()))
    if (AssemblyCallColonexit != null) __obj.updateDynamic("AssemblyCallColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyCall) => AssemblyCallColonexit(t0).runNow()))
    if (AssemblyCase != null) __obj.updateDynamic("AssemblyCase")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyCase) => AssemblyCase(t0).runNow()))
    if (AssemblyCaseColonexit != null) __obj.updateDynamic("AssemblyCaseColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyCase) => AssemblyCaseColonexit(t0).runNow()))
    if (AssemblyFor != null) __obj.updateDynamic("AssemblyFor")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyFor) => AssemblyFor(t0).runNow()))
    if (AssemblyForColonexit != null) __obj.updateDynamic("AssemblyForColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyFor) => AssemblyForColonexit(t0).runNow()))
    if (AssemblyFunctionDefinition != null) __obj.updateDynamic("AssemblyFunctionDefinition")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition) => AssemblyFunctionDefinition(t0).runNow()))
    if (AssemblyFunctionDefinitionColonexit != null) __obj.updateDynamic("AssemblyFunctionDefinitionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition) => AssemblyFunctionDefinitionColonexit(t0).runNow()))
    if (AssemblyFunctionReturns != null) __obj.updateDynamic("AssemblyFunctionReturns")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionReturns) => AssemblyFunctionReturns(t0).runNow()))
    if (AssemblyFunctionReturnsColonexit != null) __obj.updateDynamic("AssemblyFunctionReturnsColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionReturns) => AssemblyFunctionReturnsColonexit(t0).runNow()))
    if (AssemblyIf != null) __obj.updateDynamic("AssemblyIf")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyIf) => AssemblyIf(t0).runNow()))
    if (AssemblyIfColonexit != null) __obj.updateDynamic("AssemblyIfColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyIf) => AssemblyIfColonexit(t0).runNow()))
    if (AssemblyLiteral != null) __obj.updateDynamic("AssemblyLiteral")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral) => AssemblyLiteral(t0).runNow()))
    if (AssemblyLiteralColonexit != null) __obj.updateDynamic("AssemblyLiteralColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral) => AssemblyLiteralColonexit(t0).runNow()))
    if (AssemblyLocalDefinition != null) __obj.updateDynamic("AssemblyLocalDefinition")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition) => AssemblyLocalDefinition(t0).runNow()))
    if (AssemblyLocalDefinitionColonexit != null) __obj.updateDynamic("AssemblyLocalDefinitionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition) => AssemblyLocalDefinitionColonexit(t0).runNow()))
    if (AssemblyStackAssignment != null) __obj.updateDynamic("AssemblyStackAssignment")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment) => AssemblyStackAssignment(t0).runNow()))
    if (AssemblyStackAssignmentColonexit != null) __obj.updateDynamic("AssemblyStackAssignmentColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment) => AssemblyStackAssignmentColonexit(t0).runNow()))
    if (AssemblySwitch != null) __obj.updateDynamic("AssemblySwitch")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch) => AssemblySwitch(t0).runNow()))
    if (AssemblySwitchColonexit != null) __obj.updateDynamic("AssemblySwitchColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch) => AssemblySwitchColonexit(t0).runNow()))
    if (BinaryOperation != null) __obj.updateDynamic("BinaryOperation")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.BinaryOperation) => BinaryOperation(t0).runNow()))
    if (BinaryOperationColonexit != null) __obj.updateDynamic("BinaryOperationColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.BinaryOperation) => BinaryOperationColonexit(t0).runNow()))
    if (Block != null) __obj.updateDynamic("Block")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Block) => Block(t0).runNow()))
    if (BlockColonexit != null) __obj.updateDynamic("BlockColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Block) => BlockColonexit(t0).runNow()))
    if (BooleanLiteral != null) __obj.updateDynamic("BooleanLiteral")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral) => BooleanLiteral(t0).runNow()))
    if (BooleanLiteralColonexit != null) __obj.updateDynamic("BooleanLiteralColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.BooleanLiteral) => BooleanLiteralColonexit(t0).runNow()))
    if (Break != null) __obj.updateDynamic("Break")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Break) => Break(t0).runNow()))
    if (BreakColonexit != null) __obj.updateDynamic("BreakColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Break) => BreakColonexit(t0).runNow()))
    if (BreakStatement != null) __obj.updateDynamic("BreakStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.BreakStatement) => BreakStatement(t0).runNow()))
    if (BreakStatementColonexit != null) __obj.updateDynamic("BreakStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.BreakStatement) => BreakStatementColonexit(t0).runNow()))
    if (Conditional != null) __obj.updateDynamic("Conditional")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Conditional) => Conditional(t0).runNow()))
    if (ConditionalColonexit != null) __obj.updateDynamic("ConditionalColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Conditional) => ConditionalColonexit(t0).runNow()))
    if (Continue != null) __obj.updateDynamic("Continue")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Continue) => Continue(t0).runNow()))
    if (ContinueColonexit != null) __obj.updateDynamic("ContinueColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Continue) => ContinueColonexit(t0).runNow()))
    if (ContinueStatement != null) __obj.updateDynamic("ContinueStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ContinueStatement) => ContinueStatement(t0).runNow()))
    if (ContinueStatementColonexit != null) __obj.updateDynamic("ContinueStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ContinueStatement) => ContinueStatementColonexit(t0).runNow()))
    if (ContractDefinition != null) __obj.updateDynamic("ContractDefinition")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ContractDefinition) => ContractDefinition(t0).runNow()))
    if (ContractDefinitionColonexit != null) __obj.updateDynamic("ContractDefinitionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ContractDefinition) => ContractDefinitionColonexit(t0).runNow()))
    if (DecimalNumber != null) __obj.updateDynamic("DecimalNumber")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.DecimalNumber) => DecimalNumber(t0).runNow()))
    if (DecimalNumberColonexit != null) __obj.updateDynamic("DecimalNumberColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.DecimalNumber) => DecimalNumberColonexit(t0).runNow()))
    if (DoWhileStatement != null) __obj.updateDynamic("DoWhileStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.DoWhileStatement) => DoWhileStatement(t0).runNow()))
    if (DoWhileStatementColonexit != null) __obj.updateDynamic("DoWhileStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.DoWhileStatement) => DoWhileStatementColonexit(t0).runNow()))
    if (ElementaryTypeName != null) __obj.updateDynamic("ElementaryTypeName")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeName) => ElementaryTypeName(t0).runNow()))
    if (ElementaryTypeNameColonexit != null) __obj.updateDynamic("ElementaryTypeNameColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeName) => ElementaryTypeNameColonexit(t0).runNow()))
    if (ElementaryTypeNameExpression != null) __obj.updateDynamic("ElementaryTypeNameExpression")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression) => ElementaryTypeNameExpression(t0).runNow()))
    if (ElementaryTypeNameExpressionColonexit != null) __obj.updateDynamic("ElementaryTypeNameExpressionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ElementaryTypeNameExpression) => ElementaryTypeNameExpressionColonexit(t0).runNow()))
    if (EmitStatement != null) __obj.updateDynamic("EmitStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.EmitStatement) => EmitStatement(t0).runNow()))
    if (EmitStatementColonexit != null) __obj.updateDynamic("EmitStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.EmitStatement) => EmitStatementColonexit(t0).runNow()))
    if (EnumDefinition != null) __obj.updateDynamic("EnumDefinition")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.EnumDefinition) => EnumDefinition(t0).runNow()))
    if (EnumDefinitionColonexit != null) __obj.updateDynamic("EnumDefinitionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.EnumDefinition) => EnumDefinitionColonexit(t0).runNow()))
    if (EnumValue != null) __obj.updateDynamic("EnumValue")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.EnumValue) => EnumValue(t0).runNow()))
    if (EnumValueColonexit != null) __obj.updateDynamic("EnumValueColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.EnumValue) => EnumValueColonexit(t0).runNow()))
    if (EventDefinition != null) __obj.updateDynamic("EventDefinition")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.EventDefinition) => EventDefinition(t0).runNow()))
    if (EventDefinitionColonexit != null) __obj.updateDynamic("EventDefinitionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.EventDefinition) => EventDefinitionColonexit(t0).runNow()))
    if (ExpressionStatement != null) __obj.updateDynamic("ExpressionStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ExpressionStatement) => ExpressionStatement(t0).runNow()))
    if (ExpressionStatementColonexit != null) __obj.updateDynamic("ExpressionStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ExpressionStatement) => ExpressionStatementColonexit(t0).runNow()))
    if (ForStatement != null) __obj.updateDynamic("ForStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ForStatement) => ForStatement(t0).runNow()))
    if (ForStatementColonexit != null) __obj.updateDynamic("ForStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ForStatement) => ForStatementColonexit(t0).runNow()))
    if (FunctionDefinition != null) __obj.updateDynamic("FunctionDefinition")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.FunctionDefinition) => FunctionDefinition(t0).runNow()))
    if (FunctionDefinitionColonexit != null) __obj.updateDynamic("FunctionDefinitionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.FunctionDefinition) => FunctionDefinitionColonexit(t0).runNow()))
    if (FunctionTypeName != null) __obj.updateDynamic("FunctionTypeName")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.FunctionTypeName) => FunctionTypeName(t0).runNow()))
    if (FunctionTypeNameColonexit != null) __obj.updateDynamic("FunctionTypeNameColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.FunctionTypeName) => FunctionTypeNameColonexit(t0).runNow()))
    if (HexNumber != null) __obj.updateDynamic("HexNumber")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.HexNumber) => HexNumber(t0).runNow()))
    if (HexNumberColonexit != null) __obj.updateDynamic("HexNumberColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.HexNumber) => HexNumberColonexit(t0).runNow()))
    if (Identifier != null) __obj.updateDynamic("Identifier")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Identifier) => Identifier(t0).runNow()))
    if (IdentifierColonexit != null) __obj.updateDynamic("IdentifierColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Identifier) => IdentifierColonexit(t0).runNow()))
    if (IfStatement != null) __obj.updateDynamic("IfStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.IfStatement) => IfStatement(t0).runNow()))
    if (IfStatementColonexit != null) __obj.updateDynamic("IfStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.IfStatement) => IfStatementColonexit(t0).runNow()))
    if (ImportDirective != null) __obj.updateDynamic("ImportDirective")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ImportDirective) => ImportDirective(t0).runNow()))
    if (ImportDirectiveColonexit != null) __obj.updateDynamic("ImportDirectiveColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ImportDirective) => ImportDirectiveColonexit(t0).runNow()))
    if (IndexAccess != null) __obj.updateDynamic("IndexAccess")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.IndexAccess) => IndexAccess(t0).runNow()))
    if (IndexAccessColonexit != null) __obj.updateDynamic("IndexAccessColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.IndexAccess) => IndexAccessColonexit(t0).runNow()))
    if (InheritanceSpecifier != null) __obj.updateDynamic("InheritanceSpecifier")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.InheritanceSpecifier) => InheritanceSpecifier(t0).runNow()))
    if (InheritanceSpecifierColonexit != null) __obj.updateDynamic("InheritanceSpecifierColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.InheritanceSpecifier) => InheritanceSpecifierColonexit(t0).runNow()))
    if (InlineAssemblyStatement != null) __obj.updateDynamic("InlineAssemblyStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.InlineAssemblyStatement) => InlineAssemblyStatement(t0).runNow()))
    if (InlineAssemblyStatementColonexit != null) __obj.updateDynamic("InlineAssemblyStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.InlineAssemblyStatement) => InlineAssemblyStatementColonexit(t0).runNow()))
    if (LabelDefinition != null) __obj.updateDynamic("LabelDefinition")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.LabelDefinition) => LabelDefinition(t0).runNow()))
    if (LabelDefinitionColonexit != null) __obj.updateDynamic("LabelDefinitionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.LabelDefinition) => LabelDefinitionColonexit(t0).runNow()))
    if (Mapping != null) __obj.updateDynamic("Mapping")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Mapping) => Mapping(t0).runNow()))
    if (MappingColonexit != null) __obj.updateDynamic("MappingColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.Mapping) => MappingColonexit(t0).runNow()))
    if (MemberAccess != null) __obj.updateDynamic("MemberAccess")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.MemberAccess) => MemberAccess(t0).runNow()))
    if (MemberAccessColonexit != null) __obj.updateDynamic("MemberAccessColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.MemberAccess) => MemberAccessColonexit(t0).runNow()))
    if (ModifierDefinition != null) __obj.updateDynamic("ModifierDefinition")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ModifierDefinition) => ModifierDefinition(t0).runNow()))
    if (ModifierDefinitionColonexit != null) __obj.updateDynamic("ModifierDefinitionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ModifierDefinition) => ModifierDefinitionColonexit(t0).runNow()))
    if (ModifierInvocation != null) __obj.updateDynamic("ModifierInvocation")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ModifierInvocation) => ModifierInvocation(t0).runNow()))
    if (ModifierInvocationColonexit != null) __obj.updateDynamic("ModifierInvocationColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ModifierInvocation) => ModifierInvocationColonexit(t0).runNow()))
    if (NumberLiteral != null) __obj.updateDynamic("NumberLiteral")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.NumberLiteral) => NumberLiteral(t0).runNow()))
    if (NumberLiteralColonexit != null) __obj.updateDynamic("NumberLiteralColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.NumberLiteral) => NumberLiteralColonexit(t0).runNow()))
    if (PragmaDirective != null) __obj.updateDynamic("PragmaDirective")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.PragmaDirective) => PragmaDirective(t0).runNow()))
    if (PragmaDirectiveColonexit != null) __obj.updateDynamic("PragmaDirectiveColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.PragmaDirective) => PragmaDirectiveColonexit(t0).runNow()))
    if (ReturnStatement != null) __obj.updateDynamic("ReturnStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ReturnStatement) => ReturnStatement(t0).runNow()))
    if (ReturnStatementColonexit != null) __obj.updateDynamic("ReturnStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ReturnStatement) => ReturnStatementColonexit(t0).runNow()))
    if (SourceUnit != null) __obj.updateDynamic("SourceUnit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.SourceUnit) => SourceUnit(t0).runNow()))
    if (SourceUnitColonexit != null) __obj.updateDynamic("SourceUnitColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.SourceUnit) => SourceUnitColonexit(t0).runNow()))
    if (StateVariableDeclaration != null) __obj.updateDynamic("StateVariableDeclaration")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.StateVariableDeclaration) => StateVariableDeclaration(t0).runNow()))
    if (StateVariableDeclarationColonexit != null) __obj.updateDynamic("StateVariableDeclarationColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.StateVariableDeclaration) => StateVariableDeclarationColonexit(t0).runNow()))
    if (StructDefinition != null) __obj.updateDynamic("StructDefinition")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.StructDefinition) => StructDefinition(t0).runNow()))
    if (StructDefinitionColonexit != null) __obj.updateDynamic("StructDefinitionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.StructDefinition) => StructDefinitionColonexit(t0).runNow()))
    if (SubAssembly != null) __obj.updateDynamic("SubAssembly")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.SubAssembly) => SubAssembly(t0).runNow()))
    if (SubAssemblyColonexit != null) __obj.updateDynamic("SubAssemblyColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.SubAssembly) => SubAssemblyColonexit(t0).runNow()))
    if (ThrowStatement != null) __obj.updateDynamic("ThrowStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ThrowStatement) => ThrowStatement(t0).runNow()))
    if (ThrowStatementColonexit != null) __obj.updateDynamic("ThrowStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.ThrowStatement) => ThrowStatementColonexit(t0).runNow()))
    if (TupleExpression != null) __obj.updateDynamic("TupleExpression")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.TupleExpression) => TupleExpression(t0).runNow()))
    if (TupleExpressionColonexit != null) __obj.updateDynamic("TupleExpressionColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.TupleExpression) => TupleExpressionColonexit(t0).runNow()))
    if (UserDefinedTypeName != null) __obj.updateDynamic("UserDefinedTypeName")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.UserDefinedTypeName) => UserDefinedTypeName(t0).runNow()))
    if (UserDefinedTypeNameColonexit != null) __obj.updateDynamic("UserDefinedTypeNameColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.UserDefinedTypeName) => UserDefinedTypeNameColonexit(t0).runNow()))
    if (UsingForDeclaration != null) __obj.updateDynamic("UsingForDeclaration")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.UsingForDeclaration) => UsingForDeclaration(t0).runNow()))
    if (UsingForDeclarationColonexit != null) __obj.updateDynamic("UsingForDeclarationColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.UsingForDeclaration) => UsingForDeclarationColonexit(t0).runNow()))
    if (VariableDeclaration != null) __obj.updateDynamic("VariableDeclaration")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.VariableDeclaration) => VariableDeclaration(t0).runNow()))
    if (VariableDeclarationColonexit != null) __obj.updateDynamic("VariableDeclarationColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.VariableDeclaration) => VariableDeclarationColonexit(t0).runNow()))
    if (VariableDeclarationStatement != null) __obj.updateDynamic("VariableDeclarationStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.VariableDeclarationStatement) => VariableDeclarationStatement(t0).runNow()))
    if (VariableDeclarationStatementColonexit != null) __obj.updateDynamic("VariableDeclarationStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.VariableDeclarationStatement) => VariableDeclarationStatementColonexit(t0).runNow()))
    if (WhileStatement != null) __obj.updateDynamic("WhileStatement")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.WhileStatement) => WhileStatement(t0).runNow()))
    if (WhileStatementColonexit != null) __obj.updateDynamic("WhileStatementColonexit")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.solidityParserAntlr.mod.WhileStatement) => WhileStatementColonexit(t0).runNow()))
    __obj.asInstanceOf[Visitor]
  }
}

