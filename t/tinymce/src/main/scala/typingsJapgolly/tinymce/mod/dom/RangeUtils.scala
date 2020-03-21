package typingsJapgolly.tinymce.mod.dom

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Range
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeUtils extends js.Object {
  def compareRanges(rng1: Range, rng2: Range): Boolean
  def getCaretRangeFromPoint(clientX: Double, clientY: Double, doc: Document_): Range
}

object RangeUtils {
  @scala.inline
  def apply(
    compareRanges: (Range, Range) => CallbackTo[Boolean],
    getCaretRangeFromPoint: (Double, Double, Document_) => CallbackTo[Range]
  ): RangeUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compareRanges")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Range, t1: org.scalajs.dom.raw.Range) => compareRanges(t0, t1).runNow()))
    __obj.updateDynamic("getCaretRangeFromPoint")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: typingsJapgolly.std.Document_) => getCaretRangeFromPoint(t0, t1, t2).runNow()))
    __obj.asInstanceOf[RangeUtils]
  }
}

