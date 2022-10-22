package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCharacterData
  extends StObject
     with XNode {
  
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  var Data: String
  
  /** The number of 16-bit units that are available through data and the substringData method below. */
  val Length: Double
  
  /**
    * Append the string to the end of the character data of the node. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is
    * readonly.
    */
  def appendData(arg: String): Unit
  
  /**
    * Remove a range of 16-bit units from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater
    * than the number of 16-bit units in data, or if the specified count is negative. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def deleteData(offset: Double, count: Double): Unit
  
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def getData(): String
  
  /** The number of 16-bit units that are available through data and the substringData method below. */
  def getLength(): Double
  
  /**
    * Insert a string at the specified 16-bit unit offset. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or
    * greater than the number of 16-bit units in data. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def insertData(offset: Double, arg: String): Unit
  
  /**
    * Replace the characters starting at the specified 16-bit unit offset with the specified string. Throws; {@link DOMException} - INDEX_SIZE_ERR: Raised
    * if the specified offset is negative or greater than the number of 16-bit units in data, or if the specified count is negative.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def replaceData(offset: Double, count: Double, arg: String): Unit
  
  /**
    * Set the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is
    * readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def setData(data: String): Unit
  
  /**
    * Extracts a range of data from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater than the
    * number of 16-bit units in data, or if the specified count is negative. DOMSTRING_SIZE_ERR: Raised if the specified range of text does not fit into a
    * DOMString.
    */
  def subStringData(offset: Double, count: Double): String
}
object XCharacterData {
  
  inline def apply(
    Attributes: XNamedNodeMap,
    ChildNodes: XNodeList,
    Data: String,
    FirstChild: XNode,
    LastChild: XNode,
    Length: Double,
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
    appendData: String => Callback,
    cloneNode: Boolean => XNode,
    deleteData: (Double, Double) => Callback,
    getAttributes: CallbackTo[XNamedNodeMap],
    getChildNodes: CallbackTo[XNodeList],
    getData: CallbackTo[String],
    getFirstChild: CallbackTo[XNode],
    getLastChild: CallbackTo[XNode],
    getLength: CallbackTo[Double],
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
    insertData: (Double, String) => Callback,
    isSupported: (String, String) => Boolean,
    normalize: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeChild: XNode => XNode,
    replaceChild: (XNode, XNode) => XNode,
    replaceData: (Double, Double, String) => Callback,
    setData: String => Callback,
    setNodeValue: String => Callback,
    setPrefix: String => Callback,
    subStringData: (Double, Double) => String
  ): XCharacterData = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], ChildNodes = ChildNodes.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], FirstChild = FirstChild.asInstanceOf[js.Any], LastChild = LastChild.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], NextSibling = NextSibling.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], NodeValue = NodeValue.asInstanceOf[js.Any], OwnerDocument = OwnerDocument.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], PreviousSibling = PreviousSibling.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1((t0: String) => appendData(t0).runNow()), cloneNode = js.Any.fromFunction1(cloneNode), deleteData = js.Any.fromFunction2((t0: Double, t1: Double) => (deleteData(t0, t1)).runNow()), getAttributes = getAttributes.toJsFn, getChildNodes = getChildNodes.toJsFn, getData = getData.toJsFn, getFirstChild = getFirstChild.toJsFn, getLastChild = getLastChild.toJsFn, getLength = getLength.toJsFn, getLocalName = getLocalName.toJsFn, getNamespaceURI = getNamespaceURI.toJsFn, getNextSibling = getNextSibling.toJsFn, getNodeName = getNodeName.toJsFn, getNodeType = getNodeType.toJsFn, getNodeValue = getNodeValue.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPrefix = getPrefix.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, hasAttributes = hasAttributes.toJsFn, hasChildNodes = hasChildNodes.toJsFn, insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2((t0: Double, t1: String) => (insertData(t0, t1)).runNow()), isSupported = js.Any.fromFunction2(isSupported), normalize = normalize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (replaceData(t0, t1, t2)).runNow()), setData = js.Any.fromFunction1((t0: String) => setData(t0).runNow()), setNodeValue = js.Any.fromFunction1((t0: String) => setNodeValue(t0).runNow()), setPrefix = js.Any.fromFunction1((t0: String) => setPrefix(t0).runNow()), subStringData = js.Any.fromFunction2(subStringData))
    __obj.asInstanceOf[XCharacterData]
  }
  
  extension [Self <: XCharacterData](x: Self) {
    
    inline def setAppendData(value: String => Callback): Self = StObject.set(x, "appendData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDeleteData(value: (Double, Double) => Callback): Self = StObject.set(x, "deleteData", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setGetData(value: CallbackTo[String]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setInsertData(value: (Double, String) => Callback): Self = StObject.set(x, "insertData", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setReplaceData(value: (Double, Double, String) => Callback): Self = StObject.set(x, "replaceData", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetData(value: String => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSubStringData(value: (Double, Double) => String): Self = StObject.set(x, "subStringData", js.Any.fromFunction2(value))
  }
}
