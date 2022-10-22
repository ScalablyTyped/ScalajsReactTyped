package typingsJapgolly.reactNative.mod

import typingsJapgolly.reactNative.anon.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRenderItemInfo[ItemT] extends StObject {
  
  var index: Double
  
  var item: ItemT
  
  var separators: Highlight
}
object ListRenderItemInfo {
  
  inline def apply[ItemT](index: Double, item: ItemT, separators: Highlight): ListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRenderItemInfo[ItemT]]
  }
  
  extension [Self <: ListRenderItemInfo[?], ItemT](x: Self & ListRenderItemInfo[ItemT]) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ItemT): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setSeparators(value: Highlight): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
  }
}
