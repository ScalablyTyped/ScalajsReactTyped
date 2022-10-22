package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkRippleProvider extends StObject {
  
  def disableInkRipple(): Unit
}
object IInkRippleProvider {
  
  inline def apply(disableInkRipple: Callback): IInkRippleProvider = {
    val __obj = js.Dynamic.literal(disableInkRipple = disableInkRipple.toJsFn)
    __obj.asInstanceOf[IInkRippleProvider]
  }
  
  extension [Self <: IInkRippleProvider](x: Self) {
    
    inline def setDisableInkRipple(value: Callback): Self = StObject.set(x, "disableInkRipple", value.toJsFn)
  }
}
