package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.BW
import typingsJapgolly.baseui.baseuiStrings.Botswana
import typingsJapgolly.baseui.baseuiStrings.Plussign267
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  val dialCode: Plussign267
  
  val id: BW
  
  val label: Botswana
}
object `38` {
  
  inline def apply(): `38` = {
    val __obj = js.Dynamic.literal(dialCode = "+267", id = "BW", label = "Botswana")
    __obj.asInstanceOf[`38`]
  }
  
  extension [Self <: `38`](x: Self) {
    
    inline def setDialCode(value: Plussign267): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Botswana): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
