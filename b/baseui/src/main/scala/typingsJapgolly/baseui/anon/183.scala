package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.PR
import typingsJapgolly.baseui.baseuiStrings.Plussign1
import typingsJapgolly.baseui.baseuiStrings.`Puerto Rico`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `183` extends StObject {
  
  val dialCode: Plussign1
  
  val id: PR
  
  val label: `Puerto Rico`
}
object `183` {
  
  inline def apply(): `183` = {
    val __obj = js.Dynamic.literal(dialCode = "+1", id = "PR", label = "Puerto Rico")
    __obj.asInstanceOf[`183`]
  }
  
  extension [Self <: `183`](x: Self) {
    
    inline def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: PR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Puerto Rico`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
