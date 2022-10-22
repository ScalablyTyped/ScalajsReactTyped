package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Find or replace text within a range, sheet or spreadsheet. Can also specify search options.
  */
trait TextFinder extends StObject {
  
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
  
  inline def apply(
    findAll: CallbackTo[js.Array[Range]],
    findNext: CallbackTo[Range | Null],
    findPrevious: CallbackTo[Range | Null],
    getCurrentMatch: CallbackTo[Range | Null],
    ignoreDiacritics: Boolean => TextFinder,
    matchCase: Boolean => TextFinder,
    matchEntireCell: Boolean => TextFinder,
    matchFormulaText: Boolean => TextFinder,
    replaceAllWith: String => Integer,
    replaceWith: String => Integer,
    startFrom: Range => TextFinder,
    useRegularExpression: Boolean => TextFinder
  ): TextFinder = {
    val __obj = js.Dynamic.literal(findAll = findAll.toJsFn, findNext = findNext.toJsFn, findPrevious = findPrevious.toJsFn, getCurrentMatch = getCurrentMatch.toJsFn, ignoreDiacritics = js.Any.fromFunction1(ignoreDiacritics), matchCase = js.Any.fromFunction1(matchCase), matchEntireCell = js.Any.fromFunction1(matchEntireCell), matchFormulaText = js.Any.fromFunction1(matchFormulaText), replaceAllWith = js.Any.fromFunction1(replaceAllWith), replaceWith = js.Any.fromFunction1(replaceWith), startFrom = js.Any.fromFunction1(startFrom), useRegularExpression = js.Any.fromFunction1(useRegularExpression))
    __obj.asInstanceOf[TextFinder]
  }
  
  extension [Self <: TextFinder](x: Self) {
    
    inline def setFindAll(value: CallbackTo[js.Array[Range]]): Self = StObject.set(x, "findAll", value.toJsFn)
    
    inline def setFindNext(value: CallbackTo[Range | Null]): Self = StObject.set(x, "findNext", value.toJsFn)
    
    inline def setFindPrevious(value: CallbackTo[Range | Null]): Self = StObject.set(x, "findPrevious", value.toJsFn)
    
    inline def setGetCurrentMatch(value: CallbackTo[Range | Null]): Self = StObject.set(x, "getCurrentMatch", value.toJsFn)
    
    inline def setIgnoreDiacritics(value: Boolean => TextFinder): Self = StObject.set(x, "ignoreDiacritics", js.Any.fromFunction1(value))
    
    inline def setMatchCase(value: Boolean => TextFinder): Self = StObject.set(x, "matchCase", js.Any.fromFunction1(value))
    
    inline def setMatchEntireCell(value: Boolean => TextFinder): Self = StObject.set(x, "matchEntireCell", js.Any.fromFunction1(value))
    
    inline def setMatchFormulaText(value: Boolean => TextFinder): Self = StObject.set(x, "matchFormulaText", js.Any.fromFunction1(value))
    
    inline def setReplaceAllWith(value: String => Integer): Self = StObject.set(x, "replaceAllWith", js.Any.fromFunction1(value))
    
    inline def setReplaceWith(value: String => Integer): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
    
    inline def setStartFrom(value: Range => TextFinder): Self = StObject.set(x, "startFrom", js.Any.fromFunction1(value))
    
    inline def setUseRegularExpression(value: Boolean => TextFinder): Self = StObject.set(x, "useRegularExpression", js.Any.fromFunction1(value))
  }
}
