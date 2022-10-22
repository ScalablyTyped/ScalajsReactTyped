package typingsJapgolly.reactAsync.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Persist extends StObject {
  
  var children: Any
  
  var persist: Any
  
  var state: Any
}
object Persist {
  
  inline def apply(children: Any, persist: Any, state: Any): Persist = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persist]
  }
  
  extension [Self <: Persist](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setPersist(value: Any): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
