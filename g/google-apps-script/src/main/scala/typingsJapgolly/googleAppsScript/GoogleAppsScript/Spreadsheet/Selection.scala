package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Selection extends StObject {
  
  def getActiveRange(): Range | Null
  
  def getActiveRangeList(): RangeList | Null
  
  def getActiveSheet(): Sheet
  
  def getCurrentCell(): Range | Null
  
  def getNextDataRange(direction: Direction): Range | Null
}
object Selection {
  
  inline def apply(
    getActiveRange: CallbackTo[Range | Null],
    getActiveRangeList: CallbackTo[RangeList | Null],
    getActiveSheet: CallbackTo[Sheet],
    getCurrentCell: CallbackTo[Range | Null],
    getNextDataRange: Direction => Range | Null
  ): Selection = {
    val __obj = js.Dynamic.literal(getActiveRange = getActiveRange.toJsFn, getActiveRangeList = getActiveRangeList.toJsFn, getActiveSheet = getActiveSheet.toJsFn, getCurrentCell = getCurrentCell.toJsFn, getNextDataRange = js.Any.fromFunction1(getNextDataRange))
    __obj.asInstanceOf[Selection]
  }
  
  extension [Self <: Selection](x: Self) {
    
    inline def setGetActiveRange(value: CallbackTo[Range | Null]): Self = StObject.set(x, "getActiveRange", value.toJsFn)
    
    inline def setGetActiveRangeList(value: CallbackTo[RangeList | Null]): Self = StObject.set(x, "getActiveRangeList", value.toJsFn)
    
    inline def setGetActiveSheet(value: CallbackTo[Sheet]): Self = StObject.set(x, "getActiveSheet", value.toJsFn)
    
    inline def setGetCurrentCell(value: CallbackTo[Range | Null]): Self = StObject.set(x, "getCurrentCell", value.toJsFn)
    
    inline def setGetNextDataRange(value: Direction => Range | Null): Self = StObject.set(x, "getNextDataRange", js.Any.fromFunction1(value))
  }
}
