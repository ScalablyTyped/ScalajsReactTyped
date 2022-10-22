package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartYAxisItemNotesDataItem extends StObject {
  
  var icon: js.UndefOr[ChartYAxisItemNotesDataItemIcon] = js.undefined
  
  var label: js.UndefOr[ChartYAxisItemNotesDataItemLabel] = js.undefined
  
  var line: js.UndefOr[ChartYAxisItemNotesDataItemLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object ChartYAxisItemNotesDataItem {
  
  inline def apply(): ChartYAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartYAxisItemNotesDataItem]
  }
  
  extension [Self <: ChartYAxisItemNotesDataItem](x: Self) {
    
    inline def setIcon(value: ChartYAxisItemNotesDataItemIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: ChartYAxisItemNotesDataItemLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: ChartYAxisItemNotesDataItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
