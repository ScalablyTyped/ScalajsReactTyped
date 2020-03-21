package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSnapshotLine extends js.Object {
  def end(): SnapshotPoint
  def endIncludingLineBreak(): SnapshotPoint
  def endIncludingLineBreakPosition(): Double
  def endPosition(): Double
  def getText(): String
  def length(): Double
  def lineNumber(): Double
  def snapshot(): ITextSnapshot
  def start(): SnapshotPoint
  def startPosition(): Double
}

object ITextSnapshotLine {
  @scala.inline
  def apply(
    end: CallbackTo[SnapshotPoint],
    endIncludingLineBreak: CallbackTo[SnapshotPoint],
    endIncludingLineBreakPosition: CallbackTo[Double],
    endPosition: CallbackTo[Double],
    getText: CallbackTo[String],
    length: CallbackTo[Double],
    lineNumber: CallbackTo[Double],
    snapshot: CallbackTo[ITextSnapshot],
    start: CallbackTo[SnapshotPoint],
    startPosition: CallbackTo[Double]
  ): ITextSnapshotLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("endIncludingLineBreak")(endIncludingLineBreak.toJsFn)
    __obj.updateDynamic("endIncludingLineBreakPosition")(endIncludingLineBreakPosition.toJsFn)
    __obj.updateDynamic("endPosition")(endPosition.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("length")(length.toJsFn)
    __obj.updateDynamic("lineNumber")(lineNumber.toJsFn)
    __obj.updateDynamic("snapshot")(snapshot.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("startPosition")(startPosition.toJsFn)
    __obj.asInstanceOf[ITextSnapshotLine]
  }
}

