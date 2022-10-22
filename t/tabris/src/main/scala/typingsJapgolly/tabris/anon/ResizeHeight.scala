package typingsJapgolly.tabris.anon

import typingsJapgolly.tabris.tabrisStrings.high
import typingsJapgolly.tabris.tabrisStrings.low
import typingsJapgolly.tabris.tabrisStrings.medium
import typingsJapgolly.tabris.tabrisStrings.pixelated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeHeight extends StObject {
  
  var resizeHeight: js.UndefOr[Double] = js.undefined
  
  var resizeQuality: js.UndefOr[pixelated | low | medium | high] = js.undefined
  
  var resizeWidth: js.UndefOr[Double] = js.undefined
}
object ResizeHeight {
  
  inline def apply(): ResizeHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeHeight]
  }
  
  extension [Self <: ResizeHeight](x: Self) {
    
    inline def setResizeHeight(value: Double): Self = StObject.set(x, "resizeHeight", value.asInstanceOf[js.Any])
    
    inline def setResizeHeightUndefined: Self = StObject.set(x, "resizeHeight", js.undefined)
    
    inline def setResizeQuality(value: pixelated | low | medium | high): Self = StObject.set(x, "resizeQuality", value.asInstanceOf[js.Any])
    
    inline def setResizeQualityUndefined: Self = StObject.set(x, "resizeQuality", js.undefined)
    
    inline def setResizeWidth(value: Double): Self = StObject.set(x, "resizeWidth", value.asInstanceOf[js.Any])
    
    inline def setResizeWidthUndefined: Self = StObject.set(x, "resizeWidth", js.undefined)
  }
}
