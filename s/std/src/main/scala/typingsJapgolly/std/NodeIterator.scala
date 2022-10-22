package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
trait NodeIterator extends StObject {
  
  /** @deprecated */
  /* standard dom */
  def detach(): Unit
  
  /* standard dom */
  val filter: org.scalajs.dom.NodeFilter | Null
  
  /* standard dom */
  def nextNode(): org.scalajs.dom.Node | Null
  
  /* standard dom */
  val pointerBeforeReferenceNode: scala.Boolean
  
  /* standard dom */
  def previousNode(): org.scalajs.dom.Node | Null
  
  /* standard dom */
  val referenceNode: org.scalajs.dom.Node
  
  /* standard dom */
  val root: org.scalajs.dom.Node
  
  /* standard dom */
  val whatToShow: Double
}
object NodeIterator {
  
  inline def apply(
    detach: Callback,
    nextNode: CallbackTo[org.scalajs.dom.Node | Null],
    pointerBeforeReferenceNode: scala.Boolean,
    previousNode: CallbackTo[org.scalajs.dom.Node | Null],
    referenceNode: org.scalajs.dom.Node,
    root: org.scalajs.dom.Node,
    whatToShow: Double
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(detach = detach.toJsFn, nextNode = nextNode.toJsFn, pointerBeforeReferenceNode = pointerBeforeReferenceNode.asInstanceOf[js.Any], previousNode = previousNode.toJsFn, referenceNode = referenceNode.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = null)
    __obj.asInstanceOf[NodeIterator]
  }
  
  extension [Self <: NodeIterator](x: Self) {
    
    inline def setDetach(value: Callback): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setFilter(value: org.scalajs.dom.NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setNextNode(value: CallbackTo[org.scalajs.dom.Node | Null]): Self = StObject.set(x, "nextNode", value.toJsFn)
    
    inline def setPointerBeforeReferenceNode(value: scala.Boolean): Self = StObject.set(x, "pointerBeforeReferenceNode", value.asInstanceOf[js.Any])
    
    inline def setPreviousNode(value: CallbackTo[org.scalajs.dom.Node | Null]): Self = StObject.set(x, "previousNode", value.toJsFn)
    
    inline def setReferenceNode(value: org.scalajs.dom.Node): Self = StObject.set(x, "referenceNode", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: org.scalajs.dom.Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
