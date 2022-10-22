package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A template that is rendered to display a tooltip.
  */
trait MVCxClientSchedulerTemplateToolTip
  extends StObject
     with ASPxClientToolTipBase {
  
  /**
    * Gets the tooltip type.
    */
  var `type`: MVCxSchedulerToolTipType
}
object MVCxClientSchedulerTemplateToolTip {
  
  inline def apply(
    CalculatePosition: Any => ASPxClientPoint,
    CanShowToolTip: CallbackTo[Boolean],
    Close: Callback,
    ConvertIntervalToString: ASPxClientTimeInterval => String,
    FinalizeUpdate: ASPxClientSchedulerToolTipData => Callback,
    ShowAppointmentMenu: Any => Callback,
    ShowViewMenu: Any => Callback,
    Update: ASPxClientSchedulerToolTipData => Callback,
    `type`: MVCxSchedulerToolTipType
  ): MVCxClientSchedulerTemplateToolTip = {
    val __obj = js.Dynamic.literal(CalculatePosition = js.Any.fromFunction1(CalculatePosition), CanShowToolTip = CanShowToolTip.toJsFn, Close = Close.toJsFn, ConvertIntervalToString = js.Any.fromFunction1(ConvertIntervalToString), FinalizeUpdate = js.Any.fromFunction1((t0: ASPxClientSchedulerToolTipData) => FinalizeUpdate(t0).runNow()), ShowAppointmentMenu = js.Any.fromFunction1((t0: Any) => ShowAppointmentMenu(t0).runNow()), ShowViewMenu = js.Any.fromFunction1((t0: Any) => ShowViewMenu(t0).runNow()), Update = js.Any.fromFunction1((t0: ASPxClientSchedulerToolTipData) => Update(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientSchedulerTemplateToolTip]
  }
  
  extension [Self <: MVCxClientSchedulerTemplateToolTip](x: Self) {
    
    inline def setType(value: MVCxSchedulerToolTipType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
