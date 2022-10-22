package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.swiper.typesModulesPaginationMod.PaginationOptions
import typingsJapgolly.vueRuntimeCore.mod.PropConstructor
import typingsJapgolly.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[PaginationOptions | Boolean]
}
object `18` {
  
  inline def apply(default: Unit, `type`: PropType[PaginationOptions | Boolean]): `18` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[PaginationOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeCallbackTo(value: CallbackTo[PaginationOptions | Boolean]): Self = StObject.set(x, "type", value.toJsFn)
    
    inline def setTypeVarargs(value: (PropConstructor[PaginationOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
