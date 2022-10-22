package typingsJapgolly.kefir.anon

import typingsJapgolly.kefir.kefirStrings.error
import typingsJapgolly.kefir.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[E]
  extends StObject
     with Event[Any, E] {
  
  var `type`: error
  
  var value: E
}
object Value {
  
  inline def apply[E](value: E): Value[E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[Value[E]]
  }
  
  extension [Self <: Value[?], E](x: Self & Value[E]) {
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: E): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
