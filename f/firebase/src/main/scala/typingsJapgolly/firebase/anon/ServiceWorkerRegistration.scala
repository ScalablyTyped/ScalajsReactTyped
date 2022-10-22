package typingsJapgolly.firebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
