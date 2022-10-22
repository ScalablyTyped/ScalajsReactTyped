package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.swiperStrings.horizontal
import typingsJapgolly.swiper.swiperStrings.vertical
import typingsJapgolly.vueRuntimeCore.mod.PropConstructor
import typingsJapgolly.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypePropType extends StObject {
  
  var default: js.UndefOr[horizontal | vertical] = js.undefined
  
  var `type`: PropType[js.UndefOr[horizontal | vertical]]
}
object TypePropType {
  
  inline def apply(`type`: PropType[js.UndefOr[horizontal | vertical]]): TypePropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePropType]
  }
  
  extension [Self <: TypePropType](x: Self) {
    
    inline def setDefault(value: horizontal | vertical): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setType(value: PropType[js.UndefOr[horizontal | vertical]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[js.UndefOr[horizontal | vertical]]): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setTypeVarargs(value: (PropConstructor[js.UndefOr[horizontal | vertical]])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
