package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign597
import typingsJapgolly.baseui.baseuiStrings.SR
import typingsJapgolly.baseui.baseuiStrings.Suriname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `216` extends StObject {
  
  val dialCode: Plussign597
  
  val id: SR
  
  val label: Suriname
}
object `216` {
  
  inline def apply(): `216` = {
    val __obj = js.Dynamic.literal(dialCode = "+597", id = "SR", label = "Suriname")
    __obj.asInstanceOf[`216`]
  }
  
  extension [Self <: `216`](x: Self) {
    
    inline def setDialCode(value: Plussign597): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Suriname): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
