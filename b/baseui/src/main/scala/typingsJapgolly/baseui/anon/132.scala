package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.LI
import typingsJapgolly.baseui.baseuiStrings.Liechtenstein
import typingsJapgolly.baseui.baseuiStrings.Plussign423
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  val dialCode: Plussign423
  
  val id: LI
  
  val label: Liechtenstein
}
object `132` {
  
  inline def apply(): `132` = {
    val __obj = js.Dynamic.literal(dialCode = "+423", id = "LI", label = "Liechtenstein")
    __obj.asInstanceOf[`132`]
  }
  
  extension [Self <: `132`](x: Self) {
    
    inline def setDialCode(value: Plussign423): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Liechtenstein): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
