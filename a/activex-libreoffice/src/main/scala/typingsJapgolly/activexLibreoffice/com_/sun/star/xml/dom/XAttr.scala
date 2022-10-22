package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAttr
  extends StObject
     with XNode {
  
  /** Returns the name of this attribute. */
  val Name: String
  
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  val OwnerElement: XElement
  
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  val Specified: Boolean
  
  /** On retrieval, the value of the attribute is returned as a string. */
  var Value: String
  
  /** Returns the name of this attribute. */
  def getName(): String
  
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  def getOwnerElement(): XElement
  
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  def getSpecified(): Boolean
  
  /** On retrieval, the value of the attribute is returned as a string. */
  def getValue(): String
  
  /** Sets the value of the attribute from a string. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. */
  def setValue(value: String): Unit
}
object XAttr {
  
  inline def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    FirstChild: XNode,
    LastChild: XNode,
    LocalName: String,
    Name: String,
    NamespaceURI: String,
    NextSibling: XNode,
    NodeName: String,
    NodeType: NodeType,
    NodeValue: String,
    OwnerDocument: XDocument,
    OwnerElement: XElement,
    ParentNode: XNode,
    Prefix: String,
    PreviousSibling: XNode,
    Specified: Boolean,
    Value: String,
    acquire: Callback,
    appendChild: XNode => XNode,
    cloneNode: Boolean => XNode,
    getAttributes: CallbackTo[XNamedNodeMap],
    getChildNodes: CallbackTo[XNodeList],
    getFirstChild: CallbackTo[XNode],
    getLastChild: CallbackTo[XNode],
    getLocalName: CallbackTo[String],
    getName: CallbackTo[String],
    getNamespaceURI: CallbackTo[String],
    getNextSibling: CallbackTo[XNode],
    getNodeName: CallbackTo[String],
    getNodeType: CallbackTo[NodeType],
    getNodeValue: CallbackTo[String],
    getOwnerDocument: CallbackTo[XDocument],
    getOwnerElement: CallbackTo[XElement],
    getParentNode: CallbackTo[XNode],
    getPrefix: CallbackTo[String],
    getPreviousSibling: CallbackTo[XNode],
    getSpecified: CallbackTo[Boolean],
    getValue: CallbackTo[String],
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
    setPrefix: String => Callback,
    setValue: String => Callback
  ): XAttr = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], OwnerElement = OwnerElement.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], Specified = Specified.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendChild = js.Any.fromFunction1(appendChild), cloneNode = js.Any.fromFunction1(cloneNode), getAttributes = getAttributes.toJsFn, getChildNodes = getChildNodes.toJsFn, getFirstChild = getFirstChild.toJsFn, getLastChild = getLastChild.toJsFn, getLocalName = getLocalName.toJsFn, getName = getName.toJsFn, getNamespaceURI = getNamespaceURI.toJsFn, getNextSibling = getNextSibling.toJsFn, getNodeName = getNodeName.toJsFn, getNodeType = getNodeType.toJsFn, getNodeValue = getNodeValue.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getOwnerElement = getOwnerElement.toJsFn, getParentNode = getParentNode.toJsFn, getPrefix = getPrefix.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getSpecified = getSpecified.toJsFn, getValue = getValue.toJsFn, hasAttributes = hasAttributes.toJsFn, hasChildNodes = hasChildNodes.toJsFn, insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), normalize = normalize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setNodeValue = js.Any.fromFunction1((t0: String) => setNodeValue(t0).runNow()), setPrefix = js.Any.fromFunction1((t0: String) => setPrefix(t0).runNow()), setValue = js.Any.fromFunction1((t0: String) => setValue(t0).runNow()))
    __obj.asInstanceOf[XAttr]
  }
  
  extension [Self <: XAttr](x: Self) {
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetOwnerElement(value: CallbackTo[XElement]): Self = StObject.set(x, "getOwnerElement", value.toJsFn)
    
    inline def setGetSpecified(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSpecified", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOwnerElement(value: XElement): Self = StObject.set(x, "OwnerElement", value.asInstanceOf[js.Any])
    
    inline def setSetValue(value: String => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSpecified(value: Boolean): Self = StObject.set(x, "Specified", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
