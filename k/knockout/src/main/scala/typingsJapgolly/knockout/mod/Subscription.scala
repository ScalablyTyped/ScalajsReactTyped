package typingsJapgolly.knockout.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  def dispose(): Unit
  
  def disposeWhenNodeIsRemoved(node: Node): Unit
}
object Subscription {
  
  inline def apply(dispose: Callback, disposeWhenNodeIsRemoved: Node => Callback): Subscription = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, disposeWhenNodeIsRemoved = js.Any.fromFunction1((t0: Node) => disposeWhenNodeIsRemoved(t0).runNow()))
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setDisposeWhenNodeIsRemoved(value: Node => Callback): Self = StObject.set(x, "disposeWhenNodeIsRemoved", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
  }
}
