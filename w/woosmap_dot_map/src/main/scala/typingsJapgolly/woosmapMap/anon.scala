package typingsJapgolly.woosmapMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IdPropertyName extends StObject {
    
    var idPropertyName: String
  }
  object IdPropertyName {
    
    inline def apply(idPropertyName: String): IdPropertyName = {
      val __obj = js.Dynamic.literal(idPropertyName = idPropertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdPropertyName]
    }
    
    extension [Self <: IdPropertyName](x: Self) {
      
      inline def setIdPropertyName(value: String): Self = StObject.set(x, "idPropertyName", value.asInstanceOf[js.Any])
    }
  }
}
