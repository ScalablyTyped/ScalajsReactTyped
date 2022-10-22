package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOMNodeIterator extends StObject {
  
  def Detach(): Unit
  
  /* private */ @JSName("MSHTML.IDOMNodeIterator_typekey")
  var MSHTMLDotIDOMNodeIterator_typekey: IDOMNodeIterator
  
  val expandEntityReferences: Boolean
  
  val filter: Any
  
  def nextNode(): Any
  
  def previousNode(): Any
  
  val root: Any
  
  val whatToShow: Double
}
object IDOMNodeIterator {
  
  inline def apply(
    Detach: Callback,
    MSHTMLDotIDOMNodeIterator_typekey: IDOMNodeIterator,
    expandEntityReferences: Boolean,
    filter: Any,
    nextNode: CallbackTo[Any],
    previousNode: CallbackTo[Any],
    root: Any,
    whatToShow: Double
  ): IDOMNodeIterator = {
    val __obj = js.Dynamic.literal(Detach = Detach.toJsFn, expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], nextNode = nextNode.toJsFn, previousNode = previousNode.toJsFn, root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMNodeIterator_typekey")(MSHTMLDotIDOMNodeIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMNodeIterator]
  }
  
  extension [Self <: IDOMNodeIterator](x: Self) {
    
    inline def setDetach(value: Callback): Self = StObject.set(x, "Detach", value.toJsFn)
    
    inline def setExpandEntityReferences(value: Boolean): Self = StObject.set(x, "expandEntityReferences", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIDOMNodeIterator_typekey(value: IDOMNodeIterator): Self = StObject.set(x, "MSHTML.IDOMNodeIterator_typekey", value.asInstanceOf[js.Any])
    
    inline def setNextNode(value: CallbackTo[Any]): Self = StObject.set(x, "nextNode", value.toJsFn)
    
    inline def setPreviousNode(value: CallbackTo[Any]): Self = StObject.set(x, "previousNode", value.toJsFn)
    
    inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
