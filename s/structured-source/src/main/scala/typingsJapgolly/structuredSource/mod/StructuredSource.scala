package typingsJapgolly.structuredSource.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredSource extends js.Object {
  def indexToPosition(index: Double): SourcePosition
  def locationToRange(loc: SourceLocation): js.Tuple2[Double, Double]
  def positionToIndex(pos: SourcePosition): Double
  def rangeToLocation(range: js.Tuple2[Double, Double]): SourceLocation
}

object StructuredSource {
  @scala.inline
  def apply(
    indexToPosition: Double => CallbackTo[SourcePosition],
    locationToRange: SourceLocation => CallbackTo[js.Tuple2[Double, Double]],
    positionToIndex: SourcePosition => CallbackTo[Double],
    rangeToLocation: js.Tuple2[Double, Double] => CallbackTo[SourceLocation]
  ): StructuredSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indexToPosition")(js.Any.fromFunction1((t0: scala.Double) => indexToPosition(t0).runNow()))
    __obj.updateDynamic("locationToRange")(js.Any.fromFunction1((t0: typingsJapgolly.structuredSource.mod.SourceLocation) => locationToRange(t0).runNow()))
    __obj.updateDynamic("positionToIndex")(js.Any.fromFunction1((t0: typingsJapgolly.structuredSource.mod.SourcePosition) => positionToIndex(t0).runNow()))
    __obj.updateDynamic("rangeToLocation")(js.Any.fromFunction1((t0: js.Tuple2[scala.Double, scala.Double]) => rangeToLocation(t0).runNow()))
    __obj.asInstanceOf[StructuredSource]
  }
}

