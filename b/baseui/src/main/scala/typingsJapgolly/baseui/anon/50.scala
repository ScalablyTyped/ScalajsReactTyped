package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.KY
import typingsJapgolly.baseui.baseuiStrings.Plussign1345
import typingsJapgolly.baseui.baseuiStrings.`Cayman Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  val dialCode: Plussign1345
  
  val id: KY
  
  val label: `Cayman Islands`
}
object `50` {
  
  inline def apply(): `50` = {
    val __obj = js.Dynamic.literal(dialCode = "+1345", id = "KY", label = "Cayman Islands")
    __obj.asInstanceOf[`50`]
  }
  
  extension [Self <: `50`](x: Self) {
    
    inline def setDialCode(value: Plussign1345): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KY): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Cayman Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
