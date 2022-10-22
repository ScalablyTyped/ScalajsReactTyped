package typingsJapgolly.reactSpringCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finished extends StObject {
  
  var cancelled: Boolean
  
  var finished: Boolean
  
  var value: Any
}
object Finished {
  
  inline def apply(cancelled: Boolean, finished: Boolean, value: Any): Finished = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finished]
  }
  
  extension [Self <: Finished](x: Self) {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
