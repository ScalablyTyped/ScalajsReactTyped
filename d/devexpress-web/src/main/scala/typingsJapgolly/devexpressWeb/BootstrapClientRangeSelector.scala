package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapRangeSelector control.
  */
trait BootstrapClientRangeSelector
  extends StObject
     with BootstrapUIWidgetBase {
  
  /**
    * Gets the Range Selector's selected value range.
    */
  def GetValue(): js.Array[Any]
  
  /**
    * Gets the Range Selector's selected value range.
    * @param value An array containing the value range.
    */
  def SetValue(value: js.Array[Any]): Unit
  
  /**
    * Fires after the selected range has been changed by moving one of the sliders.
    */
  var ValueChanged: ASPxClientEvent[
    BootstrapClientRangeSelectorValueChangedEventHandler[BootstrapClientRangeSelector]
  ]
}
object BootstrapClientRangeSelector {
  
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
    GetValue: CallbackTo[js.Array[Any]],
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
    SetValue: js.Array[Any] => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    ValueChanged: ASPxClientEvent[
      BootstrapClientRangeSelectorValueChangedEventHandler[BootstrapClientRangeSelector]
    ],
    name: String
  ): BootstrapClientRangeSelector = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, Disposing = Disposing.asInstanceOf[js.Any], Drawn = Drawn.asInstanceOf[js.Any], ExportTo = js.Any.fromFunction2((t0: String, t1: String) => (ExportTo(t0, t1)).runNow()), Exported = Exported.asInstanceOf[js.Any], Exporting = Exporting.asInstanceOf[js.Any], FileSaving = FileSaving.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetDataSource = GetDataSource.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetInstance = GetInstance.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, IncidentOccurred = IncidentOccurred.asInstanceOf[js.Any], Init = Init.asInstanceOf[js.Any], OptionChanged = OptionChanged.asInstanceOf[js.Any], Print = Print.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetDataSource = js.Any.fromFunction1((t0: Any) => SetDataSource(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetOptions = js.Any.fromFunction1((t0: Any) => SetOptions(t0).runNow()), SetValue = js.Any.fromFunction1((t0: js.Array[Any]) => SetValue(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientRangeSelector]
  }
  
  extension [Self <: BootstrapClientRangeSelector](x: Self) {
    
    inline def setGetValue(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "GetValue", value.toJsFn)
    
    inline def setSetValue(value: js.Array[Any] => Callback): Self = StObject.set(x, "SetValue", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setValueChanged(
      value: ASPxClientEvent[
          BootstrapClientRangeSelectorValueChangedEventHandler[BootstrapClientRangeSelector]
        ]
    ): Self = StObject.set(x, "ValueChanged", value.asInstanceOf[js.Any])
  }
}
