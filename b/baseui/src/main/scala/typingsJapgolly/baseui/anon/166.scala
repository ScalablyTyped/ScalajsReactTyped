package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.NG
import typingsJapgolly.baseui.baseuiStrings.Nigeria
import typingsJapgolly.baseui.baseuiStrings.Plussign234
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  val dialCode: Plussign234
  
  val id: NG
  
  val label: Nigeria
}
object `166` {
  
  inline def apply(): `166` = {
    val __obj = js.Dynamic.literal(dialCode = "+234", id = "NG", label = "Nigeria")
    __obj.asInstanceOf[`166`]
  }
  
  extension [Self <: `166`](x: Self) {
    
    inline def setDialCode(value: Plussign234): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Nigeria): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
