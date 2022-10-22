package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.BorderTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderTopProps[TLength] extends StObject {
  
  val borderTop: js.UndefOr[ResponsiveValue[BorderTop[TLength]]] = js.undefined
}
object BorderTopProps {
  
  inline def apply[TLength](): BorderTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopProps[TLength]]
  }
  
  extension [Self <: BorderTopProps[?], TLength](x: Self & BorderTopProps[TLength]) {
    
    inline def setBorderTop(value: ResponsiveValue[BorderTop[TLength]]): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setBorderTopVarargs(value: BorderTop[TLength]*): Self = StObject.set(x, "borderTop", js.Array(value*))
  }
}
