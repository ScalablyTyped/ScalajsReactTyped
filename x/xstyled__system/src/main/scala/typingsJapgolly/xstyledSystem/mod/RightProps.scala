package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.Right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightProps[TLength] extends StObject {
  
  val right: js.UndefOr[ResponsiveValue[Right[TLength]]] = js.undefined
}
object RightProps {
  
  inline def apply[TLength](): RightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightProps[TLength]]
  }
  
  extension [Self <: RightProps[?], TLength](x: Self & RightProps[TLength]) {
    
    inline def setRight(value: ResponsiveValue[Right[TLength]]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRightVarargs(value: Right[TLength]*): Self = StObject.set(x, "right", js.Array(value*))
  }
}
