package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign228
import typingsJapgolly.baseui.baseuiStrings.TG
import typingsJapgolly.baseui.baseuiStrings.Togo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `227` extends StObject {
  
  val dialCode: Plussign228
  
  val id: TG
  
  val label: Togo
}
object `227` {
  
  inline def apply(): `227` = {
    val __obj = js.Dynamic.literal(dialCode = "+228", id = "TG", label = "Togo")
    __obj.asInstanceOf[`227`]
  }
  
  extension [Self <: `227`](x: Self) {
    
    inline def setDialCode(value: Plussign228): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Togo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
