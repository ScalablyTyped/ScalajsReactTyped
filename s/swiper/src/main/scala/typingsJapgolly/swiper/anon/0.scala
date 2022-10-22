package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.swiperStrings.cards
import typingsJapgolly.swiper.swiperStrings.coverflow
import typingsJapgolly.swiper.swiperStrings.creative
import typingsJapgolly.swiper.swiperStrings.cube
import typingsJapgolly.swiper.swiperStrings.fade
import typingsJapgolly.swiper.swiperStrings.flip
import typingsJapgolly.swiper.swiperStrings.slide
import typingsJapgolly.vueRuntimeCore.mod.PropConstructor
import typingsJapgolly.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]]
}
object `0` {
  
  inline def apply(
    default: Unit,
    `type`: PropType[js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]]
  ): `0` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]]): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setTypeVarargs(value: (PropConstructor[js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
