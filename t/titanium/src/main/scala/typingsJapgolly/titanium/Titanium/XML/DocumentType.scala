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
		 * Each <Titanium.XML.Document> has a `doctype` attribute whose value is either 'null' or a <Titanium.XML.DocumentType> object.
		 */
trait DocumentType extends Proxy {
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
  			 * A <Titanium.XML.NamedNodeMap> containing the general entities, both external and internal, declared in the DTD. Parameter entities are not contained. Duplicates are discarded.
  			 */
  val entities: NamedNodeMap
  /**
  			 * This node's first child.
  			 */
  val firstChild: Node
  /**
  			 * The internal subset as a string.
  			 */
  val internalSubset: String
  /**
  			 * This node's last child.
  			 */
  val lastChild: Node
  /**
  			 * Local part of the qualified name of this node.
  			 */
  var localName: String
  /**
  			 * The name of DTD; i.e., the name immediately following the `DOCTYPE` keyword.
  			 */
  val name: String
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
  			 * A <Titanium.XML.NamedNodeMap> containing the notations declared in the DTD. Duplicates are discarded. Every node in this map also implements the <Titanium.XML.Notation> interface.
  			 */
  val notations: NamedNodeMap
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
  			 * The public identifier of the external subset.
  			 */
  val publicId: String
  /**
  			 * The system identifier of the external subset.
  			 */
  val systemId: String
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
  			 * Gets the value of the <Titanium.XML.DocumentType.attributes> property.
  			 */
  def getAttributes(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.entities> property.
  			 */
  def getEntities(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.internalSubset> property.
  			 */
  def getInternalSubset(): String
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.name> property.
  			 */
  def getName(): String
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.notations> property.
  			 */
  def getNotations(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.publicId> property.
  			 */
  def getPublicId(): String
  /**
  			 * Gets the value of the <Titanium.XML.DocumentType.systemId> property.
  			 */
  def getSystemId(): String
  /**
  			 * Returns `true` if this node has attributes.
  			 */
  def hasAttributes(): Boolean
  /**
  			 * Returns `true` if this node has child nodes.
  			 */
  def hasChildNodes(): Boolean
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

object DocumentType {
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
    entities: NamedNodeMap,
    fireEvent: (String, js.Any) => Callback,
    firstChild: Node,
    getApiName: CallbackTo[String],
    getAttributes: CallbackTo[NamedNodeMap],
    getBubbleParent: CallbackTo[Boolean],
    getEntities: CallbackTo[NamedNodeMap],
    getInternalSubset: CallbackTo[String],
    getName: CallbackTo[String],
    getNotations: CallbackTo[NamedNodeMap],
    getPublicId: CallbackTo[String],
    getSystemId: CallbackTo[String],
    hasAttributes: CallbackTo[Boolean],
    hasChildNodes: CallbackTo[Boolean],
    insertBefore: (Node, Node) => CallbackTo[Node],
    internalSubset: String,
    isSupported: (String, String) => CallbackTo[Boolean],
    lastChild: Node,
    localName: String,
    name: String,
    namespaceURI: String,
    nextSibling: Node,
    nodeName: String,
    nodeType: Double,
    nodeValue: String,
    normalize: Callback,
    notations: NamedNodeMap,
    ownerDocument: Document,
    parentNode: Node,
    prefix: String,
    previousSibling: Node,
    publicId: String,
    removeChild: Node => CallbackTo[Node],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    replaceChild: (Node, Node) => CallbackTo[Node],
    setBubbleParent: Boolean => Callback,
    systemId: String,
    text: String,
    textContent: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): DocumentType = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE.asInstanceOf[js.Any], CDATA_SECTION_NODE = CDATA_SECTION_NODE.asInstanceOf[js.Any], COMMENT_NODE = COMMENT_NODE.asInstanceOf[js.Any], DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any], DOCUMENT_NODE = DOCUMENT_NODE.asInstanceOf[js.Any], DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE.asInstanceOf[js.Any], ELEMENT_NODE = ELEMENT_NODE.asInstanceOf[js.Any], ENTITY_NODE = ENTITY_NODE.asInstanceOf[js.Any], ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE.asInstanceOf[js.Any], NOTATION_NODE = NOTATION_NODE.asInstanceOf[js.Any], PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any], TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], internalSubset = internalSubset.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], notations = notations.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.XML.Node) => appendChild(t0).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("cloneNode")(js.Any.fromFunction1((t0: scala.Boolean) => cloneNode(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getEntities")(getEntities.toJsFn)
    __obj.updateDynamic("getInternalSubset")(getInternalSubset.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getNotations")(getNotations.toJsFn)
    __obj.updateDynamic("getPublicId")(getPublicId.toJsFn)
    __obj.updateDynamic("getSystemId")(getSystemId.toJsFn)
    __obj.updateDynamic("hasAttributes")(hasAttributes.toJsFn)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes.toJsFn)
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
    __obj.asInstanceOf[DocumentType]
  }
}

