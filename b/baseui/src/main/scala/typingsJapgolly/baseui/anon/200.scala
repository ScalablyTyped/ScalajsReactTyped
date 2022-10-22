package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign221
import typingsJapgolly.baseui.baseuiStrings.SN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200` extends StObject {
  
  val dialCode: Plussign221
  
  val id: SN
  
  val label: /* Senegal (Sénégal) */ String
}
object `200` {
  
  inline def apply(): `200` = {
    val __obj = js.Dynamic.literal(dialCode = "+221", id = "SN", label = "Senegal (S\u00E9n\u00E9gal)")
    __obj.asInstanceOf[`200`]
  }
  
  extension [Self <: `200`](x: Self) {
    
    inline def setDialCode(value: Plussign221): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Senegal (Sénégal) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
