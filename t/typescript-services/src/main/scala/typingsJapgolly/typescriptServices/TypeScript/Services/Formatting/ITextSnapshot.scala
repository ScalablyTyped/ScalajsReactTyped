package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSnapshot extends js.Object {
  def getLineFromLineNumber(lineNumber: Double): ITextSnapshotLine
  def getLineFromPosition(position: Double): ITextSnapshotLine
  def getLineNumberFromPosition(position: Double): Double
  def getText(span: TextSpan): String
}

object ITextSnapshot {
  @scala.inline
  def apply(
    getLineFromLineNumber: Double => CallbackTo[ITextSnapshotLine],
    getLineFromPosition: Double => CallbackTo[ITextSnapshotLine],
    getLineNumberFromPosition: Double => CallbackTo[Double],
    getText: TextSpan => CallbackTo[String]
  ): ITextSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLineFromLineNumber")(js.Any.fromFunction1((t0: scala.Double) => getLineFromLineNumber(t0).runNow()))
    __obj.updateDynamic("getLineFromPosition")(js.Any.fromFunction1((t0: scala.Double) => getLineFromPosition(t0).runNow()))
    __obj.updateDynamic("getLineNumberFromPosition")(js.Any.fromFunction1((t0: scala.Double) => getLineNumberFromPosition(t0).runNow()))
    __obj.updateDynamic("getText")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.TextSpan) => getText(t0).runNow()))
    __obj.asInstanceOf[ITextSnapshot]
  }
}

