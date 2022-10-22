package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGElementInstance extends StObject {
  
  /* private */ @JSName("MSHTML.SVGElementInstance_typekey")
  var MSHTMLDotSVGElementInstance_typekey: SVGElementInstance
  
  def addEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit
  
  val childNodes: ISVGElementInstanceList
  
  val correspondingElement: ISVGElement
  
  val correspondingUseElement: ISVGUseElement
  
  def dispatchEvent(evt: IDOMEvent): Boolean
  
  val firstChild: ISVGElementInstance
  
  val lastChild: ISVGElementInstance
  
  val nextSibling: ISVGElementInstance
  
  val parentNode: ISVGElementInstance
  
  val previousSibling: ISVGElementInstance
  
  def removeEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit
}
object SVGElementInstance {
  
  inline def apply(
    MSHTMLDotSVGElementInstance_typekey: SVGElementInstance,
    addEventListener: (String, Any, Boolean) => Callback,
    childNodes: ISVGElementInstanceList,
    correspondingElement: ISVGElement,
    correspondingUseElement: ISVGUseElement,
    dispatchEvent: IDOMEvent => Boolean,
    firstChild: ISVGElementInstance,
    lastChild: ISVGElementInstance,
    nextSibling: ISVGElementInstance,
    parentNode: ISVGElementInstance,
    previousSibling: ISVGElementInstance,
    removeEventListener: (String, Any, Boolean) => Callback
  ): SVGElementInstance = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (addEventListener(t0, t1, t2)).runNow()), childNodes = childNodes.asInstanceOf[js.Any], correspondingElement = correspondingElement.asInstanceOf[js.Any], correspondingUseElement = correspondingUseElement.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (removeEventListener(t0, t1, t2)).runNow()))
    __obj.updateDynamic("MSHTML.SVGElementInstance_typekey")(MSHTMLDotSVGElementInstance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstance]
  }
  
  extension [Self <: SVGElementInstance](x: Self) {
    
    inline def setAddEventListener(value: (String, Any, Boolean) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setChildNodes(value: ISVGElementInstanceList): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setCorrespondingElement(value: ISVGElement): Self = StObject.set(x, "correspondingElement", value.asInstanceOf[js.Any])
    
    inline def setCorrespondingUseElement(value: ISVGUseElement): Self = StObject.set(x, "correspondingUseElement", value.asInstanceOf[js.Any])
    
    inline def setDispatchEvent(value: IDOMEvent => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setFirstChild(value: ISVGElementInstance): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    inline def setLastChild(value: ISVGElementInstance): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGElementInstance_typekey(value: SVGElementInstance): Self = StObject.set(x, "MSHTML.SVGElementInstance_typekey", value.asInstanceOf[js.Any])
    
    inline def setNextSibling(value: ISVGElementInstance): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    inline def setParentNode(value: ISVGElementInstance): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setPreviousSibling(value: ISVGElementInstance): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, Any, Boolean) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
