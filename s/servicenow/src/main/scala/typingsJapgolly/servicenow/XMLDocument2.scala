package typingsJapgolly.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.servicenow.servicenow.XMLNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLDocument2 extends StObject {
  
  def createElement(name: String): XMLNode
  
  def createElementWithTextValue(name: String, value: String): XMLNode
  
  def getDocumentElement(): XMLNode
  
  def getFirstNode(xpath: String): XMLNode
  
  def getNextNode(prev: js.Object): XMLNode
  
  def getNode(xpath: String): XMLNode
  
  def getNodeText(xpath: String): String
  
  def parseXML(xmlDoc: String): Unit
  
  def setCurrentElement(element: XMLNode): Unit
}
object XMLDocument2 {
  
  inline def apply(
    createElement: String => XMLNode,
    createElementWithTextValue: (String, String) => XMLNode,
    getDocumentElement: CallbackTo[XMLNode],
    getFirstNode: String => XMLNode,
    getNextNode: js.Object => XMLNode,
    getNode: String => XMLNode,
    getNodeText: String => String,
    parseXML: String => Callback,
    setCurrentElement: XMLNode => Callback
  ): XMLDocument2 = {
    val __obj = js.Dynamic.literal(createElement = js.Any.fromFunction1(createElement), createElementWithTextValue = js.Any.fromFunction2(createElementWithTextValue), getDocumentElement = getDocumentElement.toJsFn, getFirstNode = js.Any.fromFunction1(getFirstNode), getNextNode = js.Any.fromFunction1(getNextNode), getNode = js.Any.fromFunction1(getNode), getNodeText = js.Any.fromFunction1(getNodeText), parseXML = js.Any.fromFunction1((t0: String) => parseXML(t0).runNow()), setCurrentElement = js.Any.fromFunction1((t0: XMLNode) => setCurrentElement(t0).runNow()))
    __obj.asInstanceOf[XMLDocument2]
  }
  
  extension [Self <: XMLDocument2](x: Self) {
    
    inline def setCreateElement(value: String => XMLNode): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
    
    inline def setCreateElementWithTextValue(value: (String, String) => XMLNode): Self = StObject.set(x, "createElementWithTextValue", js.Any.fromFunction2(value))
    
    inline def setGetDocumentElement(value: CallbackTo[XMLNode]): Self = StObject.set(x, "getDocumentElement", value.toJsFn)
    
    inline def setGetFirstNode(value: String => XMLNode): Self = StObject.set(x, "getFirstNode", js.Any.fromFunction1(value))
    
    inline def setGetNextNode(value: js.Object => XMLNode): Self = StObject.set(x, "getNextNode", js.Any.fromFunction1(value))
    
    inline def setGetNode(value: String => XMLNode): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
    
    inline def setGetNodeText(value: String => String): Self = StObject.set(x, "getNodeText", js.Any.fromFunction1(value))
    
    inline def setParseXML(value: String => Callback): Self = StObject.set(x, "parseXML", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetCurrentElement(value: XMLNode => Callback): Self = StObject.set(x, "setCurrentElement", js.Any.fromFunction1((t0: XMLNode) => value(t0).runNow()))
  }
}
