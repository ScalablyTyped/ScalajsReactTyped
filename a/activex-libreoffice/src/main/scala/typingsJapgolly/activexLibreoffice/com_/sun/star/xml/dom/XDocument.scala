package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDocument
  extends StObject
     with XNode {
  
  /** The Document Type Declaration (see DocumentType) associated with this document. */
  val Doctype: XDocumentType
  
  /** This is a convenience attribute that allows direct access to the child node that is the root element of the document. */
  val DocumentElement: XElement
  
  /** The DOMImplementation object that handles this document. */
  val Implementation: XDOMImplementation
  
  /** Creates an Attr of the given name. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal character. */
  def createAttribute(name: String): XAttr
  
  /**
    * Creates an attribute of the given qualified name and namespace URI. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified
    * qualified name contains an illegal character, per the XML 1.0 specification . NAMESPACE_ERR: Raised if the qualifiedName is malformed per the
    * Namespaces in XML specification, if the qualifiedName has a prefix and the namespaceURI is null, if the qualifiedName has a prefix that is "xml" and
    * the namespaceURI is different from " http://www.w3.org/XML/1998/namespace", or if the qualifiedName, or its prefix, is "xmlns" and the namespaceURI is
    * different from " http://www.w3.org/2000/xmlns/". NOT_SUPPORTED_ERR: Always thrown if the current document does not support the "XML" feature, since
    * namespaces were defined by XML.
    */
  def createAttributeNS(namespaceURI: String, qualifiedName: String): XAttr
  
  /**
    * Creates a CDATASection node whose value is the specified string. Throws: {@link DOMException} - NOT_SUPPORTED_ERR: Raised if this document is an HTML
    * document.
    */
  def createCDATASection(data: String): XCDATASection
  
  /** Creates a Comment node given the specified string. */
  def createComment(data: String): XComment
  
  /** Creates an empty DocumentFragment object. */
  def createDocumentFragment(): XDocumentFragment
  
  /**
    * Creates an element of the type specified. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal
    * character.
    */
  def createElement(tagName: String): XElement
  
  /**
    * Creates an element of the given qualified name and namespace URI. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified
    * qualified name contains an illegal character, per the XML 1.0 specification . NAMESPACE_ERR: Raised if the qualifiedName is malformed per the
    * Namespaces in XML specification, if the qualifiedName has a prefix and the namespaceURI is null, or if the qualifiedName has a prefix that is "xml"
    * and the namespaceURI is different from " http://www.w3.org/XML/1998/namespace" . NOT_SUPPORTED_ERR: Always thrown if the current document does not
    * support the "XML" feature, since namespaces were defined by XML.
    */
  def createElementNS(namespaceURI: String, qualifiedName: String): XElement
  
  /**
    * Throws: {@link DOMException} - NOT_SUPPORTED_ERR: Raised if the type of node being imported is not supported. Creates an EntityReference object.
    * Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the specified name contains an illegal character. NOT_SUPPORTED_ERR: Raised if this
    * document is an HTML document.
    */
  def createEntityReference(name: String): XEntityReference
  
  /**
    * Creates a ProcessingInstruction node given the specified name and data strings. Throws: {@link DOMException} - INVALID_CHARACTER_ERR: Raised if the
    * specified target contains an illegal character. NOT_SUPPORTED_ERR: Raised if this document is an HTML document.
    */
  def createProcessingInstruction(target: String, data: String): XProcessingInstruction
  
  /** Creates a Text node given the specified string. */
  def createTextNode(data: String): XText
  
  /** The Document Type Declaration (see DocumentType) associated with this document. */
  def getDoctype(): XDocumentType
  
  /** This is a convenience attribute that allows direct access to the child node that is the root element of the document. */
  def getDocumentElement(): XElement
  
  /** Returns the Element whose ID is given by elementId. */
  def getElementById(elementId: String): XElement
  
  /** Returns a NodeList of all the Elements with a given tag name in the order in which they are encountered in a preorder traversal of the Document tree. */
  def getElementsByTagName(tagname: String): XNodeList
  
  /**
    * Returns a NodeList of all the Elements with a given local name and namespace URI in the order in which they are encountered in a preorder traversal of
    * the Document tree.
    */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): XNodeList
  
  /** The DOMImplementation object that handles this document. */
  def getImplementation(): XDOMImplementation
  
  /**
    * Imports a node from another document to this document. Throws: {@link DOMException} - NOT_SUPPORTED_ERR: Raised if the type of node being imported is
    * not supported.
    */
  def importNode(importedNode: XNode, deep: Boolean): XNode
}
object XDocument {
  
