package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.BB
import typingsJapgolly.baseui.baseuiStrings.Barbados
import typingsJapgolly.baseui.baseuiStrings.Plussign1246
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  val dialCode: Plussign1246
  
  val id: BB
  
  val label: Barbados
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal(dialCode = "+1246", id = "BB", label = "Barbados")
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setDialCode(value: Plussign1246): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BB): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Barbados): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
