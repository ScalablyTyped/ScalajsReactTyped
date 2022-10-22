package typingsJapgolly.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An AppCheck token provider that always yields an empty token.
  * @internal
  */ trait J extends StObject {
  
  def getToken(): js.Promise[z]
  
  def invalidateToken(): Unit
  
  def shutdown(): Unit
  
  def start(t: Any, e: Any): Unit
}
object J {
  
  inline def apply(
    getToken: CallbackTo[js.Promise[z]],
    invalidateToken: Callback,
    shutdown: Callback,
    start: (Any, Any) => Callback
  ): J = {
    val __obj = js.Dynamic.literal(getToken = getToken.toJsFn, invalidateToken = invalidateToken.toJsFn, shutdown = shutdown.toJsFn, start = js.Any.fromFunction2((t0: Any, t1: Any) => (start(t0, t1)).runNow()))
    __obj.asInstanceOf[J]
  }
  
  extension [Self <: J](x: Self) {
    
    inline def setGetToken(value: CallbackTo[js.Promise[z]]): Self = StObject.set(x, "getToken", value.toJsFn)
    
    inline def setInvalidateToken(value: Callback): Self = StObject.set(x, "invalidateToken", value.toJsFn)
    
    inline def setShutdown(value: Callback): Self = StObject.set(x, "shutdown", value.toJsFn)
    
    inline def setStart(value: (Any, Any) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
  }
}
