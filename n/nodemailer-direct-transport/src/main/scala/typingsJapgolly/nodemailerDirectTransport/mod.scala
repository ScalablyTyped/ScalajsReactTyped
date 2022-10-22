package typingsJapgolly.nodemailerDirectTransport

import typingsJapgolly.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: DirectOptions): Transport[Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transport[Any]]
  
  @JSImport("nodemailer-direct-transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AuthOptions extends StObject {
    
    var pass: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
    
    var xoauth2: js.UndefOr[Any] = js.undefined
  }
  object AuthOptions {
    
    inline def apply(): AuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthOptions]
    }
    
    extension [Self <: AuthOptions](x: Self) {
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setXoauth2(value: Any): Self = StObject.set(x, "xoauth2", value.asInstanceOf[js.Any])
      
      inline def setXoauth2Undefined: Self = StObject.set(x, "xoauth2", js.undefined)
    }
  }
  
  trait DirectOptions extends StObject {
    
    /**
      * if true, the connection emits all traffic between client and server as 'log' events
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * optional hostname of the client, used for identifying to the server
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object DirectOptions {
    
    inline def apply(): DirectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectOptions]
    }
    
    extension [Self <: DirectOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
