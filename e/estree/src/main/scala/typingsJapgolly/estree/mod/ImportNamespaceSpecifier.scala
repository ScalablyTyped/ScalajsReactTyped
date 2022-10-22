package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportNamespaceSpecifier
  extends StObject
     with BaseModuleSpecifier
     with ModuleSpecifier {
  
  @JSName("type")
  var type_ImportNamespaceSpecifier: typingsJapgolly.estree.estreeStrings.ImportNamespaceSpecifier
}
object ImportNamespaceSpecifier {
  
  inline def apply(local: Identifier): ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[ImportNamespaceSpecifier]
  }
  
  extension [Self <: ImportNamespaceSpecifier](x: Self) {
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
