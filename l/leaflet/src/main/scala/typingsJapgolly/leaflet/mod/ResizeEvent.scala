package typingsJapgolly.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeEvent
  extends StObject
     with LeafletEvent {
  
  var newSize: Point_
  
  var oldSize: Point_
}
object ResizeEvent {
  
  inline def apply(
    layer: Any,
    newSize: Point_,
    oldSize: Point_,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    `type`: String
  ): ResizeEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], newSize = newSize.asInstanceOf[js.Any], oldSize = oldSize.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEvent]
  }
  
  extension [Self <: ResizeEvent](x: Self) {
    
    inline def setNewSize(value: Point_): Self = StObject.set(x, "newSize", value.asInstanceOf[js.Any])
    
    inline def setOldSize(value: Point_): Self = StObject.set(x, "oldSize", value.asInstanceOf[js.Any])
  }
}
