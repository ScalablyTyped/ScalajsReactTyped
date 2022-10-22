package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCallback extends StObject {
  
  /**
    * Called when DELETE request was received.
    *
    * @param request That is request from server side.
    */
  def ondelete(request: Request): Unit
  
  /**
    * Called when GET request was received.
    *
    * @param request That is request from server side.
    */
  def onget(request: Request): Unit
  
  /**
    * Called when OBSERVE request was received.
    *
    * @param request That is request from server side.
    * @param observeType The observation type of the request.
    * @param observeId The observation id of the request.
    */
  def onobserving(request: Request, observeType: ObserveType, observeId: Double): Unit
  
  /**
    * Called when POST request was received.
    *
    * @param request That is request from server side.
    */
  def onpost(request: Request): Unit
  
  /**
    * Called when PUT request was received.
    *
    * @param request That is request from server side.
    */
  def onput(request: Request): Unit
}
object RequestCallback {
  
  inline def apply(
    ondelete: Request => Callback,
    onget: Request => Callback,
    onobserving: (Request, ObserveType, Double) => Callback,
    onpost: Request => Callback,
    onput: Request => Callback
  ): RequestCallback = {
    val __obj = js.Dynamic.literal(ondelete = js.Any.fromFunction1((t0: Request) => ondelete(t0).runNow()), onget = js.Any.fromFunction1((t0: Request) => onget(t0).runNow()), onobserving = js.Any.fromFunction3((t0: Request, t1: ObserveType, t2: Double) => (onobserving(t0, t1, t2)).runNow()), onpost = js.Any.fromFunction1((t0: Request) => onpost(t0).runNow()), onput = js.Any.fromFunction1((t0: Request) => onput(t0).runNow()))
    __obj.asInstanceOf[RequestCallback]
  }
  
  extension [Self <: RequestCallback](x: Self) {
    
    inline def setOndelete(value: Request => Callback): Self = StObject.set(x, "ondelete", js.Any.fromFunction1((t0: Request) => value(t0).runNow()))
    
    inline def setOnget(value: Request => Callback): Self = StObject.set(x, "onget", js.Any.fromFunction1((t0: Request) => value(t0).runNow()))
    
    inline def setOnobserving(value: (Request, ObserveType, Double) => Callback): Self = StObject.set(x, "onobserving", js.Any.fromFunction3((t0: Request, t1: ObserveType, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnpost(value: Request => Callback): Self = StObject.set(x, "onpost", js.Any.fromFunction1((t0: Request) => value(t0).runNow()))
    
    inline def setOnput(value: Request => Callback): Self = StObject.set(x, "onput", js.Any.fromFunction1((t0: Request) => value(t0).runNow()))
  }
}
