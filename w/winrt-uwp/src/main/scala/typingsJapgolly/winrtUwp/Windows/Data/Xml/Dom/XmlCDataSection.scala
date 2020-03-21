package typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CDATA section of an XML document. */
@JSGlobal("Windows.Data.Xml.Dom.XmlCDataSection")
@js.native
abstract class XmlCDataSection () extends js.Object {
  /** Gets the list of attributes of this node. */
  var attributes: XmlNamedNodeMap = js.native
  /** Gets a list of children in the current node. This property always returns NULL. */
  var childNodes: XmlNodeList = js.native
  /** Gets or sets the node data depending on the node type. */
  var data: String = js.native
  /** Gets the first child node. This property always returns NULL. */
  var firstChild: IXmlNode = js.native
  /** Gets the text from inside the XML. */
  var innerText: String = js.native
  /** Gets the last child node. This property always returns NULL because the CDataSection does not have children. */
  var lastChild: IXmlNode = js.native
  /** Gets the length of the data, in Unicode characters. */
  var length: Double = js.native
  /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
  var localName: js.Any = js.native
  /** Returns the Uniform Resource Identifier (URI) for the namespace. */
  var namespaceUri: js.Any = js.native
  /** Gets the next sibling of the node in the parent's child list. */
  var nextSibling: IXmlNode = js.native
  /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
  var nodeName: String = js.native
  /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
  var nodeType: NodeType = js.native
  /** Gets or sets the text associated with the node. */
  var nodeValue: js.Any = js.native
  /** Returns the root of the document that contains the node. */
  var ownerDocument: XmlDocument = js.native
  /** Gets the parent node of the node instance. */
  var parentNode: IXmlNode = js.native
  /** Gets or sets the namespace prefix. */
  var prefix: js.Any = js.native
  /** Gets the previous sibling of the node in the parent's child list. */
  var previousSibling: IXmlNode = js.native
  /**
    * This method is not applicable to this class. The CDataSection does not have children. This method will throw an exception.
    * @param newChild The new child node to be appended to the end of the list of children of this node.
    * @return The new child node successfully appended to the list. If null, no object is created.
    */
  def appendChild(newChild: IXmlNode): IXmlNode = js.native
  /**
    * Appends the supplied string to the existing string data.
    * @param data The data to be appended to the existing string.
    */
  def appendData(data: String): Unit = js.native
  /**
    * Clones a new node.
    * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
    * @return The newly created clone node.
    */
  def cloneNode(deep: Boolean): IXmlNode = js.native
  /**
    * Deletes specified data.
    * @param offset The offset, in characters, at which to start deleting the string data.
    * @param count The number of characters to delete.
    */
  def deleteData(offset: Double, count: Double): Unit = js.native
  /**
    * Returns the XML representation of the node and all its descendants.
    * @return The XML representation of the node and all its descendants.
    */
  def getXml(): String = js.native
  /**
    * Determines whether a node has children. The CDataSection does not have children. This method always returns false.
    * @return True if this node has children; otherwise false. This method always returns false.
    */
  def hasChildNodes(): Boolean = js.native
  /**
    * Inserts a child node to the left of the specified node, or at the end of the child node list. This method is not applicable to this class and will throw an exception.
    * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
    * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
    * @return On success, the child node that was inserted. If null, no object is created.
    */
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /**
    * Inserts a string at the specified offset.
    * @param offset The offset, in characters, at which to insert the supplied string data.
    * @param data The data to be inserted into the existing string.
    */
  def insertData(offset: Double, data: String): Unit = js.native
  /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
  def normalize(): Unit = js.native
  /**
    * Removes the specified child node from the list of children and returns it. This method is not applicable to this class as the CDataSection does not have children. This method will throw an exception.
    * @param childNode The child node to be removed from the list of children of this node.
    * @return The removed child node. If null, the childNode object is not removed.
    */
  def removeChild(childNode: IXmlNode): IXmlNode = js.native
  /**
    * Replaces the specified old child node with the supplied new child node. This method is not applicable to this class as the CDataSection does not have children. This method will throw an exception.
    * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
    * @param referenceChild The old child that is to be replaced by the new child.
    * @return The old child that is replaced. If null, no object is created.
    */
  def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /**
    * Replaces the specified number of characters with the supplied string.
    * @param offset The offset, in characters, at which to start replacing string data.
    * @param count The number of characters to replace.
    * @param data The new data that replaces the old string data.
    */
  def replaceData(offset: Double, count: Double, data: String): Unit = js.native
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList . This method is not applicable to this class and will throw an exception.
    * @param xpath Specifies an XPath expression.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
    */
  def selectNodes(xpath: String): XmlNodeList = js.native
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList . This method is not applicable to this class and will throw an exception.
    * @param xpath Specifies an XPath expresssion.
    * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
    */
  def selectNodesNS(xpath: String, namespaces: js.Any): XmlNodeList = js.native
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node. This method is not applicable to this class and will throw an exception.
    * @param xpath Specifies an XPath expression.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
    */
  def selectSingleNode(xpath: String): IXmlNode = js.native
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node. This method is not applicable to this class and will throw an exception.
    * @param xpath Specifies an XPath expression.
    * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
    */
  def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  /**
    * Splits this text node into two text nodes at the specified offset and inserts the new text node into the tree as a sibling that immediately follows this node.
    * @param offset The number of characters at which to split this text node into two nodes, starting from zero.
    * @return The new text node.
    */
  def splitText(offset: Double): IXmlText = js.native
  /**
    * Retrieves a substring of the full string from the specified range.
    * @param offset Specifies the offset, in characters, from the beginning of the string. An offset of zero indicates copying from the start of the data.
    * @param count Specifies the number of characters to retrieve from the specified offset.
    * @return The returned substring.
    */
  def substringData(offset: Double, count: Double): String = js.native
}

