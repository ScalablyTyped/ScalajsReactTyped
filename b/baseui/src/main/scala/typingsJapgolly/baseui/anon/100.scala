package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.GN
import typingsJapgolly.baseui.baseuiStrings.Plussign224
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  val dialCode: Plussign224
  
  val id: GN
  
  val label: /* Guinea (Guinée) */ String
}
object `100` {
  
  inline def apply(): `100` = {
    val __obj = js.Dynamic.literal(dialCode = "+224", id = "GN", label = "Guinea (Guin\u00E9e)")
    __obj.asInstanceOf[`100`]
  }
  
  extension [Self <: `100`](x: Self) {
    
    inline def setDialCode(value: Plussign224): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Guinea (Guinée) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
