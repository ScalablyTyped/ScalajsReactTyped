package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.typesModulesControllerMod.ControllerOptions
import typingsJapgolly.vueRuntimeCore.mod.PropConstructor
import typingsJapgolly.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[ControllerOptions]
}
object `5` {
  
  inline def apply(default: Unit, `type`: PropType[ControllerOptions]): `5` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[ControllerOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[ControllerOptions]): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setTypeVarargs(value: PropConstructor[ControllerOptions]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
