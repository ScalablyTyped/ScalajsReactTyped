package typingsJapgolly.textBuffer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.textBuffer.mod._Global_.TextBuffer.PointCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<text-buffer.text-buffer._Global_.TextBuffer.Point> */
trait ReadonlyPoint extends js.Object {
  val column: Double
  val row: Double
  def compare(other: PointCompatible): Double
  def copy(): this.type
  def freeze(): this.type
  def isEqual(other: PointCompatible): Boolean
  def isGreaterThan(other: PointCompatible): Boolean
  def isGreaterThanOrEqual(other: PointCompatible): Boolean
  def isLessThan(other: PointCompatible): Boolean
  def isLessThanOrEqual(other: PointCompatible): Boolean
  def negate(): this.type
  def serialize(): js.Tuple2[Double, Double]
  def toArray(): js.Tuple2[Double, Double]
  def translate(other: PointCompatible): this.type
  def traverse(other: PointCompatible): this.type
}

object ReadonlyPoint {
  @scala.inline
  def apply(
    column: Double,
    compare: PointCompatible => CallbackTo[Double],
    copy: CallbackTo[ReadonlyPoint],
    freeze: CallbackTo[ReadonlyPoint],
    isEqual: PointCompatible => CallbackTo[Boolean],
    isGreaterThan: PointCompatible => CallbackTo[Boolean],
    isGreaterThanOrEqual: PointCompatible => CallbackTo[Boolean],
    isLessThan: PointCompatible => CallbackTo[Boolean],
    isLessThanOrEqual: PointCompatible => CallbackTo[Boolean],
    negate: CallbackTo[ReadonlyPoint],
    row: Double,
    serialize: CallbackTo[js.Tuple2[Double, Double]],
    toArray: CallbackTo[js.Tuple2[Double, Double]],
    translate: PointCompatible => CallbackTo[ReadonlyPoint],
    traverse: PointCompatible => CallbackTo[ReadonlyPoint]
  ): ReadonlyPoint = {
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
    __obj.asInstanceOf[ReadonlyPoint]
  }
}

