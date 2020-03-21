package typingsJapgolly.textBuffer.mod._Global_.TextBuffer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.textBuffer.ReadonlyPointCompare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a point in a buffer in row/column coordinates. */
trait Point extends js.Object {
  /** A zero-indexed number representing the column of the Point. */
  var column: Double
  // Properties
  /** A zero-indexed number representing the row of the Point. */
  var row: Double
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
  def freeze(): ReadonlyPointCompare
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
  @scala.inline
  def apply(
    column: Double,
    compare: PointCompatible => CallbackTo[Double],
    copy: CallbackTo[Point],
    freeze: CallbackTo[ReadonlyPointCompare],
    isEqual: PointCompatible => CallbackTo[Boolean],
    isGreaterThan: PointCompatible => CallbackTo[Boolean],
    isGreaterThanOrEqual: PointCompatible => CallbackTo[Boolean],
    isLessThan: PointCompatible => CallbackTo[Boolean],
    isLessThanOrEqual: PointCompatible => CallbackTo[Boolean],
    negate: CallbackTo[Point],
    row: Double,
    serialize: CallbackTo[js.Tuple2[Double, Double]],
    toArray: CallbackTo[js.Tuple2[Double, Double]],
    translate: PointCompatible => CallbackTo[Point],
    traverse: PointCompatible => CallbackTo[Point]
  ): Point = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.updateDynamic("compare")(js.Any.fromFunction1((t0: typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointCompatible) => compare(t0).runNow()))
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("freeze")(freeze.toJsFn)
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointCompatible) => isEqual(t0).runNow()))
    __obj.updateDynamic("isGreaterThan")(js.Any.fromFunction1((t0: typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointCompatible) => isGreaterThan(t0).runNow()))
    __obj.updateDynamic("isGreaterThanOrEqual")(js.Any.fromFunction1((t0: typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointCompatible) => isGreaterThanOrEqual(t0).runNow()))
    __obj.updateDynamic("isLessThan")(js.Any.fromFunction1((t0: typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointCompatible) => isLessThan(t0).runNow()))
    __obj.updateDynamic("isLessThanOrEqual")(js.Any.fromFunction1((t0: typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointCompatible) => isLessThanOrEqual(t0).runNow()))
    __obj.updateDynamic("negate")(negate.toJsFn)
    __obj.updateDynamic("serialize")(serialize.toJsFn)
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.updateDynamic("translate")(js.Any.fromFunction1((t0: typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointCompatible) => translate(t0).runNow()))
    __obj.updateDynamic("traverse")(js.Any.fromFunction1((t0: typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointCompatible) => traverse(t0).runNow()))
    __obj.asInstanceOf[Point]
  }
}

