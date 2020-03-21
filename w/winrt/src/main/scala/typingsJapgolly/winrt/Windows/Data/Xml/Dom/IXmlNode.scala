package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlNode
  extends IXmlNodeSelector
     with IXmlNodeSerializer {
  var attributes: XmlNamedNodeMap
  var childNodes: XmlNodeList
  var firstChild: IXmlNode
  var lastChild: IXmlNode
  var localName: js.Any
  var namespaceUri: js.Any
  var nextSibling: IXmlNode
  var nodeName: String
  var nodeType: NodeType
  var nodeValue: js.Any
  var ownerDocument: XmlDocument
  var parentNode: IXmlNode
  var prefix: js.Any
  var previousSibling: IXmlNode
  def appendChild(newChild: IXmlNode): IXmlNode
  def cloneNode(deep: Boolean): IXmlNode
  def hasChildNodes(): Boolean
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
  def normalize(): Unit
  def removeChild(childNode: IXmlNode): IXmlNode
  def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
}

object IXmlNode {
  @scala.inline
  def apply(
    appendChild: IXmlNode => CallbackTo[IXmlNode],
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => CallbackTo[IXmlNode],
    firstChild: IXmlNode,
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
    removeChild: IXmlNode => CallbackTo[IXmlNode],
    replaceChild: (IXmlNode, IXmlNode) => CallbackTo[IXmlNode],
    selectNodes: String => CallbackTo[XmlNodeList],
    selectNodesNS: (String, js.Any) => CallbackTo[XmlNodeList],
    selectSingleNode: String => CallbackTo[IXmlNode],
    selectSingleNodeNS: (String, js.Any) => CallbackTo[IXmlNode]
  ): IXmlNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => appendChild(t0).runNow()))
    __obj.updateDynamic("cloneNode")(js.Any.fromFunction1((t0: scala.Boolean) => cloneNode(t0).runNow()))
    __obj.updateDynamic("getXml")(getXml.toJsFn)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes.toJsFn)
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.updateDynamic("removeChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => removeChild(t0).runNow()))
    __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => replaceChild(t0, t1).runNow()))
    __obj.updateDynamic("selectNodes")(js.Any.fromFunction1((t0: java.lang.String) => selectNodes(t0).runNow()))
    __obj.updateDynamic("selectNodesNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectNodesNS(t0, t1).runNow()))
    __obj.updateDynamic("selectSingleNode")(js.Any.fromFunction1((t0: java.lang.String) => selectSingleNode(t0).runNow()))
    __obj.updateDynamic("selectSingleNodeNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectSingleNodeNS(t0, t1).runNow()))
    __obj.asInstanceOf[IXmlNode]
  }
}

