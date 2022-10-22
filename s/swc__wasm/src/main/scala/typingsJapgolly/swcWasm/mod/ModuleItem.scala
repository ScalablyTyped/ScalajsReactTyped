package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.ModuleDeclaration
  - typingsJapgolly.swcWasm.mod.Statement
*/
trait ModuleItem extends StObject
object ModuleItem {
  
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
  
  inline def ExportAllDeclaration(source: StringLiteral, span: Span): typingsJapgolly.swcWasm.mod.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ExportAllDeclaration]
  }
  
  inline def ExportDeclaration(declaration: Declaration, span: Span): typingsJapgolly.swcWasm.mod.ExportDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ExportDeclaration]
  }
  
  inline def ExportDefaultDeclaration(decl: DefaultDecl, span: Span): typingsJapgolly.swcWasm.mod.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ExportDefaultDeclaration]
  }
  
  inline def ExportDefaultExpression(expression: Expression, span: Span): typingsJapgolly.swcWasm.mod.ExportDefaultExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultExpression")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ExportDefaultExpression]
  }
  
  inline def ExportNamedDeclaration(span: Span, specifiers: js.Array[ExportSpecifier], typeOnly: Boolean): typingsJapgolly.swcWasm.mod.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ExportNamedDeclaration]
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
  
  inline def ImportDeclaration(source: StringLiteral, span: Span, specifiers: js.Array[ImportSpecifier], typeOnly: Boolean): typingsJapgolly.swcWasm.mod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ImportDeclaration]
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
  
  inline def TsExportAssignment(expression: Expression, span: Span): typingsJapgolly.swcWasm.mod.TsExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExportAssignment")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsExportAssignment]
  }
  
  inline def TsImportEqualsDeclaration(
    declare: Boolean,
    id: Identifier,
    isExport: Boolean,
    isTypeOnly: Boolean,
    moduleRef: TsModuleReference,
    span: Span
  ): typingsJapgolly.swcWasm.mod.TsImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], isTypeOnly = isTypeOnly.asInstanceOf[js.Any], moduleRef = moduleRef.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsImportEqualsDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsImportEqualsDeclaration]
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
  
  inline def TsNamespaceExportDeclaration(id: Identifier, span: Span): typingsJapgolly.swcWasm.mod.TsNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNamespaceExportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsNamespaceExportDeclaration]
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
