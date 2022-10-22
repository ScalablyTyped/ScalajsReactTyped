package typingsJapgolly.woosmapMap.woosmap.map

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsService extends StObject {
  
  /**
    * Issue a directions search request.
    */
  def route(
    request: DirectionRequest,
    callback: js.Function2[/* result */ DirectionResult, /* status */ String, Any]
  ): Unit
}
object DirectionsService {
  
  inline def apply(
    route: (DirectionRequest, js.Function2[/* result */ DirectionResult, /* status */ String, Any]) => Callback
  ): DirectionsService = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2((t0: DirectionRequest, t1: js.Function2[/* result */ DirectionResult, /* status */ String, Any]) => (route(t0, t1)).runNow()))
    __obj.asInstanceOf[DirectionsService]
  }
  
  extension [Self <: DirectionsService](x: Self) {
    
    inline def setRoute(
      value: (DirectionRequest, js.Function2[/* result */ DirectionResult, /* status */ String, Any]) => Callback
    ): Self = StObject.set(x, "route", js.Any.fromFunction2((t0: DirectionRequest, t1: js.Function2[/* result */ DirectionResult, /* status */ String, Any]) => (value(t0, t1)).runNow()))
  }
}
