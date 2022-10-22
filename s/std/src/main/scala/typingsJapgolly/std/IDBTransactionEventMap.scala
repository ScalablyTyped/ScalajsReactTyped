package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBTransactionEventMap extends StObject {
  
  /* standard dom */
  var abort: org.scalajs.dom.Event
  
  /* standard dom */
  var complete: org.scalajs.dom.Event
  
  /* standard dom */
  var error: org.scalajs.dom.Event
}
object IDBTransactionEventMap {
  
  inline def apply(abort: org.scalajs.dom.Event, complete: org.scalajs.dom.Event, error: org.scalajs.dom.Event): IDBTransactionEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBTransactionEventMap]
  }
  
  extension [Self <: IDBTransactionEventMap](x: Self) {
    
    inline def setAbort(value: org.scalajs.dom.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: org.scalajs.dom.Event): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
