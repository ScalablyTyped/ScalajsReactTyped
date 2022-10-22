package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.GW
import typingsJapgolly.baseui.baseuiStrings.Plussign245
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101` extends StObject {
  
  val dialCode: Plussign245
  
  val id: GW
  
  val label: /* Guinea-Bissau (Guiné Bissau) */ String
}
object `101` {
  
  inline def apply(): `101` = {
    val __obj = js.Dynamic.literal(dialCode = "+245", id = "GW", label = "Guinea-Bissau (Guin\u00E9 Bissau)")
    __obj.asInstanceOf[`101`]
  }
  
  extension [Self <: `101`](x: Self) {
    
    inline def setDialCode(value: Plussign245): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Guinea-Bissau (Guiné Bissau) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
