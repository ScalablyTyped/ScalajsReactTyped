package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.ExportSpecifier_
  - typingsJapgolly.babelTypes.mod.ImportDefaultSpecifier_
  - typingsJapgolly.babelTypes.mod.ImportNamespaceSpecifier_
  - typingsJapgolly.babelTypes.mod.ImportSpecifier_
  - typingsJapgolly.babelTypes.mod.ExportDefaultSpecifier_
  - typingsJapgolly.babelTypes.mod.ExportNamespaceSpecifier_
*/
trait ModuleSpecifier extends StObject
object ModuleSpecifier {
  
  inline def ExportDefaultSpecifier_(end: Double, exported: Identifier_, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExportDefaultSpecifier_]
  }
  
  inline def ExportNamespaceSpecifier_(end: Double, exported: Identifier_, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExportNamespaceSpecifier_]
  }
  
  inline def ExportSpecifier_(
    end: Double,
    exported: Identifier_,
    imported: Identifier_,
    loc: SourceLocation,
    local: Identifier_,
    start: Double
  ): typingsJapgolly.babelTypes.mod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExportSpecifier_]
  }
  
  inline def ImportDefaultSpecifier_(end: Double, loc: SourceLocation, local: Identifier_, start: Double): typingsJapgolly.babelTypes.mod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ImportDefaultSpecifier_]
  }
  
  inline def ImportNamespaceSpecifier_(end: Double, loc: SourceLocation, local: Identifier_, start: Double): typingsJapgolly.babelTypes.mod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ImportNamespaceSpecifier_]
  }
  
  inline def ImportSpecifier_(end: Double, imported: Identifier_, loc: SourceLocation, local: Identifier_, start: Double): typingsJapgolly.babelTypes.mod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ImportSpecifier_]
  }
}
