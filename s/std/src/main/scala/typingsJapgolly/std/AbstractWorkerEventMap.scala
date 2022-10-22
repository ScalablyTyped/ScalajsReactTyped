package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractWorkerEventMap extends StObject {
  
  /* standard dom */
  var error: org.scalajs.dom.ErrorEvent
}
object AbstractWorkerEventMap {
  
  inline def apply(error: org.scalajs.dom.ErrorEvent): AbstractWorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractWorkerEventMap]
  }
  
  extension [Self <: AbstractWorkerEventMap](x: Self) {
    
    inline def setError(value: org.scalajs.dom.ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
