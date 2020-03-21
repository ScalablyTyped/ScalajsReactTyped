package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options related to exporting a dashboard/dashboard item to the PDF format.
  */
@JSGlobal("DashboardPdfExportOptions")
@js.native
class DashboardPdfExportOptions () extends js.Object {
  /**
    * Gets or sets the number of horizontal/vertical pages spanning the total width/height of a dashboard/dashboard item.
    */
  var AutoFitPageCount: Double = js.native
  /**
    * Gets or sets whether cards within the Card dashboard item are arranged automatically on the exported page.
    */
  var CardAutoArrangeContent: Boolean = js.native
  /**
    * Gets or sets whether the page orientation used to export the Chart dashboard item is selected automatically.
    */
  var ChartAutomaticPageLayout: Boolean = js.native
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    */
  var ChartSizeMode: String = js.native
  /**
    * Gets or sets whether the page orientation used to export a dashboard is selected automatically.
    */
  var DashboardAutomaticPageLayout: Boolean = js.native
  /**
    * Gets or sets a position of the dashboard state (such as master filter or current parameter values) in the exported document.
    */
  var DashboardStatePosition: String = js.native
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var DocumentScaleMode: String = js.native
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    */
  var ExportFilters: Boolean = js.native
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    */
  var ExportParameters: Boolean = js.native
  var FontInfo: ExportFontInfo = js.native
  /**
    * Gets or sets whether gauges within the Gauge dashboard item are arranged automatically on the exported page.
    */
  var GaugeAutoArrangeContent: Boolean = js.native
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    */
  var GridFitToPageWidth: Boolean = js.native
  /**
    * Gets or sets whether to add column headers of the Grid dashboard item to every page.
    */
  var GridPrintHeadersOnEveryPage: Boolean = js.native
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  var IncludeHiddenParameters: Boolean = js.native
  /**
    * Gets or sets whether the page orientation used to export the Map dashboard item is selected automatically.
    */
  var MapAutomaticPageLayout: Boolean = js.native
  /**
    * Gets or sets the export size mode for the Map dashboard item.
    */
  var MapSizeMode: String = js.native
  /**
    * Gets or sets the page orientation used to export a dashboard/dashboard item.
    */
  var PageLayout: String = js.native
  /**
    * Gets or sets the type of paper for the exported document.
    */
  var PaperKind: String = js.native
  /**
    * Gets or sets whether pies within the Pie dashboard item are arranged automatically on the exported page.
    */
  var PieAutoArrangeContent: Boolean = js.native
  /**
    * Gets or sets whether to add column headers of the Pivot dashboard item to every page.
    */
  var PivotPrintHeadersOnEveryPage: Boolean = js.native
  /**
    * Gets or sets whether the page orientation used to export the Range Filter dashboard item is selected automatically.
    */
  var RangeFilterAutomaticPageLayout: Boolean = js.native
  /**
    * Gets or sets the export size mode for the Range Filter dashboard item.
    */
  var RangeFilterSizeMode: String = js.native
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    */
  var ScaleFactor: Double = js.native
  /** @deprecated The ScaleMode property is obsolete now. Use the DocumentScaleMode and DashboardAutomaticPageLayout property instead. */
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var ScaleMode: String = js.native
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  var ShowTitle: Boolean = js.native
  /**
    * Gets or sets the title of the exported document.
    */
  var Title: String = js.native
  /**
    * Gets or sets whether the page orientation used to export the Treemap dashboard item is selected automatically.
    */
  var TreemapAutomaticPageLayout: Boolean = js.native
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    */
  var TreemapSizeMode: String = js.native
}

