package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Find or replace text within a range, sheet or spreadsheet. Can also specify search options.
  */
trait TextFinder extends js.Object {
  def findAll(): js.Array[Range]
  def findNext(): Range | Null
  def findPrevious(): Range | Null
  def getCurrentMatch(): Range | Null
  def ignoreDiacritics(ignoreDiacritics: Boolean): TextFinder
  def matchCase(matchCase: Boolean): TextFinder
  def matchEntireCell(matchEntireCell: Boolean): TextFinder
  def matchFormulaText(matchFormulaText: Boolean): TextFinder
  def replaceAllWith(replaceText: String): Integer
  def replaceWith(replaceText: String): Integer
  def startFrom(startRange: Range): TextFinder
  def useRegularExpression(useRegEx: Boolean): TextFinder
}

object TextFinder {
  @scala.inline
  def apply(
    findAll: CallbackTo[js.Array[Range]],
    findNext: CallbackTo[Range | Null],
    findPrevious: CallbackTo[Range | Null],
    getCurrentMatch: CallbackTo[Range | Null],
    ignoreDiacritics: Boolean => CallbackTo[TextFinder],
    matchCase: Boolean => CallbackTo[TextFinder],
    matchEntireCell: Boolean => CallbackTo[TextFinder],
    matchFormulaText: Boolean => CallbackTo[TextFinder],
    replaceAllWith: String => CallbackTo[Integer],
    replaceWith: String => CallbackTo[Integer],
    startFrom: Range => CallbackTo[TextFinder],
    useRegularExpression: Boolean => CallbackTo[TextFinder]
  ): TextFinder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findAll")(findAll.toJsFn)
    __obj.updateDynamic("findNext")(findNext.toJsFn)
    __obj.updateDynamic("findPrevious")(findPrevious.toJsFn)
    __obj.updateDynamic("getCurrentMatch")(getCurrentMatch.toJsFn)
    __obj.updateDynamic("ignoreDiacritics")(js.Any.fromFunction1((t0: scala.Boolean) => ignoreDiacritics(t0).runNow()))
    __obj.updateDynamic("matchCase")(js.Any.fromFunction1((t0: scala.Boolean) => matchCase(t0).runNow()))
    __obj.updateDynamic("matchEntireCell")(js.Any.fromFunction1((t0: scala.Boolean) => matchEntireCell(t0).runNow()))
    __obj.updateDynamic("matchFormulaText")(js.Any.fromFunction1((t0: scala.Boolean) => matchFormulaText(t0).runNow()))
    __obj.updateDynamic("replaceAllWith")(js.Any.fromFunction1((t0: java.lang.String) => replaceAllWith(t0).runNow()))
    __obj.updateDynamic("replaceWith")(js.Any.fromFunction1((t0: java.lang.String) => replaceWith(t0).runNow()))
    __obj.updateDynamic("startFrom")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Range) => startFrom(t0).runNow()))
    __obj.updateDynamic("useRegularExpression")(js.Any.fromFunction1((t0: scala.Boolean) => useRegularExpression(t0).runNow()))
    __obj.asInstanceOf[TextFinder]
  }
}

