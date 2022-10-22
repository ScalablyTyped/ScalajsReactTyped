package typingsJapgolly.firebaseMessagingCompat

import typingsJapgolly.firebaseMessagingCompat.appCompatMod.FirebaseApp
import typingsJapgolly.firebaseMessagingCompat.distSrcMessagingCompatMod.MessagingCompat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(): MessagingCompat = js.native
    def apply(app: FirebaseApp): MessagingCompat = js.native
    
    def isSupported(): Boolean = js.native
  }
  
  trait ServiceWorkerRegistration extends StObject {
    
    var serviceWorkerRegistration: js.UndefOr[org.scalajs.dom.ServiceWorkerRegistration] = js.undefined
    
    var vapidKey: js.UndefOr[String] = js.undefined
  }
  object ServiceWorkerRegistration {
    
    inline def apply(): ServiceWorkerRegistration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceWorkerRegistration]
    }
    
    extension [Self <: ServiceWorkerRegistration](x: Self) {
      
      inline def setServiceWorkerRegistration(value: org.scalajs.dom.ServiceWorkerRegistration): Self = StObject.set(x, "serviceWorkerRegistration", value.asInstanceOf[js.Any])
      
      inline def setServiceWorkerRegistrationUndefined: Self = StObject.set(x, "serviceWorkerRegistration", js.undefined)
      
      inline def setVapidKey(value: String): Self = StObject.set(x, "vapidKey", value.asInstanceOf[js.Any])
      
      inline def setVapidKeyUndefined: Self = StObject.set(x, "vapidKey", js.undefined)
    }
  }
}
