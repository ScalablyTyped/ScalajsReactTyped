package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAriaProvider extends StObject {
  
  def disableWarnings(): Unit
}
object IAriaProvider {
  
  inline def apply(disableWarnings: Callback): IAriaProvider = {
    val __obj = js.Dynamic.literal(disableWarnings = disableWarnings.toJsFn)
    __obj.asInstanceOf[IAriaProvider]
  }
  
  extension [Self <: IAriaProvider](x: Self) {
    
    inline def setDisableWarnings(value: Callback): Self = StObject.set(x, "disableWarnings", value.toJsFn)
  }
}
