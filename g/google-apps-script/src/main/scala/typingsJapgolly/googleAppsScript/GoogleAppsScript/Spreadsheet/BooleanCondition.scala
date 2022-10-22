package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access boolean conditions in ConditionalFormatRules. Each
  * conditional format rule may contain a single boolean condition. The boolean condition itself
  * contains a boolean criteria (with values) and formatting settings. The criteria is evaluated
  * against the content of a cell resulting in either a true or false value. If the
  * criteria evaluates to true, the condition's formatting settings are applied to the cell.
  */
trait BooleanCondition extends StObject {
  
  def getBackground(): String | Null
  
  def getBold(): Boolean | Null
  
  def getCriteriaType(): BooleanCriteria
  
  def getCriteriaValues(): js.Array[Any]
  
  def getFontColor(): String | Null
  
  def getItalic(): Boolean | Null
  
  def getStrikethrough(): Boolean | Null
  
  def getUnderline(): Boolean | Null
}
object BooleanCondition {
  
  inline def apply(
    getBackground: CallbackTo[String | Null],
    getBold: CallbackTo[Boolean | Null],
    getCriteriaType: CallbackTo[BooleanCriteria],
    getCriteriaValues: CallbackTo[js.Array[Any]],
    getFontColor: CallbackTo[String | Null],
    getItalic: CallbackTo[Boolean | Null],
    getStrikethrough: CallbackTo[Boolean | Null],
    getUnderline: CallbackTo[Boolean | Null]
  ): BooleanCondition = {
    val __obj = js.Dynamic.literal(getBackground = getBackground.toJsFn, getBold = getBold.toJsFn, getCriteriaType = getCriteriaType.toJsFn, getCriteriaValues = getCriteriaValues.toJsFn, getFontColor = getFontColor.toJsFn, getItalic = getItalic.toJsFn, getStrikethrough = getStrikethrough.toJsFn, getUnderline = getUnderline.toJsFn)
    __obj.asInstanceOf[BooleanCondition]
  }
  
  extension [Self <: BooleanCondition](x: Self) {
    
    inline def setGetBackground(value: CallbackTo[String | Null]): Self = StObject.set(x, "getBackground", value.toJsFn)
    
    inline def setGetBold(value: CallbackTo[Boolean | Null]): Self = StObject.set(x, "getBold", value.toJsFn)
    
    inline def setGetCriteriaType(value: CallbackTo[BooleanCriteria]): Self = StObject.set(x, "getCriteriaType", value.toJsFn)
    
    inline def setGetCriteriaValues(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getCriteriaValues", value.toJsFn)
    
    inline def setGetFontColor(value: CallbackTo[String | Null]): Self = StObject.set(x, "getFontColor", value.toJsFn)
    
    inline def setGetItalic(value: CallbackTo[Boolean | Null]): Self = StObject.set(x, "getItalic", value.toJsFn)
    
    inline def setGetStrikethrough(value: CallbackTo[Boolean | Null]): Self = StObject.set(x, "getStrikethrough", value.toJsFn)
    
    inline def setGetUnderline(value: CallbackTo[Boolean | Null]): Self = StObject.set(x, "getUnderline", value.toJsFn)
  }
}
