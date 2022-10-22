package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.HN
import typingsJapgolly.baseui.baseuiStrings.Honduras
import typingsJapgolly.baseui.baseuiStrings.Plussign504
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  val dialCode: Plussign504
  
  val id: HN
  
  val label: Honduras
}
object `104` {
  
  inline def apply(): `104` = {
    val __obj = js.Dynamic.literal(dialCode = "+504", id = "HN", label = "Honduras")
    __obj.asInstanceOf[`104`]
  }
  
  extension [Self <: `104`](x: Self) {
    
    inline def setDialCode(value: Plussign504): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: HN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Honduras): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
