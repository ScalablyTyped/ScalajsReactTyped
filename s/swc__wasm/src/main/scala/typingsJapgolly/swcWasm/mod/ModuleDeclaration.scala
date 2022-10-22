package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.ImportDeclaration
  - typingsJapgolly.swcWasm.mod.ExportDeclaration
  - typingsJapgolly.swcWasm.mod.ExportNamedDeclaration
  - typingsJapgolly.swcWasm.mod.ExportDefaultDeclaration
  - typingsJapgolly.swcWasm.mod.ExportDefaultExpression
  - typingsJapgolly.swcWasm.mod.ExportAllDeclaration
  - typingsJapgolly.swcWasm.mod.TsImportEqualsDeclaration
  - typingsJapgolly.swcWasm.mod.TsExportAssignment
  - typingsJapgolly.swcWasm.mod.TsNamespaceExportDeclaration
*/
trait ModuleDeclaration
  extends StObject
     with ModuleItem
object ModuleDeclaration {
  
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
  
  inline def ImportDeclaration(source: StringLiteral, span: Span, specifiers: js.Array[ImportSpecifier], typeOnly: Boolean): typingsJapgolly.swcWasm.mod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ImportDeclaration]
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
  
  inline def TsNamespaceExportDeclaration(id: Identifier, span: Span): typingsJapgolly.swcWasm.mod.TsNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNamespaceExportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsNamespaceExportDeclaration]
  }
}
