package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.MarginRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginRightProps[TLength] extends StObject {
  
  val marginRight: js.UndefOr[ResponsiveValue[MarginRight[TLength]]] = js.undefined
  
  val mr: js.UndefOr[ResponsiveValue[MarginRight[TLength]]] = js.undefined
}
object MarginRightProps {
  
  inline def apply[TLength](): MarginRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginRightProps[TLength]]
  }
  
  extension [Self <: MarginRightProps[?], TLength](x: Self & MarginRightProps[TLength]) {
    
    inline def setMarginRight(value: ResponsiveValue[MarginRight[TLength]]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginRightVarargs(value: MarginRight[TLength]*): Self = StObject.set(x, "marginRight", js.Array(value*))
    
    inline def setMr(value: ResponsiveValue[MarginRight[TLength]]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
    
    inline def setMrVarargs(value: MarginRight[TLength]*): Self = StObject.set(x, "mr", js.Array(value*))
  }
}
