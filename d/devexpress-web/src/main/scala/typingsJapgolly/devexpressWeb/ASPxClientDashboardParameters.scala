package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of ASPxClientDashboardParameter objects.
  */
trait ASPxClientDashboardParameters extends StObject {
  
  /**
    * Returns a dashboard parameter by its index in the ASPxClientDashboardParameters collection. A ASPxClientDashboardParameter object that is the client-side dashboard parameter.
    * @param index An integer value that specifies the parameter index.
    */
  def GetParameterByIndex(index: Double): ASPxClientDashboardParameter
  
  /**
    * Returns a dashboard parameter by its name. A ASPxClientDashboardParameter object that is the client-side dashboard parameter.
    * @param name A String object that specifies the parameter name.
    */
  def GetParameterByName(name: String): ASPxClientDashboardParameter
  
  /**
    * Returns an array of dashboard parameters from the ASPxClientDashboardParameters collection.
    */
  def GetParameterList(): js.Array[ASPxClientDashboardParameter]
}
object ASPxClientDashboardParameters {
  
  inline def apply(
    GetParameterByIndex: Double => ASPxClientDashboardParameter,
    GetParameterByName: String => ASPxClientDashboardParameter,
    GetParameterList: CallbackTo[js.Array[ASPxClientDashboardParameter]]
  ): ASPxClientDashboardParameters = {
    val __obj = js.Dynamic.literal(GetParameterByIndex = js.Any.fromFunction1(GetParameterByIndex), GetParameterByName = js.Any.fromFunction1(GetParameterByName), GetParameterList = GetParameterList.toJsFn)
    __obj.asInstanceOf[ASPxClientDashboardParameters]
  }
  
  extension [Self <: ASPxClientDashboardParameters](x: Self) {
    
    inline def setGetParameterByIndex(value: Double => ASPxClientDashboardParameter): Self = StObject.set(x, "GetParameterByIndex", js.Any.fromFunction1(value))
    
    inline def setGetParameterByName(value: String => ASPxClientDashboardParameter): Self = StObject.set(x, "GetParameterByName", js.Any.fromFunction1(value))
    
    inline def setGetParameterList(value: CallbackTo[js.Array[ASPxClientDashboardParameter]]): Self = StObject.set(x, "GetParameterList", value.toJsFn)
  }
}
