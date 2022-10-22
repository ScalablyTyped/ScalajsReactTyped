package typingsJapgolly.leafletEditable.leafletMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.DomEvent._PropagableEvent because Already inherited
- typingsJapgolly.leaflet.mod.LeafletEvent because Already inherited
- typingsJapgolly.leafletEditable.leafletMod.VertexEvent because var conflicts: layer, popup, propagatedFrom, sourceTarget, target, `type`. Inlined vertex */ trait CancelableVertexEvent
  extends StObject
     with CancelableEvent {
  
  /**
    * The vertex that fired the event.
    */
  var vertex: VertexMarker
}
object CancelableVertexEvent {
  
  inline def apply(
    cancel: Callback,
    layer: Any,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    `type`: String,
    vertex: VertexMarker
  ): CancelableVertexEvent = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelableVertexEvent]
  }
  
  extension [Self <: CancelableVertexEvent](x: Self) {
    
    inline def setVertex(value: VertexMarker): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
  }
}
