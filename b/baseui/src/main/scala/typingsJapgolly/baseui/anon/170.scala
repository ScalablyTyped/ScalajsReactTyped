package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.MP
import typingsJapgolly.baseui.baseuiStrings.Plussign1670
import typingsJapgolly.baseui.baseuiStrings.`Northern Mariana Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `170` extends StObject {
  
  val dialCode: Plussign1670
  
  val id: MP
  
  val label: `Northern Mariana Islands`
}
object `170` {
  
  inline def apply(): `170` = {
    val __obj = js.Dynamic.literal(dialCode = "+1670", id = "MP", label = "Northern Mariana Islands")
    __obj.asInstanceOf[`170`]
  }
  
  extension [Self <: `170`](x: Self) {
    
    inline def setDialCode(value: Plussign1670): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: MP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Northern Mariana Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
