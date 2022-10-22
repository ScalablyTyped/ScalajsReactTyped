package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPad extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object ColorPad {
  
  inline def apply(): ColorPad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPad]
  }
  
  extension [Self <: ColorPad](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
