package typingsJapgolly.csurf

import typingsJapgolly.csurf.mod.CookieOptions
import typingsJapgolly.expressServeStaticCore.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cookie extends StObject {
    
    /**
      * @default false
      */
    var cookie: js.UndefOr[CookieOptions | Boolean] = js.undefined
    
    var ignoreMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Function1[/* req */ Request, String]] = js.undefined
  }
  object Cookie {
    
    inline def apply(): Cookie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cookie]
    }
    
    extension [Self <: Cookie](x: Self) {
      
      inline def setCookie(value: CookieOptions | Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setIgnoreMethods(value: js.Array[String]): Self = StObject.set(x, "ignoreMethods", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMethodsUndefined: Self = StObject.set(x, "ignoreMethods", js.undefined)
      
      inline def setIgnoreMethodsVarargs(value: String*): Self = StObject.set(x, "ignoreMethods", js.Array(value*))
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setValue(value: /* req */ Request => String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
