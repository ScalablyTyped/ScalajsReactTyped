package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.CW
import typingsJapgolly.baseui.baseuiStrings.Curaçao
import typingsJapgolly.baseui.baseuiStrings.Plussign599
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66` extends StObject {
  
  val dialCode: Plussign599
  
  val id: CW
  
  val label: Curaçao
}
object `66` {
  
  inline def apply(): `66` = {
    val __obj = js.Dynamic.literal(dialCode = "+599", id = "CW", label = "Cura\u00E7ao")
    __obj.asInstanceOf[`66`]
  }
  
  extension [Self <: `66`](x: Self) {
    
    inline def setDialCode(value: Plussign599): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Curaçao): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
