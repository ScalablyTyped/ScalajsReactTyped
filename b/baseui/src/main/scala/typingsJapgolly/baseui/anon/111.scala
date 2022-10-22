package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.IQ
import typingsJapgolly.baseui.baseuiStrings.Plussign964
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  val dialCode: Plussign964
  
  val id: IQ
  
  val label: /* Iraq (‫العراق‬‎) */ String
}
object `111` {
  
  inline def apply(): `111` = {
    val __obj = js.Dynamic.literal(dialCode = "+964", id = "IQ", label = "Iraq (\u202B\u0627\u0644\u0639\u0631\u0627\u0642\u202C\u200E)")
    __obj.asInstanceOf[`111`]
  }
  
  extension [Self <: `111`](x: Self) {
    
    inline def setDialCode(value: Plussign964): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IQ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Iraq (‫العراق‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
