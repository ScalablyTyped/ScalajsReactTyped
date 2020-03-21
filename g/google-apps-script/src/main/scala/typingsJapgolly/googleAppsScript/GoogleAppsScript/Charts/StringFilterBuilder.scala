package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for string filter controls.
  *
  * A string filter is a simple text input field that lets the user filter data via string
  * matching. Given a column of type string and matching options, this control filters out the rows
  * that don't match the term that's in the input field.
  *
  * For more details, see the Gviz
  * documentation.
  */
trait StringFilterBuilder extends js.Object {
  def setCaseSensitive(caseSensitive: Boolean): StringFilterBuilder
  def setMatchType(matchType: MatchType): StringFilterBuilder
  def setRealtimeTrigger(realtimeTrigger: Boolean): StringFilterBuilder
}

object StringFilterBuilder {
  @scala.inline
  def apply(
    setCaseSensitive: Boolean => CallbackTo[StringFilterBuilder],
    setMatchType: MatchType => CallbackTo[StringFilterBuilder],
    setRealtimeTrigger: Boolean => CallbackTo[StringFilterBuilder]
  ): StringFilterBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setCaseSensitive")(js.Any.fromFunction1((t0: scala.Boolean) => setCaseSensitive(t0).runNow()))
    __obj.updateDynamic("setMatchType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.MatchType) => setMatchType(t0).runNow()))
    __obj.updateDynamic("setRealtimeTrigger")(js.Any.fromFunction1((t0: scala.Boolean) => setRealtimeTrigger(t0).runNow()))
    __obj.asInstanceOf[StringFilterBuilder]
  }
}

