package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.GF
import typingsJapgolly.baseui.baseuiStrings.Plussign594
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  val dialCode: Plussign594
  
  val id: GF
  
  val label: /* French Guiana (Guyane française) */ String
}
object `85` {
  
  inline def apply(): `85` = {
    val __obj = js.Dynamic.literal(dialCode = "+594", id = "GF", label = "French Guiana (Guyane fran\u00E7aise)")
    __obj.asInstanceOf[`85`]
  }
  
  extension [Self <: `85`](x: Self) {
    
    inline def setDialCode(value: Plussign594): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* French Guiana (Guyane française) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
