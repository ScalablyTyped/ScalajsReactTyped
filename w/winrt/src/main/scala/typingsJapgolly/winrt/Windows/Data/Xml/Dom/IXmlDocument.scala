package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDocument extends IXmlNode {
  var doctype: XmlDocumentType
  var documentElement: XmlElement
  var documentUri: String
  var implementation: XmlDomImplementation
  def createAttribute(name: String): XmlAttribute
  def createAttributeNS(namespaceUri: js.Any, qualifiedName: String): XmlAttribute
  def createCDataSection(data: String): XmlCDataSection
  def createComment(data: String): XmlComment
  def createDocumentFragment(): XmlDocumentFragment
  def createElement(tagName: String): XmlElement
  def createElementNS(namespaceUri: js.Any, qualifiedName: String): XmlElement
  def createEntityReference(name: String): XmlEntityReference
  def createProcessingInstruction(target: String, data: String): XmlProcessingInstruction
  def createTextNode(data: String): XmlText
  def getElementById(elementId: String): XmlElement
  def getElementsByTagName(tagName: String): XmlNodeList
  def importNode(node: IXmlNode, deep: Boolean): IXmlNode
}

object IXmlDocument {
  @scala.inline
  def apply(
    appendChild: IXmlNode => CallbackTo[IXmlNode],
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => CallbackTo[IXmlNode],
    createAttribute: String => CallbackTo[XmlAttribute],
    createAttributeNS: (js.Any, String) => CallbackTo[XmlAttribute],
    createCDataSection: String => CallbackTo[XmlCDataSection],
    createComment: String => CallbackTo[XmlComment],
    createDocumentFragment: CallbackTo[XmlDocumentFragment],
    createElement: String => CallbackTo[XmlElement],
    createElementNS: (js.Any, String) => CallbackTo[XmlElement],
    createEntityReference: String => CallbackTo[XmlEntityReference],
    createProcessingInstruction: (String, String) => CallbackTo[XmlProcessingInstruction],
    createTextNode: String => CallbackTo[XmlText],
    doctype: XmlDocumentType,
    documentElement: XmlElement,
    documentUri: String,
    firstChild: IXmlNode,
    getElementById: String => CallbackTo[XmlElement],
    getElementsByTagName: String => CallbackTo[XmlNodeList],
    getXml: CallbackTo[String],
    hasChildNodes: CallbackTo[Boolean],
    implementation: XmlDomImplementation,
    importNode: (IXmlNode, Boolean) => CallbackTo[IXmlNode],
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
  ): IXmlDocument = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], doctype = doctype.asInstanceOf[js.Any], documentElement = documentElement.asInstanceOf[js.Any], documentUri = documentUri.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => appendChild(t0).runNow()))
    __obj.updateDynamic("cloneNode")(js.Any.fromFunction1((t0: scala.Boolean) => cloneNode(t0).runNow()))
    __obj.updateDynamic("createAttribute")(js.Any.fromFunction1((t0: java.lang.String) => createAttribute(t0).runNow()))
    __obj.updateDynamic("createAttributeNS")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => createAttributeNS(t0, t1).runNow()))
    __obj.updateDynamic("createCDataSection")(js.Any.fromFunction1((t0: java.lang.String) => createCDataSection(t0).runNow()))
    __obj.updateDynamic("createComment")(js.Any.fromFunction1((t0: java.lang.String) => createComment(t0).runNow()))
    __obj.updateDynamic("createDocumentFragment")(createDocumentFragment.toJsFn)
    __obj.updateDynamic("createElement")(js.Any.fromFunction1((t0: java.lang.String) => createElement(t0).runNow()))
    __obj.updateDynamic("createElementNS")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => createElementNS(t0, t1).runNow()))
    __obj.updateDynamic("createEntityReference")(js.Any.fromFunction1((t0: java.lang.String) => createEntityReference(t0).runNow()))
    __obj.updateDynamic("createProcessingInstruction")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createProcessingInstruction(t0, t1).runNow()))
    __obj.updateDynamic("createTextNode")(js.Any.fromFunction1((t0: java.lang.String) => createTextNode(t0).runNow()))
    __obj.updateDynamic("getElementById")(js.Any.fromFunction1((t0: java.lang.String) => getElementById(t0).runNow()))
    __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByTagName(t0).runNow()))
    __obj.updateDynamic("getXml")(getXml.toJsFn)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes.toJsFn)
    __obj.updateDynamic("importNode")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode, t1: scala.Boolean) => importNode(t0, t1).runNow()))
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.updateDynamic("removeChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => removeChild(t0).runNow()))
    __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => replaceChild(t0, t1).runNow()))
    __obj.updateDynamic("selectNodes")(js.Any.fromFunction1((t0: java.lang.String) => selectNodes(t0).runNow()))
    __obj.updateDynamic("selectNodesNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectNodesNS(t0, t1).runNow()))
    __obj.updateDynamic("selectSingleNode")(js.Any.fromFunction1((t0: java.lang.String) => selectSingleNode(t0).runNow()))
    __obj.updateDynamic("selectSingleNodeNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectSingleNodeNS(t0, t1).runNow()))
    __obj.asInstanceOf[IXmlDocument]
  }
}

