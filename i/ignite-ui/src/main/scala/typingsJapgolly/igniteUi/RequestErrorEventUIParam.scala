package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestErrorEventUIParam extends StObject {
  
  /**
    * Gets the processed error message sent by the server
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the whole response object
    */
  var response: js.UndefOr[Any] = js.undefined
}
object RequestErrorEventUIParam {
  
  inline def apply(): RequestErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestErrorEventUIParam]
  }
  
  extension [Self <: RequestErrorEventUIParam](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
