package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.Flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexProps[TLength] extends StObject {
  
  val flex: js.UndefOr[ResponsiveValue[Flex[TLength]]] = js.undefined
}
object FlexProps {
  
  inline def apply[TLength](): FlexProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps[TLength]]
  }
  
  extension [Self <: FlexProps[?], TLength](x: Self & FlexProps[TLength]) {
    
    inline def setFlex(value: ResponsiveValue[Flex[TLength]]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFlexVarargs(value: Flex[TLength]*): Self = StObject.set(x, "flex", js.Array(value*))
  }
}
