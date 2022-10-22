package typingsJapgolly.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyActiveItem extends StObject {
  
  var copyActiveItem: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object CopyActiveItem {
  
  inline def apply(): CopyActiveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyActiveItem]
  }
  
  extension [Self <: CopyActiveItem](x: Self) {
    
    inline def setCopyActiveItem(value: Boolean): Self = StObject.set(x, "copyActiveItem", value.asInstanceOf[js.Any])
    
    inline def setCopyActiveItemUndefined: Self = StObject.set(x, "copyActiveItem", js.undefined)
    
    inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
