package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.OM
import typingsJapgolly.baseui.baseuiStrings.Plussign968
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172` extends StObject {
  
  val dialCode: Plussign968
  
  val id: OM
  
  val label: /* Oman (‫عُمان‬‎) */ String
}
object `172` {
  
  inline def apply(): `172` = {
    val __obj = js.Dynamic.literal(dialCode = "+968", id = "OM", label = "Oman (\u202B\u0639\u064F\u0645\u0627\u0646\u202C\u200E)")
    __obj.asInstanceOf[`172`]
  }
  
  extension [Self <: `172`](x: Self) {
    
    inline def setDialCode(value: Plussign968): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: OM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Oman (‫عُمان‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
