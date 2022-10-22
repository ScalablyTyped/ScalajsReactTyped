package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.KM
import typingsJapgolly.baseui.baseuiStrings.Plussign269
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  val dialCode: Plussign269
  
  val id: KM
  
  val label: /* Comoros (‫جزر القمر‬‎) */ String
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal(dialCode = "+269", id = "KM", label = "Comoros (\u202B\u062C\u0632\u0631 \u0627\u0644\u0642\u0645\u0631\u202C\u200E)")
    __obj.asInstanceOf[`58`]
  }
  
  extension [Self <: `58`](x: Self) {
    
    inline def setDialCode(value: Plussign269): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Comoros (‫جزر القمر‬‎) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
