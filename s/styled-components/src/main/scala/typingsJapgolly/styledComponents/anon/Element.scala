package typingsJapgolly.styledComponents.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLStyleElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  def deleteRule(index: Double): Unit
  
  var element: HTMLStyleElement
  
  def getRule(index: Double): String
  
  def insertRule(index: Double, rule: String): Boolean
  
  var length: Double
  
  var nodes: NodeList[Node]
}
object Element {
  
  inline def apply(
    deleteRule: Double => Callback,
    element: HTMLStyleElement,
    getRule: Double => String,
    insertRule: (Double, String) => Boolean,
    length: Double,
    nodes: NodeList[Node]
  ): Element = {
    val __obj = js.Dynamic.literal(deleteRule = js.Any.fromFunction1((t0: Double) => deleteRule(t0).runNow()), element = element.asInstanceOf[js.Any], getRule = js.Any.fromFunction1(getRule), insertRule = js.Any.fromFunction2(insertRule), length = length.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setDeleteRule(value: Double => Callback): Self = StObject.set(x, "deleteRule", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setElement(value: HTMLStyleElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setGetRule(value: Double => String): Self = StObject.set(x, "getRule", js.Any.fromFunction1(value))
    
    inline def setInsertRule(value: (Double, String) => Boolean): Self = StObject.set(x, "insertRule", js.Any.fromFunction2(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: NodeList[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
