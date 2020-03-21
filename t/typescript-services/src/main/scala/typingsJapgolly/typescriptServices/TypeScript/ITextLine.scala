package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextLine extends js.Object {
  def end(): Double
  def endIncludingLineBreak(): Double
  def extent(): TextSpan
  def extentIncludingLineBreak(): TextSpan
  def lineNumber(): Double
  def start(): Double
}

object ITextLine {
  @scala.inline
  def apply(
    end: CallbackTo[Double],
    endIncludingLineBreak: CallbackTo[Double],
    extent: CallbackTo[TextSpan],
    extentIncludingLineBreak: CallbackTo[TextSpan],
    lineNumber: CallbackTo[Double],
    start: CallbackTo[Double]
  ): ITextLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("endIncludingLineBreak")(endIncludingLineBreak.toJsFn)
    __obj.updateDynamic("extent")(extent.toJsFn)
    __obj.updateDynamic("extentIncludingLineBreak")(extentIncludingLineBreak.toJsFn)
    __obj.updateDynamic("lineNumber")(lineNumber.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[ITextLine]
  }
}

