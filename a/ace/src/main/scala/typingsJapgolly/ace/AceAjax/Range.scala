package typingsJapgolly.ace.AceAjax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  /**
    * Returns the part of the current `Range` that occurs within the boundaries of `firstRow` and `lastRow` as a new `Range` object.
    * @param firstRow The starting row
    * @param lastRow The ending row
    **/
  def clipRows(firstRow: Double, lastRow: Double): Range
  
  /**
    * Returns a range containing the starting and ending rows of the original range, but with a column value of `0`.
    **/
  def collapseRows(): Range
  
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compare(row: Double, column: Double): Double
  
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compareEnd(row: Double, column: Double): Double
  
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compareInside(row: Double, column: Double): Double
  
  /**
    * Checks the row and column points of `p` with the row and column points of the calling range.
    * @param p A point to compare with
    **/
  def comparePoint(p: Range): Double
  
  /**
    * Compares `this` range (A) with another range (B).
    * @param range A range to compare with
    **/
  def compareRange(range: Range): Double
  
  /**
    * Checks the row and column points with the row and column points of the calling range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def compareStart(row: Double, column: Double): Double
  
  /**
    * Returns `true` if the `row` and `column` provided are within the given range. This can better be expressed as returning `true` if:
    * ```javascript
    * this.start.row <= row <= this.end.row &&
    * this.start.column <= column <= this.end.column
    * ```
    * @param row A row to check for
    * @param column A column to check for
    **/
  def contains(row: Double, column: Double): Boolean
  
  /**
    * Checks the start and end points of `range` and compares them to the calling range. Returns `true` if the `range` is contained within the caller's range.
    * @param range A range to compare with
    **/
  def containsRange(range: Range): Boolean
  
  var end: Position
  
  var endColumn: Double
  
  var endRow: Double
  
  /**
    * Changes the row and column points for the calling range for both the starting and ending points.
    * @param row A new row to extend to
    * @param column A new column to extend to
    **/
  def extend(row: Double, column: Double): Range
  
  /**
    * Creates and returns a new `Range` based on the row and column of the given parameters.
    * @param start A starting point to use
    * @param end An ending point to use
    **/
  def fromPoints(start: Range, end: Range): Range
  
  /**
    * Returns `true` if the `row` and `column` are within the given range.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def inside(row: Double, column: Double): Boolean
  
  /**
    * Returns `true` if the `row` and `column` are within the given range's ending points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def insideEnd(row: Double, column: Double): Boolean
  
  /**
    * Returns `true` if the `row` and `column` are within the given range's starting points.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def insideStart(row: Double, column: Double): Boolean
  
  /**
    * Returns `true` if passed in `range` intersects with the one calling this method.
    * @param range A range to compare with
    **/
  def intersects(range: Range): Boolean
  
  def isEmpty(): Boolean
  
  /**
    * Returns `true` if the caller's ending row point is the same as `row`, and if the caller's ending column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def isEnd(row: Double, column: Double): Boolean
  
  /**
    * Returns `true` if and only if the starting row and column, and ending row and column, are equivalent to those given by `range`.
    * @param range A range to check against
    **/
  def isEqual(range: Range): Unit
  
  /**
    * Returns `true` if the range spans across multiple lines.
    **/
  def isMultiLine(): Boolean
  
  /**
    * Returns `true` if the caller's starting row point is the same as `row`, and if the caller's starting column is the same as `column`.
    * @param row A row point to compare with
    * @param column A column point to compare with
    **/
  def isStart(row: Double, column: Double): Boolean
  
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  def setEnd(row: Double, column: Double): Unit
  
  /**
    * Sets the starting row and column for the range.
    * @param row A row point to set
    * @param column A column point to set
    **/
  def setStart(row: Double, column: Double): Unit
  
  var start: Position
  
  var startColumn: Double
  
  var startRow: Double
  
  /**
    * Given the current `Range`, this function converts those starting and ending points into screen positions, and then returns a new `Range` object.
    * @param session The `EditSession` to retrieve coordinates from
    **/
  def toScreenRange(session: IEditSession): Range
}
object Range {
  
