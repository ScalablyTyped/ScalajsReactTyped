package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.TextTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTransformProps extends StObject {
  
  val textTransform: js.UndefOr[ResponsiveValue[TextTransform]] = js.undefined
}
object TextTransformProps {
  
  inline def apply(): TextTransformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTransformProps]
  }
  
  extension [Self <: TextTransformProps](x: Self) {
    
    inline def setTextTransform(value: ResponsiveValue[TextTransform]): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    
    inline def setTextTransformVarargs(value: TextTransform*): Self = StObject.set(x, "textTransform", js.Array(value*))
  }
}
