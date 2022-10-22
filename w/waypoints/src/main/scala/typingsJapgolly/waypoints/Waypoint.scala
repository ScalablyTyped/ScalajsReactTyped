package typingsJapgolly.waypoints

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Waypoint extends StObject {
  
  // properties
  var adapter: WaypointAdapter
  
  var context: WaypointContext
  
  // Instance Methods
  def destroy(): Waypoint
  
  def disable(): Waypoint
  
  var element: HTMLElement
  
  def enable(): Waypoint
  
  var group: WaypointGroup
  
  def next(): Waypoint | String
  
  var options: WaypointOptions
  
  // actually `null` not string
  def previous(): Waypoint | String
  
  var triggerPoint: Double
}
object Waypoint {
  
  inline def apply(
    adapter: WaypointAdapter,
    context: WaypointContext,
    destroy: CallbackTo[Waypoint],
    disable: CallbackTo[Waypoint],
    element: HTMLElement,
    enable: CallbackTo[Waypoint],
    group: WaypointGroup,
    next: CallbackTo[Waypoint | String],
    options: WaypointOptions,
    previous: CallbackTo[Waypoint | String],
    triggerPoint: Double
  ): Waypoint = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = destroy.toJsFn, disable = disable.toJsFn, element = element.asInstanceOf[js.Any], enable = enable.toJsFn, group = group.asInstanceOf[js.Any], next = next.toJsFn, options = options.asInstanceOf[js.Any], previous = previous.toJsFn, triggerPoint = triggerPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoint]
  }
  
  extension [Self <: Waypoint](x: Self) {
    
    inline def setAdapter(value: WaypointAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setContext(value: WaypointContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: CallbackTo[Waypoint]): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDisable(value: CallbackTo[Waypoint]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: CallbackTo[Waypoint]): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setGroup(value: WaypointGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setNext(value: CallbackTo[Waypoint | String]): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setOptions(value: WaypointOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: CallbackTo[Waypoint | String]): Self = StObject.set(x, "previous", value.toJsFn)
    
    inline def setTriggerPoint(value: Double): Self = StObject.set(x, "triggerPoint", value.asInstanceOf[js.Any])
  }
}
