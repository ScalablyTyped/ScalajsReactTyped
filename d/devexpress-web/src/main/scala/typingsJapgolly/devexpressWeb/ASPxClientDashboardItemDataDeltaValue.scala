package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides delta element values.
  */
trait ASPxClientDashboardItemDataDeltaValue extends StObject {
  
  /**
    * Provides access to the absolute difference between the actual and target values.
    */
  def GetAbsoluteVariation(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the actual value displayed within the delta element.
    */
  def GetActualValue(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the first additional delta value.
    */
  def GetDisplaySubValue1(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the second additional delta value.
    */
  def GetDisplaySubValue2(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the main delta value.
    */
  def GetDisplayValue(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Gets the type of delta indicator.
    */
  def GetIndicatorType(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Gets the value specifying the condition for displaying the delta indication.
    */
  def GetIsGood(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the percentage of the actual value in the target value.
    */
  def GetPercentOfTarget(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the percent of variation between the actual and target values.
    */
  def GetPercentVariation(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the target value.
    */
  def GetTargetValue(): ASPxClientDashboardItemDataMeasureValue
}
object ASPxClientDashboardItemDataDeltaValue {
  
  inline def apply(
    GetAbsoluteVariation: CallbackTo[ASPxClientDashboardItemDataMeasureValue],
    GetActualValue: CallbackTo[ASPxClientDashboardItemDataMeasureValue],
    GetDisplaySubValue1: CallbackTo[ASPxClientDashboardItemDataMeasureValue],
    GetDisplaySubValue2: CallbackTo[ASPxClientDashboardItemDataMeasureValue],
    GetDisplayValue: CallbackTo[ASPxClientDashboardItemDataMeasureValue],
    GetIndicatorType: CallbackTo[ASPxClientDashboardItemDataMeasureValue],
    GetIsGood: CallbackTo[ASPxClientDashboardItemDataMeasureValue],
    GetPercentOfTarget: CallbackTo[ASPxClientDashboardItemDataMeasureValue],
    GetPercentVariation: CallbackTo[ASPxClientDashboardItemDataMeasureValue],
    GetTargetValue: CallbackTo[ASPxClientDashboardItemDataMeasureValue]
  ): ASPxClientDashboardItemDataDeltaValue = {
    val __obj = js.Dynamic.literal(GetAbsoluteVariation = GetAbsoluteVariation.toJsFn, GetActualValue = GetActualValue.toJsFn, GetDisplaySubValue1 = GetDisplaySubValue1.toJsFn, GetDisplaySubValue2 = GetDisplaySubValue2.toJsFn, GetDisplayValue = GetDisplayValue.toJsFn, GetIndicatorType = GetIndicatorType.toJsFn, GetIsGood = GetIsGood.toJsFn, GetPercentOfTarget = GetPercentOfTarget.toJsFn, GetPercentVariation = GetPercentVariation.toJsFn, GetTargetValue = GetTargetValue.toJsFn)
    __obj.asInstanceOf[ASPxClientDashboardItemDataDeltaValue]
  }
  
  extension [Self <: ASPxClientDashboardItemDataDeltaValue](x: Self) {
    
    inline def setGetAbsoluteVariation(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetAbsoluteVariation", value.toJsFn)
    
    inline def setGetActualValue(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetActualValue", value.toJsFn)
    
    inline def setGetDisplaySubValue1(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetDisplaySubValue1", value.toJsFn)
    
    inline def setGetDisplaySubValue2(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetDisplaySubValue2", value.toJsFn)
    
    inline def setGetDisplayValue(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetDisplayValue", value.toJsFn)
    
    inline def setGetIndicatorType(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetIndicatorType", value.toJsFn)
    
    inline def setGetIsGood(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetIsGood", value.toJsFn)
    
    inline def setGetPercentOfTarget(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetPercentOfTarget", value.toJsFn)
    
    inline def setGetPercentVariation(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetPercentVariation", value.toJsFn)
    
    inline def setGetTargetValue(value: CallbackTo[ASPxClientDashboardItemDataMeasureValue]): Self = StObject.set(x, "GetTargetValue", value.toJsFn)
  }
}
