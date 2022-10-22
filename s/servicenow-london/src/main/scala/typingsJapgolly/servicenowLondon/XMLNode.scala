package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLNode extends StObject {
  
  def getAttribute(attribute: String): String
  
  def getChildNodeIterator(): XMLNodeIterator
  
  def getFirstChild(): XMLNode
  
  def getLastChild(): XMLNode
  
  def getNodeName(): String
  
  def getNodeValue(): String
  
  def getTextContent(): String
  
  def hasAttribute(name: String): Boolean
}
object XMLNode {
  
  inline def apply(
    getAttribute: String => String,
    getChildNodeIterator: CallbackTo[XMLNodeIterator],
    getFirstChild: CallbackTo[XMLNode],
    getLastChild: CallbackTo[XMLNode],
    getNodeName: CallbackTo[String],
    getNodeValue: CallbackTo[String],
    getTextContent: CallbackTo[String],
    hasAttribute: String => Boolean
  ): XMLNode = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getChildNodeIterator = getChildNodeIterator.toJsFn, getFirstChild = getFirstChild.toJsFn, getLastChild = getLastChild.toJsFn, getNodeName = getNodeName.toJsFn, getNodeValue = getNodeValue.toJsFn, getTextContent = getTextContent.toJsFn, hasAttribute = js.Any.fromFunction1(hasAttribute))
    __obj.asInstanceOf[XMLNode]
  }
  
  extension [Self <: XMLNode](x: Self) {
    
    inline def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetChildNodeIterator(value: CallbackTo[XMLNodeIterator]): Self = StObject.set(x, "getChildNodeIterator", value.toJsFn)
    
    inline def setGetFirstChild(value: CallbackTo[XMLNode]): Self = StObject.set(x, "getFirstChild", value.toJsFn)
    
    inline def setGetLastChild(value: CallbackTo[XMLNode]): Self = StObject.set(x, "getLastChild", value.toJsFn)
    
    inline def setGetNodeName(value: CallbackTo[String]): Self = StObject.set(x, "getNodeName", value.toJsFn)
    
    inline def setGetNodeValue(value: CallbackTo[String]): Self = StObject.set(x, "getNodeValue", value.toJsFn)
    
    inline def setGetTextContent(value: CallbackTo[String]): Self = StObject.set(x, "getTextContent", value.toJsFn)
    
    inline def setHasAttribute(value: String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
  }
}
