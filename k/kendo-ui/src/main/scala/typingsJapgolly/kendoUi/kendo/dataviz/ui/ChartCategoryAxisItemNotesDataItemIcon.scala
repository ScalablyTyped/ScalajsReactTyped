package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCategoryAxisItemNotesDataItemIcon extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[ChartCategoryAxisItemNotesDataItemIconBorder] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartCategoryAxisItemNotesDataItemIcon {
  
  inline def apply(): ChartCategoryAxisItemNotesDataItemIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItemNotesDataItemIcon]
  }
  
  extension [Self <: ChartCategoryAxisItemNotesDataItemIcon](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: ChartCategoryAxisItemNotesDataItemIconBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
