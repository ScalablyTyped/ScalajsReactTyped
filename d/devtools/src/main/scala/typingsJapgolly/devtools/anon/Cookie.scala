package typingsJapgolly.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  var cookie: typingsJapgolly.wdioProtocols.buildTypesMod.Cookie
}
object Cookie {
  
  inline def apply(cookie: typingsJapgolly.wdioProtocols.buildTypesMod.Cookie): Cookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  extension [Self <: Cookie](x: Self) {
    
    inline def setCookie(value: typingsJapgolly.wdioProtocols.buildTypesMod.Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