  inline def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Doctype: XDocumentType,
    DocumentElement: XElement,
    FirstChild: XNode,
    Implementation: XDOMImplementation,
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
    createAttribute: String => XAttr,
    createAttributeNS: (String, String) => XAttr,
    createCDATASection: String => XCDATASection,
    createComment: String => XComment,
    createDocumentFragment: CallbackTo[XDocumentFragment],
    createElement: String => XElement,
    createElementNS: (String, String) => XElement,
    createEntityReference: String => XEntityReference,
    createProcessingInstruction: (String, String) => XProcessingInstruction,
    createTextNode: String => XText,
    getAttributes: CallbackTo[XNamedNodeMap],
    getChildNodes: CallbackTo[XNodeList],
    getDoctype: CallbackTo[XDocumentType],
    getDocumentElement: CallbackTo[XElement],
    getElementById: String => XElement,
    getElementsByTagName: String => XNodeList,
    getElementsByTagNameNS: (String, String) => XNodeList,
    getFirstChild: CallbackTo[XNode],
    getImplementation: CallbackTo[XDOMImplementation],
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
    importNode: (XNode, Boolean) => XNode,
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setNodeValue: String => Callback,
    setPrefix: String => Callback
  ): XDocument = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], Doctype = Doctype.asInstanceOf[js.Any], DocumentElement = DocumentElement.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], Implementation = Implementation.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), createAttribute = js.Any.fromFunction1(createAttribute), createAttributeNS = js.Any.fromFunction2(createAttributeNS), createCDATASection = js.Any.fromFunction1(createCDATASection), createComment = js.Any.fromFunction1(createComment), createDocumentFragment = createDocumentFragment.toJsFn, createElement = js.Any.fromFunction1(createElement), createElementNS = js.Any.fromFunction2(createElementNS), createEntityReference = js.Any.fromFunction1(createEntityReference), createProcessingInstruction = js.Any.fromFunction2(createProcessingInstruction), createTextNode = js.Any.fromFunction1(createTextNode), getAttributes = getAttributes.toJsFn, getChildNodes = getChildNodes.toJsFn, getDoctype = getDoctype.toJsFn, getDocumentElement = getDocumentElement.toJsFn, getElementById = js.Any.fromFunction1(getElementById), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getFirstChild = getFirstChild.toJsFn, getImplementation = getImplementation.toJsFn, getLastChild = getLastChild.toJsFn, getLocalName = getLocalName.toJsFn, getNamespaceURI = getNamespaceURI.toJsFn, getNextSibling = getNextSibling.toJsFn, getNodeName = getNodeName.toJsFn, getNodeType = getNodeType.toJsFn, getNodeValue = getNodeValue.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPrefix = getPrefix.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, hasAttributes = hasAttributes.toJsFn, hasChildNodes = hasChildNodes.toJsFn, importNode = js.Any.fromFunction2(importNode), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = normalize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1((t0: String) => setNodeValue(t0).runNow()), setPrefix = js.Any.fromFunction1((t0: String) => setPrefix(t0).runNow()))
    __obj.asInstanceOf[XDocument]
  }
  
  extension [Self <: XDocument](x: Self) {
    
    inline def setCreateAttribute(value: String => XAttr): Self = StObject.set(x, "createAttribute", js.Any.fromFunction1(value))
    
    inline def setCreateAttributeNS(value: (String, String) => XAttr): Self = StObject.set(x, "createAttributeNS", js.Any.fromFunction2(value))
    
    inline def setCreateCDATASection(value: String => XCDATASection): Self = StObject.set(x, "createCDATASection", js.Any.fromFunction1(value))
    
    inline def setCreateComment(value: String => XComment): Self = StObject.set(x, "createComment", js.Any.fromFunction1(value))
    
    inline def setCreateDocumentFragment(value: CallbackTo[XDocumentFragment]): Self = StObject.set(x, "createDocumentFragment", value.toJsFn)
    
    inline def setCreateElement(value: String => XElement): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
    
    inline def setCreateElementNS(value: (String, String) => XElement): Self = StObject.set(x, "createElementNS", js.Any.fromFunction2(value))
    
    inline def setCreateEntityReference(value: String => XEntityReference): Self = StObject.set(x, "createEntityReference", js.Any.fromFunction1(value))
    
    inline def setCreateProcessingInstruction(value: (String, String) => XProcessingInstruction): Self = StObject.set(x, "createProcessingInstruction", js.Any.fromFunction2(value))
    
    inline def setCreateTextNode(value: String => XText): Self = StObject.set(x, "createTextNode", js.Any.fromFunction1(value))
    
    inline def setDoctype(value: XDocumentType): Self = StObject.set(x, "Doctype", value.asInstanceOf[js.Any])
    
    inline def setDocumentElement(value: XElement): Self = StObject.set(x, "DocumentElement", value.asInstanceOf[js.Any])
    
    inline def setGetDoctype(value: CallbackTo[XDocumentType]): Self = StObject.set(x, "getDoctype", value.toJsFn)
    
    inline def setGetDocumentElement(value: CallbackTo[XElement]): Self = StObject.set(x, "getDocumentElement", value.toJsFn)
    
    inline def setGetElementById(value: String => XElement): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
    
    inline def setGetElementsByTagName(value: String => XNodeList): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    
    inline def setGetElementsByTagNameNS(value: (String, String) => XNodeList): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    inline def setGetImplementation(value: CallbackTo[XDOMImplementation]): Self = StObject.set(x, "getImplementation", value.toJsFn)
    
    inline def setImplementation(value: XDOMImplementation): Self = StObject.set(x, "Implementation", value.asInstanceOf[js.Any])
    
    inline def setImportNode(value: (XNode, Boolean) => XNode): Self = StObject.set(x, "importNode", js.Any.fromFunction2(value))
  }
}
