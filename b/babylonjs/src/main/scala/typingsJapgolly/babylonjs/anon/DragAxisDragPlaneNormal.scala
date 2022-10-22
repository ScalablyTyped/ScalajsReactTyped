package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAxisDragPlaneNormal extends StObject {
  
  var dragAxis: js.UndefOr[Vector3] = js.undefined
  
  var dragPlaneNormal: js.UndefOr[Vector3] = js.undefined
}
object DragAxisDragPlaneNormal {
  
  inline def apply(): DragAxisDragPlaneNormal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAxisDragPlaneNormal]
  }
  
  extension [Self <: DragAxisDragPlaneNormal](x: Self) {
    
    inline def setDragAxis(value: Vector3): Self = StObject.set(x, "dragAxis", value.asInstanceOf[js.Any])
    
    inline def setDragAxisUndefined: Self = StObject.set(x, "dragAxis", js.undefined)
    
    inline def setDragPlaneNormal(value: Vector3): Self = StObject.set(x, "dragPlaneNormal", value.asInstanceOf[js.Any])
    
    inline def setDragPlaneNormalUndefined: Self = StObject.set(x, "dragPlaneNormal", js.undefined)
  }
}
