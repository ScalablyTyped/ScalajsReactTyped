package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign386
import typingsJapgolly.baseui.baseuiStrings.SI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  val dialCode: Plussign386
  
  val id: SI
  
  val label: /* Slovenia (Slovenija) */ String
}
object `207` {
  
  inline def apply(): `207` = {
    val __obj = js.Dynamic.literal(dialCode = "+386", id = "SI", label = "Slovenia (Slovenija)")
    __obj.asInstanceOf[`207`]
  }
  
  extension [Self <: `207`](x: Self) {
    
    inline def setDialCode(value: Plussign386): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Slovenia (Slovenija) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
