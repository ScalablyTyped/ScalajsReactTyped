package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ComponentsListMod.BorderType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pad extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[BorderType] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
}
object Pad {
  
  inline def apply(): Pad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pad]
  }
  
  extension [Self <: Pad](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
