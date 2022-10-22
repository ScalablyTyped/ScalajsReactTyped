package typingsJapgolly.reactWidgets.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactWidgets.esmTypesMod.Value
import typingsJapgolly.reactWidgets.reactWidgetsStrings.insert
import typingsJapgolly.reactWidgets.reactWidgetsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataItem[TDataItem] extends StObject {
  
  var action: insert | remove
  
  var dataItem: TDataItem
  
  var lastValue: Value
  
  var originalEvent: js.UndefOr[ReactEventFrom[Element]] = js.undefined
}
object DataItem {
  
  inline def apply[TDataItem](action: insert | remove, dataItem: TDataItem, lastValue: Value): DataItem[TDataItem] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any], lastValue = lastValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataItem[TDataItem]]
  }
  
  extension [Self <: DataItem[?], TDataItem](x: Self & DataItem[TDataItem]) {
    
    inline def setAction(value: insert | remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDataItem(value: TDataItem): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    inline def setLastValue(value: Value): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
