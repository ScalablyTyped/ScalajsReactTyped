package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side dashboard parameter.
  */
trait ASPxClientDashboardParameter extends StObject {
  
  /**
    * Returns a default parameter value.
    */
  def GetDefaultValue(): Any
  
  /**
    * Returns the parameter's description displayed to an end-user.
    */
  def GetDescription(): String
  
  /**
    * Returns a parameter name.
    */
  def GetName(): String
  
  /**
    * Returns a parameter type.
    */
  def GetType(): String
  
  /**
    * Returns a current parameter value(s).
    */
  def GetValue(): Any
  
  /**
    * Returns possible parameter values.
    */
  def GetValues(): js.Array[ASPxClientDashboardParameterValue]
  
  /** @deprecated Use the GetName method instead. */
  /**
    * Gets the dashboard parameter name on the client side.
    */
  var Name: String
  
  /**
    * Specifies the current parameter value(s).
    * @param value The current parameter value(s).
    */
  def SetValue(value: Any): Unit
  
  /** @deprecated Use the GetValue method instead. */
  /**
    * Gets the dashboard parameter value on the client side.
    */
  var Value: Any
}
object ASPxClientDashboardParameter {
  
  inline def apply(
    GetDefaultValue: CallbackTo[Any],
    GetDescription: CallbackTo[String],
    GetName: CallbackTo[String],
    GetType: CallbackTo[String],
    GetValue: CallbackTo[Any],
    GetValues: CallbackTo[js.Array[ASPxClientDashboardParameterValue]],
    Name: String,
    SetValue: Any => Callback,
    Value: Any
  ): ASPxClientDashboardParameter = {
    val __obj = js.Dynamic.literal(GetDefaultValue = GetDefaultValue.toJsFn, GetDescription = GetDescription.toJsFn, GetName = GetName.toJsFn, GetType = GetType.toJsFn, GetValue = GetValue.toJsFn, GetValues = GetValues.toJsFn, Name = Name.asInstanceOf[js.Any], SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardParameter]
  }
  
  extension [Self <: ASPxClientDashboardParameter](x: Self) {
    
    inline def setGetDefaultValue(value: CallbackTo[Any]): Self = StObject.set(x, "GetDefaultValue", value.toJsFn)
    
    inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "GetDescription", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "GetName", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "GetType", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "GetValue", value.toJsFn)
    
    inline def setGetValues(value: CallbackTo[js.Array[ASPxClientDashboardParameterValue]]): Self = StObject.set(x, "GetValues", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSetValue(value: Any => Callback): Self = StObject.set(x, "SetValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
