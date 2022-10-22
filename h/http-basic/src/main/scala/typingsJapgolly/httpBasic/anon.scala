package typingsJapgolly.httpBasic

import typingsJapgolly.httpBasic.libHeadersMod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<http-basic.http-basic/lib/CachedResponse.CachedResponse, 'headers' | 'requestTimestamp'> */
  trait PickCachedResponseheaders extends StObject {
    
    var headers: Headers
    
    var requestTimestamp: Double
  }
  object PickCachedResponseheaders {
    
    inline def apply(headers: Headers, requestTimestamp: Double): PickCachedResponseheaders = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], requestTimestamp = requestTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickCachedResponseheaders]
    }
    
    extension [Self <: PickCachedResponseheaders](x: Self) {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequestTimestamp(value: Double): Self = StObject.set(x, "requestTimestamp", value.asInstanceOf[js.Any])
    }
  }
}
