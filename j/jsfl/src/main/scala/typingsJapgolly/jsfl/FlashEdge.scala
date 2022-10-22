package typingsJapgolly.jsfl

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashEdge extends StObject {
  
  var cubicSegmentIndex: Double
  
  def getControl(i: Double): FlashPoint
  
  def getHalfEdge(index: Double): FlashHalfEdge
  
  var id: Double
  
  var isLine: Boolean
  
  def setControl(index: Double, x: Double, y: Double): Unit
  
  def splitEdge(t: Double): Unit
  
  var stroke: FlashStroke
}
object FlashEdge {
  
  inline def apply(
    cubicSegmentIndex: Double,
    getControl: Double => FlashPoint,
    getHalfEdge: Double => FlashHalfEdge,
    id: Double,
    isLine: Boolean,
    setControl: (Double, Double, Double) => Callback,
    splitEdge: Double => Callback,
    stroke: FlashStroke
  ): FlashEdge = {
    val __obj = js.Dynamic.literal(cubicSegmentIndex = cubicSegmentIndex.asInstanceOf[js.Any], getControl = js.Any.fromFunction1(getControl), getHalfEdge = js.Any.fromFunction1(getHalfEdge), id = id.asInstanceOf[js.Any], isLine = isLine.asInstanceOf[js.Any], setControl = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setControl(t0, t1, t2)).runNow()), splitEdge = js.Any.fromFunction1((t0: Double) => splitEdge(t0).runNow()), stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashEdge]
  }
  
  extension [Self <: FlashEdge](x: Self) {
    
    inline def setCubicSegmentIndex(value: Double): Self = StObject.set(x, "cubicSegmentIndex", value.asInstanceOf[js.Any])
    
    inline def setGetControl(value: Double => FlashPoint): Self = StObject.set(x, "getControl", js.Any.fromFunction1(value))
    
    inline def setGetHalfEdge(value: Double => FlashHalfEdge): Self = StObject.set(x, "getHalfEdge", js.Any.fromFunction1(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsLine(value: Boolean): Self = StObject.set(x, "isLine", value.asInstanceOf[js.Any])
    
    inline def setSetControl(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setControl", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSplitEdge(value: Double => Callback): Self = StObject.set(x, "splitEdge", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStroke(value: FlashStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
