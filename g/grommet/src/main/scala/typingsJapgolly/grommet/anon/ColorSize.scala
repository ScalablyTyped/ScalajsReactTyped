package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSize extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object ColorSize {
  
  inline def apply(): ColorSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSize]
  }
  
  extension [Self <: ColorSize](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
