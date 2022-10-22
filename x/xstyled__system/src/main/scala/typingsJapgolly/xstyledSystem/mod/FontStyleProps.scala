package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.FontStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontStyleProps extends StObject {
  
  val fontStyle: js.UndefOr[ResponsiveValue[FontStyle]] = js.undefined
}
object FontStyleProps {
  
  inline def apply(): FontStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyleProps]
  }
  
  extension [Self <: FontStyleProps](x: Self) {
    
    inline def setFontStyle(value: ResponsiveValue[FontStyle]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontStyleVarargs(value: FontStyle*): Self = StObject.set(x, "fontStyle", js.Array(value*))
  }
}
