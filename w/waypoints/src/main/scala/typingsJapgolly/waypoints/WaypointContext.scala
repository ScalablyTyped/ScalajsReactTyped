package typingsJapgolly.waypoints

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.waypoints.anon.Horizontal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaypointContext extends StObject {
  
  var adapter: WaypointAdapter
  
  // http://imakewebthings.com/waypoints/api/context/#waypoints-property
  def destroy(): Waypoint
  
  var element: HTMLElement | Window
  
  def refresh(): Waypoint
  
  var waypoints: Horizontal
}
object WaypointContext {
  
  inline def apply(
    adapter: WaypointAdapter,
    destroy: CallbackTo[Waypoint],
    element: HTMLElement | Window,
    refresh: CallbackTo[Waypoint],
    waypoints: Horizontal
  ): WaypointContext = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], destroy = destroy.toJsFn, element = element.asInstanceOf[js.Any], refresh = refresh.toJsFn, waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointContext]
  }
  
  extension [Self <: WaypointContext](x: Self) {
    
    inline def setAdapter(value: WaypointAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: CallbackTo[Waypoint]): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setElement(value: HTMLElement | Window): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: CallbackTo[Waypoint]): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setWaypoints(value: Horizontal): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
  }
}
