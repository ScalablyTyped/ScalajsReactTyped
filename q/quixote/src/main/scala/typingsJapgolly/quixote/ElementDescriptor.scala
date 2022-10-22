package typingsJapgolly.quixote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Element positions and sizes are available on all QElement instances.
trait ElementDescriptor extends StObject {
  
  // The bottom edge of the element
  var bottom: js.UndefOr[PositionDescriptor] = js.undefined
  
  // Horizontal center: midway between the right and left edges.
  var center: js.UndefOr[PositionDescriptor] = js.undefined
  
  // Height of the element.
  var height: js.UndefOr[SizeDescriptor] = js.undefined
  
  // The left edge of the element
  var left: js.UndefOr[PositionDescriptor] = js.undefined
  
  // Vertical middle: midway between the top and bottom edges.
  var middle: js.UndefOr[PositionDescriptor] = js.undefined
  
  // The right edge of the element
  var right: js.UndefOr[PositionDescriptor] = js.undefined
  
  // The top edge of the element
  var top: js.UndefOr[PositionDescriptor] = js.undefined
  
  // Width of the element.
  var width: js.UndefOr[SizeDescriptor] = js.undefined
}
object ElementDescriptor {
  
  inline def apply(): ElementDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementDescriptor]
  }
  
  extension [Self <: ElementDescriptor](x: Self) {
    
    inline def setBottom(value: PositionDescriptor): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setCenter(value: PositionDescriptor): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setHeight(value: SizeDescriptor): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: PositionDescriptor): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMiddle(value: PositionDescriptor): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
    
    inline def setRight(value: PositionDescriptor): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: PositionDescriptor): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: SizeDescriptor): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
