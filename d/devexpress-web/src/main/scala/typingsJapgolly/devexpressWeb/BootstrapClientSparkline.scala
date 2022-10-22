package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapSparkline control.
  */
trait BootstrapClientSparkline
  extends StObject
     with BootstrapUIWidgetBase {
  
  var TooltipHidden: ASPxClientEvent[BootstrapClientSparklineTooltipHiddenEventHandler[BootstrapClientSparkline]]
  
  var TooltipShown: ASPxClientEvent[BootstrapClientSparklineTooltipShownEventHandler[BootstrapClientSparkline]]
}
object BootstrapClientSparkline {
  
  inline def apply(
    AdjustControl: Callback,
    Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]],
    Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]],
    ExportTo: (String, String) => Callback,
    Exported: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]],
    Exporting: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]],
    FileSaving: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]],
    GetClientVisible: CallbackTo[Boolean],
    GetDataSource: CallbackTo[Any],
    GetEnabled: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetInstance: CallbackTo[Any],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]],
    Init: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]],
    OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]],
    Print: Callback,
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetDataSource: Any => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetOptions: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    TooltipHidden: ASPxClientEvent[BootstrapClientSparklineTooltipHiddenEventHandler[BootstrapClientSparkline]],
    TooltipShown: ASPxClientEvent[BootstrapClientSparklineTooltipShownEventHandler[BootstrapClientSparkline]],
    name: String
  ): BootstrapClientSparkline = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Disposing = Disposing.asInstanceOf[js.Any], Drawn = Drawn.asInstanceOf[js.Any], ExportTo = js.Any.fromFunction2((t0: String, t1: String) => (ExportTo(t0, t1)).runNow()), Exported = Exported.asInstanceOf[js.Any], Exporting = Exporting.asInstanceOf[js.Any], FileSaving = FileSaving.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetDataSource = GetDataSource.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetInstance = GetInstance.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, IncidentOccurred = IncidentOccurred.asInstanceOf[js.Any], Init = Init.asInstanceOf[js.Any], OptionChanged = OptionChanged.asInstanceOf[js.Any], Print = Print.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetDataSource = js.Any.fromFunction1((t0: Any) => SetDataSource(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetOptions = js.Any.fromFunction1((t0: Any) => SetOptions(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), TooltipHidden = TooltipHidden.asInstanceOf[js.Any], TooltipShown = TooltipShown.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientSparkline]
  }
  
  extension [Self <: BootstrapClientSparkline](x: Self) {
    
    inline def setTooltipHidden(
      value: ASPxClientEvent[BootstrapClientSparklineTooltipHiddenEventHandler[BootstrapClientSparkline]]
    ): Self = StObject.set(x, "TooltipHidden", value.asInstanceOf[js.Any])
    
    inline def setTooltipShown(value: ASPxClientEvent[BootstrapClientSparklineTooltipShownEventHandler[BootstrapClientSparkline]]): Self = StObject.set(x, "TooltipShown", value.asInstanceOf[js.Any])
  }
}
