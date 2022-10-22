package typingsJapgolly.aceBuilds.mod.Ace

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  def clipRows(firstRow: Double, lastRow: Double): Range
  
  def collapseRows(): Range
  
  def compare(row: Double, column: Double): Double
  
  def compareEnd(row: Double, column: Double): Double
  
  def compareInside(row: Double, column: Double): Double
  
  def comparePoint(p: Point): Double
  
  def compareRange(range: Range): Double
  
  def compareStart(row: Double, column: Double): Double
  
  def contains(row: Double, column: Double): Boolean
  
  def containsRange(range: Range): Boolean
  
  var end: Point
  
  def extend(row: Double, column: Double): Range
  
  def inside(row: Double, column: Double): Boolean
  
  def insideEnd(row: Double, column: Double): Boolean
  
  def insideStart(row: Double, column: Double): Boolean
  
  def intersects(range: Range): Boolean
  
  def isEmpty(): Boolean
  
  def isEnd(row: Double, column: Double): Boolean
  
  def isEqual(range: Range): Boolean
  
  def isMultiLine(): Boolean
  
  def isStart(row: Double, column: Double): Boolean
  
  def moveBy(row: Double, column: Double): Unit
  
  def setEnd(row: Double, column: Double): Unit
  
  def setStart(row: Double, column: Double): Unit
  
  var start: Point
  
  def toScreenRange(session: EditSession): Range
}
object Range {
  
  inline def apply(
    clipRows: (Double, Double) => Range,
    collapseRows: CallbackTo[Range],
    compare: (Double, Double) => Double,
    compareEnd: (Double, Double) => Double,
    compareInside: (Double, Double) => Double,
    comparePoint: Point => Double,
    compareRange: Range => Double,
    compareStart: (Double, Double) => Double,
    contains: (Double, Double) => Boolean,
    containsRange: Range => Boolean,
    end: Point,
    extend: (Double, Double) => Range,
    inside: (Double, Double) => Boolean,
    insideEnd: (Double, Double) => Boolean,
    insideStart: (Double, Double) => Boolean,
    intersects: Range => Boolean,
    isEmpty: CallbackTo[Boolean],
    isEnd: (Double, Double) => Boolean,
    isEqual: Range => Boolean,
    isMultiLine: CallbackTo[Boolean],
    isStart: (Double, Double) => Boolean,
    moveBy: (Double, Double) => Callback,
    setEnd: (Double, Double) => Callback,
    setStart: (Double, Double) => Callback,
    start: Point,
    toScreenRange: EditSession => Range
  ): Range = {
    val __obj = js.Dynamic.literal(clipRows = js.Any.fromFunction2(clipRows), collapseRows = collapseRows.toJsFn, compare = js.Any.fromFunction2(compare), compareEnd = js.Any.fromFunction2(compareEnd), compareInside = js.Any.fromFunction2(compareInside), comparePoint = js.Any.fromFunction1(comparePoint), compareRange = js.Any.fromFunction1(compareRange), compareStart = js.Any.fromFunction2(compareStart), contains = js.Any.fromFunction2(contains), containsRange = js.Any.fromFunction1(containsRange), end = end.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), inside = js.Any.fromFunction2(inside), insideEnd = js.Any.fromFunction2(insideEnd), insideStart = js.Any.fromFunction2(insideStart), intersects = js.Any.fromFunction1(intersects), isEmpty = isEmpty.toJsFn, isEnd = js.Any.fromFunction2(isEnd), isEqual = js.Any.fromFunction1(isEqual), isMultiLine = isMultiLine.toJsFn, isStart = js.Any.fromFunction2(isStart), moveBy = js.Any.fromFunction2((t0: Double, t1: Double) => (moveBy(t0, t1)).runNow()), setEnd = js.Any.fromFunction2((t0: Double, t1: Double) => (setEnd(t0, t1)).runNow()), setStart = js.Any.fromFunction2((t0: Double, t1: Double) => (setStart(t0, t1)).runNow()), start = start.asInstanceOf[js.Any], toScreenRange = js.Any.fromFunction1(toScreenRange))
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setClipRows(value: (Double, Double) => Range): Self = StObject.set(x, "clipRows", js.Any.fromFunction2(value))
    
    inline def setCollapseRows(value: CallbackTo[Range]): Self = StObject.set(x, "collapseRows", value.toJsFn)
    
    inline def setCompare(value: (Double, Double) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setCompareEnd(value: (Double, Double) => Double): Self = StObject.set(x, "compareEnd", js.Any.fromFunction2(value))
    
    inline def setCompareInside(value: (Double, Double) => Double): Self = StObject.set(x, "compareInside", js.Any.fromFunction2(value))
    
    inline def setComparePoint(value: Point => Double): Self = StObject.set(x, "comparePoint", js.Any.fromFunction1(value))
    
    inline def setCompareRange(value: Range => Double): Self = StObject.set(x, "compareRange", js.Any.fromFunction1(value))
    
    inline def setCompareStart(value: (Double, Double) => Double): Self = StObject.set(x, "compareStart", js.Any.fromFunction2(value))
    
    inline def setContains(value: (Double, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    inline def setContainsRange(value: Range => Boolean): Self = StObject.set(x, "containsRange", js.Any.fromFunction1(value))
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: (Double, Double) => Range): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    
    inline def setInside(value: (Double, Double) => Boolean): Self = StObject.set(x, "inside", js.Any.fromFunction2(value))
    
    inline def setInsideEnd(value: (Double, Double) => Boolean): Self = StObject.set(x, "insideEnd", js.Any.fromFunction2(value))
    
    inline def setInsideStart(value: (Double, Double) => Boolean): Self = StObject.set(x, "insideStart", js.Any.fromFunction2(value))
    
    inline def setIntersects(value: Range => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setIsEnd(value: (Double, Double) => Boolean): Self = StObject.set(x, "isEnd", js.Any.fromFunction2(value))
    
    inline def setIsEqual(value: Range => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setIsMultiLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMultiLine", value.toJsFn)
    
    inline def setIsStart(value: (Double, Double) => Boolean): Self = StObject.set(x, "isStart", js.Any.fromFunction2(value))
    
    inline def setMoveBy(value: (Double, Double) => Callback): Self = StObject.set(x, "moveBy", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetEnd(value: (Double, Double) => Callback): Self = StObject.set(x, "setEnd", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetStart(value: (Double, Double) => Callback): Self = StObject.set(x, "setStart", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setToScreenRange(value: EditSession => Range): Self = StObject.set(x, "toScreenRange", js.Any.fromFunction1(value))
  }
}
