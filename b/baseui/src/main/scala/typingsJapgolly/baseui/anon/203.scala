package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign232
import typingsJapgolly.baseui.baseuiStrings.SL
import typingsJapgolly.baseui.baseuiStrings.`Sierra Leone`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  val dialCode: Plussign232
  
  val id: SL
  
  val label: `Sierra Leone`
}
object `203` {
  
  inline def apply(): `203` = {
    val __obj = js.Dynamic.literal(dialCode = "+232", id = "SL", label = "Sierra Leone")
    __obj.asInstanceOf[`203`]
  }
  
  extension [Self <: `203`](x: Self) {
    
    inline def setDialCode(value: Plussign232): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SL): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Sierra Leone`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
