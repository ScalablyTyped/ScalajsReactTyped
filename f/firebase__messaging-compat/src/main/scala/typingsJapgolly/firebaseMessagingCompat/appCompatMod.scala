package typingsJapgolly.firebaseMessagingCompat

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseMessagingCompat.anon.Call
import typingsJapgolly.firebaseMessagingCompat.distSrcMessagingCompatMod.MessagingCompat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define extension behavior of `registerMessaging`
  */
/* augmented module */
object appCompatMod {
  
  trait FirebaseApp extends StObject {
    
    def messaging(): MessagingCompat
  }
  object FirebaseApp {
    
    inline def apply(messaging: CallbackTo[MessagingCompat]): FirebaseApp = {
      val __obj = js.Dynamic.literal(messaging = messaging.toJsFn)
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setMessaging(value: CallbackTo[MessagingCompat]): Self = StObject.set(x, "messaging", value.toJsFn)
    }
  }
  
  trait FirebaseNamespace extends StObject {
    
    def messaging(): MessagingCompat
    def messaging(app: FirebaseApp): MessagingCompat
    @JSName("messaging")
    var messaging_Original: Call
  }
  object FirebaseNamespace {
    
    inline def apply(messaging: Call): FirebaseNamespace = {
      val __obj = js.Dynamic.literal(messaging = messaging.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    extension [Self <: FirebaseNamespace](x: Self) {
      
      inline def setMessaging(value: Call): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    }
  }
}
