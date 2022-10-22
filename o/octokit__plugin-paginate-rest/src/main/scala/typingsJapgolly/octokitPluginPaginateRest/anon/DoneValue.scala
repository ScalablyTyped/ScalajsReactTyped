package typingsJapgolly.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoneValue extends StObject {
  
  var done: Unit
  
  var value: Headers
}
object DoneValue {
  
  inline def apply(done: Unit, value: Headers): DoneValue = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneValue]
  }
  
  extension [Self <: DoneValue](x: Self) {
    
    inline def setDone(value: Unit): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Headers): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
