package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides dimension values at the specified axis point.
  */
trait ASPxClientDashboardItemDataDimensionValue extends StObject {
  
  /**
    * Gets the display text for the current dimension value.
    */
  def GetDisplayText(): String
  
  /**
    * Gets the unique value for the current dimension value.
    */
  def GetUniqueValue(): Any
  
  /**
    * Gets the current dimension value.
    */
  def GetValue(): Any
}
object ASPxClientDashboardItemDataDimensionValue {
  
  inline def apply(GetDisplayText: CallbackTo[String], GetUniqueValue: CallbackTo[Any], GetValue: CallbackTo[Any]): ASPxClientDashboardItemDataDimensionValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = GetDisplayText.toJsFn, GetUniqueValue = GetUniqueValue.toJsFn, GetValue = GetValue.toJsFn)
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimensionValue]
  }
  
  extension [Self <: ASPxClientDashboardItemDataDimensionValue](x: Self) {
    
    inline def setGetDisplayText(value: CallbackTo[String]): Self = StObject.set(x, "GetDisplayText", value.toJsFn)
    
    inline def setGetUniqueValue(value: CallbackTo[Any]): Self = StObject.set(x, "GetUniqueValue", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "GetValue", value.toJsFn)
  }
}
