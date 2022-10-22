package typingsJapgolly.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersHeaders extends StObject {
  
  var headers: org.scalajs.dom.Headers
}
object HeadersHeaders {
  
  inline def apply(headers: org.scalajs.dom.Headers): HeadersHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersHeaders]
  }
  
  extension [Self <: HeadersHeaders](x: Self) {
    
    inline def setHeaders(value: org.scalajs.dom.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
