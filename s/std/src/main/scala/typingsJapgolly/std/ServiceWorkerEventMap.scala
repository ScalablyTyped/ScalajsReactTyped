package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerEventMap
  extends StObject
     with AbstractWorkerEventMap {
  
  /* standard dom */
  var statechange: org.scalajs.dom.Event
}
object ServiceWorkerEventMap {
  
  inline def apply(error: org.scalajs.dom.ErrorEvent, statechange: org.scalajs.dom.Event): ServiceWorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerEventMap]
  }
  
  extension [Self <: ServiceWorkerEventMap](x: Self) {
    
    inline def setStatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
