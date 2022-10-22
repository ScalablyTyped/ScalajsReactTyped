package typingsJapgolly.openid

import typingsJapgolly.openid.anon.Authenticated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openid", "RelyingParty")
  @js.native
  open class RelyingParty protected () extends StObject {
    def this(returnUrl: String, realm: String, stateless: Boolean, strict: Boolean, extensions: js.Array[Any]) = this()
    def this(returnUrl: String, realm: Null, stateless: Boolean, strict: Boolean, extensions: js.Array[Any]) = this()
    
    def authenticate(
      identifier: String,
      immediate: Boolean,
      callback: js.Function2[/* err */ OpenIdError | Null, /* authUrl */ String | Null, Unit]
    ): Unit = js.native
    
    def verifyAssertion(
      requestOrUrl: String,
      callback: js.Function2[/* err */ OpenIdError | Null, /* result */ js.UndefOr[Authenticated], Unit]
    ): Unit = js.native
    def verifyAssertion(
      requestOrUrl: js.Object,
      callback: js.Function2[/* err */ OpenIdError | Null, /* result */ js.UndefOr[Authenticated], Unit]
    ): Unit = js.native
  }
  
  trait OpenIdError extends StObject {
    
    var message: String
  }
  object OpenIdError {
    
    inline def apply(message: String): OpenIdError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenIdError]
    }
    
    extension [Self <: OpenIdError](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
