package typingsJapgolly.cssSelect

import typingsJapgolly.cssSelect.cssSelectStrings._flexibleDescendant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Type extends StObject {
    
    var `type`: _flexibleDescendant
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("_flexibleDescendant")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: _flexibleDescendant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
