package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.typesModulesEffectFlipMod.FlipEffectOptions
import typingsJapgolly.vueRuntimeCore.mod.PropConstructor
import typingsJapgolly.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[FlipEffectOptions]
}
object `9` {
  
  inline def apply(default: Unit, `type`: PropType[FlipEffectOptions]): `9` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[FlipEffectOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[FlipEffectOptions]): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setTypeVarargs(value: PropConstructor[FlipEffectOptions]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
