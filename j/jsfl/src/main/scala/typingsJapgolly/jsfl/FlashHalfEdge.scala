package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The HalfEdge object is the directed side of the edge of a Shape object.
  * An edge has two half edges. You can transverse the contours of a shape by "walking around"
  * these half edges. For example, starting from a half edge, you can trace all the half edges
  * around a contour of a shape, and return to the original half edge.  Half edges are ordered.
  * One half edge represents one side of the edge; the other half edge represents the other side.
  */
trait FlashHalfEdge extends StObject {
  
  def getEdge(): FlashEdge
  
  def getNext(): FlashHalfEdge
  
  def getOppositeHalfEdge(): FlashHalfEdge
  
  def getPrev(): FlashHalfEdge
  
  def getVertex(): FlashVertex
  
  var id: Double
  
  var index: Double
}
object FlashHalfEdge {
  
  inline def apply(
    getEdge: CallbackTo[FlashEdge],
    getNext: CallbackTo[FlashHalfEdge],
    getOppositeHalfEdge: CallbackTo[FlashHalfEdge],
    getPrev: CallbackTo[FlashHalfEdge],
    getVertex: CallbackTo[FlashVertex],
    id: Double,
    index: Double
  ): FlashHalfEdge = {
    val __obj = js.Dynamic.literal(getEdge = getEdge.toJsFn, getNext = getNext.toJsFn, getOppositeHalfEdge = getOppositeHalfEdge.toJsFn, getPrev = getPrev.toJsFn, getVertex = getVertex.toJsFn, id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashHalfEdge]
  }
  
  extension [Self <: FlashHalfEdge](x: Self) {
    
    inline def setGetEdge(value: CallbackTo[FlashEdge]): Self = StObject.set(x, "getEdge", value.toJsFn)
    
    inline def setGetNext(value: CallbackTo[FlashHalfEdge]): Self = StObject.set(x, "getNext", value.toJsFn)
    
    inline def setGetOppositeHalfEdge(value: CallbackTo[FlashHalfEdge]): Self = StObject.set(x, "getOppositeHalfEdge", value.toJsFn)
    
    inline def setGetPrev(value: CallbackTo[FlashHalfEdge]): Self = StObject.set(x, "getPrev", value.toJsFn)
    
    inline def setGetVertex(value: CallbackTo[FlashVertex]): Self = StObject.set(x, "getVertex", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
