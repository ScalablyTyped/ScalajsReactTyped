package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOMTreeWalker extends StObject {
  
  /* private */ @JSName("MSHTML.IDOMTreeWalker_typekey")
  var MSHTMLDotIDOMTreeWalker_typekey: IDOMTreeWalker
  
  var currentNode: Any
  
  val expandEntityReferences: Boolean
  
  val filter: Any
  
  def firstChild(): Any
  
  def lastChild(): Any
  
  def nextNode(): Any
  
  def nextSibling(): Any
  
  def parentNode(): Any
  
  def previousNode(): Any
  
  def previousSibling(): Any
  
  val root: Any
  
  val whatToShow: Double
}
object IDOMTreeWalker {
  
  inline def apply(
    MSHTMLDotIDOMTreeWalker_typekey: IDOMTreeWalker,
    currentNode: Any,
    expandEntityReferences: Boolean,
    filter: Any,
    firstChild: CallbackTo[Any],
    lastChild: CallbackTo[Any],
    nextNode: CallbackTo[Any],
    nextSibling: CallbackTo[Any],
    parentNode: CallbackTo[Any],
    previousNode: CallbackTo[Any],
    previousSibling: CallbackTo[Any],
    root: Any,
    whatToShow: Double
  ): IDOMTreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], firstChild = firstChild.toJsFn, lastChild = lastChild.toJsFn, nextNode = nextNode.toJsFn, nextSibling = nextSibling.toJsFn, parentNode = parentNode.toJsFn, previousNode = previousNode.toJsFn, previousSibling = previousSibling.toJsFn, root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMTreeWalker_typekey")(MSHTMLDotIDOMTreeWalker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMTreeWalker]
  }
  
  extension [Self <: IDOMTreeWalker](x: Self) {
    
    inline def setCurrentNode(value: Any): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    inline def setExpandEntityReferences(value: Boolean): Self = StObject.set(x, "expandEntityReferences", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFirstChild(value: CallbackTo[Any]): Self = StObject.set(x, "firstChild", value.toJsFn)
    
    inline def setLastChild(value: CallbackTo[Any]): Self = StObject.set(x, "lastChild", value.toJsFn)
    
    inline def setMSHTMLDotIDOMTreeWalker_typekey(value: IDOMTreeWalker): Self = StObject.set(x, "MSHTML.IDOMTreeWalker_typekey", value.asInstanceOf[js.Any])
    
    inline def setNextNode(value: CallbackTo[Any]): Self = StObject.set(x, "nextNode", value.toJsFn)
    
    inline def setNextSibling(value: CallbackTo[Any]): Self = StObject.set(x, "nextSibling", value.toJsFn)
    
    inline def setParentNode(value: CallbackTo[Any]): Self = StObject.set(x, "parentNode", value.toJsFn)
    
    inline def setPreviousNode(value: CallbackTo[Any]): Self = StObject.set(x, "previousNode", value.toJsFn)
    
    inline def setPreviousSibling(value: CallbackTo[Any]): Self = StObject.set(x, "previousSibling", value.toJsFn)
    
    inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
