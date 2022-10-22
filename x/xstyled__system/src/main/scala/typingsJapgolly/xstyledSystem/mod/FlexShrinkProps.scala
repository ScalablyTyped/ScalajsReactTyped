package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.FlexShrink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexShrinkProps extends StObject {
  
  val flexShrink: js.UndefOr[ResponsiveValue[FlexShrink]] = js.undefined
}
object FlexShrinkProps {
  
  inline def apply(): FlexShrinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexShrinkProps]
  }
  
  extension [Self <: FlexShrinkProps](x: Self) {
    
    inline def setFlexShrink(value: ResponsiveValue[FlexShrink]): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    inline def setFlexShrinkVarargs(value: FlexShrink*): Self = StObject.set(x, "flexShrink", js.Array(value*))
  }
}
