package typingsJapgolly.csurf

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.csurf.anon.Cookie
import typingsJapgolly.expressServeStaticCore.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler]
  inline def apply(options: Cookie): RequestHandler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @JSImport("csurf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CookieOptions
    extends StObject
       with typingsJapgolly.expressServeStaticCore.mod.CookieOptions {
    
    /**
      * @default '_csrf'
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object CookieOptions {
    
    inline def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    extension [Self <: CookieOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        def csrfToken(): String
      }
      object Request {
        
        inline def apply(csrfToken: CallbackTo[String]): Request = {
          val __obj = js.Dynamic.literal(csrfToken = csrfToken.toJsFn)
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setCsrfToken(value: CallbackTo[String]): Self = StObject.set(x, "csrfToken", value.toJsFn)
        }
      }
    }
  }
}
