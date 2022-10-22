package typingsJapgolly.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewOffset extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var index: Double
  
  var viewOffset: js.UndefOr[Double] = js.undefined
  
  var viewPosition: js.UndefOr[Double] = js.undefined
}
object ViewOffset {
  
  inline def apply(index: Double): ViewOffset = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOffset]
  }
  
  extension [Self <: ViewOffset](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setViewOffset(value: Double): Self = StObject.set(x, "viewOffset", value.asInstanceOf[js.Any])
    
    inline def setViewOffsetUndefined: Self = StObject.set(x, "viewOffset", js.undefined)
    
    inline def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
    
    inline def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
  }
}
