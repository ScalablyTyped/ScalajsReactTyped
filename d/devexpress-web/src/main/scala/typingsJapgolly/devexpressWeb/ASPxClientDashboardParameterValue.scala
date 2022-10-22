package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the parameter value and display text.
  */
trait ASPxClientDashboardParameterValue extends StObject {
  
  /**
    * Returns the parameter display text.
    */
  def GetDisplayText(): String
  
  /**
    * Returns a parameter value.
    */
  def GetValue(): Any
}
object ASPxClientDashboardParameterValue {
  
  inline def apply(GetDisplayText: CallbackTo[String], GetValue: CallbackTo[Any]): ASPxClientDashboardParameterValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = GetDisplayText.toJsFn, GetValue = GetValue.toJsFn)
    __obj.asInstanceOf[ASPxClientDashboardParameterValue]
  }
  
  extension [Self <: ASPxClientDashboardParameterValue](x: Self) {
    
    inline def setGetDisplayText(value: CallbackTo[String]): Self = StObject.set(x, "GetDisplayText", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "GetValue", value.toJsFn)
  }
}
