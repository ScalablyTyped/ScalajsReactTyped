package typingsJapgolly.knockoutPaging

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Node
import typingsJapgolly.knockoutPaging.anon.Dictindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutVirtualElements extends StObject {
  
  var allowedBindings: StringDictionary[Boolean]
  
  def childNodes(node: KnockoutVirtualElement): js.Array[Node]
  
  def emptyNode(node: KnockoutVirtualElement): Unit
  
  def firstChild(node: KnockoutVirtualElement): KnockoutVirtualElement
  
  def insertAfter(container: KnockoutVirtualElement, nodeToInsert: Node, insertAfter: Node): Unit
  
  def nextSibling(node: KnockoutVirtualElement): Node
  
  def prepend(node: KnockoutVirtualElement, toInsert: Node): Unit
  
  def setDomNodeChildren(node: KnockoutVirtualElement, newChildren: Dictindex): Unit
}
object KnockoutVirtualElements {
  
  inline def apply(
    allowedBindings: StringDictionary[Boolean],
    childNodes: KnockoutVirtualElement => js.Array[Node],
    emptyNode: KnockoutVirtualElement => Callback,
    firstChild: KnockoutVirtualElement => KnockoutVirtualElement,
    insertAfter: (KnockoutVirtualElement, Node, Node) => Callback,
    nextSibling: KnockoutVirtualElement => Node,
    prepend: (KnockoutVirtualElement, Node) => Callback,
    setDomNodeChildren: (KnockoutVirtualElement, Dictindex) => Callback
  ): KnockoutVirtualElements = {
    val __obj = js.Dynamic.literal(allowedBindings = allowedBindings.asInstanceOf[js.Any], childNodes = js.Any.fromFunction1(childNodes), emptyNode = js.Any.fromFunction1((t0: KnockoutVirtualElement) => emptyNode(t0).runNow()), firstChild = js.Any.fromFunction1(firstChild), insertAfter = js.Any.fromFunction3((t0: KnockoutVirtualElement, t1: Node, t2: Node) => (insertAfter(t0, t1, t2)).runNow()), nextSibling = js.Any.fromFunction1(nextSibling), prepend = js.Any.fromFunction2((t0: KnockoutVirtualElement, t1: Node) => (prepend(t0, t1)).runNow()), setDomNodeChildren = js.Any.fromFunction2((t0: KnockoutVirtualElement, t1: Dictindex) => (setDomNodeChildren(t0, t1)).runNow()))
    __obj.asInstanceOf[KnockoutVirtualElements]
  }
  
  extension [Self <: KnockoutVirtualElements](x: Self) {
    
    inline def setAllowedBindings(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedBindings", value.asInstanceOf[js.Any])
    
    inline def setChildNodes(value: KnockoutVirtualElement => js.Array[Node]): Self = StObject.set(x, "childNodes", js.Any.fromFunction1(value))
    
    inline def setEmptyNode(value: KnockoutVirtualElement => Callback): Self = StObject.set(x, "emptyNode", js.Any.fromFunction1((t0: KnockoutVirtualElement) => value(t0).runNow()))
    
    inline def setFirstChild(value: KnockoutVirtualElement => KnockoutVirtualElement): Self = StObject.set(x, "firstChild", js.Any.fromFunction1(value))
    
    inline def setInsertAfter(value: (KnockoutVirtualElement, Node, Node) => Callback): Self = StObject.set(x, "insertAfter", js.Any.fromFunction3((t0: KnockoutVirtualElement, t1: Node, t2: Node) => (value(t0, t1, t2)).runNow()))
    
    inline def setNextSibling(value: KnockoutVirtualElement => Node): Self = StObject.set(x, "nextSibling", js.Any.fromFunction1(value))
    
    inline def setPrepend(value: (KnockoutVirtualElement, Node) => Callback): Self = StObject.set(x, "prepend", js.Any.fromFunction2((t0: KnockoutVirtualElement, t1: Node) => (value(t0, t1)).runNow()))
    
    inline def setSetDomNodeChildren(value: (KnockoutVirtualElement, Dictindex) => Callback): Self = StObject.set(x, "setDomNodeChildren", js.Any.fromFunction2((t0: KnockoutVirtualElement, t1: Dictindex) => (value(t0, t1)).runNow()))
  }
}
