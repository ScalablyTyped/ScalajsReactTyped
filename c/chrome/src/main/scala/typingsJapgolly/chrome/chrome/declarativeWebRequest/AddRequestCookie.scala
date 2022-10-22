package typingsJapgolly.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddRequestCookie extends StObject {
  
  var cookie: RequestCookie
}
object AddRequestCookie {
  
  inline def apply(cookie: RequestCookie): AddRequestCookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRequestCookie]
  }
  
  extension [Self <: AddRequestCookie](x: Self) {
    
    inline def setCookie(value: RequestCookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
