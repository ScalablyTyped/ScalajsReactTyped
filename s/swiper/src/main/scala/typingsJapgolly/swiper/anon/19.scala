package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.typesModulesParallaxMod.ParallaxOptions
import typingsJapgolly.vueRuntimeCore.mod.PropConstructor
import typingsJapgolly.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[ParallaxOptions | Boolean]
}
object `19` {
  
  inline def apply(default: Unit, `type`: PropType[ParallaxOptions | Boolean]): `19` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[ParallaxOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[ParallaxOptions | Boolean]): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setTypeVarargs(value: (PropConstructor[ParallaxOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
