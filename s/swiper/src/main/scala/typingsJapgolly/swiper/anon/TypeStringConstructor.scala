package typingsJapgolly.swiper.anon

import typingsJapgolly.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeStringConstructor extends StObject {
  
  var default: Unit
  
  var `type`: StringConstructor
}
object TypeStringConstructor {
  
  inline def apply(default: Unit, `type`: StringConstructor): TypeStringConstructor = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeStringConstructor]
  }
  
  extension [Self <: TypeStringConstructor](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
