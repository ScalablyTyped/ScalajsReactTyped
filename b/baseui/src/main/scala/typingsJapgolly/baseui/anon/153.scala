package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.ME
import typingsJapgolly.baseui.baseuiStrings.Plussign382
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  val dialCode: Plussign382
  
  val id: ME
  
  val label: /* Montenegro (Crna Gora) */ String
}
object `153` {
  
  inline def apply(): `153` = {
    val __obj = js.Dynamic.literal(dialCode = "+382", id = "ME", label = "Montenegro (Crna Gora)")
    __obj.asInstanceOf[`153`]
  }
  
  extension [Self <: `153`](x: Self) {
    
    inline def setDialCode(value: Plussign382): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ME): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Montenegro (Crna Gora) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
