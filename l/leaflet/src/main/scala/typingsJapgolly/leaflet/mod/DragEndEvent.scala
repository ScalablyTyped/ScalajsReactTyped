package typingsJapgolly.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEndEvent
  extends StObject
     with LeafletEvent {
  
  var distance: Double
}
object DragEndEvent {
  
  inline def apply(
    distance: Double,
    layer: Any,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    `type`: String
  ): DragEndEvent = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEndEvent]
  }
  
  extension [Self <: DragEndEvent](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
  }
}
