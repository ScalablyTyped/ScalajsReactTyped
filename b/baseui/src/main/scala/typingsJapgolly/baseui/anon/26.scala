package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.BS
import typingsJapgolly.baseui.baseuiStrings.Bahamas
import typingsJapgolly.baseui.baseuiStrings.Plussign1242
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  val dialCode: Plussign1242
  
  val id: BS
  
  val label: Bahamas
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal(dialCode = "+1242", id = "BS", label = "Bahamas")
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setDialCode(value: Plussign1242): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Bahamas): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
