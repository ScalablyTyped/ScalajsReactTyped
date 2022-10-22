package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightProps[TLength] extends StObject {
  
  val height: js.UndefOr[ResponsiveValue[Height[TLength]]] = js.undefined
}
object HeightProps {
  
  inline def apply[TLength](): HeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightProps[TLength]]
  }
  
  extension [Self <: HeightProps[?], TLength](x: Self & HeightProps[TLength]) {
    
    inline def setHeight(value: ResponsiveValue[Height[TLength]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHeightVarargs(value: Height[TLength]*): Self = StObject.set(x, "height", js.Array(value*))
  }
}
