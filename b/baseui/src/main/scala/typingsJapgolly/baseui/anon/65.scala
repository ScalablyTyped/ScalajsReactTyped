package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.CU
import typingsJapgolly.baseui.baseuiStrings.Cuba
import typingsJapgolly.baseui.baseuiStrings.Plussign53
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65` extends StObject {
  
  val dialCode: Plussign53
  
  val id: CU
  
  val label: Cuba
}
object `65` {
  
  inline def apply(): `65` = {
    val __obj = js.Dynamic.literal(dialCode = "+53", id = "CU", label = "Cuba")
    __obj.asInstanceOf[`65`]
  }
  
  extension [Self <: `65`](x: Self) {
    
    inline def setDialCode(value: Plussign53): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Cuba): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
