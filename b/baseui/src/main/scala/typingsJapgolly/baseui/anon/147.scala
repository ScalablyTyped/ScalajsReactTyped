package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Mayotte
import typingsJapgolly.baseui.baseuiStrings.Plussign262
import typingsJapgolly.baseui.baseuiStrings.YT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  val dialCode: Plussign262
  
  val id: YT
  
  val label: Mayotte
}
object `147` {
  
  inline def apply(): `147` = {
    val __obj = js.Dynamic.literal(dialCode = "+262", id = "YT", label = "Mayotte")
    __obj.asInstanceOf[`147`]
  }
  
  extension [Self <: `147`](x: Self) {
    
    inline def setDialCode(value: Plussign262): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: YT): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Mayotte): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
