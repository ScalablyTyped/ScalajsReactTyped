package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access filter criteria. To create a new criteria, use SpreadsheetApp.newFilterCriteria() and FilterCriteriaBuilder.
  */
trait FilterCriteria extends StObject {
  
  def copy(): FilterCriteriaBuilder
  
  def getCriteriaType(): BooleanCriteria
  
  def getCriteriaValues(): js.Array[Any]
  
  def getHiddenValues(): js.Array[String]
  
  def getVisibleValues(): js.Array[String]
}
object FilterCriteria {
  
  inline def apply(
    copy: CallbackTo[FilterCriteriaBuilder],
    getCriteriaType: CallbackTo[BooleanCriteria],
    getCriteriaValues: CallbackTo[js.Array[Any]],
    getHiddenValues: CallbackTo[js.Array[String]],
    getVisibleValues: CallbackTo[js.Array[String]]
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, getCriteriaType = getCriteriaType.toJsFn, getCriteriaValues = getCriteriaValues.toJsFn, getHiddenValues = getHiddenValues.toJsFn, getVisibleValues = getVisibleValues.toJsFn)
    __obj.asInstanceOf[FilterCriteria]
  }
  
  extension [Self <: FilterCriteria](x: Self) {
    
    inline def setCopy(value: CallbackTo[FilterCriteriaBuilder]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setGetCriteriaType(value: CallbackTo[BooleanCriteria]): Self = StObject.set(x, "getCriteriaType", value.toJsFn)
    
    inline def setGetCriteriaValues(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getCriteriaValues", value.toJsFn)
    
    inline def setGetHiddenValues(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getHiddenValues", value.toJsFn)
    
    inline def setGetVisibleValues(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getVisibleValues", value.toJsFn)
  }
}
