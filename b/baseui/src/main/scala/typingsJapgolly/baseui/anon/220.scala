package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.CH
import typingsJapgolly.baseui.baseuiStrings.Plussign41
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `220` extends StObject {
  
  val dialCode: Plussign41
  
  val id: CH
  
  val label: /* Switzerland (Schweiz) */ String
}
object `220` {
  
  inline def apply(): `220` = {
    val __obj = js.Dynamic.literal(dialCode = "+41", id = "CH", label = "Switzerland (Schweiz)")
    __obj.asInstanceOf[`220`]
  }
  
  extension [Self <: `220`](x: Self) {
    
    inline def setDialCode(value: Plussign41): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CH): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Switzerland (Schweiz) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
