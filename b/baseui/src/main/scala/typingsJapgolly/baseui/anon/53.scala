package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.CL
import typingsJapgolly.baseui.baseuiStrings.Chile
import typingsJapgolly.baseui.baseuiStrings.Plussign56
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  val dialCode: Plussign56
  
  val id: CL
  
  val label: Chile
}
object `53` {
  
  inline def apply(): `53` = {
    val __obj = js.Dynamic.literal(dialCode = "+56", id = "CL", label = "Chile")
    __obj.asInstanceOf[`53`]
  }
  
  extension [Self <: `53`](x: Self) {
    
    inline def setDialCode(value: Plussign56): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Chile): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
