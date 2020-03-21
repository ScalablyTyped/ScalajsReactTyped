package typingsJapgolly.parse5.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeAdapter extends js.Object {
  /**
    * Copies attributes to the given element. Only attributes that are not yet present in the element are copied.
    *
    * @param recipient - Element to copy attributes into.
    * @param attrs - Attributes to copy.
    */
  def adoptAttributes(recipient: Element, attrs: js.Array[Attribute]): Unit
  /**
    * Appends a child node to the given parent node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    */
  def appendChild(parentNode: ParentNode, newNode: Node): Unit
  /**
    * Creates a comment node.
    *
    * @param data - Comment text.
    */
  def createCommentNode(data: String): CommentNode
  /**
    * Creates a document node.
    */
  def createDocument(): Document
  /**
    * Creates a document fragment node.
    */
  def createDocumentFragment(): DocumentFragment
  /**
    * Creates an element node.
    *
    * @param tagName - Tag name of the element.
    * @param namespaceURI - Namespace of the element.
    * @param attrs - Attribute name-value pair array. Foreign attributes may contain `namespace` and `prefix` fields as well.
    */
  def createElement(tagName: String, namespaceURI: String, attrs: js.Array[Attribute]): Element
  /**
    * Removes a node from its parent.
    *
    * @param node - Node to remove.
    */
  def detachNode(node: Node): Unit
  /**
    * Returns the given element's attributes in an array, in the form of name-value pairs.
    * Foreign attributes may contain `namespace` and `prefix` fields as well.
    *
    * @param element - Element.
    */
  def getAttrList(element: Element): js.Array[Attribute]
  /**
    * Returns the given node's children in an array.
    *
    * @param node - Node.
    */
  def getChildNodes(node: ParentNode): js.Array[Node]
  /**
    * Returns the given comment node's content.
    *
    * @param commentNode - Comment node.
    */
  def getCommentNodeContent(commentNode: CommentNode): String
  /**
    * Returns [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    *
    * @param document - Document node.
    */
  def getDocumentMode(document: Document): DocumentMode
  /**
    * Returns the given document type node's name.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodeName(doctypeNode: DocumentType): String
  /**
    * Returns the given document type node's public identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodePublicId(doctypeNode: DocumentType): String
  /**
    * Returns the given document type node's system identifier.
    *
    * @param doctypeNode - Document type node.
    */
  def getDocumentTypeNodeSystemId(doctypeNode: DocumentType): String
  /**
    * Returns the first child of the given node.
    *
    * @param node - Node.
    */
  def getFirstChild(node: ParentNode): Node
  /**
    * Returns the given element's namespace.
    *
    * @param element - Element.
    */
  def getNamespaceURI(element: Element): String
  /**
    * Returns the given node's parent.
    *
    * @param node - Node.
    */
  def getParentNode(node: ChildNode): ParentNode
  /**
    * Returns the given element's tag name.
    *
    * @param element - Element.
    */
  def getTagName(element: Element): String
  /**
    * Returns the `<template>` element content element.
    *
    * @param templateElement - `<template>` element.
    */
  def getTemplateContent(templateElement: Element): DocumentFragment
  /**
    * Returns the given text node's content.
    *
    * @param textNode - Text node.
    */
  def getTextNodeContent(textNode: TextNode): String
  /**
    * Inserts a child node to the given parent node before the given reference node.
    *
    * @param parentNode - Parent node.
    * @param newNode -  Child node.
    * @param referenceNode -  Reference node.
    */
  def insertBefore(parentNode: ParentNode, newNode: Node, referenceNode: Node): Unit
  /**
    * Inserts text into a node. If the last child of the node is a text node, the provided text will be appended to the
    * text node content. Otherwise, inserts a new text node with the given text.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    */
  def insertText(parentNode: ParentNode, text: String): Unit
  /**
    * Inserts text into a sibling node that goes before the reference node. If this sibling node is the text node,
    * the provided text will be appended to the text node content. Otherwise, inserts a new sibling text node with
    * the given text before the reference node.
    *
    * @param parentNode - Node to insert text into.
    * @param text - Text to insert.
    * @param referenceNode - Node to insert text before.
    */
  def insertTextBefore(parentNode: ParentNode, text: String, referenceNode: Node): Unit
  /**
    * Determines if the given node is a comment node.
    *
    * @param node - Node.
    */
  def isCommentNode(node: Node): Boolean
  /**
    * Determines if the given node is a document type node.
    *
    * @param node - Node.
    */
  def isDocumentTypeNode(node: Node): Boolean
  /**
    * Determines if the given node is an element.
    *
    * @param node - Node.
    */
  def isElementNode(node: Node): Boolean
  /**
    * Determines if the given node is a text node.
    *
    * @param node - Node.
    */
  def isTextNode(node: Node): Boolean
  /**
    * Sets the [document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    *
    * @param document - Document node.
    * @param mode - Document mode.
    */
  def setDocumentMode(document: Document, mode: DocumentMode): Unit
  /**
    * Sets the document type. If the `document` already contains a document type node, the `name`, `publicId` and `systemId`
    * properties of this node will be updated with the provided values. Otherwise, creates a new document type node
    * with the given properties and inserts it into the `document`.
    *
    * @param document - Document node.
    * @param name -  Document type name.
    * @param publicId - Document type public identifier.
    * @param systemId - Document type system identifier.
    */
  def setDocumentType(document: Document, name: String, publicId: String, systemId: String): Unit
  /**
    * Sets the `<template>` element content element.
    *
    * @param templateElement - `<template>` element.
    * @param contentElement -  Content element.
    */
  def setTemplateContent(templateElement: Element, contentElement: DocumentFragment): Unit
}

