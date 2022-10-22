package typingsJapgolly.jqueryAjaxfile.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDisposeCallback extends StObject {
  
  def addDisposeCallback(node: org.scalajs.dom.Element, callback: js.Function): Unit
  
  def cleanNode(node: Node): org.scalajs.dom.Element
  
  def removeDisposeCallback(node: org.scalajs.dom.Element, callback: js.Function): Unit
  
  def removeNode(node: Node): Unit
}
object AddDisposeCallback {
  
  inline def apply(
    addDisposeCallback: (org.scalajs.dom.Element, js.Function) => Callback,
    cleanNode: Node => org.scalajs.dom.Element,
    removeDisposeCallback: (org.scalajs.dom.Element, js.Function) => Callback,
    removeNode: Node => Callback
  ): AddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2((t0: org.scalajs.dom.Element, t1: js.Function) => (addDisposeCallback(t0, t1)).runNow()), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2((t0: org.scalajs.dom.Element, t1: js.Function) => (removeDisposeCallback(t0, t1)).runNow()), removeNode = js.Any.fromFunction1((t0: Node) => removeNode(t0).runNow()))
    __obj.asInstanceOf[AddDisposeCallback]
  }
  
  extension [Self <: AddDisposeCallback](x: Self) {
    
    inline def setAddDisposeCallback(value: (org.scalajs.dom.Element, js.Function) => Callback): Self = StObject.set(x, "addDisposeCallback", js.Any.fromFunction2((t0: org.scalajs.dom.Element, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setCleanNode(value: Node => org.scalajs.dom.Element): Self = StObject.set(x, "cleanNode", js.Any.fromFunction1(value))
    
    inline def setRemoveDisposeCallback(value: (org.scalajs.dom.Element, js.Function) => Callback): Self = StObject.set(x, "removeDisposeCallback", js.Any.fromFunction2((t0: org.scalajs.dom.Element, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setRemoveNode(value: Node => Callback): Self = StObject.set(x, "removeNode", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
  }
}
