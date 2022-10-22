package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod.BackgroundType
import typingsJapgolly.grommet.es6UtilsMod.BorderType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[BorderType] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
}
object Border {
  
  inline def apply(): Border = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBorderVarargs(value: ColorError*): Self = StObject.set(x, "border", js.Array(value*))
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
