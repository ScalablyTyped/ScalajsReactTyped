package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.argumentAxisClick
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.disposing
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.done
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.drawn
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.exported
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.exporting
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.fileSaving
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.incidentOccurred
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.legendClick
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.optionChanged
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.pointClick
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.pointHoverChanged
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.pointSelectionChanged
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.seriesClick
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.seriesHoverChanged
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.seriesSelectionChanged
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.tooltipHidden
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.tooltipShown
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.zoomEnd
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.zoomStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapChart
  extends StObject
     with Control {
  
  def exportTo(format: String, fileName: String): Unit = js.native
  
  def getDataSource(): Any = js.native
  
  def getInstance(): Any = js.native
  
  def off(
    eventName: Unit,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      js.UndefOr[
        BootstrapChartElementActionEventArgs | BootstrapChartElementClickEventArgs | BootstrapChartErrorEventArgs | BootstrapChartEventArgsBase | BootstrapChartExportEventArgs | BootstrapChartOptionChangedEventArgs | BootstrapChartZoomEndEventArgs
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_argumentAxisClick(eventName: argumentAxisClick): this.type = js.native
  @JSName("off")
  def off_argumentAxisClick(
    eventName: argumentAxisClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_disposing(eventName: disposing): this.type = js.native
  @JSName("off")
  def off_disposing(
    eventName: disposing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_done(eventName: done): this.type = js.native
  @JSName("off")
  def off_done(
    eventName: done,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_drawn(eventName: drawn): this.type = js.native
  @JSName("off")
  def off_drawn(
    eventName: drawn,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_exported(eventName: exported): this.type = js.native
  @JSName("off")
  def off_exported(
    eventName: exported,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_exporting(eventName: exporting): this.type = js.native
  @JSName("off")
  def off_exporting(
    eventName: exporting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_fileSaving(eventName: fileSaving): this.type = js.native
  @JSName("off")
  def off_fileSaving(
    eventName: fileSaving,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_incidentOccurred(eventName: incidentOccurred): this.type = js.native
  @JSName("off")
  def off_incidentOccurred(
    eventName: incidentOccurred,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_legendClick(eventName: legendClick): this.type = js.native
  @JSName("off")
  def off_legendClick(
    eventName: legendClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_optionChanged(eventName: optionChanged): this.type = js.native
  @JSName("off")
  def off_optionChanged(
    eventName: optionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartOptionChangedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pointClick(eventName: pointClick): this.type = js.native
  @JSName("off")
  def off_pointClick(
    eventName: pointClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pointHoverChanged(eventName: pointHoverChanged): this.type = js.native
  @JSName("off")
  def off_pointHoverChanged(
    eventName: pointHoverChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pointSelectionChanged(eventName: pointSelectionChanged): this.type = js.native
  @JSName("off")
  def off_pointSelectionChanged(
    eventName: pointSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_seriesClick(eventName: seriesClick): this.type = js.native
  @JSName("off")
  def off_seriesClick(
    eventName: seriesClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_seriesHoverChanged(eventName: seriesHoverChanged): this.type = js.native
  @JSName("off")
  def off_seriesHoverChanged(
    eventName: seriesHoverChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_seriesSelectionChanged(eventName: seriesSelectionChanged): this.type = js.native
  @JSName("off")
  def off_seriesSelectionChanged(
    eventName: seriesSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_tooltipHidden(eventName: tooltipHidden): this.type = js.native
  @JSName("off")
  def off_tooltipHidden(
    eventName: tooltipHidden,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_tooltipShown(eventName: tooltipShown): this.type = js.native
  @JSName("off")
  def off_tooltipShown(
    eventName: tooltipShown,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomEnd(eventName: zoomEnd): this.type = js.native
  @JSName("off")
  def off_zoomEnd(
    eventName: zoomEnd,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartZoomEndEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_zoomStart(eventName: zoomStart): this.type = js.native
  @JSName("off")
  def off_zoomStart(
    eventName: zoomStart,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_argumentAxisClick(
    eventName: argumentAxisClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_disposing(
    eventName: disposing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_done(
    eventName: done,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_drawn(
    eventName: drawn,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_exported(
    eventName: exported,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_exporting(
    eventName: exporting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fileSaving(
    eventName: fileSaving,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_incidentOccurred(
    eventName: incidentOccurred,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_legendClick(
    eventName: legendClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_optionChanged(
    eventName: optionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartOptionChangedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pointClick(
    eventName: pointClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pointHoverChanged(
    eventName: pointHoverChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pointSelectionChanged(
    eventName: pointSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_seriesClick(
    eventName: seriesClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_seriesHoverChanged(
    eventName: seriesHoverChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_seriesSelectionChanged(
    eventName: seriesSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_tooltipHidden(
    eventName: tooltipHidden,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_tooltipShown(
    eventName: tooltipShown,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomEnd(
    eventName: zoomEnd,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartZoomEndEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_zoomStart(
    eventName: zoomStart,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_argumentAxisClick(
    eventName: argumentAxisClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_disposing(
    eventName: disposing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_done(
    eventName: done,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_drawn(
    eventName: drawn,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_exported(
    eventName: exported,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_exporting(
    eventName: exporting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_fileSaving(
    eventName: fileSaving,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_incidentOccurred(
    eventName: incidentOccurred,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_legendClick(
    eventName: legendClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_optionChanged(
    eventName: optionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartOptionChangedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pointClick(
    eventName: pointClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pointHoverChanged(
    eventName: pointHoverChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pointSelectionChanged(
    eventName: pointSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_seriesClick(
    eventName: seriesClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_seriesHoverChanged(
    eventName: seriesHoverChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_seriesSelectionChanged(
    eventName: seriesSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_tooltipHidden(
    eventName: tooltipHidden,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_tooltipShown(
    eventName: tooltipShown,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomEnd(
    eventName: zoomEnd,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartZoomEndEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_zoomStart(
    eventName: zoomStart,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  
  def print(): Unit = js.native
  
  def setDataSource(dataSource: Any): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
}
