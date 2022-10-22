package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LooseEnums extends StObject {
  
  var looseEnums: Boolean
  
  var pureTopLevel: Boolean
  
  var wrapDecorators: Boolean
}
object LooseEnums {
  
  inline def apply(looseEnums: Boolean, pureTopLevel: Boolean, wrapDecorators: Boolean): LooseEnums = {
    val __obj = js.Dynamic.literal(looseEnums = looseEnums.asInstanceOf[js.Any], pureTopLevel = pureTopLevel.asInstanceOf[js.Any], wrapDecorators = wrapDecorators.asInstanceOf[js.Any])
    __obj.asInstanceOf[LooseEnums]
  }
  
  extension [Self <: LooseEnums](x: Self) {
    
    inline def setLooseEnums(value: Boolean): Self = StObject.set(x, "looseEnums", value.asInstanceOf[js.Any])
    
    inline def setPureTopLevel(value: Boolean): Self = StObject.set(x, "pureTopLevel", value.asInstanceOf[js.Any])
    
    inline def setWrapDecorators(value: Boolean): Self = StObject.set(x, "wrapDecorators", value.asInstanceOf[js.Any])
  }
}
