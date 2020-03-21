package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlElement extends IXmlNode {
  var tagName: String
  def getAttribute(attributeName: String): String
  def getAttributeNS(namespaceUri: js.Any, localName: String): String
  def getAttributeNode(attributeName: String): XmlAttribute
  def getAttributeNodeNS(namespaceUri: js.Any, localName: String): XmlAttribute
  def getElementsByTagName(tagName: String): XmlNodeList
  def removeAttribute(attributeName: String): Unit
  def removeAttributeNS(namespaceUri: js.Any, localName: String): Unit
  def removeAttributeNode(attributeNode: XmlAttribute): XmlAttribute
  def setAttribute(attributeName: String, attributeValue: String): Unit
  def setAttributeNS(namespaceUri: js.Any, qualifiedName: String, value: String): Unit
  def setAttributeNode(newAttribute: XmlAttribute): XmlAttribute
  def setAttributeNodeNS(newAttribute: XmlAttribute): XmlAttribute
}

object IXmlElement {
  @scala.inline
  def apply(
    appendChild: IXmlNode => CallbackTo[IXmlNode],
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => CallbackTo[IXmlNode],
    firstChild: IXmlNode,
    getAttribute: String => CallbackTo[String],
    getAttributeNS: (js.Any, String) => CallbackTo[String],
    getAttributeNode: String => CallbackTo[XmlAttribute],
    getAttributeNodeNS: (js.Any, String) => CallbackTo[XmlAttribute],
    getElementsByTagName: String => CallbackTo[XmlNodeList],
    getXml: CallbackTo[String],
    hasChildNodes: CallbackTo[Boolean],
    innerText: String,
    insertBefore: (IXmlNode, IXmlNode) => CallbackTo[IXmlNode],
    lastChild: IXmlNode,
    localName: js.Any,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: Callback,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: js.Any,
    previousSibling: IXmlNode,
    removeAttribute: String => Callback,
    removeAttributeNS: (js.Any, String) => Callback,
    removeAttributeNode: XmlAttribute => CallbackTo[XmlAttribute],
    removeChild: IXmlNode => CallbackTo[IXmlNode],
    replaceChild: (IXmlNode, IXmlNode) => CallbackTo[IXmlNode],
    selectNodes: String => CallbackTo[XmlNodeList],
    selectNodesNS: (String, js.Any) => CallbackTo[XmlNodeList],
    selectSingleNode: String => CallbackTo[IXmlNode],
    selectSingleNodeNS: (String, js.Any) => CallbackTo[IXmlNode],
    setAttribute: (String, String) => Callback,
    setAttributeNS: (js.Any, String, String) => Callback,
    setAttributeNode: XmlAttribute => CallbackTo[XmlAttribute],
    setAttributeNodeNS: XmlAttribute => CallbackTo[XmlAttribute],
    tagName: String
  ): IXmlElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => appendChild(t0).runNow()))
    __obj.updateDynamic("cloneNode")(js.Any.fromFunction1((t0: scala.Boolean) => cloneNode(t0).runNow()))
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: java.lang.String) => getAttribute(t0).runNow()))
    __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => getAttributeNS(t0, t1).runNow()))
    __obj.updateDynamic("getAttributeNode")(js.Any.fromFunction1((t0: java.lang.String) => getAttributeNode(t0).runNow()))
    __obj.updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => getAttributeNodeNS(t0, t1).runNow()))
    __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByTagName(t0).runNow()))
    __obj.updateDynamic("getXml")(getXml.toJsFn)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes.toJsFn)
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.updateDynamic("removeAttribute")(js.Any.fromFunction1((t0: java.lang.String) => removeAttribute(t0).runNow()))
    __obj.updateDynamic("removeAttributeNS")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => removeAttributeNS(t0, t1).runNow()))
    __obj.updateDynamic("removeAttributeNode")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute) => removeAttributeNode(t0).runNow()))
    __obj.updateDynamic("removeChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => removeChild(t0).runNow()))
    __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => replaceChild(t0, t1).runNow()))
    __obj.updateDynamic("selectNodes")(js.Any.fromFunction1((t0: java.lang.String) => selectNodes(t0).runNow()))
    __obj.updateDynamic("selectNodesNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectNodesNS(t0, t1).runNow()))
    __obj.updateDynamic("selectSingleNode")(js.Any.fromFunction1((t0: java.lang.String) => selectSingleNode(t0).runNow()))
    __obj.updateDynamic("selectSingleNodeNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectSingleNodeNS(t0, t1).runNow()))
    __obj.updateDynamic("setAttribute")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAttribute(t0, t1).runNow()))
    __obj.updateDynamic("setAttributeNS")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: java.lang.String) => setAttributeNS(t0, t1, t2).runNow()))
    __obj.updateDynamic("setAttributeNode")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute) => setAttributeNode(t0).runNow()))
    __obj.updateDynamic("setAttributeNodeNS")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute) => setAttributeNodeNS(t0).runNow()))
    __obj.asInstanceOf[IXmlElement]
  }
}

