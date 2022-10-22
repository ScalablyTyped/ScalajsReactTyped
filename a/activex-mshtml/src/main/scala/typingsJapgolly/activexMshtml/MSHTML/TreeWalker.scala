package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeWalker extends StObject {
  
  /* private */ @JSName("MSHTML.TreeWalker_typekey")
  var MSHTMLDotTreeWalker_typekey: TreeWalker
  
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
object TreeWalker {
  
  inline def apply(
    MSHTMLDotTreeWalker_typekey: TreeWalker,
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
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], firstChild = firstChild.toJsFn, lastChild = lastChild.toJsFn, nextNode = nextNode.toJsFn, nextSibling = nextSibling.toJsFn, parentNode = parentNode.toJsFn, previousNode = previousNode.toJsFn, previousSibling = previousSibling.toJsFn, root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.TreeWalker_typekey")(MSHTMLDotTreeWalker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalker]
  }
  
  extension [Self <: TreeWalker](x: Self) {
    
    inline def setCurrentNode(value: Any): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    inline def setExpandEntityReferences(value: Boolean): Self = StObject.set(x, "expandEntityReferences", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFirstChild(value: CallbackTo[Any]): Self = StObject.set(x, "firstChild", value.toJsFn)
    
    inline def setLastChild(value: CallbackTo[Any]): Self = StObject.set(x, "lastChild", value.toJsFn)
    
    inline def setMSHTMLDotTreeWalker_typekey(value: TreeWalker): Self = StObject.set(x, "MSHTML.TreeWalker_typekey", value.asInstanceOf[js.Any])
    
    inline def setNextNode(value: CallbackTo[Any]): Self = StObject.set(x, "nextNode", value.toJsFn)
    
    inline def setNextSibling(value: CallbackTo[Any]): Self = StObject.set(x, "nextSibling", value.toJsFn)
    
    inline def setParentNode(value: CallbackTo[Any]): Self = StObject.set(x, "parentNode", value.toJsFn)
    
    inline def setPreviousNode(value: CallbackTo[Any]): Self = StObject.set(x, "previousNode", value.toJsFn)
    
    inline def setPreviousSibling(value: CallbackTo[Any]): Self = StObject.set(x, "previousSibling", value.toJsFn)
    
    inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
