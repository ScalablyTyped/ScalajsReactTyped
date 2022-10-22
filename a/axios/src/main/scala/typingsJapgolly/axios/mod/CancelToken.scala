package typingsJapgolly.axios.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelToken extends StObject {
  
  var promise: js.Promise[Cancel]
  
  var reason: js.UndefOr[Cancel] = js.undefined
  
  def throwIfRequested(): Unit
}
object CancelToken {
  
  inline def apply(promise: js.Promise[Cancel], throwIfRequested: Callback): CancelToken = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], throwIfRequested = throwIfRequested.toJsFn)
    __obj.asInstanceOf[CancelToken]
  }
  
  extension [Self <: CancelToken](x: Self) {
    
    inline def setPromise(value: js.Promise[Cancel]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Cancel): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setThrowIfRequested(value: Callback): Self = StObject.set(x, "throwIfRequested", value.toJsFn)
  }
}
