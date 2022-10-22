package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCategoryAxisItemSelect extends StObject {
  
  var from: js.UndefOr[Any] = js.undefined
  
  var max: js.UndefOr[Any] = js.undefined
  
  var min: js.UndefOr[Any] = js.undefined
  
  var mousewheel: js.UndefOr[ChartCategoryAxisItemSelectMousewheel] = js.undefined
  
  var to: js.UndefOr[Any] = js.undefined
}
object ChartCategoryAxisItemSelect {
  
  inline def apply(): ChartCategoryAxisItemSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItemSelect]
  }
  
  extension [Self <: ChartCategoryAxisItemSelect](x: Self) {
    
    inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMax(value: Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMousewheel(value: ChartCategoryAxisItemSelectMousewheel): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
