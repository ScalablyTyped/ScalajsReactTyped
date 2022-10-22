package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramLayoutGrid extends StObject {
  
  var componentSpacingX: js.UndefOr[Double] = js.undefined
  
  var componentSpacingY: js.UndefOr[Double] = js.undefined
  
  var offsetX: js.UndefOr[Double] = js.undefined
  
  var offsetY: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DiagramLayoutGrid {
  
  inline def apply(): DiagramLayoutGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramLayoutGrid]
  }
  
  extension [Self <: DiagramLayoutGrid](x: Self) {
    
    inline def setComponentSpacingX(value: Double): Self = StObject.set(x, "componentSpacingX", value.asInstanceOf[js.Any])
    
    inline def setComponentSpacingXUndefined: Self = StObject.set(x, "componentSpacingX", js.undefined)
    
    inline def setComponentSpacingY(value: Double): Self = StObject.set(x, "componentSpacingY", value.asInstanceOf[js.Any])
    
    inline def setComponentSpacingYUndefined: Self = StObject.set(x, "componentSpacingY", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
