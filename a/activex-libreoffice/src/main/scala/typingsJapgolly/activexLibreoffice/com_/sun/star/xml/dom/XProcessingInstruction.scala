package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XProcessingInstruction
  extends StObject
     with XNode {
  
  /** The content of this processing instruction. */
  var Data: String
  
  /** The target of this processing instruction. */
  val Target: String
  
  /** The content of this processing instruction. */
  def getData(): String
  
  /** The target of this processing instruction. */
  def getTarget(): String
  
  /** The content of this processing instruction. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. */
  def setData(data: String): Unit
}
object XProcessingInstruction {
  
  inline def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Data: String,
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
    Target: String,
    acquire: Callback,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttributes: CallbackTo[XNamedNodeMap],
    getChildNodes: CallbackTo[XNodeList],
    getData: CallbackTo[String],
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
    getTarget: CallbackTo[String],
    hasAttributes: CallbackTo[Boolean],
    hasChildNodes: CallbackTo[Boolean],
    insertBefore: (XNode, XNode) => XNode,
    isSupported: (String, String) => Boolean,
    normalize: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    setData: String => Callback,
    setNodeValue: String => Callback,
    setPrefix: String => Callback
  ): XProcessingInstruction = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = getAttributes.toJsFn, getChildNodes = getChildNodes.toJsFn, getData = getData.toJsFn, getFirstChild = getFirstChild.toJsFn, getLastChild = getLastChild.toJsFn, getLocalName = getLocalName.toJsFn, getNamespaceURI = getNamespaceURI.toJsFn, getNextSibling = getNextSibling.toJsFn, getNodeName = getNodeName.toJsFn, getNodeType = getNodeType.toJsFn, getNodeValue = getNodeValue.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPrefix = getPrefix.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getTarget = getTarget.toJsFn, hasAttributes = hasAttributes.toJsFn, hasChildNodes = hasChildNodes.toJsFn, insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = normalize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setData = js.Any.fromFunction1((t0: String) => setData(t0).runNow()), setNodeValue = js.Any.fromFunction1((t0: String) => setNodeValue(t0).runNow()), setPrefix = js.Any.fromFunction1((t0: String) => setPrefix(t0).runNow()))
    __obj.asInstanceOf[XProcessingInstruction]
  }
  
  extension [Self <: XProcessingInstruction](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setGetData(value: CallbackTo[String]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetTarget(value: CallbackTo[String]): Self = StObject.set(x, "getTarget", value.toJsFn)
    
    inline def setSetData(value: String => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
