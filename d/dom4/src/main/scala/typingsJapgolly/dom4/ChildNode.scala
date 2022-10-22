package typingsJapgolly.dom4

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://dom.spec.whatwg.org/#childnode
  */
trait ChildNode extends StObject {
  
  /**
    * Inserts `nodes` just after this node, while replacing strings with equivalent `Text` nodes.
    */
  def after(nodes: (Node | String)*): Unit
  
  /**
    * Inserts `nodes` just before this node, while replacing strings with equivalent `Text` nodes.
    */
  def before(nodes: (Node | String)*): Unit
  
  /**
    * Removes this node.
    */
  def remove(): Unit
  
  /**
    * Replaces this node with `nodes`, while replacing strings in nodes with equivalent Text nodes.
    */
  def replaceWith(nodes: (Node | String)*): Unit
}
object ChildNode {
  
  inline def apply(
    after: /* repeated */ Node | String => Callback,
    before: /* repeated */ Node | String => Callback,
    remove: Callback,
    replaceWith: /* repeated */ Node | String => Callback
  ): ChildNode = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1((t0: /* repeated */ Node | String) => after(t0).runNow()), before = js.Any.fromFunction1((t0: /* repeated */ Node | String) => before(t0).runNow()), remove = remove.toJsFn, replaceWith = js.Any.fromFunction1((t0: /* repeated */ Node | String) => replaceWith(t0).runNow()))
    __obj.asInstanceOf[ChildNode]
  }
  
  extension [Self <: ChildNode](x: Self) {
    
    inline def setAfter(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "after", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
    
    inline def setBefore(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "before", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setReplaceWith(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
  }
}
