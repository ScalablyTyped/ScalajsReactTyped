package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.swiper.typesSwiperOptionsMod.SwiperOptions
import typingsJapgolly.vueRuntimeCore.mod.PropConstructor
import typingsJapgolly.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[js.UndefOr[StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]]]
}
object `1` {
  
  inline def apply(
    default: Unit,
    `type`: PropType[js.UndefOr[StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]]]
  ): `1` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[js.UndefOr[StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[js.UndefOr[StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]]]): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setTypeVarargs(
      value: (PropConstructor[js.UndefOr[StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]]])*
    ): Self = StObject.set(x, "type", js.Array(value*))
  }
}
