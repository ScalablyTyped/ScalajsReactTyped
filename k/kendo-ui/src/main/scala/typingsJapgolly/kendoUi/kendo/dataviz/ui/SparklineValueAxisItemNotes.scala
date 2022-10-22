package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineValueAxisItemNotes extends StObject {
  
  var data: js.UndefOr[js.Array[SparklineValueAxisItemNotesDataItem]] = js.undefined
  
  var icon: js.UndefOr[SparklineValueAxisItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[SparklineValueAxisItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[SparklineValueAxisItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object SparklineValueAxisItemNotes {
  
  inline def apply(): SparklineValueAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineValueAxisItemNotes]
  }
  
  extension [Self <: SparklineValueAxisItemNotes](x: Self) {
    
    inline def setData(value: js.Array[SparklineValueAxisItemNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: SparklineValueAxisItemNotesDataItem*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIcon(value: SparklineValueAxisItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: SparklineValueAxisItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: SparklineValueAxisItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
