package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.AT
import typingsJapgolly.baseui.baseuiStrings.Plussign43
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  val dialCode: Plussign43
  
  val id: AT
  
  val label: /* Austria (Österreich) */ String
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal(dialCode = "+43", id = "AT", label = "Austria (\u00D6sterreich)")
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setDialCode(value: Plussign43): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Austria (Österreich) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
