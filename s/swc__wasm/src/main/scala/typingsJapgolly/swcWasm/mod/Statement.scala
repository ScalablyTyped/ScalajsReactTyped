package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.BlockStatement
  - typingsJapgolly.swcWasm.mod.EmptyStatement
  - typingsJapgolly.swcWasm.mod.DebuggerStatement
  - typingsJapgolly.swcWasm.mod.WithStatement
  - typingsJapgolly.swcWasm.mod.ReturnStatement
  - typingsJapgolly.swcWasm.mod.LabeledStatement
  - typingsJapgolly.swcWasm.mod.BreakStatement
  - typingsJapgolly.swcWasm.mod.ContinueStatement
  - typingsJapgolly.swcWasm.mod.IfStatement
  - typingsJapgolly.swcWasm.mod.SwitchStatement
  - typingsJapgolly.swcWasm.mod.ThrowStatement
  - typingsJapgolly.swcWasm.mod.TryStatement
  - typingsJapgolly.swcWasm.mod.WhileStatement
  - typingsJapgolly.swcWasm.mod.DoWhileStatement
  - typingsJapgolly.swcWasm.mod.ForStatement
  - typingsJapgolly.swcWasm.mod.ForInStatement
  - typingsJapgolly.swcWasm.mod.ForOfStatement
  - typingsJapgolly.swcWasm.mod.Declaration
  - typingsJapgolly.swcWasm.mod.ExpressionStatement
*/
trait Statement
  extends StObject
     with ModuleItem
object Statement {
  
  inline def BlockStatement(span: Span, stmts: js.Array[Statement]): typingsJapgolly.swcWasm.mod.BlockStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BlockStatement]
  }
  
  inline def BreakStatement(span: Span): typingsJapgolly.swcWasm.mod.BreakStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.BreakStatement]
  }
  
  inline def ClassDeclaration(
    body: js.Array[ClassMember],
    declare: Boolean,
    identifier: Identifier,
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): typingsJapgolly.swcWasm.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ClassDeclaration]
  }
  
  inline def ContinueStatement(span: Span): typingsJapgolly.swcWasm.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ContinueStatement]
  }
  
  inline def DebuggerStatement(span: Span): typingsJapgolly.swcWasm.mod.DebuggerStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.DebuggerStatement]
  }
  
  inline def DoWhileStatement(body: Statement, span: Span, test: Expression): typingsJapgolly.swcWasm.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.DoWhileStatement]
  }
  
  inline def EmptyStatement(span: Span): typingsJapgolly.swcWasm.mod.EmptyStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.EmptyStatement]
  }
  
  inline def ExpressionStatement(expression: Expression, span: Span): typingsJapgolly.swcWasm.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ExpressionStatement]
  }
  
  inline def ForInStatement(body: Statement, left: VariableDeclaration | Pattern, right: Expression, span: Span): typingsJapgolly.swcWasm.mod.ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ForInStatement]
  }
  
  inline def ForOfStatement(body: Statement, left: VariableDeclaration | Pattern, right: Expression, span: Span): typingsJapgolly.swcWasm.mod.ForOfStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ForOfStatement]
  }
  
  inline def ForStatement(body: Statement, span: Span): typingsJapgolly.swcWasm.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ForStatement]
  }
  
  inline def FunctionDeclaration(
    async: Boolean,
    declare: Boolean,
    generator: Boolean,
    identifier: Identifier,
    params: js.Array[Param],
    span: Span
  ): typingsJapgolly.swcWasm.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.FunctionDeclaration]
  }
  
  inline def IfStatement(consequent: Statement, span: Span, test: Expression): typingsJapgolly.swcWasm.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.IfStatement]
  }
  
  inline def LabeledStatement(body: Statement, label: Identifier, span: Span): typingsJapgolly.swcWasm.mod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.LabeledStatement]
  }
  
  inline def ReturnStatement(span: Span): typingsJapgolly.swcWasm.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ReturnStatement]
  }
  
  inline def SwitchStatement(cases: js.Array[SwitchCase], discriminant: Expression, span: Span): typingsJapgolly.swcWasm.mod.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.SwitchStatement]
  }
  
  inline def ThrowStatement(argument: Expression, span: Span): typingsJapgolly.swcWasm.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ThrowStatement]
  }
  
  inline def TryStatement(block: BlockStatement, span: Span): typingsJapgolly.swcWasm.mod.TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TryStatement]
  }
  
  inline def TsEnumDeclaration(declare: Boolean, id: Identifier, isConst: Boolean, members: js.Array[TsEnumMember], span: Span): typingsJapgolly.swcWasm.mod.TsEnumDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isConst = isConst.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsEnumDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsEnumDeclaration]
  }
  
  inline def TsInterfaceDeclaration(
    body: TsInterfaceBody,
    declare: Boolean,
    `extends`: js.Array[TsExpressionWithTypeArguments],
    id: Identifier,
    span: Span
  ): typingsJapgolly.swcWasm.mod.TsInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInterfaceDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsInterfaceDeclaration]
  }
  
  inline def TsModuleDeclaration(declare: Boolean, global: Boolean, id: TsModuleName, span: Span): typingsJapgolly.swcWasm.mod.TsModuleDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsModuleDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsModuleDeclaration]
  }
  
  inline def TsTypeAliasDeclaration(declare: Boolean, id: Identifier, span: Span, typeAnnotation: TsType): typingsJapgolly.swcWasm.mod.TsTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAliasDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsTypeAliasDeclaration]
  }
  
  inline def VariableDeclaration(
    declarations: js.Array[VariableDeclarator],
    declare: Boolean,
    kind: VariableDeclarationKind,
    span: Span
  ): typingsJapgolly.swcWasm.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.VariableDeclaration]
  }
  
  inline def WhileStatement(body: Statement, span: Span, test: Expression): typingsJapgolly.swcWasm.mod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.WhileStatement]
  }
  
  inline def WithStatement(body: Statement, `object`: Expression, span: Span): typingsJapgolly.swcWasm.mod.WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.WithStatement]
  }
}
