package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The primary dom datatype
  *
  * The Node interface is the primary datatype for the entire Document Object Model. It represents a single node in the document tree. While all objects
  * implementing the Node interface expose methods for dealing with children, not all objects implementing the Node interface may have children. For
  * example, Text nodes may not have children, and adding children to such nodes results in a {@link DOMException} being raised.
  *
  * The attributes nodeName, nodeValue and attributes are included as a mechanism to get at node information without casting down to the specific derived
  * interface. In cases where there is no obvious mapping of these attributes for a specific nodeType (e.g., nodeValue for an Element or attributes for a
  * Comment ), this returns null. Note that the specialized interfaces may contain additional and more convenient mechanisms to get and set the relevant
  * information.
  *
  * The values of nodeName, nodeValue, and attributes vary according to the node type as follows: {{table here, see documentation}}
  * @see Document Object Model (DOM) Level 2 Core Specification
  * @since OOo 2.0
  */
trait XNode
  extends StObject
     with XInterface {
  
  /** A NamedNodeMap containing the attributes of this node (if it is an Element) or null otherwise. */
  val Attributes: XNamedNodeMap
  
  /** A NodeList that contains all children of this node. */
  val ChildNodes: XNodeList
  
  /** The first child of this node. */
  val FirstChild: XNode
  
  /** The last child of this node. */
  val LastChild: XNode
  
  /** Returns the local part of the qualified name of this node. */
  val LocalName: String
  
  /** The namespace URI of this node, or null if it is unspecified. */
  val NamespaceURI: String
  
  /** The node immediately following this node. */
  val NextSibling: XNode
  
  /** The name of this node, depending on its type; see the table above. */
  val NodeName: String
  
  /** A code representing the type of the underlying object, as defined above. */
  val NodeType: typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.NodeType
  
  /**
    * The value of this node, depending on its type; see the table above.
    * @throws com::sun::star::xml::dom::DOMException  DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the i
    */
  var NodeValue: String
  
  /** The Document object associated with this node. */
  val OwnerDocument: XDocument
  
  /** The parent of this node. */
  val ParentNode: XNode
  
  /** The namespace prefix of this node, or null if it is unspecified. */
  var Prefix: String
  
  /** The node immediately preceding this node. */
  val PreviousSibling: XNode
  
  /**
    * Adds the node newChild to the end of the list of children of this node.
    * @param newChild the new child node
    * @throws com::sun::star::xml::dom::DOMException  HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not allow children of the type of the n
    */
  def appendChild(newChild: XNode): XNode
  
  /**
    * Returns a duplicate of this node, i.e., serves as a generic copy constructor for nodes.
    * @param deep `TRUE` : clone node together with any children ; `FALSE` : clone without children
    * @returns the cloned node
    */
  def cloneNode(deep: Boolean): XNode
  
  /** A NamedNodeMap containing the attributes of this node (if it is an Element) or null otherwise. */
  def getAttributes(): XNamedNodeMap
  
  /** A NodeList that contains all children of this node. */
  def getChildNodes(): XNodeList
  
  /** The first child of this node. */
  def getFirstChild(): XNode
  
  /** The last child of this node. */
  def getLastChild(): XNode
  
  /** Returns the local part of the qualified name of this node. */
  def getLocalName(): String
  
  /** The namespace URI of this node, or null if it is unspecified. */
  def getNamespaceURI(): String
  
  /** The node immediately following this node. */
  def getNextSibling(): XNode
  
  /** The name of this node, depending on its type; see the table above. */
  def getNodeName(): String
  
  /** A code representing the type of the underlying object, as defined above. */
  def getNodeType(): typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.NodeType
  
  /**
    * The value of this node, depending on its type; see the table above.
    * @throws com::sun::star::xml::dom::DOMException  DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the i
    */
  def getNodeValue(): String
  
  /** The Document object associated with this node. */
  def getOwnerDocument(): XDocument
  
  /** The parent of this node. */
  def getParentNode(): XNode
  
  /** The namespace prefix of this node, or null if it is unspecified. */
  def getPrefix(): String
  
  /** The node immediately preceding this node. */
  def getPreviousSibling(): XNode
  
  /** Returns whether this node (if it is an element) has any attributes. */
  def hasAttributes(): Boolean
  
  /** Returns whether this node has any children. */
  def hasChildNodes(): Boolean
  
  /**
    * Inserts the node newChild before the existing child node refChild.
    * @throws DOMException  HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not allow children of the type of the newChild node, or if the no
    */
  def insertBefore(newChild: XNode, refChild: XNode): XNode
  
  /** Tests whether the DOM implementation implements a specific feature and that feature is supported by this node. */
  def isSupported(feature: String, ver: String): Boolean
  
  /**
    * Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure
    * (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text
    * nodes nor empty Text nodes.
    */
  def normalize(): Unit
  
  /**
    * Removes the child node indicated by oldChild from the list of children, and returns it.
    * @throws DOMException  NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.  NOT_FOUND_ERR: Raised if oldChild is not a child of this node.
    */
  def removeChild(oldChild: XNode): XNode
  
  /**
    * Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node.
    * @throws DOMException  HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not allow children of the type of the newChild node, or if the no
    */
  def replaceChild(newChild: XNode, oldChild: XNode): XNode
  
  /**
    * The value of this node, depending on its type; see the table above.
    * @throws DOMException  NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.  DOMSTRING_SIZE_ERR: Raised when it would return more characters tha
    */
  def setNodeValue(nodeValue: String): Unit
  
  /**
    * The namespace prefix of this node, or null if it is unspecified.
    * @throws DOMException  INVALID_CHARACTER_ERR: Raised if the specified prefix contains an illegal character, per the XML 1.0 specification .  NO_MODIFICATI
    */
  def setPrefix(prefix: String): Unit
}
object XNode {
  
