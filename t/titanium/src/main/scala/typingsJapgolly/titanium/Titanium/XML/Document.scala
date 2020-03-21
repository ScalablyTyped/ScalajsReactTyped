package typingsJapgolly.titanium.Titanium.XML

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The DOM Document returned from <Titanium.XML.parseString>.
		 */
trait Document extends Proxy {
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Attr](Titanium.XML.Attr) node.
  			 */
  val ATTRIBUTE_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [CDATASection](Titanium.XML.CDATASection) node.
  			 */
  val CDATA_SECTION_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Comment](Titanium.XML.Comment) node.
  			 */
  val COMMENT_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentFragment](Titanium.XML.DocumentFragment) node.
  			 */
  val DOCUMENT_FRAGMENT_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Document](Titanium.XML.Document) node.
  			 */
  val DOCUMENT_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentType](Titanium.XML.DocumentType) node.
  			 */
  val DOCUMENT_TYPE_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Element](Titanium.XML.Element) node.
  			 */
  val ELEMENT_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Entity](Titanium.XML.Entity) node.
  			 */
  val ENTITY_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [EntityReference](Titanium.XML.EntityReference) node.
  			 */
  val ENTITY_REFERENCE_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Notation](Titanium.XML.Notation) node.
  			 */
  val NOTATION_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [ProcessingInstruction](Titanium.XML.ProcessingInstruction) node.
  			 */
  val PROCESSING_INSTRUCTION_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Text](Titanium.XML.Text) node.
  			 */
  val TEXT_NODE: Double
  /**
  			 * A map of this node's attributes.
  			 */
  val attributes: NamedNodeMap
  /**
  			 * A <Titanium.XML.NodeList> of this node's children.
  			 */
  val childNodes: NodeList
  /**
  			 * An interface to the list of entities that are defined for the document, such as via a Document Type Definition (DTD).
  			 */
  val doctype: DocumentType
  /**
  			 * Root element of this document.
  			 */
  val documentElement: Element
  /**
  			 * This node's first child.
  			 */
  val firstChild: Node
  /**
  			 * [DOMImplementation](Titanium.XML.DOMImplementation) object associated with this
  			 * document.
  			 */
  val implementation: DOMImplementation
  /**
  			 * This node's last child.
  			 */
  val lastChild: Node
  /**
  			 * Local part of the qualified name of this node.
  			 */
  var localName: String
  /**
  			 * Namespace URI of this node.
  			 */
  val namespaceURI: String
  /**
  			 * This node's next sibling.
  			 */
  val nextSibling: Node
  /**
  			 * Name of this node.
  			 */
  val nodeName: String
  /**
  			 * This node's type. One of `ELEMENT_NODE`, `ATTRIBUTE_NODE`, `TEXT_NODE`, `CDATA_SECTION_NODE`,
  			 * `ENTITY_REFERENCE_NODE`, `ENTITY_NODE`, `PROCESSING_INSTRUCTION_NODE`, `COMMENT_NODE`,
  			 * `DOCUMENT_NODE`, `DOCUMENT_TYPE_NODE`, `DOCUMENT_FRAGMENT_NODE`, `NOTATION_NODE`.
  			 */
  val nodeType: Double
  /**
  			 * Content (value) of this node.
  			 */
  var nodeValue: String
  /**
  			 * This node's owning document.
  			 */
  val ownerDocument: Document
  /**
  			 * This node's parent node.
  			 */
  val parentNode: Node
  /**
  			 * Namespace prefix of this node.
  			 */
  var prefix: String
  /**
  			 * This node's previous sibling.
  			 */
  val previousSibling: Node
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val text: String
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val textContent: String
  /**
  			 * Appends the node `newChild` as a child of this node.
  			 */
  def appendChild(newChild: Node): Node
  /**
  			 * Returns a duplicate of this node.
  			 */
  def cloneNode(deep: Boolean): Node
  /**
  			 * Creates an attribute with the given name.
  			 */
  def createAttribute(name: String): Attr
  /**
  			 * Creates an attribute with the given name and namespace.
  			 */
  def createAttributeNS(namespaceURI: String, name: String): Attr
  /**
  			 * Creates and returns a [CDATASection](Titanium.XML.CDATASection).
  			 */
  def createCDATASection(data: String): CDATASection
  /**
  			 * Creates a [Comment](Titanium.XML.Comment) with the supplied string data.
  			 */
  def createComment(data: String): Comment
  /**
  			 * Creates an empty [DocumentFragment](Titanium.XML.DocumentFragment).
  			 */
  def createDocumentFragment(): DocumentFragment
  /**
  			 * Creates an element with the given tag name.
  			 */
  def createElement(tagName: String): Element
  /**
  			 * Create a new element with the given namespace and name.
  			 */
  def createElementNS(namespaceURI: String, name: String): Element
  /**
  			 * Creates an [EntityReference](Titanium.XML.EntityReference) with the given name.
  			 */
  def createEntityReference(name: String): EntityReference
  /**
  			 * Creates a processing instruction for inserting into the DOM tree.
  			 */
  def createProcessingInstruction(target: String, data: String): ProcessingInstruction
  /**
  			 * Creates a text node.
  			 */
  def createTextNode(data: String): Text
  /**
  			 * Gets the value of the <Titanium.XML.Document.attributes> property.
  			 */
  def getAttributes(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.Document.doctype> property.
  			 */
  def getDoctype(): DocumentType
  /**
  			 * Gets the value of the <Titanium.XML.Document.documentElement> property.
  			 */
  def getDocumentElement(): Element
  /**
  			 * Returns an [Element](Titanium.XML.Element) that has an ID attribute with the given value.
  			 */
  def getElementById(elementId: String): Element
  /**
  			 * Returns a node list of elements in the document which have the given tag.
  			 */
  def getElementsByTagName(tagname: String): NodeList
  /**
  			 * Returns a node list of elements in the document which belong to the given namespace and have the given tag name.
  			 */
  def getElementsByTagNameNS(namespaceURI: String, localname: String): NodeList
  /**
  			 * Gets the value of the <Titanium.XML.Document.implementation> property.
  			 */
  def getImplementation(): DOMImplementation
  /**
  			 * Returns `true` if this node has attributes.
  			 */
  def hasAttributes(): Boolean
  /**
  			 * Returns `true` if this node has child nodes.
  			 */
  def hasChildNodes(): Boolean
  /**
  			 * Imports a node from another document to this document,
  			 * without altering or removing the source node from the original document.
  			 */
  def importNode(importedNode: Node, deep: Boolean): Node
  /**
  			 * Inserts the node `newChild` before the node `refChild`.
  			 */
  def insertBefore(newChild: Node, refChild: Node): Node
  /**
  			 * Tests whether the DOM implementation supports a specific feature.
  			 */
  def isSupported(feature: String, version: String): Boolean
  /**
  			 * Normalizes text and attribute nodes in this node's child hierarchy.
  			 */
  def normalize(): Unit
  /**
  			 * Removes a child node from this node.
  			 */
  def removeChild(oldChild: Node): Node
  /**
  			 * Replaces the node `oldChild` with the node `newChild`.
  			 */
  def replaceChild(newChild: Node, oldChild: Node): Node
}

