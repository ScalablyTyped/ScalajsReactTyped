package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageUrl extends StObject {
  
  var message: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object MessageUrl {
  
  inline def apply(): MessageUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageUrl]
  }
  
  extension [Self <: MessageUrl](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
