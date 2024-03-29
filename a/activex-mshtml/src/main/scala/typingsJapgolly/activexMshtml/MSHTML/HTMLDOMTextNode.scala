package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLDOMTextNode extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLDOMTextNode_typekey")
  var MSHTMLDotHTMLDOMTextNode_typekey: HTMLDOMTextNode = js.native
  
  def addEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def appendData(bstrstring: String): Unit = js.native
  
  val attributes: Any = js.native
  
  val childNodes: Any = js.native
  
  def cloneNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def compareDocumentPosition(otherNode: IHTMLDOMNode): Double = js.native
  
  val constructor: Any = js.native
  
  var data: String = js.native
  
  def deleteData(offset: Double, Count: Double): Unit = js.native
  
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  
  val firstChild: IHTMLDOMNode = js.native
  
  def hasAttributes(): Boolean = js.native
  
  def hasChildNodes(): Boolean = js.native
  
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_deleteData(offset: Double, Count: Double): Unit = js.native
  
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: Any): IHTMLDOMNode = js.native
  
  def ie9_insertData(offset: Double, bstrstring: String): Unit = js.native
  
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_replaceData(offset: Double, Count: Double, bstrstring: String): Unit = js.native
  
  def ie9_splitText(offset: Double): IHTMLDOMNode = js.native
  
  def ie9_substringData(offset: Double, Count: Double): String = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: Any): IHTMLDOMNode = js.native
  
  def insertData(offset: Double, bstrstring: String): Unit = js.native
  
  def isDefaultNamespace(pvarNamespace: Any): Boolean = js.native
  
  def isEqualNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSameNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSupported(feature: String, version: Any): Boolean = js.native
  
  val lastChild: IHTMLDOMNode = js.native
  
  val length: Double = js.native
  
  val localName: Any = js.native
  
  def lookupNamespaceURI(pvarPrefix: Any): Any = js.native
  
  def lookupPrefix(pvarNamespaceURI: Any): Any = js.native
  
  val namespaceURI: Any = js.native
  
  val nextSibling: IHTMLDOMNode = js.native
  
  val nodeName: String = js.native
  
  val nodeType: Double = js.native
  
  var nodeValue: Any = js.native
  
  def normalize(): Unit = js.native
  
  val ownerDocument: Any = js.native
  
  val parentNode: IHTMLDOMNode = js.native
  
  var prefix: Any = js.native
  
  val previousSibling: IHTMLDOMNode = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def removeEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit = js.native
  
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceData(offset: Double, Count: Double, bstrstring: String): Unit = js.native
  
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceWholeText(bstrText: String): IHTMLDOMNode = js.native
  
  def splitText(offset: Double): IHTMLDOMNode = js.native
  
  def substringData(offset: Double, Count: Double): String = js.native
  
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  var textContent: Any = js.native
  
  val wholeText: String = js.native
}
