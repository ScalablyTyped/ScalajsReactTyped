package typingsJapgolly.promClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var resp: js.UndefOr[Any] = js.undefined
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setResp(value: Any): Self = StObject.set(x, "resp", value.asInstanceOf[js.Any])
      
      inline def setRespUndefined: Self = StObject.set(x, "resp", js.undefined)
    }
  }
}
