package typingsJapgolly.reactDndHtml5Backend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnchorX extends StObject {
    
    var anchorX: Double
    
    var anchorY: Double
  }
  object AnchorX {
    
    inline def apply(anchorX: Double, anchorY: Double): AnchorX = {
      val __obj = js.Dynamic.literal(anchorX = anchorX.asInstanceOf[js.Any], anchorY = anchorY.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorX]
    }
    
    extension [Self <: AnchorX](x: Self) {
      
      inline def setAnchorX(value: Double): Self = StObject.set(x, "anchorX", value.asInstanceOf[js.Any])
      
      inline def setAnchorY(value: Double): Self = StObject.set(x, "anchorY", value.asInstanceOf[js.Any])
    }
  }
  
  trait OffsetX extends StObject {
    
    var offsetX: Double
    
    var offsetY: Double
  }
  object OffsetX {
    
    inline def apply(offsetX: Double, offsetY: Double): OffsetX = {
      val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetX]
    }
    
    extension [Self <: OffsetX](x: Self) {
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    }
  }
}
