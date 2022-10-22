package typingsJapgolly.swiper.anon

import typingsJapgolly.std.ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultType extends StObject {
  
  var default: Unit
  
  var `type`: ArrayConstructor
}
object DefaultType {
  
  inline def apply(default: Unit, `type`: ArrayConstructor): DefaultType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultType]
  }
  
  extension [Self <: DefaultType](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: ArrayConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
