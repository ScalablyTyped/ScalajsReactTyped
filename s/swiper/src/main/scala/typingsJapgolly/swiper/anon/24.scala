package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.typesModulesFreeModeMod.FreeModeOptions
import typingsJapgolly.vueRuntimeCore.mod.PropConstructor
import typingsJapgolly.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[FreeModeOptions | Boolean]
}
object `24` {
  
  inline def apply(default: Unit, `type`: PropType[FreeModeOptions | Boolean]): `24` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[FreeModeOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[FreeModeOptions | Boolean]): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setTypeVarargs(value: (PropConstructor[FreeModeOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
