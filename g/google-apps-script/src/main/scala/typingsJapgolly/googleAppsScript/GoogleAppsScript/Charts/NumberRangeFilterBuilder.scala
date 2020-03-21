package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for number range filter controls.
  *
  * A number range filter is a slider with two thumbs that lets the user select ranges of numeric
  * values. Given a column of type number and matching options, this control filters out the rows
  * that don't match the range that was selected.
  *
  * For more details, see the Gviz
  * documentation.
  */
trait NumberRangeFilterBuilder extends js.Object {
  def setMaxValue(maxValue: Integer): NumberRangeFilterBuilder
  def setMinValue(minValue: Integer): NumberRangeFilterBuilder
  def setOrientation(orientation: Orientation): NumberRangeFilterBuilder
  def setShowRangeValues(showRangeValues: Boolean): NumberRangeFilterBuilder
  def setTicks(ticks: Integer): NumberRangeFilterBuilder
}

object NumberRangeFilterBuilder {
  @scala.inline
  def apply(
    setMaxValue: Integer => CallbackTo[NumberRangeFilterBuilder],
    setMinValue: Integer => CallbackTo[NumberRangeFilterBuilder],
    setOrientation: Orientation => CallbackTo[NumberRangeFilterBuilder],
    setShowRangeValues: Boolean => CallbackTo[NumberRangeFilterBuilder],
    setTicks: Integer => CallbackTo[NumberRangeFilterBuilder]
  ): NumberRangeFilterBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setMaxValue(t0).runNow()))
    __obj.updateDynamic("setMinValue")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setMinValue(t0).runNow()))
    __obj.updateDynamic("setOrientation")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.Orientation) => setOrientation(t0).runNow()))
    __obj.updateDynamic("setShowRangeValues")(js.Any.fromFunction1((t0: scala.Boolean) => setShowRangeValues(t0).runNow()))
    __obj.updateDynamic("setTicks")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setTicks(t0).runNow()))
    __obj.asInstanceOf[NumberRangeFilterBuilder]
  }
}

