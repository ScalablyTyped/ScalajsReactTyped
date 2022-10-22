package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeEventTarget extends StObject {
  
  def addListener(name: String, cb: js.Function1[/* e */ Any, Any]): Unit
}
object NodeEventTarget {
  
  inline def apply(addListener: (String, js.Function1[/* e */ Any, Any]) => Callback): NodeEventTarget = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Any, Any]) => (addListener(t0, t1)).runNow()))
    __obj.asInstanceOf[NodeEventTarget]
  }
  
  extension [Self <: NodeEventTarget](x: Self) {
    
    inline def setAddListener(value: (String, js.Function1[/* e */ Any, Any]) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Any, Any]) => (value(t0, t1)).runNow()))
  }
}
