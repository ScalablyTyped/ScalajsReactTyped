package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorWidth extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object ColorWidth {
  
  inline def apply(): ColorWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorWidth]
  }
  
  extension [Self <: ColorWidth](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
