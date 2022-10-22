package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.AZ
import typingsJapgolly.baseui.baseuiStrings.Plussign994
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  val dialCode: Plussign994
  
  val id: AZ
  
  val label: /* Azerbaijan (Azərbaycan) */ String
}
object `25` {
  
  inline def apply(): `25` = {
    val __obj = js.Dynamic.literal(dialCode = "+994", id = "AZ", label = "Azerbaijan (Az\u0259rbaycan)")
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setDialCode(value: Plussign994): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AZ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Azerbaijan (Azərbaycan) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
