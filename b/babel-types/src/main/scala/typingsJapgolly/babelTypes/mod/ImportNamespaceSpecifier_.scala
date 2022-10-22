package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportNamespaceSpecifier_
  extends StObject
     with Node
     with ModuleSpecifier {
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportNamespaceSpecifier_ : ImportNamespaceSpecifier
}
object ImportNamespaceSpecifier_ {
  
  inline def apply(end: Double, loc: SourceLocation, local: Identifier_, start: Double): ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[ImportNamespaceSpecifier_]
  }
  
  extension [Self <: ImportNamespaceSpecifier_](x: Self) {
    
    inline def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
