package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign676
import typingsJapgolly.baseui.baseuiStrings.TO
import typingsJapgolly.baseui.baseuiStrings.Tonga
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `229` extends StObject {
  
  val dialCode: Plussign676
  
  val id: TO
  
  val label: Tonga
}
object `229` {
  
  inline def apply(): `229` = {
    val __obj = js.Dynamic.literal(dialCode = "+676", id = "TO", label = "Tonga")
    __obj.asInstanceOf[`229`]
  }
  
  extension [Self <: `229`](x: Self) {
    
    inline def setDialCode(value: Plussign676): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Tonga): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
