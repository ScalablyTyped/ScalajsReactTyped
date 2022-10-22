package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.AL
import typingsJapgolly.baseui.baseuiStrings.Plussign355
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  val dialCode: Plussign355
  
  val id: AL
  
  val label: /* Albania (Shqipëri) */ String
}
object Label {
  
  inline def apply(): Label = {
    val __obj = js.Dynamic.literal(dialCode = "+355", id = "AL", label = "Albania (Shqip\u00EBri)")
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setDialCode(value: Plussign355): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Albania (Shqipëri) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
