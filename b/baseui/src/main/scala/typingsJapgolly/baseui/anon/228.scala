package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign690
import typingsJapgolly.baseui.baseuiStrings.TK
import typingsJapgolly.baseui.baseuiStrings.Tokelau
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `228` extends StObject {
  
  val dialCode: Plussign690
  
  val id: TK
  
  val label: Tokelau
}
object `228` {
  
  inline def apply(): `228` = {
    val __obj = js.Dynamic.literal(dialCode = "+690", id = "TK", label = "Tokelau")
    __obj.asInstanceOf[`228`]
  }
  
  extension [Self <: `228`](x: Self) {
    
    inline def setDialCode(value: Plussign690): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TK): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Tokelau): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
