package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The nodes of a document subtree and a position within them. */
trait TreeWalker extends StObject {
  
  /* standard dom */
  var currentNode: org.scalajs.dom.Node
  
  /* standard dom */
  val filter: org.scalajs.dom.NodeFilter | Null
  
  /* standard dom */
  def firstChild(): org.scalajs.dom.Node | Null
  
  /* standard dom */
  def lastChild(): org.scalajs.dom.Node | Null
  
  /* standard dom */
  def nextNode(): org.scalajs.dom.Node | Null
  
  /* standard dom */
  def nextSibling(): org.scalajs.dom.Node | Null
  
  /* standard dom */
  def parentNode(): org.scalajs.dom.Node | Null
  
  /* standard dom */
  def previousNode(): org.scalajs.dom.Node | Null
  
  /* standard dom */
  def previousSibling(): org.scalajs.dom.Node | Null
  
  /* standard dom */
  val root: org.scalajs.dom.Node
  
  /* standard dom */
  val whatToShow: Double
}
object TreeWalker {
  
  inline def apply(
    currentNode: org.scalajs.dom.Node,
    firstChild: CallbackTo[org.scalajs.dom.Node | Null],
    lastChild: CallbackTo[org.scalajs.dom.Node | Null],
    nextNode: CallbackTo[org.scalajs.dom.Node | Null],
    nextSibling: CallbackTo[org.scalajs.dom.Node | Null],
    parentNode: CallbackTo[org.scalajs.dom.Node | Null],
    previousNode: CallbackTo[org.scalajs.dom.Node | Null],
    previousSibling: CallbackTo[org.scalajs.dom.Node | Null],
    root: org.scalajs.dom.Node,
    whatToShow: Double
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], firstChild = firstChild.toJsFn, lastChild = lastChild.toJsFn, nextNode = nextNode.toJsFn, nextSibling = nextSibling.toJsFn, parentNode = parentNode.toJsFn, previousNode = previousNode.toJsFn, previousSibling = previousSibling.toJsFn, root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = null)
    __obj.asInstanceOf[TreeWalker]
  }
  
  extension [Self <: TreeWalker](x: Self) {
    
    inline def setCurrentNode(value: org.scalajs.dom.Node): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: org.scalajs.dom.NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFirstChild(value: CallbackTo[org.scalajs.dom.Node | Null]): Self = StObject.set(x, "firstChild", value.toJsFn)
    
    inline def setLastChild(value: CallbackTo[org.scalajs.dom.Node | Null]): Self = StObject.set(x, "lastChild", value.toJsFn)
    
    inline def setNextNode(value: CallbackTo[org.scalajs.dom.Node | Null]): Self = StObject.set(x, "nextNode", value.toJsFn)
    
    inline def setNextSibling(value: CallbackTo[org.scalajs.dom.Node | Null]): Self = StObject.set(x, "nextSibling", value.toJsFn)
    
    inline def setParentNode(value: CallbackTo[org.scalajs.dom.Node | Null]): Self = StObject.set(x, "parentNode", value.toJsFn)
    
    inline def setPreviousNode(value: CallbackTo[org.scalajs.dom.Node | Null]): Self = StObject.set(x, "previousNode", value.toJsFn)
    
    inline def setPreviousSibling(value: CallbackTo[org.scalajs.dom.Node | Null]): Self = StObject.set(x, "previousSibling", value.toJsFn)
    
    inline def setRoot(value: org.scalajs.dom.Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
