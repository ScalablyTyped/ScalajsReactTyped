package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.BackgroundPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundPositionProps[TLength] extends StObject {
  
  val backgroundPosition: js.UndefOr[ResponsiveValue[BackgroundPosition[TLength]]] = js.undefined
}
object BackgroundPositionProps {
  
  inline def apply[TLength](): BackgroundPositionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPositionProps[TLength]]
  }
  
  extension [Self <: BackgroundPositionProps[?], TLength](x: Self & BackgroundPositionProps[TLength]) {
    
    inline def setBackgroundPosition(value: ResponsiveValue[BackgroundPosition[TLength]]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundPositionVarargs(value: BackgroundPosition[TLength]*): Self = StObject.set(x, "backgroundPosition", js.Array(value*))
  }
}
