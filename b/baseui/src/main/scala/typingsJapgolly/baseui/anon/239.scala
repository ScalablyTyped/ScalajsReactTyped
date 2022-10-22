package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.AE
import typingsJapgolly.baseui.baseuiStrings.Plussign971
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `239` extends StObject {
  
  val dialCode: Plussign971
  
  val id: AE
  
  val label: /* United Arab Emirates (‫الإمارات العربية المتحدة‬‎) */ String
}
object `239` {
  
  inline def apply(): `239` = {
    val __obj = js.Dynamic.literal(dialCode = "+971", id = "AE", label = "United Arab Emirates (\u202B\u0627\u0644\u0625\u0645\u0627\u0631\u0627\u062A \u0627\u0644\u0639\u0631\u0628\u064A\u0629 \u0627\u0644\u0645\u062A\u062D\u062F\u0629\u202C\u200E)")
    __obj.asInstanceOf[`239`]
  }
  
  extension [Self <: `239`](x: Self) {
    
    inline def setDialCode(value: Plussign971): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* United Arab Emirates (‫الإمارات العربية المتحدة‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
