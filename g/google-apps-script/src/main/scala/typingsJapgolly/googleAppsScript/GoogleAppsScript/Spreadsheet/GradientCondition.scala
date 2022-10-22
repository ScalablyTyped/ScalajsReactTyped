package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access gradient (color) conditions in ConditionalFormatRuleApis.
  * Each conditional format rule may contain a single gradient condition. A gradient condition is
  * defined by three points along a number scale (min, mid, and max), each of which has a color, a
  * value, and a InterpolationType. The content of a cell is
  * compared to the values in the number scale and the color applied to the cell is interpolated
  * based on the cell content's proximity to the gradient condition min, mid, and max points.
  *
  *     // Logs all the information inside gradient conditional format rules on a sheet.
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var rules = sheet.getConditionalFormatRules();
  *     for (int i = 0; i < rules.length; i++) {
  *       var gradient = rules[i].getGradientCondition();
  *       Logger.log("The conditional format gradient information for rule %d:\n
  *         MinColor %s, MinType %s, MinValue %s, \n
  *         MidColor %s, MidType %s, MidValue %s, \n
  *         MaxColor %s, MaxType %s, MaxValue %s \n", i,
  *         gradient.getMinColor(), gradient.getMinType(), gradient.getMinValue(),
  *         gradient.getMidColor(), gradient.getMidType(), gradient.getMidValue(),
  *         gradient.getMaxColor(), gradient.getMaxType(), gradient.getMaxValue());
  *     }
  */
trait GradientCondition extends StObject {
  
  def getMaxColor(): String
  
  def getMaxType(): InterpolationType | Null
  
  def getMaxValue(): String
  
  def getMidColor(): String
  
  def getMidType(): InterpolationType | Null
  
  def getMidValue(): String
  
  def getMinColor(): String
  
  def getMinType(): InterpolationType | Null
  
  def getMinValue(): String
}
object GradientCondition {
  
  inline def apply(
    getMaxColor: CallbackTo[String],
    getMaxType: CallbackTo[InterpolationType | Null],
    getMaxValue: CallbackTo[String],
    getMidColor: CallbackTo[String],
    getMidType: CallbackTo[InterpolationType | Null],
    getMidValue: CallbackTo[String],
    getMinColor: CallbackTo[String],
    getMinType: CallbackTo[InterpolationType | Null],
    getMinValue: CallbackTo[String]
  ): GradientCondition = {
    val __obj = js.Dynamic.literal(getMaxColor = getMaxColor.toJsFn, getMaxType = getMaxType.toJsFn, getMaxValue = getMaxValue.toJsFn, getMidColor = getMidColor.toJsFn, getMidType = getMidType.toJsFn, getMidValue = getMidValue.toJsFn, getMinColor = getMinColor.toJsFn, getMinType = getMinType.toJsFn, getMinValue = getMinValue.toJsFn)
    __obj.asInstanceOf[GradientCondition]
  }
  
  extension [Self <: GradientCondition](x: Self) {
    
    inline def setGetMaxColor(value: CallbackTo[String]): Self = StObject.set(x, "getMaxColor", value.toJsFn)
    
    inline def setGetMaxType(value: CallbackTo[InterpolationType | Null]): Self = StObject.set(x, "getMaxType", value.toJsFn)
    
    inline def setGetMaxValue(value: CallbackTo[String]): Self = StObject.set(x, "getMaxValue", value.toJsFn)
    
    inline def setGetMidColor(value: CallbackTo[String]): Self = StObject.set(x, "getMidColor", value.toJsFn)
    
    inline def setGetMidType(value: CallbackTo[InterpolationType | Null]): Self = StObject.set(x, "getMidType", value.toJsFn)
    
    inline def setGetMidValue(value: CallbackTo[String]): Self = StObject.set(x, "getMidValue", value.toJsFn)
    
    inline def setGetMinColor(value: CallbackTo[String]): Self = StObject.set(x, "getMinColor", value.toJsFn)
    
    inline def setGetMinType(value: CallbackTo[InterpolationType | Null]): Self = StObject.set(x, "getMinType", value.toJsFn)
    
    inline def setGetMinValue(value: CallbackTo[String]): Self = StObject.set(x, "getMinValue", value.toJsFn)
  }
}
