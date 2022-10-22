package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedsRenderFrame extends StObject {
  
  var around: ^
  
  var needsRenderFrame: Boolean
  
  var noInertia: Boolean
  
  var originalEvent: Any
  
  var zoomDelta: Double
}
object NeedsRenderFrame {
  
  inline def apply(around: ^, needsRenderFrame: Boolean, noInertia: Boolean, originalEvent: Any, zoomDelta: Double): NeedsRenderFrame = {
    val __obj = js.Dynamic.literal(around = around.asInstanceOf[js.Any], needsRenderFrame = needsRenderFrame.asInstanceOf[js.Any], noInertia = noInertia.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], zoomDelta = zoomDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsRenderFrame]
  }
  
  extension [Self <: NeedsRenderFrame](x: Self) {
    
    inline def setAround(value: ^): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
    
    inline def setNeedsRenderFrame(value: Boolean): Self = StObject.set(x, "needsRenderFrame", value.asInstanceOf[js.Any])
    
    inline def setNoInertia(value: Boolean): Self = StObject.set(x, "noInertia", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
  }
}
