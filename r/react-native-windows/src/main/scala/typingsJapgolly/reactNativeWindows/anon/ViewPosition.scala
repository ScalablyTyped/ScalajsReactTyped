package typingsJapgolly.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPosition[ItemT] extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var item: ItemT
  
  var viewPosition: js.UndefOr[Double] = js.undefined
}
object ViewPosition {
  
  inline def apply[ItemT](item: ItemT): ViewPosition[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPosition[ItemT]]
  }
  
  extension [Self <: ViewPosition[?], ItemT](x: Self & ViewPosition[ItemT]) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setItem(value: ItemT): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
    
    inline def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
  }
}
