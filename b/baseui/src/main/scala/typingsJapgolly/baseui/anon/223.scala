package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign992
import typingsJapgolly.baseui.baseuiStrings.TJ
import typingsJapgolly.baseui.baseuiStrings.Tajikistan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `223` extends StObject {
  
  val dialCode: Plussign992
  
  val id: TJ
  
  val label: Tajikistan
}
object `223` {
  
  inline def apply(): `223` = {
    val __obj = js.Dynamic.literal(dialCode = "+992", id = "TJ", label = "Tajikistan")
    __obj.asInstanceOf[`223`]
  }
  
  extension [Self <: `223`](x: Self) {
    
    inline def setDialCode(value: Plussign992): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TJ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Tajikistan): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
