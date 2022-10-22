package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSpecifier
  extends StObject
     with BaseModuleSpecifier
     with ModuleSpecifier {
  
  var exported: Identifier
  
  @JSName("type")
  var type_ExportSpecifier: typingsJapgolly.estree.estreeStrings.ExportSpecifier
}
object ExportSpecifier {
  
  inline def apply(exported: Identifier, local: Identifier): ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[ExportSpecifier]
  }
  
  extension [Self <: ExportSpecifier](x: Self) {
    
    inline def setExported(value: Identifier): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
