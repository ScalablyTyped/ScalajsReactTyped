package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access the current active selection in the active sheet. A selection is the set of cells the user
  * has highlighted in the sheet, which can be non-adjacent ranges. One cell in the selection is the
  * current cell, where the user's current focus is. The current cell is highlighted with a
  * darker border in the Google Sheets UI.
  *
  *     var activeSheet = SpreadsheetApp.getActiveSheet();
  *     var rangeList = activeSheet.getRangeList(['A1:B4', 'D1:E4']);
  *     rangeList.activate();
  *
  *     var selection = activeSheet.getSelection();
  *     // Current Cell: D1
  *     Logger.log('Current Cell: ' + selection.getCurrentCell().getA1Notation());
  *     // Active Range: D1:E4
  *     Logger.log('Active Range: ' + selection.getActiveRange().getA1Notation());
  *     // Active Ranges: A1:B4, D1:E4
  *     var ranges =  selection.getActiveRangeList().getRanges();
  *     for (var i = 0; i < ranges.length; i++) {
  *       Logger.log('Active Ranges: ' + ranges[i].getA1Notation());
  *     }
  *     Logger.log('Active Sheet: ' + selection.getActiveSheet().getName());
  */
trait Selection extends js.Object {
  def getActiveRange(): Range | Null
  def getActiveRangeList(): RangeList | Null
  def getActiveSheet(): Sheet
  def getCurrentCell(): Range | Null
  def getNextDataRange(direction: Direction): Range | Null
}

object Selection {
  @scala.inline
  def apply(
    getActiveRange: CallbackTo[Range | Null],
    getActiveRangeList: CallbackTo[RangeList | Null],
    getActiveSheet: CallbackTo[Sheet],
    getCurrentCell: CallbackTo[Range | Null],
    getNextDataRange: Direction => CallbackTo[Range | Null]
  ): Selection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActiveRange")(getActiveRange.toJsFn)
    __obj.updateDynamic("getActiveRangeList")(getActiveRangeList.toJsFn)
    __obj.updateDynamic("getActiveSheet")(getActiveSheet.toJsFn)
    __obj.updateDynamic("getCurrentCell")(getCurrentCell.toJsFn)
    __obj.updateDynamic("getNextDataRange")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction) => getNextDataRange(t0).runNow()))
    __obj.asInstanceOf[Selection]
  }
}

