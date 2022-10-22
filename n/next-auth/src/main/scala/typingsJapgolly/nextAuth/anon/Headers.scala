package typingsJapgolly.nextAuth.anon

import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.std.Map
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var cookies: js.UndefOr[Partial[(Record[String, String]) | (Map[String, String])]] = js.undefined
  
  var headers: js.UndefOr[org.scalajs.dom.Headers | IncomingHttpHeaders | (Record[String, String])] = js.undefined
}
object Headers {
  
  inline def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setCookies(value: Partial[(Record[String, String]) | (Map[String, String])]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setHeaders(value: org.scalajs.dom.Headers | IncomingHttpHeaders | (Record[String, String])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
