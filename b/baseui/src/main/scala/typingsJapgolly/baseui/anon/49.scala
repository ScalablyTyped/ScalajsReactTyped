package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.CV
import typingsJapgolly.baseui.baseuiStrings.Plussign238
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  val dialCode: Plussign238
  
  val id: CV
  
  val label: /* Cape Verde (Kabu Verdi) */ String
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal(dialCode = "+238", id = "CV", label = "Cape Verde (Kabu Verdi)")
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setDialCode(value: Plussign238): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Cape Verde (Kabu Verdi) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
