package typingsJapgolly.antd.anon

import typingsJapgolly.antd.libTransferListMod.RenderedItem
import typingsJapgolly.antd.libTransferMod.KeyWiseTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteredItems[RecordType /* <: KeyWiseTransferItem */] extends StObject {
  
  var filteredItems: js.Array[RecordType]
  
  var filteredRenderItems: js.Array[RenderedItem[RecordType]]
}
object FilteredItems {
  
  inline def apply[RecordType /* <: KeyWiseTransferItem */](filteredItems: js.Array[RecordType], filteredRenderItems: js.Array[RenderedItem[RecordType]]): FilteredItems[RecordType] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredItems[RecordType]]
  }
  
  extension [Self <: FilteredItems[?], RecordType /* <: KeyWiseTransferItem */](x: Self & FilteredItems[RecordType]) {
    
    inline def setFilteredItems(value: js.Array[RecordType]): Self = StObject.set(x, "filteredItems", value.asInstanceOf[js.Any])
    
    inline def setFilteredItemsVarargs(value: RecordType*): Self = StObject.set(x, "filteredItems", js.Array(value*))
    
    inline def setFilteredRenderItems(value: js.Array[RenderedItem[RecordType]]): Self = StObject.set(x, "filteredRenderItems", value.asInstanceOf[js.Any])
    
    inline def setFilteredRenderItemsVarargs(value: RenderedItem[RecordType]*): Self = StObject.set(x, "filteredRenderItems", js.Array(value*))
  }
}
