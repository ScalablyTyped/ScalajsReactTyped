package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The styles of text that apply to entire paragraphs.
  *
  * Read methods in this class return null if the corresponding TextRange spans
  * multiple paragraphs, and those paragraphs have different values for the read method being called.
  * To avoid this, query for paragraph styles using the TextRange returned by the Paragraph.getRange() method.
  */
trait ParagraphStyle extends js.Object {
  def getIndentEnd(): Double
  def getIndentFirstLine(): Double
  def getIndentStart(): Double
  def getLineSpacing(): Double
  def getParagraphAlignment(): ParagraphAlignment
  def getSpaceAbove(): Double
  def getSpaceBelow(): Double
  def getSpacingMode(): SpacingMode
  def getTextDirection(): TextDirection
  def setIndentEnd(indent: Double): ParagraphStyle
  def setIndentFirstLine(indent: Double): ParagraphStyle
  def setIndentStart(indent: Double): ParagraphStyle
  def setLineSpacing(spacing: Double): ParagraphStyle
  def setParagraphAlignment(alignment: ParagraphAlignment): ParagraphStyle
  def setSpaceAbove(space: Double): ParagraphStyle
  def setSpaceBelow(space: Double): ParagraphStyle
  def setSpacingMode(mode: SpacingMode): ParagraphStyle
  def setTextDirection(direction: TextDirection): ParagraphStyle
}

object ParagraphStyle {
  @scala.inline
  def apply(
    getIndentEnd: CallbackTo[Double],
    getIndentFirstLine: CallbackTo[Double],
    getIndentStart: CallbackTo[Double],
    getLineSpacing: CallbackTo[Double],
    getParagraphAlignment: CallbackTo[ParagraphAlignment],
    getSpaceAbove: CallbackTo[Double],
    getSpaceBelow: CallbackTo[Double],
    getSpacingMode: CallbackTo[SpacingMode],
    getTextDirection: CallbackTo[TextDirection],
    setIndentEnd: Double => CallbackTo[ParagraphStyle],
    setIndentFirstLine: Double => CallbackTo[ParagraphStyle],
    setIndentStart: Double => CallbackTo[ParagraphStyle],
    setLineSpacing: Double => CallbackTo[ParagraphStyle],
    setParagraphAlignment: ParagraphAlignment => CallbackTo[ParagraphStyle],
    setSpaceAbove: Double => CallbackTo[ParagraphStyle],
    setSpaceBelow: Double => CallbackTo[ParagraphStyle],
    setSpacingMode: SpacingMode => CallbackTo[ParagraphStyle],
    setTextDirection: TextDirection => CallbackTo[ParagraphStyle]
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIndentEnd")(getIndentEnd.toJsFn)
    __obj.updateDynamic("getIndentFirstLine")(getIndentFirstLine.toJsFn)
    __obj.updateDynamic("getIndentStart")(getIndentStart.toJsFn)
    __obj.updateDynamic("getLineSpacing")(getLineSpacing.toJsFn)
    __obj.updateDynamic("getParagraphAlignment")(getParagraphAlignment.toJsFn)
    __obj.updateDynamic("getSpaceAbove")(getSpaceAbove.toJsFn)
    __obj.updateDynamic("getSpaceBelow")(getSpaceBelow.toJsFn)
    __obj.updateDynamic("getSpacingMode")(getSpacingMode.toJsFn)
    __obj.updateDynamic("getTextDirection")(getTextDirection.toJsFn)
    __obj.updateDynamic("setIndentEnd")(js.Any.fromFunction1((t0: scala.Double) => setIndentEnd(t0).runNow()))
    __obj.updateDynamic("setIndentFirstLine")(js.Any.fromFunction1((t0: scala.Double) => setIndentFirstLine(t0).runNow()))
    __obj.updateDynamic("setIndentStart")(js.Any.fromFunction1((t0: scala.Double) => setIndentStart(t0).runNow()))
    __obj.updateDynamic("setLineSpacing")(js.Any.fromFunction1((t0: scala.Double) => setLineSpacing(t0).runNow()))
    __obj.updateDynamic("setParagraphAlignment")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ParagraphAlignment) => setParagraphAlignment(t0).runNow()))
    __obj.updateDynamic("setSpaceAbove")(js.Any.fromFunction1((t0: scala.Double) => setSpaceAbove(t0).runNow()))
    __obj.updateDynamic("setSpaceBelow")(js.Any.fromFunction1((t0: scala.Double) => setSpaceBelow(t0).runNow()))
    __obj.updateDynamic("setSpacingMode")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.SpacingMode) => setSpacingMode(t0).runNow()))
    __obj.updateDynamic("setTextDirection")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.TextDirection) => setTextDirection(t0).runNow()))
    __obj.asInstanceOf[ParagraphStyle]
  }
}

