package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityProps extends StObject {
  
  val opacity: js.UndefOr[ResponsiveValue[Opacity]] = js.undefined
}
object OpacityProps {
  
  inline def apply(): OpacityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityProps]
  }
  
  extension [Self <: OpacityProps](x: Self) {
    
    inline def setOpacity(value: ResponsiveValue[Opacity]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpacityVarargs(value: Opacity*): Self = StObject.set(x, "opacity", js.Array(value*))
  }
}
