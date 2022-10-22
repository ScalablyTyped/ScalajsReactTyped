package typingsJapgolly.next.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.next.distClientComponentsReducerMod.FocusAndScrollRef
import typingsJapgolly.next.distServerAppRenderMod.FlightData
import typingsJapgolly.next.distServerAppRenderMod.FlightRouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeByServerResponse extends StObject {
  
  def changeByServerResponse(previousTree: FlightRouterState, flightData: FlightData): Unit
  
  var focusAndScrollRef: FocusAndScrollRef
  
  var tree: FlightRouterState
}
object ChangeByServerResponse {
  
  inline def apply(
    changeByServerResponse: (FlightRouterState, FlightData) => Callback,
    focusAndScrollRef: FocusAndScrollRef,
    tree: FlightRouterState
  ): ChangeByServerResponse = {
    val __obj = js.Dynamic.literal(changeByServerResponse = js.Any.fromFunction2((t0: FlightRouterState, t1: FlightData) => (changeByServerResponse(t0, t1)).runNow()), focusAndScrollRef = focusAndScrollRef.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeByServerResponse]
  }
  
  extension [Self <: ChangeByServerResponse](x: Self) {
    
    inline def setChangeByServerResponse(value: (FlightRouterState, FlightData) => Callback): Self = StObject.set(x, "changeByServerResponse", js.Any.fromFunction2((t0: FlightRouterState, t1: FlightData) => (value(t0, t1)).runNow()))
    
    inline def setFocusAndScrollRef(value: FocusAndScrollRef): Self = StObject.set(x, "focusAndScrollRef", value.asInstanceOf[js.Any])
    
    inline def setTree(value: FlightRouterState): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
