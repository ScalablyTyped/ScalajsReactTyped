package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapChartBase class.
  */
trait BootstrapClientChartBase
  extends StObject
     with BootstrapUIWidgetBase {
  
  /**
    * Fires when a user clicks a label on the argument axis.
    */
  var ArgumentAxisClick: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[BootstrapClientChartBase]
  ]
  
  /**
    * Fires when the Series and Points chart elements are ready to be accessed.
    */
  var Done: ASPxClientEvent[BootstrapClientChartBaseDoneEventHandler[BootstrapClientChartBase]]
  
  /**
    * Fires when an item on the chart legend is clicked.
    */
  var LegendClick: ASPxClientEvent[BootstrapClientChartBaseLegendClickEventHandler[BootstrapClientChartBase]]
  
  /**
    * Fires when a user clicks a series point.
    */
  var PointClick: ASPxClientEvent[BootstrapClientChartBasePointClickEventHandler[BootstrapClientChartBase]]
  
  /**
    * Fires when the hover state of a series point has been changed.
    */
  var PointHoverChanged: ASPxClientEvent[BootstrapClientChartBasePointHoverChangedEventHandler[BootstrapClientChartBase]]
  
  /**
    * Fires when the selection state of a series point has been changed.
    */
  var PointSelectionChanged: ASPxClientEvent[
    BootstrapClientChartBasePointSelectionChangedEventHandler[BootstrapClientChartBase]
  ]
  
  /**
    * Fires when a user clicks a series.
    */
  var SeriesClick: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesClickEventHandler[BootstrapClientChartBase]
  ]
  
  /**
    * Fires when the hover state of a series has been changed.
    */
  var SeriesHoverChanged: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[BootstrapClientChartBase]
  ]
  
  /**
    * Fires when the selection state of a series has been changed.
    */
  var SeriesSelectionChanged: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[BootstrapClientChartBase]
  ]
  
  /**
    * Fires when a point's tooltip becomes hidden.
    */
  var TooltipHidden: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]]
  
  /**
    * Fires when a point's tooltip appears.
    */
  var TooltipShown: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]]
}
object BootstrapClientChartBase {
  
  inline def apply(
    AdjustControl: Callback,
    ArgumentAxisClick: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[BootstrapClientChartBase]
    ],
    Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]],
    Done: ASPxClientEvent[BootstrapClientChartBaseDoneEventHandler[BootstrapClientChartBase]],
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
    LegendClick: ASPxClientEvent[BootstrapClientChartBaseLegendClickEventHandler[BootstrapClientChartBase]],
    OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]],
    PointClick: ASPxClientEvent[BootstrapClientChartBasePointClickEventHandler[BootstrapClientChartBase]],
    PointHoverChanged: ASPxClientEvent[BootstrapClientChartBasePointHoverChangedEventHandler[BootstrapClientChartBase]],
    PointSelectionChanged: ASPxClientEvent[
      BootstrapClientChartBasePointSelectionChangedEventHandler[BootstrapClientChartBase]
    ],
    Print: Callback,
    SendMessageToAssistiveTechnology: String => Callback,
    SeriesClick: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartSeriesClickEventHandler[BootstrapClientChartBase]
    ],
    SeriesHoverChanged: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[BootstrapClientChartBase]
    ],
    SeriesSelectionChanged: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[BootstrapClientChartBase]
    ],
    SetClientVisible: Boolean => Callback,
    SetDataSource: Any => Callback,
    SetEnabled: Boolean => Callback,
    SetHeight: Double => Callback,
    SetOptions: Any => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    TooltipHidden: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]],
    TooltipShown: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]],
    name: String
  ): BootstrapClientChartBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, ArgumentAxisClick = ArgumentAxisClick.asInstanceOf[js.Any], Disposing = Disposing.asInstanceOf[js.Any], Done = Done.asInstanceOf[js.Any], Drawn = Drawn.asInstanceOf[js.Any], ExportTo = js.Any.fromFunction2((t0: String, t1: String) => (ExportTo(t0, t1)).runNow()), Exported = Exported.asInstanceOf[js.Any], Exporting = Exporting.asInstanceOf[js.Any], FileSaving = FileSaving.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetDataSource = GetDataSource.toJsFn, GetEnabled = GetEnabled.toJsFn, GetHeight = GetHeight.toJsFn, GetInstance = GetInstance.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, IncidentOccurred = IncidentOccurred.asInstanceOf[js.Any], Init = Init.asInstanceOf[js.Any], LegendClick = LegendClick.asInstanceOf[js.Any], OptionChanged = OptionChanged.asInstanceOf[js.Any], PointClick = PointClick.asInstanceOf[js.Any], PointHoverChanged = PointHoverChanged.asInstanceOf[js.Any], PointSelectionChanged = PointSelectionChanged.asInstanceOf[js.Any], Print = Print.toJsFn, SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SeriesClick = SeriesClick.asInstanceOf[js.Any], SeriesHoverChanged = SeriesHoverChanged.asInstanceOf[js.Any], SeriesSelectionChanged = SeriesSelectionChanged.asInstanceOf[js.Any], SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetDataSource = js.Any.fromFunction1((t0: Any) => SetDataSource(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetOptions = js.Any.fromFunction1((t0: Any) => SetOptions(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), TooltipHidden = TooltipHidden.asInstanceOf[js.Any], TooltipShown = TooltipShown.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientChartBase]
  }
  
  extension [Self <: BootstrapClientChartBase](x: Self) {
    
    inline def setArgumentAxisClick(
      value: ASPxClientEvent[
          BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "ArgumentAxisClick", value.asInstanceOf[js.Any])
    
    inline def setDone(value: ASPxClientEvent[BootstrapClientChartBaseDoneEventHandler[BootstrapClientChartBase]]): Self = StObject.set(x, "Done", value.asInstanceOf[js.Any])
    
    inline def setLegendClick(value: ASPxClientEvent[BootstrapClientChartBaseLegendClickEventHandler[BootstrapClientChartBase]]): Self = StObject.set(x, "LegendClick", value.asInstanceOf[js.Any])
    
    inline def setPointClick(value: ASPxClientEvent[BootstrapClientChartBasePointClickEventHandler[BootstrapClientChartBase]]): Self = StObject.set(x, "PointClick", value.asInstanceOf[js.Any])
    
    inline def setPointHoverChanged(
      value: ASPxClientEvent[BootstrapClientChartBasePointHoverChangedEventHandler[BootstrapClientChartBase]]
    ): Self = StObject.set(x, "PointHoverChanged", value.asInstanceOf[js.Any])
    
    inline def setPointSelectionChanged(
      value: ASPxClientEvent[
          BootstrapClientChartBasePointSelectionChangedEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "PointSelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSeriesClick(
      value: ASPxClientEvent[
          BootstrapClientCoordinateSystemChartSeriesClickEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "SeriesClick", value.asInstanceOf[js.Any])
    
    inline def setSeriesHoverChanged(
      value: ASPxClientEvent[
          BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "SeriesHoverChanged", value.asInstanceOf[js.Any])
    
    inline def setSeriesSelectionChanged(
      value: ASPxClientEvent[
          BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "SeriesSelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipHidden(
      value: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]]
    ): Self = StObject.set(x, "TooltipHidden", value.asInstanceOf[js.Any])
    
    inline def setTooltipShown(value: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]]): Self = StObject.set(x, "TooltipShown", value.asInstanceOf[js.Any])
  }
}
