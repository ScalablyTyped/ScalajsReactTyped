package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign670
import typingsJapgolly.baseui.baseuiStrings.TL
import typingsJapgolly.baseui.baseuiStrings.`Timor-Leste`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `226` extends StObject {
  
  val dialCode: Plussign670
  
  val id: TL
  
  val label: `Timor-Leste`
}
object `226` {
  
  inline def apply(): `226` = {
    val __obj = js.Dynamic.literal(dialCode = "+670", id = "TL", label = "Timor-Leste")
    __obj.asInstanceOf[`226`]
  }
  
  extension [Self <: `226`](x: Self) {
    
    inline def setDialCode(value: Plussign670): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Timor-Leste`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