  inline def apply(
    clipRows: (Double, Double) => Range,
    collapseRows: CallbackTo[Range],
    compare: (Double, Double) => Double,
    compareEnd: (Double, Double) => Double,
    compareInside: (Double, Double) => Double,
    comparePoint: Range => Double,
    compareRange: Range => Double,
    compareStart: (Double, Double) => Double,
    contains: (Double, Double) => Boolean,
    containsRange: Range => Boolean,
    end: Position,
    endColumn: Double,
    endRow: Double,
    extend: (Double, Double) => Range,
    fromPoints: (Range, Range) => Range,
    inside: (Double, Double) => Boolean,
    insideEnd: (Double, Double) => Boolean,
    insideStart: (Double, Double) => Boolean,
    intersects: Range => Boolean,
    isEmpty: CallbackTo[Boolean],
    isEnd: (Double, Double) => Boolean,
    isEqual: Range => Callback,
    isMultiLine: CallbackTo[Boolean],
    isStart: (Double, Double) => Boolean,
    setEnd: (Double, Double) => Callback,
    setStart: (Double, Double) => Callback,
    start: Position,
    startColumn: Double,
    startRow: Double,
    toScreenRange: IEditSession => Range
  ): Range = {
    val __obj = js.Dynamic.literal(clipRows = js.Any.fromFunction2(clipRows), collapseRows = collapseRows.toJsFn, compare = js.Any.fromFunction2(compare), compareEnd = js.Any.fromFunction2(compareEnd), compareInside = js.Any.fromFunction2(compareInside), comparePoint = js.Any.fromFunction1(comparePoint), compareRange = js.Any.fromFunction1(compareRange), compareStart = js.Any.fromFunction2(compareStart), contains = js.Any.fromFunction2(contains), containsRange = js.Any.fromFunction1(containsRange), end = end.asInstanceOf[js.Any], endColumn = endColumn.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), fromPoints = js.Any.fromFunction2(fromPoints), inside = js.Any.fromFunction2(inside), insideEnd = js.Any.fromFunction2(insideEnd), insideStart = js.Any.fromFunction2(insideStart), intersects = js.Any.fromFunction1(intersects), isEmpty = isEmpty.toJsFn, isEnd = js.Any.fromFunction2(isEnd), isEqual = js.Any.fromFunction1((t0: Range) => isEqual(t0).runNow()), isMultiLine = isMultiLine.toJsFn, isStart = js.Any.fromFunction2(isStart), setEnd = js.Any.fromFunction2((t0: Double, t1: Double) => (setEnd(t0, t1)).runNow()), setStart = js.Any.fromFunction2((t0: Double, t1: Double) => (setStart(t0, t1)).runNow()), start = start.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any], toScreenRange = js.Any.fromFunction1(toScreenRange))
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setClipRows(value: (Double, Double) => Range): Self = StObject.set(x, "clipRows", js.Any.fromFunction2(value))
    
    inline def setCollapseRows(value: CallbackTo[Range]): Self = StObject.set(x, "collapseRows", value.toJsFn)
    
    inline def setCompare(value: (Double, Double) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setCompareEnd(value: (Double, Double) => Double): Self = StObject.set(x, "compareEnd", js.Any.fromFunction2(value))
    
    inline def setCompareInside(value: (Double, Double) => Double): Self = StObject.set(x, "compareInside", js.Any.fromFunction2(value))
    
    inline def setComparePoint(value: Range => Double): Self = StObject.set(x, "comparePoint", js.Any.fromFunction1(value))
    
    inline def setCompareRange(value: Range => Double): Self = StObject.set(x, "compareRange", js.Any.fromFunction1(value))
    
    inline def setCompareStart(value: (Double, Double) => Double): Self = StObject.set(x, "compareStart", js.Any.fromFunction2(value))
    
    inline def setContains(value: (Double, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    inline def setContainsRange(value: Range => Boolean): Self = StObject.set(x, "containsRange", js.Any.fromFunction1(value))
    
    inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: (Double, Double) => Range): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    
    inline def setFromPoints(value: (Range, Range) => Range): Self = StObject.set(x, "fromPoints", js.Any.fromFunction2(value))
    
    inline def setInside(value: (Double, Double) => Boolean): Self = StObject.set(x, "inside", js.Any.fromFunction2(value))
    
    inline def setInsideEnd(value: (Double, Double) => Boolean): Self = StObject.set(x, "insideEnd", js.Any.fromFunction2(value))
    
    inline def setInsideStart(value: (Double, Double) => Boolean): Self = StObject.set(x, "insideStart", js.Any.fromFunction2(value))
    
    inline def setIntersects(value: Range => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setIsEnd(value: (Double, Double) => Boolean): Self = StObject.set(x, "isEnd", js.Any.fromFunction2(value))
    
    inline def setIsEqual(value: Range => Callback): Self = StObject.set(x, "isEqual", js.Any.fromFunction1((t0: Range) => value(t0).runNow()))
    
    inline def setIsMultiLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMultiLine", value.toJsFn)
    
    inline def setIsStart(value: (Double, Double) => Boolean): Self = StObject.set(x, "isStart", js.Any.fromFunction2(value))
    
    inline def setSetEnd(value: (Double, Double) => Callback): Self = StObject.set(x, "setEnd", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetStart(value: (Double, Double) => Callback): Self = StObject.set(x, "setStart", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    inline def setToScreenRange(value: IEditSession => Range): Self = StObject.set(x, "toScreenRange", js.Any.fromFunction1(value))
  }
}
