package typingsJapgolly.ejWebAll.ej.ReportViewer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires before the ajax request process started.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.undefined
  /** Fires when ajax request failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
  /** Fires when ajax post call succeed.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
  /** Enables and disables the rendering of Viewer when default values are specified for the parameters.
    * @Default {true}
    */
  var autoRender: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets the list of data sources for the RDLC report.
    * @Default {[]}
    */
  var dataSources: js.UndefOr[js.Array[DataSource]] = js.undefined
  /** Fires when the report viewer is destroyed successfully.If you want to perform any operation after destroying the reportviewer control,you can make use of the destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Fires during drill through action done in report.If you want to perform any operation when a drill through action is performed, you can make use of the drillThrough event.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.undefined
  /** Enables and disables the data source credential block scroller.
    * @Default {true}
    */
  var enableDatasourceBlockScroller: js.UndefOr[Boolean] = js.undefined
  /** Enables and disables the drop-down parameter search.
    * @Default {false}
    */
  var enableDropDownSearch: js.UndefOr[Boolean] = js.undefined
  /** Enables and disables the Error Notification bar.
    * @Default {true}
    */
  var enableNotificationBar: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the page cache of report.
    * @Default {false}
    */
  var enablePageCache: js.UndefOr[Boolean] = js.undefined
  /** Enables and disables the PageVirtualization.
    * @Default {false}
    */
  var enablePageVirtualization: js.UndefOr[Boolean] = js.undefined
  /** Enables and disables the parameter block scroller.
    * @Default {true}
    */
  var enableParameterBlockScroller: js.UndefOr[Boolean] = js.undefined
  /** Fires when the export items are clicked. To perform any operation when the export items are clicked, use the exportItemClick event.
    */
  var exportItemClick: js.UndefOr[js.Function1[/* e */ ExportItemClickEventArgs, Unit]] = js.undefined
  /** Fires when the export progress is changed. To perform any operation when the export progress is changed, use the exportProgressChanged event.
    */
  var exportProgressChanged: js.UndefOr[js.Function1[/* e */ ExportProgressChangedEventArgs, Unit]] = js.undefined
  /** Specifies the export settings.
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Fires when the hyperlink action is performed in the report. To perform any operation during the hyperlink action, use the hyperlink event.
    */
  var hyperlink: js.UndefOr[js.Function1[/* e */ HyperlinkEventArgs, Unit]] = js.undefined
  /** When set to true, adapts the report layout to fit the screen size of devices on which it renders.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Specifies the locale for report viewer.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Specifies the page settings.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.undefined
  /** Specifies the parameter settings.
    */
  var parameterSettings: js.UndefOr[ParameterSettings] = js.undefined
  /** Fires when the dependent parameter value is the parameter block. You can add custom user interface, loading indicator and modify the default progress text, using the
    * ParameterUpdateStateChange event.
    */
  var parameterUpdateStateChange: js.UndefOr[js.Function1[/* e */ ParameterUpdateStateChangeEventArgs, Unit]] = js.undefined
  /** Gets or sets the list of parameters associated with the report.
    * @Default {[]}
    */
  var parameters: js.UndefOr[js.Array[Parameter]] = js.undefined
  /** Enables and disables the print mode.
    * @Default {false}
    */
  var printMode: js.UndefOr[Boolean] = js.undefined
  /** Specifies the print option of the report.
    * @Default {ej.ReportViewer.PrintOptions.Default}
    */
  var printOption: js.UndefOr[PrintOptions | String] = js.undefined
  /** Fires when the print progress is changed. To perform any operation when the print progress is changed, use the printProgressChanged event.
    */
  var printProgressChanged: js.UndefOr[js.Function1[/* e */ PrintProgressChangedEventArgs, Unit]] = js.undefined
  /** Specifies the processing mode of the report.
    * @Default {ej.ReportViewer.ProcessingMode.Remote}
    */
  var processingMode: js.UndefOr[ProcessingMode | String] = js.undefined
  /** Specifies the render layout.
    * @Default {ej.ReportViewer.RenderMode.Default}
    */
  var renderMode: js.UndefOr[RenderMode | String] = js.undefined
  /** Fires before report rendering is completed.If you want to perform any operation before the rendering of report,you can make use of the renderingBegin event.
    */
  var renderingBegin: js.UndefOr[js.Function1[/* e */ RenderingBeginEventArgs, Unit]] = js.undefined
  /** Fires after report rendering completed.If you want to perform any operation after the rendering of report,you can make use of this renderingComplete event.
    */
  var renderingComplete: js.UndefOr[js.Function1[/* e */ RenderingCompleteEventArgs, Unit]] = js.undefined
  /** Fires when any error occurred while rendering the report.If you want to perform any operation when an error occurs in the report, you can make use of the reportError event.
    */
  var reportError: js.UndefOr[js.Function1[/* e */ ReportErrorEventArgs, Unit]] = js.undefined
  /** Fires when the report is being exported.If you want to perform any operation before exporting of report, you can make use of the reportExport event.
    */
  var reportExport: js.UndefOr[js.Function1[/* e */ ReportExportEventArgs, Unit]] = js.undefined
  /** Fires when the report is loaded.If you want to perform any operation after the successful loading of report, you can make use of the reportLoaded event.
    */
  var reportLoaded: js.UndefOr[js.Function1[/* e */ ReportLoadedEventArgs, Unit]] = js.undefined
  /** Gets or sets the path of the report file.
    * @Default {empty}
    */
  var reportPath: js.UndefOr[String] = js.undefined
  /** Fires when the report print action is performed in the report. To perform any operation during the report print action, use the ReportPrint event.
    */
  var reportPrint: js.UndefOr[js.Function1[/* e */ ReportPrintEventArgs, Unit]] = js.undefined
  /** Gets or sets the reports server URL.
    * @Default {empty}
    */
  var reportServerUrl: js.UndefOr[String] = js.undefined
  /** Specifies the report Web API service URL.
    * @Default {empty}
    */
  var reportServiceUrl: js.UndefOr[String] = js.undefined
  /** Specifies the token for authorizing reporting service url to process the reports.
    * @Default {empty}
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.undefined
  /** Fires when user clicks on a failed report item in the rendered report, before displaying error details dialog. If you want to show custom error detail or perform any action before
    * viewing error detail, you can make use of the showError event.
    */
  var showError: js.UndefOr[js.Function1[/* e */ ShowErrorEventArgs, Unit]] = js.undefined
  /** Gets or sets the showExceptionsInDialog for report viewer.
    * @Default {false}
    */
  var showExceptionsInDialog: js.UndefOr[Boolean] = js.undefined
  /** Render the ReportViewer height based on the report content size.
    * @Default {false}
    */
  var sizeToReportContent: js.UndefOr[Boolean] = js.undefined
  /** Fires when the toolbar items are clicked. To perform any operation when the toolbar items are clicked, use the toolBarItemClick event.
    */
  var toolBarItemClick: js.UndefOr[js.Function1[/* e */ ToolBarItemClickEventArgs, Unit]] = js.undefined
  /** This event will be triggered on rendering the Report Viewer toolbar.
    */
  var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, Unit]] = js.undefined
  /** Specifies the toolbar settings.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  /** Fires when click the View Report Button.
    */
  var viewReportClick: js.UndefOr[js.Function1[/* e */ ViewReportClickEventArgs, Unit]] = js.undefined
  /** Gets or sets the zoom factor for report viewer.
    * @Default {1}
    */
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    ajaxBeforeLoad: /* e */ AjaxBeforeLoadEventArgs => Callback = null,
    ajaxError: /* e */ AjaxErrorEventArgs => Callback = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => Callback = null,
    autoRender: js.UndefOr[Boolean] = js.undefined,
    dataSources: js.Array[DataSource] = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    drillThrough: /* e */ DrillThroughEventArgs => Callback = null,
    enableDatasourceBlockScroller: js.UndefOr[Boolean] = js.undefined,
    enableDropDownSearch: js.UndefOr[Boolean] = js.undefined,
    enableNotificationBar: js.UndefOr[Boolean] = js.undefined,
    enablePageCache: js.UndefOr[Boolean] = js.undefined,
    enablePageVirtualization: js.UndefOr[Boolean] = js.undefined,
    enableParameterBlockScroller: js.UndefOr[Boolean] = js.undefined,
    exportItemClick: /* e */ ExportItemClickEventArgs => Callback = null,
    exportProgressChanged: /* e */ ExportProgressChangedEventArgs => Callback = null,
    exportSettings: ExportSettings = null,
    hyperlink: /* e */ HyperlinkEventArgs => Callback = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    pageSettings: PageSettings = null,
    parameterSettings: ParameterSettings = null,
    parameterUpdateStateChange: /* e */ ParameterUpdateStateChangeEventArgs => Callback = null,
    parameters: js.Array[Parameter] = null,
    printMode: js.UndefOr[Boolean] = js.undefined,
    printOption: PrintOptions | String = null,
    printProgressChanged: /* e */ PrintProgressChangedEventArgs => Callback = null,
    processingMode: ProcessingMode | String = null,
    renderMode: RenderMode | String = null,
    renderingBegin: /* e */ RenderingBeginEventArgs => Callback = null,
    renderingComplete: /* e */ RenderingCompleteEventArgs => Callback = null,
    reportError: /* e */ ReportErrorEventArgs => Callback = null,
    reportExport: /* e */ ReportExportEventArgs => Callback = null,
    reportLoaded: /* e */ ReportLoadedEventArgs => Callback = null,
    reportPath: String = null,
    reportPrint: /* e */ ReportPrintEventArgs => Callback = null,
    reportServerUrl: String = null,
    reportServiceUrl: String = null,
    serviceAuthorizationToken: String = null,
    showError: /* e */ ShowErrorEventArgs => Callback = null,
    showExceptionsInDialog: js.UndefOr[Boolean] = js.undefined,
    sizeToReportContent: js.UndefOr[Boolean] = js.undefined,
    toolBarItemClick: /* e */ ToolBarItemClickEventArgs => Callback = null,
    toolbarRendering: /* e */ ToolbarRenderingEventArgs => Callback = null,
    toolbarSettings: ToolbarSettings = null,
    viewReportClick: /* e */ ViewReportClickEventArgs => Callback = null,
    zoomFactor: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxBeforeLoad != null) __obj.updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.AjaxBeforeLoadEventArgs) => ajaxBeforeLoad(t0).runNow()))
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.AjaxErrorEventArgs) => ajaxError(t0).runNow()))
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.AjaxSuccessEventArgs) => ajaxSuccess(t0).runNow()))
    if (!js.isUndefined(autoRender)) __obj.updateDynamic("autoRender")(autoRender.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.DestroyEventArgs) => destroy(t0).runNow()))
    if (drillThrough != null) __obj.updateDynamic("drillThrough")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.DrillThroughEventArgs) => drillThrough(t0).runNow()))
    if (!js.isUndefined(enableDatasourceBlockScroller)) __obj.updateDynamic("enableDatasourceBlockScroller")(enableDatasourceBlockScroller.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDropDownSearch)) __obj.updateDynamic("enableDropDownSearch")(enableDropDownSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNotificationBar)) __obj.updateDynamic("enableNotificationBar")(enableNotificationBar.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePageCache)) __obj.updateDynamic("enablePageCache")(enablePageCache.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePageVirtualization)) __obj.updateDynamic("enablePageVirtualization")(enablePageVirtualization.asInstanceOf[js.Any])
    if (!js.isUndefined(enableParameterBlockScroller)) __obj.updateDynamic("enableParameterBlockScroller")(enableParameterBlockScroller.asInstanceOf[js.Any])
    if (exportItemClick != null) __obj.updateDynamic("exportItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ExportItemClickEventArgs) => exportItemClick(t0).runNow()))
    if (exportProgressChanged != null) __obj.updateDynamic("exportProgressChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ExportProgressChangedEventArgs) => exportProgressChanged(t0).runNow()))
    if (exportSettings != null) __obj.updateDynamic("exportSettings")(exportSettings.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.HyperlinkEventArgs) => hyperlink(t0).runNow()))
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pageSettings != null) __obj.updateDynamic("pageSettings")(pageSettings.asInstanceOf[js.Any])
    if (parameterSettings != null) __obj.updateDynamic("parameterSettings")(parameterSettings.asInstanceOf[js.Any])
    if (parameterUpdateStateChange != null) __obj.updateDynamic("parameterUpdateStateChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ParameterUpdateStateChangeEventArgs) => parameterUpdateStateChange(t0).runNow()))
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(printMode)) __obj.updateDynamic("printMode")(printMode.asInstanceOf[js.Any])
    if (printOption != null) __obj.updateDynamic("printOption")(printOption.asInstanceOf[js.Any])
    if (printProgressChanged != null) __obj.updateDynamic("printProgressChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.PrintProgressChangedEventArgs) => printProgressChanged(t0).runNow()))
    if (processingMode != null) __obj.updateDynamic("processingMode")(processingMode.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (renderingBegin != null) __obj.updateDynamic("renderingBegin")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.RenderingBeginEventArgs) => renderingBegin(t0).runNow()))
    if (renderingComplete != null) __obj.updateDynamic("renderingComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.RenderingCompleteEventArgs) => renderingComplete(t0).runNow()))
    if (reportError != null) __obj.updateDynamic("reportError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ReportErrorEventArgs) => reportError(t0).runNow()))
    if (reportExport != null) __obj.updateDynamic("reportExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ReportExportEventArgs) => reportExport(t0).runNow()))
    if (reportLoaded != null) __obj.updateDynamic("reportLoaded")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ReportLoadedEventArgs) => reportLoaded(t0).runNow()))
    if (reportPath != null) __obj.updateDynamic("reportPath")(reportPath.asInstanceOf[js.Any])
    if (reportPrint != null) __obj.updateDynamic("reportPrint")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ReportPrintEventArgs) => reportPrint(t0).runNow()))
    if (reportServerUrl != null) __obj.updateDynamic("reportServerUrl")(reportServerUrl.asInstanceOf[js.Any])
    if (reportServiceUrl != null) __obj.updateDynamic("reportServiceUrl")(reportServiceUrl.asInstanceOf[js.Any])
    if (serviceAuthorizationToken != null) __obj.updateDynamic("serviceAuthorizationToken")(serviceAuthorizationToken.asInstanceOf[js.Any])
    if (showError != null) __obj.updateDynamic("showError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ShowErrorEventArgs) => showError(t0).runNow()))
    if (!js.isUndefined(showExceptionsInDialog)) __obj.updateDynamic("showExceptionsInDialog")(showExceptionsInDialog.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeToReportContent)) __obj.updateDynamic("sizeToReportContent")(sizeToReportContent.asInstanceOf[js.Any])
    if (toolBarItemClick != null) __obj.updateDynamic("toolBarItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ToolBarItemClickEventArgs) => toolBarItemClick(t0).runNow()))
    if (toolbarRendering != null) __obj.updateDynamic("toolbarRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ToolbarRenderingEventArgs) => toolbarRendering(t0).runNow()))
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings.asInstanceOf[js.Any])
    if (viewReportClick != null) __obj.updateDynamic("viewReportClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ReportViewer.ViewReportClickEventArgs) => viewReportClick(t0).runNow()))
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

