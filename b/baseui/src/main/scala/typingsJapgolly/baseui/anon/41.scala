package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign1284
import typingsJapgolly.baseui.baseuiStrings.VG
import typingsJapgolly.baseui.baseuiStrings.`British Virgin Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  val dialCode: Plussign1284
  
  val id: VG
  
  val label: `British Virgin Islands`
}
object `41` {
  
  inline def apply(): `41` = {
    val __obj = js.Dynamic.literal(dialCode = "+1284", id = "VG", label = "British Virgin Islands")
    __obj.asInstanceOf[`41`]
  }
  
  extension [Self <: `41`](x: Self) {
    
    inline def setDialCode(value: Plussign1284): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `British Virgin Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
