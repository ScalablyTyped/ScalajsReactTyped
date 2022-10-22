package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.BorderRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRightProps[TLength] extends StObject {
  
  val borderRight: js.UndefOr[ResponsiveValue[BorderRight[TLength]]] = js.undefined
}
object BorderRightProps {
  
  inline def apply[TLength](): BorderRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRightProps[TLength]]
  }
  
  extension [Self <: BorderRightProps[?], TLength](x: Self & BorderRightProps[TLength]) {
    
    inline def setBorderRight(value: ResponsiveValue[BorderRight[TLength]]): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderRightVarargs(value: BorderRight[TLength]*): Self = StObject.set(x, "borderRight", js.Array(value*))
  }
}
