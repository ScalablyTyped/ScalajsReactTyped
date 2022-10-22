package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.ImportDeclaration
  - typingsJapgolly.swcCore.typesMod.ExportDeclaration
  - typingsJapgolly.swcCore.typesMod.ExportNamedDeclaration
  - typingsJapgolly.swcCore.typesMod.ExportDefaultDeclaration
  - typingsJapgolly.swcCore.typesMod.ExportDefaultExpression
  - typingsJapgolly.swcCore.typesMod.ExportAllDeclaration
  - typingsJapgolly.swcCore.typesMod.TsImportEqualsDeclaration
  - typingsJapgolly.swcCore.typesMod.TsExportAssignment
  - typingsJapgolly.swcCore.typesMod.TsNamespaceExportDeclaration
*/
trait ModuleDeclaration
  extends StObject
     with ModuleItem
object ModuleDeclaration {
  
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
  
  inline def ImportDeclaration(source: StringLiteral, span: Span, specifiers: js.Array[ImportSpecifier], typeOnly: Boolean): typingsJapgolly.swcCore.typesMod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.ImportDeclaration]
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
  
  inline def TsNamespaceExportDeclaration(id: Identifier, span: Span): typingsJapgolly.swcCore.typesMod.TsNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNamespaceExportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsNamespaceExportDeclaration]
  }
}
