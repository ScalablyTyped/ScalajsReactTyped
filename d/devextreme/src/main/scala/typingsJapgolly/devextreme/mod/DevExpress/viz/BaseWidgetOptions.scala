package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponentOptions
import typingsJapgolly.devextreme.mod.DevExpress.common.charts.Theme
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseWidgetOptions[TComponent]
  extends StObject
     with DOMComponentOptions[TComponent] {
  
  /**
    * Specifies whether the UI component responds to user interaction.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the exporting and printing features.
    */
  var `export`: js.UndefOr[BaseWidgetExport] = js.undefined
  
  /**
    * Configures the loading indicator.
    */
  var loadingIndicator: js.UndefOr[BaseWidgetLoadingIndicator] = js.undefined
  
  /**
    * Generates space around the UI component.
    */
  var margin: js.UndefOr[BaseWidgetMargin] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s rendering has finished.
    */
  var onDrawn: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed after the UI component is exported.
    */
  var onExported: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed before the UI component is exported.
    */
  var onExporting: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & ExportInfo, Unit]] = js.undefined
  
  /**
    * A function that is executed before a file with exported UI component is saved to the user&apos;s local storage.
    */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ FileSavingEventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed when an error or warning occurs.
    */
  var onIncidentOccurred: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & IncidentInfo, Unit]] = js.undefined
  
  /**
    * Notifies the UI component that it is embedded into an HTML page that uses a tag modifying the path.
    */
  var pathModified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to redraw the UI component when the size of the parent browser window changes or a mobile device rotates.
    */
  var redrawOnResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the UI component&apos;s size in pixels.
    */
  var size: js.UndefOr[BaseWidgetSize] = js.undefined
  
  /**
    * Sets the name of the theme the UI component uses.
    */
  var theme: js.UndefOr[Theme] = js.undefined
  
  /**
    * Configures the UI component&apos;s title.
    */
  var title: js.UndefOr[BaseWidgetTitle | String] = js.undefined
  
  /**
    * Configures tooltips - small pop-up rectangles that display information about a data-visualizing UI component element being pressed or hovered over with the mouse pointer.
    */
  var tooltip: js.UndefOr[BaseWidgetTooltip] = js.undefined
}
object BaseWidgetOptions {
  
  inline def apply[TComponent](): BaseWidgetOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetOptions[TComponent]]
  }
  
  extension [Self <: BaseWidgetOptions[?], TComponent](x: Self & BaseWidgetOptions[TComponent]) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExport(value: BaseWidgetExport): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setLoadingIndicator(value: BaseWidgetLoadingIndicator): Self = StObject.set(x, "loadingIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
    
    inline def setMargin(value: BaseWidgetMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOnDrawn(value: /* e */ EventInfo[TComponent] => Callback): Self = StObject.set(x, "onDrawn", js.Any.fromFunction1((t0: /* e */ EventInfo[TComponent]) => value(t0).runNow()))
    
    inline def setOnDrawnUndefined: Self = StObject.set(x, "onDrawn", js.undefined)
    
    inline def setOnExported(value: /* e */ EventInfo[TComponent] => Callback): Self = StObject.set(x, "onExported", js.Any.fromFunction1((t0: /* e */ EventInfo[TComponent]) => value(t0).runNow()))
    
    inline def setOnExportedUndefined: Self = StObject.set(x, "onExported", js.undefined)
    
    inline def setOnExporting(value: /* e */ EventInfo[TComponent] & ExportInfo => Callback): Self = StObject.set(x, "onExporting", js.Any.fromFunction1((t0: /* e */ EventInfo[TComponent] & ExportInfo) => value(t0).runNow()))
    
    inline def setOnExportingUndefined: Self = StObject.set(x, "onExporting", js.undefined)
    
    inline def setOnFileSaving(value: /* e */ FileSavingEventInfo[TComponent] => Callback): Self = StObject.set(x, "onFileSaving", js.Any.fromFunction1((t0: /* e */ FileSavingEventInfo[TComponent]) => value(t0).runNow()))
    
    inline def setOnFileSavingUndefined: Self = StObject.set(x, "onFileSaving", js.undefined)
    
    inline def setOnIncidentOccurred(value: /* e */ EventInfo[TComponent] & IncidentInfo => Callback): Self = StObject.set(x, "onIncidentOccurred", js.Any.fromFunction1((t0: /* e */ EventInfo[TComponent] & IncidentInfo) => value(t0).runNow()))
    
    inline def setOnIncidentOccurredUndefined: Self = StObject.set(x, "onIncidentOccurred", js.undefined)
    
    inline def setPathModified(value: Boolean): Self = StObject.set(x, "pathModified", value.asInstanceOf[js.Any])
    
    inline def setPathModifiedUndefined: Self = StObject.set(x, "pathModified", js.undefined)
    
    inline def setRedrawOnResize(value: Boolean): Self = StObject.set(x, "redrawOnResize", value.asInstanceOf[js.Any])
    
    inline def setRedrawOnResizeUndefined: Self = StObject.set(x, "redrawOnResize", js.undefined)
    
    inline def setSize(value: BaseWidgetSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: BaseWidgetTitle | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: BaseWidgetTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
