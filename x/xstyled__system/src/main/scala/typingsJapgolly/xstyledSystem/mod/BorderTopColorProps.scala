package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.BorderColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderTopColorProps extends StObject {
  
  val borderTopColor: js.UndefOr[ResponsiveValue[BorderColor]] = js.undefined
}
object BorderTopColorProps {
  
  inline def apply(): BorderTopColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopColorProps]
  }
  
  extension [Self <: BorderTopColorProps](x: Self) {
    
    inline def setBorderTopColor(value: ResponsiveValue[BorderColor]): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
    
    inline def setBorderTopColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderTopColor", js.Array(value*))
  }
}
