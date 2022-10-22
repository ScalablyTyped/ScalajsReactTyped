package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.BorderColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomColorProps extends StObject {
  
  val borderBottomColor: js.UndefOr[ResponsiveValue[BorderColor]] = js.undefined
}
object BorderBottomColorProps {
  
  inline def apply(): BorderBottomColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomColorProps]
  }
  
  extension [Self <: BorderBottomColorProps](x: Self) {
    
    inline def setBorderBottomColor(value: ResponsiveValue[BorderColor]): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    inline def setBorderBottomColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderBottomColor", js.Array(value*))
  }
}
