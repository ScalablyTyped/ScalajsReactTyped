package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XElement
  extends StObject
     with XNode {
  
  /** The name of the element. */
  val TagName: String
  
  /** Retrieves an attribute value by name. */
  def getAttribute(name: String): String
  
  /** Retrieves an attribute value by local name and namespace URI. */
  def getAttributeNS(namespaceURI: String, localName: String): String
  
  /** Retrieves an attribute node by name. */
  def getAttributeNode(name: String): XAttr
  
  /** Retrieves an Attr node by local name and namespace URI. */
  def getAttributeNodeNS(namespaceURI: String, localName: String): XAttr
  
  /**
    * Returns a NodeList of all descendant Elements with a given tag name, in the order in which they are encountered in a preorder traversal of this
    * Element tree.
    */
  def getElementsByTagName(name: String): XNodeList
  
  /**
    * Returns a NodeList of all the descendant Elements with a given local name and namespace URI in the order in which they are encountered in a preorder
    * traversal of this Element tree.
    */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): XNodeList
  
  /** The name of the element. */
  def getTagName(): String
  
  /** Returns true when an attribute with a given name is specified on this element or has a default value, false otherwise. */
  def hasAttribute(name: String): Boolean
  
  /** Returns true when an attribute with a given local name and namespace URI is specified on this element or has a default value, false otherwise. */
  def hasAttributeNS(namespaceURI: String, localName: String): Boolean
  
  /** Removes an attribute by name. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */
  def removeAttribute(name: String): Unit
  
  /** Removes an attribute by local name and namespace URI. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */
  def removeAttributeNS(namespaceURI: String, localName: String): Unit
  
  /**
    * Removes the specified attribute node. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. NOT_FOUND_ERR:
    * Raised if oldAttr is not an attribute of the element.
    */
  def removeAttributeNode(oldAttr: XAttr): XAttr
  
  /**
    * Adds a new attribute. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal character.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def setAttribute(name: String, value: String): Unit
  
  /**
    * Adds a new attribute. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified qualified name contains an illegal character, per
    * the XML 1.0 specification . NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. NAMESPACE_ERR: Raised if the qualifiedName is malformed per
    * the Namespaces in XML specification, if the qualifiedName has a prefix and the namespaceURI is null, if the qualifiedName has a prefix that is "xml"
    * and the namespaceURI is different from " http://www.w3.org/XML/1998/namespace", or if the qualifiedName, or its prefix, is "xmlns" and the
    * namespaceURI is different from " http://www.w3.org/2000/xmlns/". NOT_SUPPORTED_ERR: Always thrown if the current document does not support the "XML"
    * feature, since namespaces were defined by XML.
    */
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit
  
  /**
    * Adds a new attribute node. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if newAttr was created from a different document than the one
    * that created the element. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. INUSE_ATTRIBUTE_ERR: Raised if newAttr is already an attribute
    * of another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements.
    */
  def setAttributeNode(newAttr: XAttr): XAttr
  
  /**
    * Adds a new attribute. Throws: {@link DOMException} - WRONG_DOCUMENT_ERR: Raised if newAttr was created from a different document than the one that
    * created the element. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. INUSE_ATTRIBUTE_ERR: Raised if newAttr is already an attribute of
    * another Element object. The DOM user must explicitly clone Attr nodes to re-use them in other elements. NOT_SUPPORTED_ERR: Always thrown if the
    * current document does not support the "XML" feature, since namespaces were defined by XML.
    */
  def setAttributeNodeNS(newAttr: XAttr): XAttr
}
object XElement {
  
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
    TagName: String,
    acquire: Callback,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttribute: String => String,
    getAttributeNS: (String, String) => String,
    getAttributeNode: String => XAttr,
    getAttributeNodeNS: (String, String) => XAttr,
    getAttributes: CallbackTo[XNamedNodeMap],
    getChildNodes: CallbackTo[XNodeList],
    getElementsByTagName: String => XNodeList,
    getElementsByTagNameNS: (String, String) => XNodeList,
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
    getTagName: CallbackTo[String],
    hasAttribute: String => Boolean,
    hasAttributeNS: (String, String) => Boolean,
    hasAttributes: CallbackTo[Boolean],
    hasChildNodes: CallbackTo[Boolean],
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeAttribute: String => Callback,
    removeAttributeNS: (String, String) => Callback,
    removeAttributeNode: XAttr => XAttr,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setAttribute: (String, String) => Callback,
    setAttributeNS: (String, String, String) => Callback,
    setAttributeNode: XAttr => XAttr,
    setAttributeNodeNS: XAttr => XAttr,
    setNodeValue: String => Callback,
    setPrefix: String => Callback
  ): XElement = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], TagName = TagName.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getAttributes = getAttributes.toJsFn, getChildNodes = getChildNodes.toJsFn, getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getFirstChild = getFirstChild.toJsFn, getLastChild = getLastChild.toJsFn, getLocalName = getLocalName.toJsFn, getNamespaceURI = getNamespaceURI.toJsFn, getNextSibling = getNextSibling.toJsFn, getNodeName = getNodeName.toJsFn, getNodeType = getNodeType.toJsFn, getNodeValue = getNodeValue.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPrefix = getPrefix.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getTagName = getTagName.toJsFn, hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = hasAttributes.toJsFn, hasChildNodes = hasChildNodes.toJsFn, insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = normalize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAttribute = js.Any.fromFunction1((t0: String) => removeAttribute(t0).runNow()), removeAttributeNS = js.Any.fromFunction2((t0: String, t1: String) => (removeAttributeNS(t0, t1)).runNow()), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setAttribute(t0, t1)).runNow()), setAttributeNS = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (setAttributeNS(t0, t1, t2)).runNow()), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setNodeValue = js.Any.fromFunction1((t0: String) => setNodeValue(t0).runNow()), setPrefix = js.Any.fromFunction1((t0: String) => setPrefix(t0).runNow()))
    __obj.asInstanceOf[XElement]
  }
  
  extension [Self <: XElement](x: Self) {
    
    inline def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetAttributeNS(value: (String, String) => String): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
    
    inline def setGetAttributeNode(value: String => XAttr): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
    
    inline def setGetAttributeNodeNS(value: (String, String) => XAttr): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction2(value))
    
    inline def setGetElementsByTagName(value: String => XNodeList): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    
    inline def setGetElementsByTagNameNS(value: (String, String) => XNodeList): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    inline def setGetTagName(value: CallbackTo[String]): Self = StObject.set(x, "getTagName", value.toJsFn)
    
    inline def setHasAttribute(value: String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
    
    inline def setHasAttributeNS(value: (String, String) => Boolean): Self = StObject.set(x, "hasAttributeNS", js.Any.fromFunction2(value))
    
    inline def setRemoveAttribute(value: String => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveAttributeNS(value: (String, String) => Callback): Self = StObject.set(x, "removeAttributeNS", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRemoveAttributeNode(value: XAttr => XAttr): Self = StObject.set(x, "removeAttributeNode", js.Any.fromFunction1(value))
    
    inline def setSetAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetAttributeNS(value: (String, String, String) => Callback): Self = StObject.set(x, "setAttributeNS", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetAttributeNode(value: XAttr => XAttr): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
    
    inline def setSetAttributeNodeNS(value: XAttr => XAttr): Self = StObject.set(x, "setAttributeNodeNS", js.Any.fromFunction1(value))
    
    inline def setTagName(value: String): Self = StObject.set(x, "TagName", value.asInstanceOf[js.Any])
  }
}
