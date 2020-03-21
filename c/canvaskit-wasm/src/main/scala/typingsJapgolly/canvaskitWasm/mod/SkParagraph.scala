package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkParagraph extends SkObject[SkParagraph] {
  def getGlyphPositionAtCoordinate(x: Double, y: Double): SkGlyphPosition
  def getHeight(): Double
  def getWordBoundary(index: Double): SkWordBoundary
  def layout(maxWidth: Double): Unit
}

object SkParagraph {
  @scala.inline
  def apply(
    delete: Callback,
    deleteAfter: Callback,
    getGlyphPositionAtCoordinate: (Double, Double) => CallbackTo[SkGlyphPosition],
    getHeight: CallbackTo[Double],
    getWordBoundary: Double => CallbackTo[SkWordBoundary],
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean],
    layout: Double => Callback
  ): SkParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("getGlyphPositionAtCoordinate")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getGlyphPositionAtCoordinate(t0, t1).runNow()))
    __obj.updateDynamic("getHeight")(getHeight.toJsFn)
    __obj.updateDynamic("getWordBoundary")(js.Any.fromFunction1((t0: scala.Double) => getWordBoundary(t0).runNow()))
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.updateDynamic("layout")(js.Any.fromFunction1((t0: scala.Double) => layout(t0).runNow()))
    __obj.asInstanceOf[SkParagraph]
  }
}

