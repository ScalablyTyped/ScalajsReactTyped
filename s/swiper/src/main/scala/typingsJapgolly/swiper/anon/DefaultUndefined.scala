package typingsJapgolly.swiper.anon

import typingsJapgolly.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultUndefined extends StObject {
  
  var default: Unit
  
  var `type`: BooleanConstructor
}
object DefaultUndefined {
  
  inline def apply(default: Unit, `type`: BooleanConstructor): DefaultUndefined = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefined]
  }
  
  extension [Self <: DefaultUndefined](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