  inline def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    FirstChild: XNode,
    LastChild: XNode,
    LocalName: String,
    NamespaceURI: String,
    NextSibling: XNode,
    NodeName: String,
    NodeType: NodeType,
    NodeValue: String,
    OwnerDocument: XDocument,
    ParentNode: XNode,
    Prefix: String,
    PreviousSibling: XNode,
    acquire: Callback,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttributes: CallbackTo[XNamedNodeMap],
    getChildNodes: CallbackTo[XNodeList],
    getFirstChild: CallbackTo[XNode],
    getLastChild: CallbackTo[XNode],
    getLocalName: CallbackTo[String],
    getNamespaceURI: CallbackTo[String],
    getNextSibling: CallbackTo[XNode],
    getNodeName: CallbackTo[String],
    getNodeType: CallbackTo[NodeType],
    getNodeValue: CallbackTo[String],
    getOwnerDocument: CallbackTo[XDocument],
    getParentNode: CallbackTo[XNode],
    getPrefix: CallbackTo[String],
    getPreviousSibling: CallbackTo[XNode],
    hasAttributes: CallbackTo[Boolean],
    hasChildNodes: CallbackTo[Boolean],
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setNodeValue: String => Callback,
    setPrefix: String => Callback
  ): XNode = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = getAttributes.toJsFn, getChildNodes = getChildNodes.toJsFn, getFirstChild = getFirstChild.toJsFn, getLastChild = getLastChild.toJsFn, getLocalName = getLocalName.toJsFn, getNamespaceURI = getNamespaceURI.toJsFn, getNextSibling = getNextSibling.toJsFn, getNodeName = getNodeName.toJsFn, getNodeType = getNodeType.toJsFn, getNodeValue = getNodeValue.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPrefix = getPrefix.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, hasAttributes = hasAttributes.toJsFn, hasChildNodes = hasChildNodes.toJsFn, insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = normalize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1((t0: String) => setNodeValue(t0).runNow()), setPrefix = js.Any.fromFunction1((t0: String) => setPrefix(t0).runNow()))
    __obj.asInstanceOf[XNode]
  }
  
  extension [Self <: XNode](x: Self) {
    
    inline def setAppendChild(value: XNode => XNode): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setAttributes(value: XNamedNodeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setChildNodes(value: XNodeList): Self = StObject.set(x, "ChildNodes", value.asInstanceOf[js.Any])
    
    inline def setCloneNode(value: Boolean => XNode): Self = StObject.set(x, "cloneNode", js.Any.fromFunction1(value))
    
    inline def setFirstChild(value: XNode): Self = StObject.set(x, "FirstChild", value.asInstanceOf[js.Any])
    
    inline def setGetAttributes(value: CallbackTo[XNamedNodeMap]): Self = StObject.set(x, "getAttributes", value.toJsFn)
    
    inline def setGetChildNodes(value: CallbackTo[XNodeList]): Self = StObject.set(x, "getChildNodes", value.toJsFn)
    
    inline def setGetFirstChild(value: CallbackTo[XNode]): Self = StObject.set(x, "getFirstChild", value.toJsFn)
    
    inline def setGetLastChild(value: CallbackTo[XNode]): Self = StObject.set(x, "getLastChild", value.toJsFn)
    
    inline def setGetLocalName(value: CallbackTo[String]): Self = StObject.set(x, "getLocalName", value.toJsFn)
    
    inline def setGetNamespaceURI(value: CallbackTo[String]): Self = StObject.set(x, "getNamespaceURI", value.toJsFn)
    
    inline def setGetNextSibling(value: CallbackTo[XNode]): Self = StObject.set(x, "getNextSibling", value.toJsFn)
    
    inline def setGetNodeName(value: CallbackTo[String]): Self = StObject.set(x, "getNodeName", value.toJsFn)
    
    inline def setGetNodeType(value: CallbackTo[NodeType]): Self = StObject.set(x, "getNodeType", value.toJsFn)
    
    inline def setGetNodeValue(value: CallbackTo[String]): Self = StObject.set(x, "getNodeValue", value.toJsFn)
    
    inline def setGetOwnerDocument(value: CallbackTo[XDocument]): Self = StObject.set(x, "getOwnerDocument", value.toJsFn)
    
    inline def setGetParentNode(value: CallbackTo[XNode]): Self = StObject.set(x, "getParentNode", value.toJsFn)
    
    inline def setGetPrefix(value: CallbackTo[String]): Self = StObject.set(x, "getPrefix", value.toJsFn)
    
    inline def setGetPreviousSibling(value: CallbackTo[XNode]): Self = StObject.set(x, "getPreviousSibling", value.toJsFn)
    
    inline def setHasAttributes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasAttributes", value.toJsFn)
    
    inline def setHasChildNodes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChildNodes", value.toJsFn)
    
    inline def setInsertBefore(value: (XNode, XNode) => XNode): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    inline def setIsSupported(value: (String, String) => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction2(value))
    
    inline def setLastChild(value: XNode): Self = StObject.set(x, "LastChild", value.asInstanceOf[js.Any])
    
    inline def setLocalName(value: String): Self = StObject.set(x, "LocalName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceURI(value: String): Self = StObject.set(x, "NamespaceURI", value.asInstanceOf[js.Any])
    
    inline def setNextSibling(value: XNode): Self = StObject.set(x, "NextSibling", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: String): Self = StObject.set(x, "NodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeType(value: NodeType): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeValue(value: String): Self = StObject.set(x, "NodeValue", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: Callback): Self = StObject.set(x, "normalize", value.toJsFn)
    
    inline def setOwnerDocument(value: XDocument): Self = StObject.set(x, "OwnerDocument", value.asInstanceOf[js.Any])
    
    inline def setParentNode(value: XNode): Self = StObject.set(x, "ParentNode", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPreviousSibling(value: XNode): Self = StObject.set(x, "PreviousSibling", value.asInstanceOf[js.Any])
    
    inline def setRemoveChild(value: XNode => XNode): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    inline def setReplaceChild(value: (XNode, XNode) => XNode): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    inline def setSetNodeValue(value: String => Callback): Self = StObject.set(x, "setNodeValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetPrefix(value: String => Callback): Self = StObject.set(x, "setPrefix", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
