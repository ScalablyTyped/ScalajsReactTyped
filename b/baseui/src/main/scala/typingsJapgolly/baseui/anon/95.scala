package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.GD
import typingsJapgolly.baseui.baseuiStrings.Grenada
import typingsJapgolly.baseui.baseuiStrings.Plussign1473
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  val dialCode: Plussign1473
  
  val id: GD
  
  val label: Grenada
}
object `95` {
  
  inline def apply(): `95` = {
    val __obj = js.Dynamic.literal(dialCode = "+1473", id = "GD", label = "Grenada")
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setDialCode(value: Plussign1473): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: GD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Grenada): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
