package typingsJapgolly.swiper.anon

import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var default: Unit
  
  var `type`: StringConstructor | NumberConstructor
}
object `26` {
  
  inline def apply(default: Unit, `type`: StringConstructor | NumberConstructor): `26` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor | NumberConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
