package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.mod.ImportSpecifier
  - typingsJapgolly.estree.mod.ImportDefaultSpecifier
  - typingsJapgolly.estree.mod.ImportNamespaceSpecifier
  - typingsJapgolly.estree.mod.ExportSpecifier
*/
trait ModuleSpecifier extends StObject
object ModuleSpecifier {
  
  inline def ExportSpecifier(exported: Identifier, local: Identifier): typingsJapgolly.estree.mod.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ExportSpecifier]
  }
  
  inline def ImportDefaultSpecifier(local: Identifier): typingsJapgolly.estree.mod.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ImportDefaultSpecifier]
  }
  
  inline def ImportNamespaceSpecifier(local: Identifier): typingsJapgolly.estree.mod.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ImportNamespaceSpecifier]
  }
  
  inline def ImportSpecifier(imported: Identifier, local: Identifier): typingsJapgolly.estree.mod.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ImportSpecifier]
  }
}
