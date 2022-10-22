package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the measure value and display text.
  */
trait ASPxClientDashboardItemDataMeasureValue extends StObject {
  
  /**
    * Gets the measure display text.
    */
  def GetDisplayText(): String
  
  /**
    * Gets the measure value.
    */
  def GetValue(): Any
}
object ASPxClientDashboardItemDataMeasureValue {
  
  inline def apply(GetDisplayText: CallbackTo[String], GetValue: CallbackTo[Any]): ASPxClientDashboardItemDataMeasureValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = GetDisplayText.toJsFn, GetValue = GetValue.toJsFn)
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasureValue]
  }
  
  extension [Self <: ASPxClientDashboardItemDataMeasureValue](x: Self) {
    
    inline def setGetDisplayText(value: CallbackTo[String]): Self = StObject.set(x, "GetDisplayText", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "GetValue", value.toJsFn)
  }
}
