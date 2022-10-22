package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.IS
import typingsJapgolly.baseui.baseuiStrings.Plussign354
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107` extends StObject {
  
  val dialCode: Plussign354
  
  val id: IS
  
  val label: /* Iceland (Ísland) */ String
}
object `107` {
  
  inline def apply(): `107` = {
    val __obj = js.Dynamic.literal(dialCode = "+354", id = "IS", label = "Iceland (\u00CDsland)")
    __obj.asInstanceOf[`107`]
  }
  
  extension [Self <: `107`](x: Self) {
    
    inline def setDialCode(value: Plussign354): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Iceland (Ísland) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
