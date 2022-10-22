package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.MX
import typingsJapgolly.baseui.baseuiStrings.Plussign52
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  val dialCode: Plussign52
  
  val id: MX
  
  val label: /* Mexico (México) */ String
}
object `148` {
  
  inline def apply(): `148` = {
    val __obj = js.Dynamic.literal(dialCode = "+52", id = "MX", label = "Mexico (M\u00E9xico)")
    __obj.asInstanceOf[`148`]
  }
  
  extension [Self <: `148`](x: Self) {
    
    inline def setDialCode(value: Plussign52): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Mexico (México) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
