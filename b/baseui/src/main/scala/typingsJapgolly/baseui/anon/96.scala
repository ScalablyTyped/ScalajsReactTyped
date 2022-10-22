package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.GP
import typingsJapgolly.baseui.baseuiStrings.Guadeloupe
import typingsJapgolly.baseui.baseuiStrings.Plussign590
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  val dialCode: Plussign590
  
  val id: GP
  
  val label: Guadeloupe
}
object `96` {
  
  inline def apply(): `96` = {
    val __obj = js.Dynamic.literal(dialCode = "+590", id = "GP", label = "Guadeloupe")
    __obj.asInstanceOf[`96`]
  }
  
  extension [Self <: `96`](x: Self) {
    
    inline def setDialCode(value: Plussign590): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Guadeloupe): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
