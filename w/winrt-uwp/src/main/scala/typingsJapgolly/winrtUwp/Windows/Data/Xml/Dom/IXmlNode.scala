package typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information for the entire Document Object Model. This interface represents a single node in the document tree. While all objects that implement this interface expose methods for dealing with children, not all objects that implement this interface may have children. */
trait IXmlNode
  extends IXmlNodeSelector
     with IXmlNodeSerializer {
  /** Gets the list of attributes of this node. */
  var attributes: XmlNamedNodeMap
  /** Gets a list of children in the current node. */
  var childNodes: XmlNodeList
  /** Gets the first child node. */
  var firstChild: IXmlNode
  /** Gets the last child node. */
  var lastChild: IXmlNode
  /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
  var localName: js.Any
  /** Returns the Uniform Resource Identifier (URI) for the namespace. */
  var namespaceUri: js.Any
  /** Gets the next sibling of the node in the parent's child list. */
  var nextSibling: IXmlNode
  /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
  var nodeName: String
  /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
  var nodeType: NodeType
  /** Gets or sets the text associated with the node. */
  var nodeValue: js.Any
  /** Returns the root of the document that contains the node. */
  var ownerDocument: XmlDocument
  /** Gets the parent node of the node instance. */
  var parentNode: IXmlNode
  /** Gets or sets the namespace prefix. */
  var prefix: js.Any
  /** Gets the previous sibling of the node in the parent's child list. */
  var previousSibling: IXmlNode
  /**
    * Appends a new child node as the last child of the node.
    * @param newChild The new child node to be appended to the end of the list of children of this node.
    * @return The new child node successfully appended to the list. If null, no object is created.
    */
  def appendChild(newChild: IXmlNode): IXmlNode
  /**
    * Clones a new node.
    * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
    * @return The newly created clone node.
    */
  def cloneNode(deep: Boolean): IXmlNode
  /**
    * Determines whether a node has children.
    * @return True if this node has children; otherwise false.
    */
  def hasChildNodes(): Boolean
  /**
    * Inserts a child node to the left of the specified node, or at the end of the list.
    * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
    * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
    * @return On success, the child node that was inserted. If null, no object is created.
    */
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
  /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
  def normalize(): Unit
  /**
    * Removes the specified child node from the list of children and returns it.
    * @param childNode The child node to be removed from the list of children of this node.
    * @return The removed child node. If null, the childNode object is not removed.
    */
  def removeChild(childNode: IXmlNode): IXmlNode
  /**
    * Replaces the specified old child node with the supplied new child node.
    * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
    * @param referenceChild The old child that is to be replaced by the new child.
    * @return The old child that is replaced. If null, no object is created.
    */
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
    __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode) => appendChild(t0).runNow()))
    __obj.updateDynamic("cloneNode")(js.Any.fromFunction1((t0: scala.Boolean) => cloneNode(t0).runNow()))
    __obj.updateDynamic("getXml")(getXml.toJsFn)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes.toJsFn)
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.updateDynamic("removeChild")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode) => removeChild(t0).runNow()))
    __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode, t1: typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.IXmlNode) => replaceChild(t0, t1).runNow()))
    __obj.updateDynamic("selectNodes")(js.Any.fromFunction1((t0: java.lang.String) => selectNodes(t0).runNow()))
    __obj.updateDynamic("selectNodesNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectNodesNS(t0, t1).runNow()))
    __obj.updateDynamic("selectSingleNode")(js.Any.fromFunction1((t0: java.lang.String) => selectSingleNode(t0).runNow()))
    __obj.updateDynamic("selectSingleNodeNS")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => selectSingleNodeNS(t0, t1).runNow()))
    __obj.asInstanceOf[IXmlNode]
  }
}

