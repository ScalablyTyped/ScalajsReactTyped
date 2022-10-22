package typingsJapgolly.dom4

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentNode extends StObject {
  
  /**
    * Inserts `nodes` after the last child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def append(nodes: (Node | String)*): Unit
  
  /**
    * Returns the child elements.
    */
  val children: HTMLCollection[Any]
  
  /**
    * Inserts `nodes` before the first child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def prepend(nodes: (Node | String)*): Unit
}
object ParentNode {
  
  inline def apply(
    append: /* repeated */ Node | String => Callback,
    children: HTMLCollection[Any],
    prepend: /* repeated */ Node | String => Callback
  ): ParentNode = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1((t0: /* repeated */ Node | String) => append(t0).runNow()), children = children.asInstanceOf[js.Any], prepend = js.Any.fromFunction1((t0: /* repeated */ Node | String) => prepend(t0).runNow()))
    __obj.asInstanceOf[ParentNode]
  }
  
  extension [Self <: ParentNode](x: Self) {
    
    inline def setAppend(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
    
    inline def setChildren(value: HTMLCollection[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setPrepend(value: /* repeated */ Node | String => Callback): Self = StObject.set(x, "prepend", js.Any.fromFunction1((t0: /* repeated */ Node | String) => value(t0).runNow()))
  }
}
