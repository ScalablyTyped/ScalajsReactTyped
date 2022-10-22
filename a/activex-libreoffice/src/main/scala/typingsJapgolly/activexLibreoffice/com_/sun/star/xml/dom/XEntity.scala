package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEntity
  extends StObject
     with XNode {
  
  /** For unparsed entities, the name of the notation for the entity. */
  val NotationName: String
  
  /** The public identifier associated with the entity, if specified. */
  val PublicId: String
  
  /** The system identifier associated with the entity, if specified. */
  val SystemId: String
  
  /** For unparsed entities, the name of the notation for the entity. */
  def getNotationName(): String
  
  /** The public identifier associated with the entity, if specified. */
  def getPublicId(): String
  
  /** The system identifier associated with the entity, if specified. */
  def getSystemId(): String
}
object XEntity {
  
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
    NotationName: String,
    OwnerDocument: XDocument,
    ParentNode: XNode,
    Prefix: String,
    PreviousSibling: XNode,
    PublicId: String,
    SystemId: String,
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
    getNotationName: CallbackTo[String],
    getOwnerDocument: CallbackTo[XDocument],
    getParentNode: CallbackTo[XNode],
    getPrefix: CallbackTo[String],
    getPreviousSibling: CallbackTo[XNode],
    getPublicId: CallbackTo[String],
    getSystemId: CallbackTo[String],
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
  ): XEntity = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], NotationName = NotationName.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], PublicId = PublicId.asInstanceOf[js.Any], SystemId = SystemId.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = getAttributes.toJsFn, getChildNodes = getChildNodes.toJsFn, getFirstChild = getFirstChild.toJsFn, getLastChild = getLastChild.toJsFn, getLocalName = getLocalName.toJsFn, getNamespaceURI = getNamespaceURI.toJsFn, getNextSibling = getNextSibling.toJsFn, getNodeName = getNodeName.toJsFn, getNodeType = getNodeType.toJsFn, getNodeValue = getNodeValue.toJsFn, getNotationName = getNotationName.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPrefix = getPrefix.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getPublicId = getPublicId.toJsFn, getSystemId = getSystemId.toJsFn, hasAttributes = hasAttributes.toJsFn, hasChildNodes = hasChildNodes.toJsFn, insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = normalize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1((t0: String) => setNodeValue(t0).runNow()), setPrefix = js.Any.fromFunction1((t0: String) => setPrefix(t0).runNow()))
    __obj.asInstanceOf[XEntity]
  }
  
  extension [Self <: XEntity](x: Self) {
    
    inline def setGetNotationName(value: CallbackTo[String]): Self = StObject.set(x, "getNotationName", value.toJsFn)
    
    inline def setGetPublicId(value: CallbackTo[String]): Self = StObject.set(x, "getPublicId", value.toJsFn)
    
    inline def setGetSystemId(value: CallbackTo[String]): Self = StObject.set(x, "getSystemId", value.toJsFn)
    
    inline def setNotationName(value: String): Self = StObject.set(x, "NotationName", value.asInstanceOf[js.Any])
    
    inline def setPublicId(value: String): Self = StObject.set(x, "PublicId", value.asInstanceOf[js.Any])
    
    inline def setSystemId(value: String): Self = StObject.set(x, "SystemId", value.asInstanceOf[js.Any])
  }
}
