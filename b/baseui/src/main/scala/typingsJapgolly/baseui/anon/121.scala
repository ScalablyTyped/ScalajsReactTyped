package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.KE
import typingsJapgolly.baseui.baseuiStrings.Kenya
import typingsJapgolly.baseui.baseuiStrings.Plussign254
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  val dialCode: Plussign254
  
  val id: KE
  
  val label: Kenya
}
object `121` {
  
  inline def apply(): `121` = {
    val __obj = js.Dynamic.literal(dialCode = "+254", id = "KE", label = "Kenya")
    __obj.asInstanceOf[`121`]
  }
  
  extension [Self <: `121`](x: Self) {
    
    inline def setDialCode(value: Plussign254): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Kenya): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
