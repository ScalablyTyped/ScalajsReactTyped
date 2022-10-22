package typingsJapgolly.textBuffer.mod.global.TextBuffer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.textBuffer.anon.ReadonlyPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a point in a buffer in row/column coordinates. */
trait Point extends StObject {
  
  /** A zero-indexed number representing the column of the Point. */
  var column: Double
  
  // Comparison
  /**
    *  Compare another Point to this Point instance.
    *  Returns -1 if this point precedes the argument.
    *  Returns 0 if this point is equivalent to the argument.
    *  Returns 1 if this point follows the argument.
    */
  def compare(other: PointCompatible): Double
  
  // Construction
  /** Returns a new Point with the same row and column. */
  def copy(): Point
  
  // Operations
  /** Makes this point immutable and returns itself. */
  def freeze(): ReadonlyPoint
  
  /**
    *  Returns a boolean indicating whether this point has the same row and
    *  column as the given Point.
    */
  def isEqual(other: PointCompatible): Boolean
  
  /** Returns a Boolean indicating whether this point follows the given Point. */
  def isGreaterThan(other: PointCompatible): Boolean
  
  /**
    *  Returns a Boolean indicating whether this point follows or is equal to
    *  the given Point.
    */
  def isGreaterThanOrEqual(other: PointCompatible): Boolean
  
  /** Returns a Boolean indicating whether this point precedes the given Point. */
  def isLessThan(other: PointCompatible): Boolean
  
  /**
    *  Returns a Boolean indicating whether this point precedes or is equal to
    *  the given Point.
    */
  def isLessThanOrEqual(other: PointCompatible): Boolean
  
  /** Returns a new Point with the row and column negated. */
  def negate(): Point
  
  // Properties
  /** A zero-indexed number representing the row of the Point. */
  var row: Double
  
  /** Returns an array of this point's row and column. */
  def serialize(): js.Tuple2[Double, Double]
  
  /** Returns an array of this point's row and column. */
  def toArray(): js.Tuple2[Double, Double]
  
  /**
    *  Build and return a new point by adding the rows and columns of the
    *  given point.
    */
  def translate(other: PointCompatible): Point
  
  /**
    *  Build and return a new Point by traversing the rows and columns
    *  specified by the given point.
    */
  def traverse(other: PointCompatible): Point
}
object Point {
  
  inline def apply(
    column: Double,
    compare: PointCompatible => Double,
    copy: CallbackTo[Point],
    freeze: CallbackTo[ReadonlyPoint],
    isEqual: PointCompatible => Boolean,
    isGreaterThan: PointCompatible => Boolean,
    isGreaterThanOrEqual: PointCompatible => Boolean,
    isLessThan: PointCompatible => Boolean,
    isLessThanOrEqual: PointCompatible => Boolean,
    negate: CallbackTo[Point],
    row: Double,
    serialize: CallbackTo[js.Tuple2[Double, Double]],
    toArray: CallbackTo[js.Tuple2[Double, Double]],
    translate: PointCompatible => Point,
    traverse: PointCompatible => Point
  ): Point = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = copy.toJsFn, freeze = freeze.toJsFn, isEqual = js.Any.fromFunction1(isEqual), isGreaterThan = js.Any.fromFunction1(isGreaterThan), isGreaterThanOrEqual = js.Any.fromFunction1(isGreaterThanOrEqual), isLessThan = js.Any.fromFunction1(isLessThan), isLessThanOrEqual = js.Any.fromFunction1(isLessThanOrEqual), negate = negate.toJsFn, row = row.asInstanceOf[js.Any], serialize = serialize.toJsFn, toArray = toArray.toJsFn, translate = js.Any.fromFunction1(translate), traverse = js.Any.fromFunction1(traverse))
    __obj.asInstanceOf[Point]
  }
  
  extension [Self <: Point](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setCompare(value: PointCompatible => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
    
    inline def setCopy(value: CallbackTo[Point]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setFreeze(value: CallbackTo[ReadonlyPoint]): Self = StObject.set(x, "freeze", value.toJsFn)
    
    inline def setIsEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setIsGreaterThan(value: PointCompatible => Boolean): Self = StObject.set(x, "isGreaterThan", js.Any.fromFunction1(value))
    
    inline def setIsGreaterThanOrEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isGreaterThanOrEqual", js.Any.fromFunction1(value))
    
    inline def setIsLessThan(value: PointCompatible => Boolean): Self = StObject.set(x, "isLessThan", js.Any.fromFunction1(value))
    
    inline def setIsLessThanOrEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isLessThanOrEqual", js.Any.fromFunction1(value))
    
    inline def setNegate(value: CallbackTo[Point]): Self = StObject.set(x, "negate", value.toJsFn)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: CallbackTo[js.Tuple2[Double, Double]]): Self = StObject.set(x, "serialize", value.toJsFn)
    
    inline def setToArray(value: CallbackTo[js.Tuple2[Double, Double]]): Self = StObject.set(x, "toArray", value.toJsFn)
    
    inline def setTranslate(value: PointCompatible => Point): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
    
    inline def setTraverse(value: PointCompatible => Point): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
  }
}
