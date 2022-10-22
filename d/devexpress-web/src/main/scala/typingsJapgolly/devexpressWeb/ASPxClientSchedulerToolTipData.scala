package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a client tooltip.
  */
trait ASPxClientSchedulerToolTipData extends StObject {
  
  /**
    * Returns the client appointment for which the tooltip is displayed.
    */
  def GetAppointment(): ASPxClientAppointment
  
  /**
    * Returns the client time interval for which the tooltip is displayed.
    */
  def GetInterval(): ASPxClientTimeInterval
  
  /**
    * Returns the resources associated with the appointment for which the tooltip is displayed.
    */
  def GetResources(): js.Array[String]
}
object ASPxClientSchedulerToolTipData {
  
  inline def apply(
    GetAppointment: CallbackTo[ASPxClientAppointment],
    GetInterval: CallbackTo[ASPxClientTimeInterval],
    GetResources: CallbackTo[js.Array[String]]
  ): ASPxClientSchedulerToolTipData = {
    val __obj = js.Dynamic.literal(GetAppointment = GetAppointment.toJsFn, GetInterval = GetInterval.toJsFn, GetResources = GetResources.toJsFn)
    __obj.asInstanceOf[ASPxClientSchedulerToolTipData]
  }
  
  extension [Self <: ASPxClientSchedulerToolTipData](x: Self) {
    
    inline def setGetAppointment(value: CallbackTo[ASPxClientAppointment]): Self = StObject.set(x, "GetAppointment", value.toJsFn)
    
    inline def setGetInterval(value: CallbackTo[ASPxClientTimeInterval]): Self = StObject.set(x, "GetInterval", value.toJsFn)
    
    inline def setGetResources(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "GetResources", value.toJsFn)
  }
}
