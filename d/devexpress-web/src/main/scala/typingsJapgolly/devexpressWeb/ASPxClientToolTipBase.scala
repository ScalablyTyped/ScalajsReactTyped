package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxSchedulerToolTipBase control.
  */
trait ASPxClientToolTipBase extends StObject {
  
  /**
    * Gets the tooltip position. An ASPxClientPoint object representing the tooltip position.
    * @param bounds An object that represents the tooltip bounds.
    */
  def CalculatePosition(bounds: Any): ASPxClientPoint
  
  /**
    * Returns the value that indicates whether or not the tooltip can be displayed.
    */
  def CanShowToolTip(): Boolean
  
  /**
    * Closes the tooltip.
    */
  def Close(): Unit
  
  /**
    * Returns the string representation of the specified interval. A string containing a textual representation of the interval.
    * @param interval An ASPxClientTimeInterval object to convert.
    */
  def ConvertIntervalToString(interval: ASPxClientTimeInterval): String
  
  /**
    * Ends updating the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def FinalizeUpdate(toolTipData: ASPxClientSchedulerToolTipData): Unit
  
  /**
    * Displays the Appointment Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowAppointmentMenu(eventObject: Any): Unit
  
  /**
    * Displays the View Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowViewMenu(eventObject: Any): Unit
  
  /**
    * Updates the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def Update(toolTipData: ASPxClientSchedulerToolTipData): Unit
}
object ASPxClientToolTipBase {
  
  inline def apply(
    CalculatePosition: Any => ASPxClientPoint,
    CanShowToolTip: CallbackTo[Boolean],
    Close: Callback,
    ConvertIntervalToString: ASPxClientTimeInterval => String,
    FinalizeUpdate: ASPxClientSchedulerToolTipData => Callback,
    ShowAppointmentMenu: Any => Callback,
    ShowViewMenu: Any => Callback,
    Update: ASPxClientSchedulerToolTipData => Callback
  ): ASPxClientToolTipBase = {
    val __obj = js.Dynamic.literal(CalculatePosition = js.Any.fromFunction1(CalculatePosition), CanShowToolTip = CanShowToolTip.toJsFn, Close = Close.toJsFn, ConvertIntervalToString = js.Any.fromFunction1(ConvertIntervalToString), FinalizeUpdate = js.Any.fromFunction1((t0: ASPxClientSchedulerToolTipData) => FinalizeUpdate(t0).runNow()), ShowAppointmentMenu = js.Any.fromFunction1((t0: Any) => ShowAppointmentMenu(t0).runNow()), ShowViewMenu = js.Any.fromFunction1((t0: Any) => ShowViewMenu(t0).runNow()), Update = js.Any.fromFunction1((t0: ASPxClientSchedulerToolTipData) => Update(t0).runNow()))
    __obj.asInstanceOf[ASPxClientToolTipBase]
  }
  
  extension [Self <: ASPxClientToolTipBase](x: Self) {
    
    inline def setCalculatePosition(value: Any => ASPxClientPoint): Self = StObject.set(x, "CalculatePosition", js.Any.fromFunction1(value))
    
    inline def setCanShowToolTip(value: CallbackTo[Boolean]): Self = StObject.set(x, "CanShowToolTip", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "Close", value.toJsFn)
    
    inline def setConvertIntervalToString(value: ASPxClientTimeInterval => String): Self = StObject.set(x, "ConvertIntervalToString", js.Any.fromFunction1(value))
    
    inline def setFinalizeUpdate(value: ASPxClientSchedulerToolTipData => Callback): Self = StObject.set(x, "FinalizeUpdate", js.Any.fromFunction1((t0: ASPxClientSchedulerToolTipData) => value(t0).runNow()))
    
    inline def setShowAppointmentMenu(value: Any => Callback): Self = StObject.set(x, "ShowAppointmentMenu", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setShowViewMenu(value: Any => Callback): Self = StObject.set(x, "ShowViewMenu", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setUpdate(value: ASPxClientSchedulerToolTipData => Callback): Self = StObject.set(x, "Update", js.Any.fromFunction1((t0: ASPxClientSchedulerToolTipData) => value(t0).runNow()))
  }
}
