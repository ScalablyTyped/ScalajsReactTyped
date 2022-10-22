package typingsJapgolly.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item[TDataItem] extends StObject {
  
  var item: TDataItem
}
object Item {
  
  inline def apply[TDataItem](item: TDataItem): Item[TDataItem] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[TDataItem]]
  }
  
  extension [Self <: Item[?], TDataItem](x: Self & Item[TDataItem]) {
    
    inline def setItem(value: TDataItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