object TreeAdapter {
  @scala.inline
  def apply(
    adoptAttributes: (Element, js.Array[Attribute]) => Callback,
    appendChild: (ParentNode, Node) => Callback,
    createCommentNode: String => CallbackTo[CommentNode],
    createDocument: CallbackTo[Document],
    createDocumentFragment: CallbackTo[DocumentFragment],
    createElement: (String, String, js.Array[Attribute]) => CallbackTo[Element],
    detachNode: Node => Callback,
    getAttrList: Element => CallbackTo[js.Array[Attribute]],
    getChildNodes: ParentNode => CallbackTo[js.Array[Node]],
    getCommentNodeContent: CommentNode => CallbackTo[String],
    getDocumentMode: Document => CallbackTo[DocumentMode],
    getDocumentTypeNodeName: DocumentType => CallbackTo[String],
    getDocumentTypeNodePublicId: DocumentType => CallbackTo[String],
    getDocumentTypeNodeSystemId: DocumentType => CallbackTo[String],
    getFirstChild: ParentNode => CallbackTo[Node],
    getNamespaceURI: Element => CallbackTo[String],
    getParentNode: ChildNode => CallbackTo[ParentNode],
    getTagName: Element => CallbackTo[String],
    getTemplateContent: Element => CallbackTo[DocumentFragment],
    getTextNodeContent: TextNode => CallbackTo[String],
    insertBefore: (ParentNode, Node, Node) => Callback,
    insertText: (ParentNode, String) => Callback,
    insertTextBefore: (ParentNode, String, Node) => Callback,
    isCommentNode: Node => CallbackTo[Boolean],
    isDocumentTypeNode: Node => CallbackTo[Boolean],
    isElementNode: Node => CallbackTo[Boolean],
    isTextNode: Node => CallbackTo[Boolean],
    setDocumentMode: (Document, DocumentMode) => Callback,
    setDocumentType: (Document, String, String, String) => Callback,
    setTemplateContent: (Element, DocumentFragment) => Callback
  ): TreeAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adoptAttributes")(js.Any.fromFunction2((t0: typingsJapgolly.parse5.mod.Element, t1: js.Array[typingsJapgolly.parse5.mod.Attribute]) => adoptAttributes(t0, t1).runNow()))
    __obj.updateDynamic("appendChild")(js.Any.fromFunction2((t0: typingsJapgolly.parse5.mod.ParentNode, t1: typingsJapgolly.parse5.mod.Node) => appendChild(t0, t1).runNow()))
    __obj.updateDynamic("createCommentNode")(js.Any.fromFunction1((t0: java.lang.String) => createCommentNode(t0).runNow()))
    __obj.updateDynamic("createDocument")(createDocument.toJsFn)
    __obj.updateDynamic("createDocumentFragment")(createDocumentFragment.toJsFn)
    __obj.updateDynamic("createElement")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Array[typingsJapgolly.parse5.mod.Attribute]) => createElement(t0, t1, t2).runNow()))
    __obj.updateDynamic("detachNode")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Node) => detachNode(t0).runNow()))
    __obj.updateDynamic("getAttrList")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Element) => getAttrList(t0).runNow()))
    __obj.updateDynamic("getChildNodes")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.ParentNode) => getChildNodes(t0).runNow()))
    __obj.updateDynamic("getCommentNodeContent")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.CommentNode) => getCommentNodeContent(t0).runNow()))
    __obj.updateDynamic("getDocumentMode")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Document) => getDocumentMode(t0).runNow()))
    __obj.updateDynamic("getDocumentTypeNodeName")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.DocumentType) => getDocumentTypeNodeName(t0).runNow()))
    __obj.updateDynamic("getDocumentTypeNodePublicId")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.DocumentType) => getDocumentTypeNodePublicId(t0).runNow()))
    __obj.updateDynamic("getDocumentTypeNodeSystemId")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.DocumentType) => getDocumentTypeNodeSystemId(t0).runNow()))
    __obj.updateDynamic("getFirstChild")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.ParentNode) => getFirstChild(t0).runNow()))
    __obj.updateDynamic("getNamespaceURI")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Element) => getNamespaceURI(t0).runNow()))
    __obj.updateDynamic("getParentNode")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.ChildNode) => getParentNode(t0).runNow()))
    __obj.updateDynamic("getTagName")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Element) => getTagName(t0).runNow()))
    __obj.updateDynamic("getTemplateContent")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Element) => getTemplateContent(t0).runNow()))
    __obj.updateDynamic("getTextNodeContent")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.TextNode) => getTextNodeContent(t0).runNow()))
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction3((t0: typingsJapgolly.parse5.mod.ParentNode, t1: typingsJapgolly.parse5.mod.Node, t2: typingsJapgolly.parse5.mod.Node) => insertBefore(t0, t1, t2).runNow()))
    __obj.updateDynamic("insertText")(js.Any.fromFunction2((t0: typingsJapgolly.parse5.mod.ParentNode, t1: java.lang.String) => insertText(t0, t1).runNow()))
    __obj.updateDynamic("insertTextBefore")(js.Any.fromFunction3((t0: typingsJapgolly.parse5.mod.ParentNode, t1: java.lang.String, t2: typingsJapgolly.parse5.mod.Node) => insertTextBefore(t0, t1, t2).runNow()))
    __obj.updateDynamic("isCommentNode")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Node) => isCommentNode(t0).runNow()))
    __obj.updateDynamic("isDocumentTypeNode")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Node) => isDocumentTypeNode(t0).runNow()))
    __obj.updateDynamic("isElementNode")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Node) => isElementNode(t0).runNow()))
    __obj.updateDynamic("isTextNode")(js.Any.fromFunction1((t0: typingsJapgolly.parse5.mod.Node) => isTextNode(t0).runNow()))
    __obj.updateDynamic("setDocumentMode")(js.Any.fromFunction2((t0: typingsJapgolly.parse5.mod.Document, t1: typingsJapgolly.parse5.mod.DocumentMode) => setDocumentMode(t0, t1).runNow()))
    __obj.updateDynamic("setDocumentType")(js.Any.fromFunction4((t0: typingsJapgolly.parse5.mod.Document, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => setDocumentType(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setTemplateContent")(js.Any.fromFunction2((t0: typingsJapgolly.parse5.mod.Element, t1: typingsJapgolly.parse5.mod.DocumentFragment) => setTemplateContent(t0, t1).runNow()))
    __obj.asInstanceOf[TreeAdapter]
  }
}

