package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDocumentType
  extends StObject
     with XNode {
  
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  val Entities: XNamedNodeMap
  
  /** The internal subset as a string, or null if there is none. */
  val InternalSubset: String
  
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  val Name: String
  
  /** A NamedNodeMap containing the notations declared in the DTD. */
  val Notations: XNamedNodeMap
  
  /** The public identifier of the external subset. */
  val PublicId: String
  
  /** The system identifier of the external subset. */
  val SystemId: String
  
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  def getEntities(): XNamedNodeMap
  
  /** The internal subset as a string, or null if there is none. */
  def getInternalSubset(): String
  
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  def getName(): String
  
  /** A NamedNodeMap containing the notations declared in the DTD. */
  def getNotations(): XNamedNodeMap
  
  /** The public identifier of the external subset. */
  def getPublicId(): String
  
  /** The system identifier of the external subset. */
  def getSystemId(): String
}
object XDocumentType {
  
  inline def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Entities: XNamedNodeMap,
    FirstChild: XNode,
    InternalSubset: String,
    LastChild: XNode,
    LocalName: String,
    Name: String,
    NamespaceURI: String,
    NextSibling: XNode,
    NodeName: String,
    NodeType: NodeType,
    NodeValue: String,
    Notations: XNamedNodeMap,
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
    getEntities: CallbackTo[XNamedNodeMap],
    getFirstChild: CallbackTo[XNode],
    getInternalSubset: CallbackTo[String],
    getLastChild: CallbackTo[XNode],
    getLocalName: CallbackTo[String],
    getName: CallbackTo[String],
    getNamespaceURI: CallbackTo[String],
    getNextSibling: CallbackTo[XNode],
    getNodeName: CallbackTo[String],
    getNodeType: CallbackTo[NodeType],
    getNodeValue: CallbackTo[String],
    getNotations: CallbackTo[XNamedNodeMap],
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
  ): XDocumentType = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], Entities = Entities.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], InternalSubset = InternalSubset.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], Notations = Notations.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], PublicId = PublicId.asInstanceOf[js.Any], SystemId = SystemId.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = getAttributes.toJsFn, getChildNodes = getChildNodes.toJsFn, getEntities = getEntities.toJsFn, getFirstChild = getFirstChild.toJsFn, getInternalSubset = getInternalSubset.toJsFn, getLastChild = getLastChild.toJsFn, getLocalName = getLocalName.toJsFn, getName = getName.toJsFn, getNamespaceURI = getNamespaceURI.toJsFn, getNextSibling = getNextSibling.toJsFn, getNodeName = getNodeName.toJsFn, getNodeType = getNodeType.toJsFn, getNodeValue = getNodeValue.toJsFn, getNotations = getNotations.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPrefix = getPrefix.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getPublicId = getPublicId.toJsFn, getSystemId = getSystemId.toJsFn, hasAttributes = hasAttributes.toJsFn, hasChildNodes = hasChildNodes.toJsFn, insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = normalize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1((t0: String) => setNodeValue(t0).runNow()), setPrefix = js.Any.fromFunction1((t0: String) => setPrefix(t0).runNow()))
    __obj.asInstanceOf[XDocumentType]
  }
  
  extension [Self <: XDocumentType](x: Self) {
    
    inline def setEntities(value: XNamedNodeMap): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setGetEntities(value: CallbackTo[XNamedNodeMap]): Self = StObject.set(x, "getEntities", value.toJsFn)
    
    inline def setGetInternalSubset(value: CallbackTo[String]): Self = StObject.set(x, "getInternalSubset", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetNotations(value: CallbackTo[XNamedNodeMap]): Self = StObject.set(x, "getNotations", value.toJsFn)
    
    inline def setGetPublicId(value: CallbackTo[String]): Self = StObject.set(x, "getPublicId", value.toJsFn)
    
    inline def setGetSystemId(value: CallbackTo[String]): Self = StObject.set(x, "getSystemId", value.toJsFn)
    
    inline def setInternalSubset(value: String): Self = StObject.set(x, "InternalSubset", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNotations(value: XNamedNodeMap): Self = StObject.set(x, "Notations", value.asInstanceOf[js.Any])
    
    inline def setPublicId(value: String): Self = StObject.set(x, "PublicId", value.asInstanceOf[js.Any])
    
    inline def setSystemId(value: String): Self = StObject.set(x, "SystemId", value.asInstanceOf[js.Any])
  }
}
