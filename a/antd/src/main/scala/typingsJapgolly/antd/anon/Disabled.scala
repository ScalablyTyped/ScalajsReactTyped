package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libTransferMod.KeyWiseTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled[RecordType /* <: KeyWiseTransferItem */] extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var filteredItems: js.Array[RecordType]
  
  def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit
  
  var prefixCls: js.UndefOr[String] = js.undefined
}
object Disabled {
  
  inline def apply[RecordType /* <: KeyWiseTransferItem */](filteredItems: js.Array[RecordType], onItemSelectAll: (js.Array[String], Boolean) => Callback): Disabled[RecordType] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], onItemSelectAll = js.Any.fromFunction2((t0: js.Array[String], t1: Boolean) => (onItemSelectAll(t0, t1)).runNow()))
    __obj.asInstanceOf[Disabled[RecordType]]
  }
  
  extension [Self <: Disabled[?], RecordType /* <: KeyWiseTransferItem */](x: Self & Disabled[RecordType]) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFilteredItems(value: js.Array[RecordType]): Self = StObject.set(x, "filteredItems", value.asInstanceOf[js.Any])
    
    inline def setFilteredItemsVarargs(value: RecordType*): Self = StObject.set(x, "filteredItems", js.Array(value*))
    
    inline def setOnItemSelectAll(value: (js.Array[String], Boolean) => Callback): Self = StObject.set(x, "onItemSelectAll", js.Any.fromFunction2((t0: js.Array[String], t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
  }
}
