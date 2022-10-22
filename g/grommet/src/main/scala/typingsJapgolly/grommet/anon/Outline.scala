package typingsJapgolly.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outline extends StObject {
  
  var border: js.UndefOr[`7`] = js.undefined
  
  var outline: js.UndefOr[ColorSize] = js.undefined
  
  var shadow: js.UndefOr[String | ColorSize] = js.undefined
}
object Outline {
  
  inline def apply(): Outline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outline]
  }
  
  extension [Self <: Outline](x: Self) {
    
    inline def setBorder(value: `7`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setOutline(value: ColorSize): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setShadow(value: String | ColorSize): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
  }
}
