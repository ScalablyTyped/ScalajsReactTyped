package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlElement
  extends StObject
     with IXmlNode {
  
  def getAttribute(attributeName: String): String
  
  def getAttributeNS(namespaceUri: Any, localName: String): String
  
  def getAttributeNode(attributeName: String): XmlAttribute
  
  def getAttributeNodeNS(namespaceUri: Any, localName: String): XmlAttribute
  
  def getElementsByTagName(tagName: String): XmlNodeList
  
  def removeAttribute(attributeName: String): Unit
  
  def removeAttributeNS(namespaceUri: Any, localName: String): Unit
  
  def removeAttributeNode(attributeNode: XmlAttribute): XmlAttribute
  
  def setAttribute(attributeName: String, attributeValue: String): Unit
  
  def setAttributeNS(namespaceUri: Any, qualifiedName: String, value: String): Unit
  
  def setAttributeNode(newAttribute: XmlAttribute): XmlAttribute
  
  def setAttributeNodeNS(newAttribute: XmlAttribute): XmlAttribute
  
  var tagName: String
}
object IXmlElement {
  
  inline def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    firstChild: IXmlNode,
    getAttribute: String => String,
    getAttributeNS: (Any, String) => String,
    getAttributeNode: String => XmlAttribute,
    getAttributeNodeNS: (Any, String) => XmlAttribute,
    getElementsByTagName: String => XmlNodeList,
    getXml: CallbackTo[String],
    hasChildNodes: CallbackTo[Boolean],
    innerText: String,
    insertBefore: (IXmlNode, IXmlNode) => IXmlNode,
    lastChild: IXmlNode,
    localName: Any,
    namespaceUri: Any,
    nextSibling: IXmlNode,
    nodeName: String,
    nodeType: NodeType,
    nodeValue: Any,
    normalize: Callback,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: Any,
    previousSibling: IXmlNode,
    removeAttribute: String => Callback,
    removeAttributeNS: (Any, String) => Callback,
    removeAttributeNode: XmlAttribute => XmlAttribute,
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, Any) => IXmlNode,
    setAttribute: (String, String) => Callback,
    setAttributeNS: (Any, String, String) => Callback,
    setAttributeNode: XmlAttribute => XmlAttribute,
    setAttributeNodeNS: XmlAttribute => XmlAttribute,
    tagName: String
  ): IXmlElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), firstChild = firstChild.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getXml = getXml.toJsFn, hasChildNodes = hasChildNodes.toJsFn, innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = normalize.toJsFn, ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeAttribute = js.Any.fromFunction1((t0: String) => removeAttribute(t0).runNow()), removeAttributeNS = js.Any.fromFunction2((t0: Any, t1: String) => (removeAttributeNS(t0, t1)).runNow()), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS), setAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setAttribute(t0, t1)).runNow()), setAttributeNS = js.Any.fromFunction3((t0: Any, t1: String, t2: String) => (setAttributeNS(t0, t1, t2)).runNow()), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlElement]
  }
  
  extension [Self <: IXmlElement](x: Self) {
    
    inline def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetAttributeNS(value: (Any, String) => String): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
    
    inline def setGetAttributeNode(value: String => XmlAttribute): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
    
    inline def setGetAttributeNodeNS(value: (Any, String) => XmlAttribute): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction2(value))
    
    inline def setGetElementsByTagName(value: String => XmlNodeList): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    
    inline def setRemoveAttribute(value: String => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveAttributeNS(value: (Any, String) => Callback): Self = StObject.set(x, "removeAttributeNS", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRemoveAttributeNode(value: XmlAttribute => XmlAttribute): Self = StObject.set(x, "removeAttributeNode", js.Any.fromFunction1(value))
    
    inline def setSetAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetAttributeNS(value: (Any, String, String) => Callback): Self = StObject.set(x, "setAttributeNS", js.Any.fromFunction3((t0: Any, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetAttributeNode(value: XmlAttribute => XmlAttribute): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
    
    inline def setSetAttributeNodeNS(value: XmlAttribute => XmlAttribute): Self = StObject.set(x, "setAttributeNodeNS", js.Any.fromFunction1(value))
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
