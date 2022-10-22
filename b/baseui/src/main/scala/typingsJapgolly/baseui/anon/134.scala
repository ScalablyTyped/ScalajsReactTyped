package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.LU
import typingsJapgolly.baseui.baseuiStrings.Luxembourg
import typingsJapgolly.baseui.baseuiStrings.Plussign352
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  val dialCode: Plussign352
  
  val id: LU
  
  val label: Luxembourg
}
object `134` {
  
  inline def apply(): `134` = {
    val __obj = js.Dynamic.literal(dialCode = "+352", id = "LU", label = "Luxembourg")
    __obj.asInstanceOf[`134`]
  }
  
  extension [Self <: `134`](x: Self) {
    
    inline def setDialCode(value: Plussign352): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LU): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Luxembourg): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
