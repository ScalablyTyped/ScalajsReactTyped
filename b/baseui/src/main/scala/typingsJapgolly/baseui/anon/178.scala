package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.PY
import typingsJapgolly.baseui.baseuiStrings.Paraguay
import typingsJapgolly.baseui.baseuiStrings.Plussign595
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `178` extends StObject {
  
  val dialCode: Plussign595
  
  val id: PY
  
  val label: Paraguay
}
object `178` {
  
  inline def apply(): `178` = {
    val __obj = js.Dynamic.literal(dialCode = "+595", id = "PY", label = "Paraguay")
    __obj.asInstanceOf[`178`]
  }
  
  extension [Self <: `178`](x: Self) {
    
    inline def setDialCode(value: Plussign595): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Paraguay): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
