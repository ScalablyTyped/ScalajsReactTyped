package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.ModuleDeclaration
  - typingsJapgolly.swcCore.typesMod.Statement
*/
trait ModuleItem extends StObject
object ModuleItem {
  
  inline def BlockStatement(span: Span, stmts: js.Array[Statement]): typingsJapgolly.swcCore.typesMod.BlockStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.BlockStatement]
  }
  
  inline def BreakStatement(span: Span): typingsJapgolly.swcCore.typesMod.BreakStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.BreakStatement]
  }
  
  inline def ClassDeclaration(
    body: js.Array[ClassMember],
    declare: Boolean,
    identifier: Identifier,
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): typingsJapgolly.swcCore.typesMod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ClassDeclaration]
  }
  
  inline def ContinueStatement(span: Span): typingsJapgolly.swcCore.typesMod.ContinueStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ContinueStatement]
  }
  
  inline def DebuggerStatement(span: Span): typingsJapgolly.swcCore.typesMod.DebuggerStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.DebuggerStatement]
  }
  
  inline def DoWhileStatement(body: Statement, span: Span, test: Expression): typingsJapgolly.swcCore.typesMod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.DoWhileStatement]
  }
  
  inline def EmptyStatement(span: Span): typingsJapgolly.swcCore.typesMod.EmptyStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.EmptyStatement]
  }
  
  inline def ExportAllDeclaration(source: StringLiteral, span: Span): typingsJapgolly.swcCore.typesMod.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ExportAllDeclaration]
  }
  
  inline def ExportDeclaration(declaration: Declaration, span: Span): typingsJapgolly.swcCore.typesMod.ExportDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ExportDeclaration]
  }
  
  inline def ExportDefaultDeclaration(decl: DefaultDecl, span: Span): typingsJapgolly.swcCore.typesMod.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ExportDefaultDeclaration]
  }
  
  inline def ExportDefaultExpression(expression: Expression, span: Span): typingsJapgolly.swcCore.typesMod.ExportDefaultExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultExpression")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ExportDefaultExpression]
  }
  
  inline def ExportNamedDeclaration(span: Span, specifiers: js.Array[ExportSpecifier], typeOnly: Boolean): typingsJapgolly.swcCore.typesMod.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ExportNamedDeclaration]
  }
  
  inline def ExpressionStatement(expression: Expression, span: Span): typingsJapgolly.swcCore.typesMod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ExpressionStatement]
  }
  
  inline def ForInStatement(body: Statement, left: VariableDeclaration | Pattern, right: Expression, span: Span): typingsJapgolly.swcCore.typesMod.ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ForInStatement]
  }
  
  inline def ForOfStatement(body: Statement, left: VariableDeclaration | Pattern, right: Expression, span: Span): typingsJapgolly.swcCore.typesMod.ForOfStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ForOfStatement]
  }
  
  inline def ForStatement(body: Statement, span: Span): typingsJapgolly.swcCore.typesMod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ForStatement]
  }
  
  inline def FunctionDeclaration(
    async: Boolean,
    declare: Boolean,
    generator: Boolean,
    identifier: Identifier,
    params: js.Array[Param],
    span: Span
  ): typingsJapgolly.swcCore.typesMod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.FunctionDeclaration]
  }
  
  inline def IfStatement(consequent: Statement, span: Span, test: Expression): typingsJapgolly.swcCore.typesMod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.IfStatement]
  }
  
  inline def ImportDeclaration(source: StringLiteral, span: Span, specifiers: js.Array[ImportSpecifier], typeOnly: Boolean): typingsJapgolly.swcCore.typesMod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ImportDeclaration]
  }
  
  inline def LabeledStatement(body: Statement, label: Identifier, span: Span): typingsJapgolly.swcCore.typesMod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.LabeledStatement]
  }
  
  inline def ReturnStatement(span: Span): typingsJapgolly.swcCore.typesMod.ReturnStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ReturnStatement]
  }
  
  inline def SwitchStatement(cases: js.Array[SwitchCase], discriminant: Expression, span: Span): typingsJapgolly.swcCore.typesMod.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.SwitchStatement]
  }
  
  inline def ThrowStatement(argument: Expression, span: Span): typingsJapgolly.swcCore.typesMod.ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ThrowStatement]
  }
  
  inline def TryStatement(block: BlockStatement, span: Span): typingsJapgolly.swcCore.typesMod.TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TryStatement]
  }
  
  inline def TsEnumDeclaration(declare: Boolean, id: Identifier, isConst: Boolean, members: js.Array[TsEnumMember], span: Span): typingsJapgolly.swcCore.typesMod.TsEnumDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isConst = isConst.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsEnumDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsEnumDeclaration]
  }
  
  inline def TsExportAssignment(expression: Expression, span: Span): typingsJapgolly.swcCore.typesMod.TsExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExportAssignment")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsExportAssignment]
  }
  
  inline def TsImportEqualsDeclaration(
    declare: Boolean,
    id: Identifier,
    isExport: Boolean,
    isTypeOnly: Boolean,
    moduleRef: TsModuleReference,
    span: Span
  ): typingsJapgolly.swcCore.typesMod.TsImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], isTypeOnly = isTypeOnly.asInstanceOf[js.Any], moduleRef = moduleRef.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsImportEqualsDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsImportEqualsDeclaration]
  }
  
  inline def TsInterfaceDeclaration(
    body: TsInterfaceBody,
    declare: Boolean,
    `extends`: js.Array[TsExpressionWithTypeArguments],
    id: Identifier,
    span: Span
  ): typingsJapgolly.swcCore.typesMod.TsInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInterfaceDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsInterfaceDeclaration]
  }
  
  inline def TsModuleDeclaration(declare: Boolean, global: Boolean, id: TsModuleName, span: Span): typingsJapgolly.swcCore.typesMod.TsModuleDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsModuleDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsModuleDeclaration]
  }
  
  inline def TsNamespaceExportDeclaration(id: Identifier, span: Span): typingsJapgolly.swcCore.typesMod.TsNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNamespaceExportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsNamespaceExportDeclaration]
  }
  
  inline def TsTypeAliasDeclaration(declare: Boolean, id: Identifier, span: Span, typeAnnotation: TsType): typingsJapgolly.swcCore.typesMod.TsTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAliasDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsTypeAliasDeclaration]
  }
  
  inline def VariableDeclaration(
    declarations: js.Array[VariableDeclarator],
    declare: Boolean,
    kind: VariableDeclarationKind,
    span: Span
  ): typingsJapgolly.swcCore.typesMod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.VariableDeclaration]
  }
  
  inline def WhileStatement(body: Statement, span: Span, test: Expression): typingsJapgolly.swcCore.typesMod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.WhileStatement]
  }
  
  inline def WithStatement(body: Statement, `object`: Expression, span: Span): typingsJapgolly.swcCore.typesMod.WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.WithStatement]
  }
}
