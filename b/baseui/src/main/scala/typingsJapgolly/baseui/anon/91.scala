package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.GH
import typingsJapgolly.baseui.baseuiStrings.Plussign233
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  val dialCode: Plussign233
  
  val id: GH
  
  val label: /* Ghana (Gaana) */ String
}
object `91` {
  
  inline def apply(): `91` = {
    val __obj = js.Dynamic.literal(dialCode = "+233", id = "GH", label = "Ghana (Gaana)")
    __obj.asInstanceOf[`91`]
  }
  
  extension [Self <: `91`](x: Self) {
    
    inline def setDialCode(value: Plussign233): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Ghana (Gaana) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
