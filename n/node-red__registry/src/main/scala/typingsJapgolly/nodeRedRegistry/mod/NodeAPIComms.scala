package typingsJapgolly.nodeRedRegistry.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAPIComms extends StObject {
  
  def publish(topic: String, data: Any, retain: Boolean): Unit
}
object NodeAPIComms {
  
  inline def apply(publish: (String, Any, Boolean) => Callback): NodeAPIComms = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (publish(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[NodeAPIComms]
  }
  
  extension [Self <: NodeAPIComms](x: Self) {
    
    inline def setPublish(value: (String, Any, Boolean) => Callback): Self = StObject.set(x, "publish", js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
