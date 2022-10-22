package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.ExportSpecifier_
  - typingsJapgolly.babelTypes.libMod.ImportDefaultSpecifier_
  - typingsJapgolly.babelTypes.libMod.ImportNamespaceSpecifier_
  - typingsJapgolly.babelTypes.libMod.ImportSpecifier_
  - typingsJapgolly.babelTypes.libMod.ExportNamespaceSpecifier_
  - typingsJapgolly.babelTypes.libMod.ExportDefaultSpecifier_
*/
trait ModuleSpecifier extends StObject
object ModuleSpecifier {
  
  inline def ExportDefaultSpecifier_(exported: Identifier_): typingsJapgolly.babelTypes.libMod.ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportDefaultSpecifier_]
  }
  
  inline def ExportNamespaceSpecifier_(exported: Identifier_): typingsJapgolly.babelTypes.libMod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportNamespaceSpecifier_]
  }
  
  inline def ExportSpecifier_(exported: Identifier_ | StringLiteral_, local: Identifier_): typingsJapgolly.babelTypes.libMod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExportSpecifier_]
  }
  
  inline def ImportDefaultSpecifier_(local: Identifier_): typingsJapgolly.babelTypes.libMod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ImportDefaultSpecifier_]
  }
  
  inline def ImportNamespaceSpecifier_(local: Identifier_): typingsJapgolly.babelTypes.libMod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ImportNamespaceSpecifier_]
  }
  
  inline def ImportSpecifier_(imported: Identifier_ | StringLiteral_, local: Identifier_): typingsJapgolly.babelTypes.libMod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ImportSpecifier_]
  }
}
