package typingsJapgolly.openidClient.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var message: js.UndefOr[String] = js.undefined
  
  var printf: js.UndefOr[Parameters[FnCallFormatParam]] = js.undefined
  
  var response: js.UndefOr[`1` & IncomingMessage] = js.undefined
}
object Message {
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPrintf(value: Parameters[FnCallFormatParam]): Self = StObject.set(x, "printf", value.asInstanceOf[js.Any])
    
    inline def setPrintfUndefined: Self = StObject.set(x, "printf", js.undefined)
    
    inline def setResponse(value: `1` & IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
