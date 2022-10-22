package typingsJapgolly.leafletEditable.leafletMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.DomEvent._PropagableEvent because Already inherited
- typingsJapgolly.leaflet.mod.LeafletEvent because Already inherited
- typingsJapgolly.leafletEditable.leafletMod.ShapeEvent because var conflicts: layer, popup, propagatedFrom, sourceTarget, target, `type`. Inlined shape */ trait CancelableShapeEvent
  extends StObject
     with CancelableEvent {
  
  /**
    * The shape (LatLngs array) subject of the action.
    */
  var shape: js.Array[LatLng_]
}
object CancelableShapeEvent {
  
  inline def apply(
    cancel: Callback,
    layer: Any,
    popup: Any,
    propagatedFrom: Any,
    shape: js.Array[LatLng_],
    sourceTarget: Any,
    target: Any,
    `type`: String
  ): CancelableShapeEvent = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelableShapeEvent]
  }
  
  extension [Self <: CancelableShapeEvent](x: Self) {
    
    inline def setShape(value: js.Array[LatLng_]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: LatLng_ *): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
