package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign1721
import typingsJapgolly.baseui.baseuiStrings.SX
import typingsJapgolly.baseui.baseuiStrings.`Sint Maarten`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205` extends StObject {
  
  val dialCode: Plussign1721
  
  val id: SX
  
  val label: `Sint Maarten`
}
object `205` {
  
  inline def apply(): `205` = {
    val __obj = js.Dynamic.literal(dialCode = "+1721", id = "SX", label = "Sint Maarten")
    __obj.asInstanceOf[`205`]
  }
  
  extension [Self <: `205`](x: Self) {
    
    inline def setDialCode(value: Plussign1721): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SX): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Sint Maarten`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
