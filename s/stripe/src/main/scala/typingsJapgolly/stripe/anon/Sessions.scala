package typingsJapgolly.stripe.anon

import typingsJapgolly.stripe.mod.Stripe.Checkout.SessionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sessions extends StObject {
  
  var sessions: SessionsResource
}
object Sessions {
  
  inline def apply(sessions: SessionsResource): Sessions = {
    val __obj = js.Dynamic.literal(sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sessions]
  }
  
  extension [Self <: Sessions](x: Self) {
    
    inline def setSessions(value: SessionsResource): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
  }
}
