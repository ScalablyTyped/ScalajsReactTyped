package typingsJapgolly.preactCustomElement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Shadow extends StObject {
    
    var shadow: Boolean
  }
  object Shadow {
    
    inline def apply(shadow: Boolean): Shadow = {
      val __obj = js.Dynamic.literal(shadow = shadow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shadow]
    }
    
    extension [Self <: Shadow](x: Self) {
      
      inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    }
  }
}
