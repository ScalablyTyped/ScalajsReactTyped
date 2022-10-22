package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerRegistrationEventMap extends StObject {
  
  /* standard dom */
  var updatefound: org.scalajs.dom.Event
}
object ServiceWorkerRegistrationEventMap {
  
  inline def apply(updatefound: org.scalajs.dom.Event): ServiceWorkerRegistrationEventMap = {
    val __obj = js.Dynamic.literal(updatefound = updatefound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistrationEventMap]
  }
  
  extension [Self <: ServiceWorkerRegistrationEventMap](x: Self) {
    
    inline def setUpdatefound(value: org.scalajs.dom.Event): Self = StObject.set(x, "updatefound", value.asInstanceOf[js.Any])
  }
}