object Document {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: Double,
    CDATA_SECTION_NODE: Double,
    COMMENT_NODE: Double,
    DOCUMENT_FRAGMENT_NODE: Double,
    DOCUMENT_NODE: Double,
    DOCUMENT_TYPE_NODE: Double,
    ELEMENT_NODE: Double,
    ENTITY_NODE: Double,
    ENTITY_REFERENCE_NODE: Double,
    NOTATION_NODE: Double,
    PROCESSING_INSTRUCTION_NODE: Double,
    TEXT_NODE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    appendChild: Node => CallbackTo[Node],
    applyProperties: js.Any => Callback,
    attributes: NamedNodeMap,
    bubbleParent: Boolean,
    childNodes: NodeList,
    cloneNode: Boolean => CallbackTo[Node],
    createAttribute: String => CallbackTo[Attr],
    createAttributeNS: (String, String) => CallbackTo[Attr],
    createCDATASection: String => CallbackTo[CDATASection],
    createComment: String => CallbackTo[Comment],
    createDocumentFragment: CallbackTo[DocumentFragment],
    createElement: String => CallbackTo[Element],
    createElementNS: (String, String) => CallbackTo[Element],
    createEntityReference: String => CallbackTo[EntityReference],
    createProcessingInstruction: (String, String) => CallbackTo[ProcessingInstruction],
    createTextNode: String => CallbackTo[Text],
    doctype: DocumentType,
    documentElement: Element,
    fireEvent: (String, js.Any) => Callback,
    firstChild: Node,
    getApiName: CallbackTo[String],
    getAttributes: CallbackTo[NamedNodeMap],
    getBubbleParent: CallbackTo[Boolean],
    getDoctype: CallbackTo[DocumentType],
    getDocumentElement: CallbackTo[Element],
    getElementById: String => CallbackTo[Element],
    getElementsByTagName: String => CallbackTo[NodeList],
    getElementsByTagNameNS: (String, String) => CallbackTo[NodeList],
    getImplementation: CallbackTo[DOMImplementation],
    hasAttributes: CallbackTo[Boolean],
    hasChildNodes: CallbackTo[Boolean],
    implementation: DOMImplementation,
    importNode: (Node, Boolean) => CallbackTo[Node],
    insertBefore: (Node, Node) => CallbackTo[Node],
    isSupported: (String, String) => CallbackTo[Boolean],
    lastChild: Node,
    localName: String,
    namespaceURI: String,
    nextSibling: Node,
    nodeName: String,
    nodeType: Double,
    nodeValue: String,
    normalize: Callback,
    ownerDocument: Document,
    parentNode: Node,
    prefix: String,
    previousSibling: Node,
    removeChild: Node => CallbackTo[Node],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    replaceChild: (Node, Node) => CallbackTo[Node],
    setBubbleParent: Boolean => Callback,
    text: String,
    textContent: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Document = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE.asInstanceOf[js.Any], CDATA_SECTION_NODE = CDATA_SECTION_NODE.asInstanceOf[js.Any], COMMENT_NODE = COMMENT_NODE.asInstanceOf[js.Any], DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any], DOCUMENT_NODE = DOCUMENT_NODE.asInstanceOf[js.Any], DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE.asInstanceOf[js.Any], ELEMENT_NODE = ELEMENT_NODE.asInstanceOf[js.Any], ENTITY_NODE = ENTITY_NODE.asInstanceOf[js.Any], ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE.asInstanceOf[js.Any], NOTATION_NODE = NOTATION_NODE.asInstanceOf[js.Any], PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any], TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], doctype = doctype.asInstanceOf[js.Any], documentElement = documentElement.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.XML.Node) => appendChild(t0).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("cloneNode")(js.Any.fromFunction1((t0: scala.Boolean) => cloneNode(t0).runNow()))
    __obj.updateDynamic("createAttribute")(js.Any.fromFunction1((t0: java.lang.String) => createAttribute(t0).runNow()))
    __obj.updateDynamic("createAttributeNS")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createAttributeNS(t0, t1).runNow()))
    __obj.updateDynamic("createCDATASection")(js.Any.fromFunction1((t0: java.lang.String) => createCDATASection(t0).runNow()))
    __obj.updateDynamic("createComment")(js.Any.fromFunction1((t0: java.lang.String) => createComment(t0).runNow()))
    __obj.updateDynamic("createDocumentFragment")(createDocumentFragment.toJsFn)
    __obj.updateDynamic("createElement")(js.Any.fromFunction1((t0: java.lang.String) => createElement(t0).runNow()))
    __obj.updateDynamic("createElementNS")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createElementNS(t0, t1).runNow()))
    __obj.updateDynamic("createEntityReference")(js.Any.fromFunction1((t0: java.lang.String) => createEntityReference(t0).runNow()))
    __obj.updateDynamic("createProcessingInstruction")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createProcessingInstruction(t0, t1).runNow()))
    __obj.updateDynamic("createTextNode")(js.Any.fromFunction1((t0: java.lang.String) => createTextNode(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDoctype")(getDoctype.toJsFn)
    __obj.updateDynamic("getDocumentElement")(getDocumentElement.toJsFn)
    __obj.updateDynamic("getElementById")(js.Any.fromFunction1((t0: java.lang.String) => getElementById(t0).runNow()))
    __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByTagName(t0).runNow()))
    __obj.updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getElementsByTagNameNS(t0, t1).runNow()))
    __obj.updateDynamic("getImplementation")(getImplementation.toJsFn)
    __obj.updateDynamic("hasAttributes")(hasAttributes.toJsFn)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes.toJsFn)
    __obj.updateDynamic("importNode")(js.Any.fromFunction2((t0: typingsJapgolly.titanium.Titanium.XML.Node, t1: scala.Boolean) => importNode(t0, t1).runNow()))
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: typingsJapgolly.titanium.Titanium.XML.Node, t1: typingsJapgolly.titanium.Titanium.XML.Node) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("isSupported")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => isSupported(t0, t1).runNow()))
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.updateDynamic("removeChild")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.XML.Node) => removeChild(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: typingsJapgolly.titanium.Titanium.XML.Node, t1: typingsJapgolly.titanium.Titanium.XML.Node) => replaceChild(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

