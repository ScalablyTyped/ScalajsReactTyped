package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.swiperStrings.auto
import typingsJapgolly.vueRuntimeCore.mod.PropConstructor
import typingsJapgolly.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[js.UndefOr[Double | auto]]
}
object `2` {
  
  inline def apply(default: Unit, `type`: PropType[js.UndefOr[Double | auto]]): `2` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[js.UndefOr[Double | auto]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[js.UndefOr[Double | auto]]): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setTypeVarargs(value: (PropConstructor[js.UndefOr[Double | auto]])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
