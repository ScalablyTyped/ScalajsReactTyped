package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign886
import typingsJapgolly.baseui.baseuiStrings.TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  val dialCode: Plussign886
  
  val id: TW
  
  val label: /* Taiwan (台灣) */ String
}
object `222` {
  
  inline def apply(): `222` = {
    val __obj = js.Dynamic.literal(dialCode = "+886", id = "TW", label = "Taiwan (\u53F0\u7063)")
    __obj.asInstanceOf[`222`]
  }
  
  extension [Self <: `222`](x: Self) {
    
    inline def setDialCode(value: Plussign886): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TW): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Taiwan (台灣) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
