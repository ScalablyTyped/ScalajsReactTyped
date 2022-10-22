package typingsJapgolly.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeServerCheckoutOptions extends StObject {
  
  var sessionId: String
}
object StripeServerCheckoutOptions {
  
  inline def apply(sessionId: String): StripeServerCheckoutOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeServerCheckoutOptions]
  }
  
  extension [Self <: StripeServerCheckoutOptions](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
