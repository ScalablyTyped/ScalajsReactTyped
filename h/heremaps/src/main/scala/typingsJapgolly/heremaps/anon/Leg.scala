package typingsJapgolly.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Leg extends StObject {
  
  var leg: js.Array[Maneuver]
  
  var mode: Feature
  
  var shape: js.Array[String]
  
  var summary: BaseTime
  
  var waypoint: js.Array[Label]
}
object Leg {
  
  inline def apply(
    leg: js.Array[Maneuver],
    mode: Feature,
    shape: js.Array[String],
    summary: BaseTime,
    waypoint: js.Array[Label]
  ): Leg = {
    val __obj = js.Dynamic.literal(leg = leg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], waypoint = waypoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leg]
  }
  
  extension [Self <: Leg](x: Self) {
    
    inline def setLeg(value: js.Array[Maneuver]): Self = StObject.set(x, "leg", value.asInstanceOf[js.Any])
    
    inline def setLegVarargs(value: Maneuver*): Self = StObject.set(x, "leg", js.Array(value*))
    
    inline def setMode(value: Feature): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setShape(value: js.Array[String]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: String*): Self = StObject.set(x, "shape", js.Array(value*))
    
    inline def setSummary(value: BaseTime): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setWaypoint(value: js.Array[Label]): Self = StObject.set(x, "waypoint", value.asInstanceOf[js.Any])
    
    inline def setWaypointVarargs(value: Label*): Self = StObject.set(x, "waypoint", js.Array(value*))
  }
}
