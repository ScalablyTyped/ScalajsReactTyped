package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.EE
import typingsJapgolly.baseui.baseuiStrings.Plussign372
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78` extends StObject {
  
  val dialCode: Plussign372
  
  val id: EE
  
  val label: /* Estonia (Eesti) */ String
}
object `78` {
  
  inline def apply(): `78` = {
    val __obj = js.Dynamic.literal(dialCode = "+372", id = "EE", label = "Estonia (Eesti)")
    __obj.asInstanceOf[`78`]
  }
  
  extension [Self <: `78`](x: Self) {
    
    inline def setDialCode(value: Plussign372): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: EE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Estonia (Eesti) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
