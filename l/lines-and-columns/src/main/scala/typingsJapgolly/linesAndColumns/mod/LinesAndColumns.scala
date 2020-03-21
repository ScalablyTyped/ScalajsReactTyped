package typingsJapgolly.linesAndColumns.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinesAndColumns extends js.Object {
  var offsets: js.Any
  var string: js.Any
  def indexForLocation(location: SourceLocation): Double | Null
  /* private */ def lengthOfLine(line: js.Any): js.Any
  def locationForIndex(index: Double): SourceLocation | Null
}

object LinesAndColumns {
  @scala.inline
  def apply(
    indexForLocation: SourceLocation => CallbackTo[Double | Null],
    lengthOfLine: js.Any => CallbackTo[js.Any],
    locationForIndex: Double => CallbackTo[SourceLocation | Null],
    offsets: js.Any,
    string: js.Any
  ): LinesAndColumns = {
    val __obj = js.Dynamic.literal(offsets = offsets.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("indexForLocation")(js.Any.fromFunction1((t0: typingsJapgolly.linesAndColumns.mod.SourceLocation) => indexForLocation(t0).runNow()))
    __obj.updateDynamic("lengthOfLine")(js.Any.fromFunction1((t0: js.Any) => lengthOfLine(t0).runNow()))
    __obj.updateDynamic("locationForIndex")(js.Any.fromFunction1((t0: scala.Double) => locationForIndex(t0).runNow()))
    __obj.asInstanceOf[LinesAndColumns]
  }
}

