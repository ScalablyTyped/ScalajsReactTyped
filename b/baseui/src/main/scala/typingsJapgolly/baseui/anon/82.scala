package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.FJ
import typingsJapgolly.baseui.baseuiStrings.Fiji
import typingsJapgolly.baseui.baseuiStrings.Plussign679
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  val dialCode: Plussign679
  
  val id: FJ
  
  val label: Fiji
}
object `82` {
  
  inline def apply(): `82` = {
    val __obj = js.Dynamic.literal(dialCode = "+679", id = "FJ", label = "Fiji")
    __obj.asInstanceOf[`82`]
  }
  
  extension [Self <: `82`](x: Self) {
    
    inline def setDialCode(value: Plussign679): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Fiji): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
