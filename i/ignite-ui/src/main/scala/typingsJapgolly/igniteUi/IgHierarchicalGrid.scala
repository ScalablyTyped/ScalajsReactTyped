package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgHierarchicalGrid
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * If this option is set to true, the height of the grid row will be calculated automatically based on the [avgRowHeight](ui.ighierarchicalgrid#options:avgRowHeight) and the visible virtual records. If no [avgRowHeight](ui.ighierarchicalgrid#options:avgRowHeight) is specified, it will be calculated automatically at runtime.
    *
    */
  var adjustVirtualHeights: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the following behavior will take place:
    * If a new row is added, and then deleted, there will be no transaction added to the log.
    * If a new row is added, edited, then deleted, there will be no transaction added to the log.
    * If several edits are made to a row or an individual cell, this should result in a single transaction.
    * Note: This option takes effect only when [autoCommit](ui.ighierarchicalgrid#options:autoCommit) is set to false.
    *
    */
  var aggregateTransactions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables/disables rendering of alternating row styles (odd and even rows receive different styling).
    *
    */
  var alternateRowStyles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The row expanding/collapsing animation duration in ms.
    *
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * If autoAdjustHeight is set to false, the [height](ui.ighierarchicalgrid#options:height) will be set only on the scrolling container, and all other UI elements such as paging footer / filter row / headers will add on top of that, so the total height of the grid will be more than this value - the height of the scroll container (content area) will not be dynamically calculated. Setting this option to false will usually result in a lot better initial rendering performance for large data sets ( > 1000 rows rendered at once, no [virtualization](ui.ighierarchicalgrid#options:virtualization) enabled), since no reflows will be made by browsers when accessing DOM properties such as offsetHeight.
    *
    */
  var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Automatically commits the transactions as rows/cells are being edited to the client data source. A [saveChanges](ui.ighierarchicalgrid#methods:saveChanges) call still needs to be performed in order to commit the transactions to a server-side data source.
    *
    */
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets gets ability to automatically format text in cells for numeric and date columns. The format patterns and rules for numbers and dates are defined in $.ig.regional.defaults object. [Here column formatting is explained in details](http://www.igniteui.com/help/iggrid-columns-and-layout#column-formatting)
    *
    *
    * Valid values:
    * "date" formats only Date columns
    * "number" formats only number columns
    * "dateandnumber" formats both Date and number columns
    * "true" formats Date and number columns
    * "false" auto formatting is disabled
    */
  var autoFormat: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * If no [columns](ui.ighierarchicalgrid#options:columns) collection is defined, and autoGenerateColumns is set to true, [columns](ui.ighierarchicalgrid#options:columns) will be inferred from the data source before the [dataRendering](ui.iggrid#events:dataRendering) event is fired. The inferred [columns](ui.ighierarchicalgrid#options:columns) collection will be available to the developer for modification at [dataRendering](ui.iggrid#events:dataRendering). If autoGenerateColumns is not explicitly set and [columns](ui.ighierarchicalgrid#options:columns) has at least one column defined then autoGenerateColumns is automatically set to false.
    * If autoGenerateColumns is true and there are columns defined auto-generated columns will render after the explicitly defined ones.
    * Since auto-generated columns don't have width defined consider setting [defaultColumnWidth](ui.ighierarchicalgrid#options:defaultColumnWidth) as well.
    *
    */
  var autoGenerateColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, will autogenerate all layouts assuming default values for "childrenDataProperty"
    * When autoGenerateLayouts is enabled, it will automatically generate all columns recursively. (all columns on all levels)
    *
    */
  var autoGenerateLayouts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true and all columns' widths are specified and their combined width is less than the grid width then the last column width will be automatically adjusted to fill the remaining empty space of the grid.
    *
    */
  var autofitLastColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used for [column virtualization](ui.ighierarchicalgrid#options:columnVirtualization) in [fixed mode](ui.ighierarchicalgrid#options:virtualizationMode). This is the average value in pixels for a column width.
    *
    *
    * Valid values:
    * "string" The avarage column width can be set in pixels ("25px").
    * "number" The avarage column width can be set in pixels as a number (25).
    */
  var avgColumnWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Used for [row virtualization](ui.ighierarchicalgrid#options:rowVirtualization) in [fixed mode](ui.ighierarchicalgrid#options:virtualizationMode). This is the average value in pixels (default) that will be used to calculate how many rows to render as the end user scrolls. Also all rows' height will be automatically set to this value.
    *
    *
    * Valid values:
    * "string" The avarage row height can be set in pixels ("25px").
    * "number" The avarage row height can be set in pixels as a number (25).
    */
  var avgRowHeight: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Caption text that will be shown above the grid header.
    *
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after the caption has been rendered.
    */
  var captionRendered: js.UndefOr[CaptionRenderedEvent] = js.undefined
  
  /**
    * Event fired before the caption starts its rendering.
    * Return false in order to cancel caption rendering.
    */
  var captionRendering: js.UndefOr[CaptionRenderingEvent] = js.undefined
  
  /**
    * Event fired when a cell is clicked.
    */
  var cellClick: js.UndefOr[CellClickEvent] = js.undefined
  
  /**
    * Event fired when a cell is right clicked.
    */
  var cellRightClick: js.UndefOr[CellRightClickEvent] = js.undefined
  
  /**
    * Event fired after a child grid is created
    */
  var childGridCreated: js.UndefOr[ChildGridCreatedEvent] = js.undefined
  
  /**
    * Event fired before a child grid is going to be created, allows the developer to override the child grid creation
    */
  var childGridCreating: js.UndefOr[ChildGridCreatingEvent] = js.undefined
  
  /**
    * Event fired when child grid is rendered
    */
  var childGridRendered: js.UndefOr[ChildGridRenderedEvent] = js.undefined
  
  /**
    * Event which is fired when children have been populated (Load on demand)
    */
  var childrenPopulated: js.UndefOr[ChildrenPopulatedEvent] = js.undefined
  
  /**
    * Event which is fired when children are about to be populated (Load on demand)
    */
  var childrenPopulating: js.UndefOr[ChildrenPopulatingEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the default tooltip applied to an expand column cell, that is currently expanded. Use option [locale.collapseTooltip](ui.ighierarchicalgrid#options:locale.collapseTooltip).
    */
  var collapseTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * List of columnLayout objects that specify the structure of the child grids. All options that are applicable to a flat grid are also applicable here
    *
    */
  var columnLayouts: js.UndefOr[js.Array[IgHierarchicalGridColumnLayout]] = js.undefined
  
  /**
    * Enables virtualization for columns only. Column virtualization can work only in combination with fixed row virtalization. Setting columnVirtualization to true will automatically set [virtualization](ui.ighierarchicalgrid#options:virtualization) to true and [virtualizationMode](ui.ighierarchicalgrid#options:virtualizationMode) to "fixed".
    *
    */
  var columnVirtualization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of column objects. Checkout the [Columns and Layout](http://www.igniteui.com/help/iggrid-columns-and-layout#defining-columns) topic for details on configuring the columns array.
    *
    */
  var columns: js.UndefOr[js.Array[IgHierarchicalGridColumn]] = js.undefined
  
  /**
    * Event fired after the columns colection has been modified(e.g. a column is hidden)
    */
  var columnsCollectionModified: js.UndefOr[ColumnsCollectionModifiedEvent] = js.undefined
  
  /**
    * Fired when the grid is created and the initial structure is rendered (this doesn't necessarily imply the data will be there if the data source is remote)
    */
  var created: js.UndefOr[CreatedEvent] = js.undefined
  
  /**
    * Event fired before data binding takes place.
    *
    * Return false in order to cancel data binding.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  
  /**
    * Event fired after data binding is complete.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.undefined
  
  /**
    * Event fired after all of the data records in the grid table body have been rendered.
    */
  var dataRendered: js.UndefOr[DataRenderedEvent] = js.undefined
  
  /**
    * Event fired before the TBODY holding the data records starts its rendering.
    * Return false in order to cancel data records rendering.
    */
  var dataRendering: js.UndefOr[DataRenderingEvent] = js.undefined
  
  /**
    * Can be any valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an $.ig.DataSource itself
    *
    *
    * Valid values:
    * "string" DataSource as a string. For example a Url.
    * "array" DataSource as an array.
    * "object" DataSource as an object. For example a JSON object
    */
  var dataSource: js.UndefOr[String | js.Array[Any] | js.Object] = js.undefined
  
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type).
    *
    */
  var dataSourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a remote URL as a data source, from which data will be retrieved using the [$.ig.DataSource](ig.datasource).
    *
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the default property in the response where children will be located
    *
    */
  var defaultChildrenDataProperty: js.UndefOr[String] = js.undefined
  
  /**
    * Default column width that will be set for all columns, that don't have [column width](ui.ighierarchicalgrid#options:columns.width) defined.
    *
    *
    * Valid values:
    * "string" The default column width can be set in pixels ("100px").
    * "number" The default column width can be set in pixels as a number (100).
    */
  var defaultColumnWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Fired when the grid is destroyed
    */
  var destroyed: js.UndefOr[DestroyedEvent] = js.undefined
  
  /**
    * Enables/disables rendering of hover styles when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
    *
    */
  var enableHoverStyles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables/disables grid adjusting its dimensions when its [width](ui.ighierarchicalgrid#options:width) and/or [height](ui.ighierarchicalgrid#options:height) is set in percent (%) and grid parent DOM container is resized.
    *
    */
  var enableResizeContainerCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Nables/Disables serializing client date as UTC ISO 8061 string instead of using the local time and zone values.
    *
    */
  var enableUTCDates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the expand column width
    *
    */
  var expandColWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Applies a linear animation - either expanding or collapsing depending on the parent row state
    *
    */
  var expandCollapseAnimations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the default tooltip applied to an expand column cell, that is currently collapsed. Use option [locale.columnChooserCaptionText](ui.ighierarchicalgrid#options:locale.expandTooltip).
    */
  var expandTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * Configures how the feature chooser icon should display on header cells - e.g. to display as gear icon or not.
    *
    *
    * Valid values:
    * "none" Always hide the feature chooser icon; The feature chooser is shown on tapping/clicking the column header.
    * "desktopOnly" Always show the icon on desktop but hide when touch device detected.
    * "always" Always show it in any environment. Chooser is shown when tapping the gear icon or column header.
    */
  var featureChooserIconDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * List of grid feature definitions: sorting, paging, etc. Each feature goes with its separate options that are documented for the feature accordingly. [Here you can find detailed documentation for all igGrid features](http://www.igniteui.com/help/iggrid-features-landing-page)
    *
    */
  var features: js.UndefOr[js.Array[IgHierarchicalGridFeature]] = js.undefined
  
  /**
    * Footers will be fixed if this option is set to true, and only the grid data will be scrollable. If [virtualization](ui.ighierarchicalgrid#options:virtualization) is enabled, fixedFooters will always act as if it's true, no matter which value is set.
    *
    */
  var fixedFooters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Headers will be fixed if this option is set to true, and only the grid data will be scrollable. If [virtualization](ui.ighierarchicalgrid#options:virtualization) is enabled, fixedHeaders will always act as if it's true, no matter which value is set.
    *
    */
  var fixedHeaders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired after the footer has been rendered.
    */
  var footerRendered: js.UndefOr[FooterRenderedEvent] = js.undefined
  
  /**
    * Event fired before the footer starts its rendering.
    *
    * Return false in order to cancel footer rendering.
    */
  var footerRendering: js.UndefOr[FooterRenderingEvent] = js.undefined
  
  /**
    * Event fired after every TH in the grid header has been rendered.
    */
  var headerCellRendered: js.UndefOr[HeaderCellRenderedEvent] = js.undefined
  
  /**
    * Event fired after the header has been rendered.
    */
  var headerRendered: js.UndefOr[HeaderRenderedEvent] = js.undefined
  
  /**
    * Event fired before the header starts its rendering.
    * Return false in order to cancel header rendering.
    */
  var headerRendering: js.UndefOr[HeaderRenderingEvent] = js.undefined
  
  /**
    * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row - (if any), etc. [Here you can find more info about setting igGrid height](http://www.igniteui.com/help/iggrid-columns-and-layout#width-height).
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number
    * "null" will stretch vertically to fit data.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Only the first level will be data-bound initially. Also serves as "render" depth, meaning that depending on this prop, the grid will render the child grids up to the specified level.
    *
    */
  var initialDataBindDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * No levels will be automatically expanded when the widget is instantiated for the first time
    *
    */
  var initialExpandDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * When dataSource is a remote URL, defines whether to set the type of the remote data source to JSONP.
    *
    */
  var jsonpRequest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * If this option is set to false, the data to which the grid is bound will be used "as is" with no additional transformations based on [columns](ui.ighierarchicalgrid#options:columns) defined. Otherwise only the subset of data properties used in the [columns](ui.ighierarchicalgrid#options:columns) defined will be extracted in a new object and used.
    *
    */
  var localSchemaTransform: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[IgHierarchicalGridLocale] = js.undefined
  
  /**
    * Specifies the limit on the number of levels to bind to
    *
    */
  var maxDataBindDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * Merge unbound columns values inside data source when data source is remote. If true then the unbound columns are merged to the data source at runtime on the server. Note that data source is expanded with the new data and this could cause performance issues when the data is huge. If mergeUnboundColumns is false then the unbound data is sent and merged on the client. This option is used by the [igGrid MVC Helper](http://www.igniteui.com/help/iggrid-developing-asp-net-mvc-applications-with-iggrid).
    * Checkout [Populating Unbound Columns Remotely (igGrid)](http://www.igniteui.com/help/iggrid-unboundcolumns-populating-with-data-remotely) topic for more information.
    *
    */
  var mergeUnboundColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, encodes all requests using OData conventions and the $expand syntax
    *
    */
  var odata: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the delimiter for constructing paths , for hierarchical lookup of data
    *
    */
  var pathSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Key of the column containing unique identifiers for the data records.
    *
    */
  var primaryKey: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Gets sets ability to render checkboxes and use checkbox editor when dataType of a column is "bool". Checkboxes are not rendered for boolean values in columns with a [column template](ui.ighierarchicalgrid#options:columns.template).
    *
    */
  var renderCheckboxes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired after the whole grid widget has been rendered (including headers, footers, etc.).
    * This event is fired only when the grid is being initialized.
    * It will not be fired if the grid is rebound to its data
    * (for example, when calling the dataBind() API method
    * or when changing the page size (when paging is enabled)).
    */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  
  /**
    * Event fired before the grid starts rendering (all contents).
    * This event is fired only when the grid is being initialized.
    * It will not be fired if the grid is rebound to its data
    * (for example, when calling the dataBind() API method
    * or when changing the page size (when paging is enabled)).
    * Return false in order to cancel grid rendering.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  
  /**
    * Event fired if there is an error in the request, when the grid is doing a remote operation,
    * such as data binding, paging, sorting, etc.
    */
  var requestError: js.UndefOr[RequestErrorEvent] = js.undefined
  
  /**
    * Specifies the HTTP verb to be used to issue the requests to a remote data source.
    *
    */
  var requestType: js.UndefOr[String] = js.undefined
  
  /**
    * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType
    *
    */
  var responseContentType: js.UndefOr[String] = js.undefined
  
  /**
    * See [$.ig.DataSource responseDataKey](ig.datasource#options:settings.responseDataKey). This is the property in the responses where data records are held, if the response is wrapped.
    *
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  
  /**
    * See [$.ig.DataSource responseTotalRecCountKey](ig.datasource#options:settings.responseTotalRecCountKey). Property in the response specifying the total number of records on the server.
    *
    */
  var responseTotalRecCountKey: js.UndefOr[String] = js.undefined
  
  /**
    * If true, load on demand will be achieved using REST compliant resource access with appropriate url-s for
    * the ajax GET calls.
    *
    */
  var rest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Settings related to REST compliant update routines.
    *
    */
  var restSettings: js.UndefOr[IgHierarchicalGridRestSettings] = js.undefined
  
  /**
    * Event which is fired when a hierarchical row has been collapsed
    */
  var rowCollapsed: js.UndefOr[RowCollapsedEvent] = js.undefined
  
  /**
    * Event which is fired when a hierarchical row is about to be collapsed
    */
  var rowCollapsing: js.UndefOr[RowCollapsingEvent] = js.undefined
  
  /**
    * Event which is fired after a hierarchical row has been expanded
    */
  var rowExpanded: js.UndefOr[RowExpandedEvent] = js.undefined
  
  /**
    * Event which is fired when a hierarchical row is about to be expanded
    */
  var rowExpanding: js.UndefOr[RowExpandingEvent] = js.undefined
  
  /**
    * Enables virtualization for rows only. [Here you can find more info about igGrid row virtualization](http://www.igniteui.com/help/iggrid-virtualization-overview)
    *
    */
  var rowVirtualization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired after data rows are rendered.
    */
  var rowsRendered: js.UndefOr[RowsRenderedEvent] = js.undefined
  
  /**
    * Event fired before actual data rows (TRs) are rendered.
    * Return false in order to cancel rows rendering.
    */
  var rowsRendering: js.UndefOr[RowsRenderingEvent] = js.undefined
  
  /**
    * Event fired after $.ig.DataSource schema has been generated, in case it needs to be modified.
    */
  var schemaGenerated: js.UndefOr[SchemaGeneratedEvent] = js.undefined
  
  /**
    * Settings related to content scrolling.
    *
    */
  var scrollSettings: js.UndefOr[IgHierarchicalGridScrollSettings] = js.undefined
  
  /**
    * If true, the transaction log will always be sent in the request for remote data, by the data source. Also this means that if there are values in the log, a POST will be performed instead of GET.
    *
    */
  var serializeTransactionLog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls the visibility of the grid footer.
    *
    */
  var showFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls the visibility of the grid header.
    *
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Initial tabIndex attribute that will be set on all focusable elements.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The templating engine that will be used to render the grid [column templates](ui.ighierarchicalgrid#options:columns.template). [Here you can find](http://www.infragistics.com/community/blogs/marina_stoyanova/archive/2014/05/30/using-different-template-engines-with-ignite-ui-controls.aspx) how to use templating engines other than igTemplating and jsRender.
    *
    *
    * Valid values:
    * "infragistics" The grid will use the Infragistics Templating engine to render its [column templates](ui.ighierarchicalgrid#options:columns.template) and specific parts of the UI.
    * "jsRender" The grid will use jsRender to render its [column templates](ui.ighierarchicalgrid#options:columns.template) and specific parts of the UI.
    */
  var templatingEngine: js.UndefOr[String] = js.undefined
  
  /**
    * URL to which updating requests will be made.
    *
    */
  var updateUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Enables/disables column and row virtualization at the same time. Virtualization can greatly enhance rendering performance. If enabled, the number of actual rendered rows (DOM elements) will be constant and related to the visible viewport of the grid. As the end user scrolls, those DOM elements will be dynamically reused to render the new data. [Here you can find more info about the performance guidelines when using the igGrid](http://www.igniteui.com/help/iggrid-performance-guide)
    *
    */
  var virtualization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines row virtualization mode.
    *
    *
    * Valid values:
    * "fixed" Renders only the visible rows and/or columns in the grid. On scrolling the same rows and/or columns are updated with new data from the data source. Only fixed virtualization can work with column virtualization at the same time. Fixed virtualization is not supported by some grid features: Resizing, Group By, Responsive.
    * "continuous" renders a pre-defined number of rows in the grid. On scrolling the continuous virtualization loads another portion of rows and disposes the current one.
    */
  var virtualizationMode: js.UndefOr[String] = js.undefined
  
  /**
    * Number of pixels to scroll the grid by, when virtualization is enabled, and mouse wheel scrolling is performed over the virtual grid area. If "null" the step will be equal to the [avgRowHeight](ui.ighierarchicalgrid#options:avgRowHeight).
    *
    */
  var virtualizationMouseWheelStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the grid width in pixels or percents. [Here you can find more info about setting igGrid width](http://www.igniteui.com/help/iggrid-columns-and-layout#width-height).
    *
    *
    * Valid values:
    * "string" The widget width can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
    * "number" The widget width can be set in pixels as a number. Example values: 800, 700.
    * "null" will stretch to fit the sum of the columns widths.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object IgHierarchicalGrid {
  
  inline def apply(): IgHierarchicalGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGrid]
  }
  
  extension [Self <: IgHierarchicalGrid](x: Self) {
    
    inline def setAdjustVirtualHeights(value: Boolean): Self = StObject.set(x, "adjustVirtualHeights", value.asInstanceOf[js.Any])
    
    inline def setAdjustVirtualHeightsUndefined: Self = StObject.set(x, "adjustVirtualHeights", js.undefined)
    
    inline def setAggregateTransactions(value: Boolean): Self = StObject.set(x, "aggregateTransactions", value.asInstanceOf[js.Any])
    
    inline def setAggregateTransactionsUndefined: Self = StObject.set(x, "aggregateTransactions", js.undefined)
    
    inline def setAlternateRowStyles(value: Boolean): Self = StObject.set(x, "alternateRowStyles", value.asInstanceOf[js.Any])
    
    inline def setAlternateRowStylesUndefined: Self = StObject.set(x, "alternateRowStyles", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAutoAdjustHeight(value: Boolean): Self = StObject.set(x, "autoAdjustHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoAdjustHeightUndefined: Self = StObject.set(x, "autoAdjustHeight", js.undefined)
    
    inline def setAutoCommit(value: Boolean): Self = StObject.set(x, "autoCommit", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitUndefined: Self = StObject.set(x, "autoCommit", js.undefined)
    
    inline def setAutoFormat(value: String | Boolean): Self = StObject.set(x, "autoFormat", value.asInstanceOf[js.Any])
    
    inline def setAutoFormatUndefined: Self = StObject.set(x, "autoFormat", js.undefined)
    
    inline def setAutoGenerateColumns(value: Boolean): Self = StObject.set(x, "autoGenerateColumns", value.asInstanceOf[js.Any])
    
    inline def setAutoGenerateColumnsUndefined: Self = StObject.set(x, "autoGenerateColumns", js.undefined)
    
    inline def setAutoGenerateLayouts(value: Boolean): Self = StObject.set(x, "autoGenerateLayouts", value.asInstanceOf[js.Any])
    
    inline def setAutoGenerateLayoutsUndefined: Self = StObject.set(x, "autoGenerateLayouts", js.undefined)
    
    inline def setAutofitLastColumn(value: Boolean): Self = StObject.set(x, "autofitLastColumn", value.asInstanceOf[js.Any])
    
    inline def setAutofitLastColumnUndefined: Self = StObject.set(x, "autofitLastColumn", js.undefined)
    
    inline def setAvgColumnWidth(value: String | Double): Self = StObject.set(x, "avgColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setAvgColumnWidthUndefined: Self = StObject.set(x, "avgColumnWidth", js.undefined)
    
    inline def setAvgRowHeight(value: String | Double): Self = StObject.set(x, "avgRowHeight", value.asInstanceOf[js.Any])
    
    inline def setAvgRowHeightUndefined: Self = StObject.set(x, "avgRowHeight", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionRendered(value: (/* event */ Event, /* ui */ CaptionRenderedEventUIParam) => Callback): Self = StObject.set(x, "captionRendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ CaptionRenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setCaptionRenderedUndefined: Self = StObject.set(x, "captionRendered", js.undefined)
    
    inline def setCaptionRendering(value: (/* event */ Event, /* ui */ CaptionRenderingEventUIParam) => Callback): Self = StObject.set(x, "captionRendering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ CaptionRenderingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setCaptionRenderingUndefined: Self = StObject.set(x, "captionRendering", js.undefined)
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCellClick(value: (/* event */ Event, /* ui */ CellClickEventUIParam) => Callback): Self = StObject.set(x, "cellClick", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ CellClickEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
    
    inline def setCellRightClick(value: (/* event */ Event, /* ui */ CellRightClickEventUIParam) => Callback): Self = StObject.set(x, "cellRightClick", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ CellRightClickEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setCellRightClickUndefined: Self = StObject.set(x, "cellRightClick", js.undefined)
    
    inline def setChildGridCreated(value: (/* event */ Event, /* ui */ ChildGridCreatedEventUIParam) => Callback): Self = StObject.set(x, "childGridCreated", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ ChildGridCreatedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setChildGridCreatedUndefined: Self = StObject.set(x, "childGridCreated", js.undefined)
    
    inline def setChildGridCreating(value: (/* event */ Event, /* ui */ ChildGridCreatingEventUIParam) => Callback): Self = StObject.set(x, "childGridCreating", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ ChildGridCreatingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setChildGridCreatingUndefined: Self = StObject.set(x, "childGridCreating", js.undefined)
    
    inline def setChildGridRendered(value: (/* event */ Event, /* ui */ ChildGridRenderedEventUIParam) => Callback): Self = StObject.set(x, "childGridRendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ ChildGridRenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setChildGridRenderedUndefined: Self = StObject.set(x, "childGridRendered", js.undefined)
    
    inline def setChildrenPopulated(value: (/* event */ Event, /* ui */ ChildrenPopulatedEventUIParam) => Callback): Self = StObject.set(x, "childrenPopulated", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ ChildrenPopulatedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setChildrenPopulatedUndefined: Self = StObject.set(x, "childrenPopulated", js.undefined)
    
    inline def setChildrenPopulating(value: (/* event */ Event, /* ui */ ChildrenPopulatingEventUIParam) => Callback): Self = StObject.set(x, "childrenPopulating", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ ChildrenPopulatingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setChildrenPopulatingUndefined: Self = StObject.set(x, "childrenPopulating", js.undefined)
    
    inline def setCollapseTooltip(value: String): Self = StObject.set(x, "collapseTooltip", value.asInstanceOf[js.Any])
    
    inline def setCollapseTooltipUndefined: Self = StObject.set(x, "collapseTooltip", js.undefined)
    
    inline def setColumnLayouts(value: js.Array[IgHierarchicalGridColumnLayout]): Self = StObject.set(x, "columnLayouts", value.asInstanceOf[js.Any])
    
    inline def setColumnLayoutsUndefined: Self = StObject.set(x, "columnLayouts", js.undefined)
    
    inline def setColumnLayoutsVarargs(value: IgHierarchicalGridColumnLayout*): Self = StObject.set(x, "columnLayouts", js.Array(value*))
    
    inline def setColumnVirtualization(value: Boolean): Self = StObject.set(x, "columnVirtualization", value.asInstanceOf[js.Any])
    
    inline def setColumnVirtualizationUndefined: Self = StObject.set(x, "columnVirtualization", js.undefined)
    
    inline def setColumns(value: js.Array[IgHierarchicalGridColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsCollectionModified(value: (/* event */ Event, /* ui */ ColumnsCollectionModifiedEventUIParam) => Callback): Self = StObject.set(x, "columnsCollectionModified", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ ColumnsCollectionModifiedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setColumnsCollectionModifiedUndefined: Self = StObject.set(x, "columnsCollectionModified", js.undefined)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: IgHierarchicalGridColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCreated(value: (/* event */ Event, /* ui */ CreatedEventUIParam) => Callback): Self = StObject.set(x, "created", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ CreatedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Callback): Self = StObject.set(x, "dataBinding", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DataBindingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Callback): Self = StObject.set(x, "dataBound", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DataBoundEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataRendered(value: (/* event */ Event, /* ui */ DataRenderedEventUIParam) => Callback): Self = StObject.set(x, "dataRendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DataRenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDataRenderedUndefined: Self = StObject.set(x, "dataRendered", js.undefined)
    
    inline def setDataRendering(value: (/* event */ Event, /* ui */ DataRenderingEventUIParam) => Callback): Self = StObject.set(x, "dataRendering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DataRenderingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDataRenderingUndefined: Self = StObject.set(x, "dataRendering", js.undefined)
    
    inline def setDataSource(value: String | js.Array[Any] | js.Object): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDefaultChildrenDataProperty(value: String): Self = StObject.set(x, "defaultChildrenDataProperty", value.asInstanceOf[js.Any])
    
    inline def setDefaultChildrenDataPropertyUndefined: Self = StObject.set(x, "defaultChildrenDataProperty", js.undefined)
    
    inline def setDefaultColumnWidth(value: String | Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultColumnWidthUndefined: Self = StObject.set(x, "defaultColumnWidth", js.undefined)
    
    inline def setDestroyed(value: (/* event */ Event, /* ui */ DestroyedEventUIParam) => Callback): Self = StObject.set(x, "destroyed", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DestroyedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDestroyedUndefined: Self = StObject.set(x, "destroyed", js.undefined)
    
    inline def setEnableHoverStyles(value: Boolean): Self = StObject.set(x, "enableHoverStyles", value.asInstanceOf[js.Any])
    
    inline def setEnableHoverStylesUndefined: Self = StObject.set(x, "enableHoverStyles", js.undefined)
    
    inline def setEnableResizeContainerCheck(value: Boolean): Self = StObject.set(x, "enableResizeContainerCheck", value.asInstanceOf[js.Any])
    
    inline def setEnableResizeContainerCheckUndefined: Self = StObject.set(x, "enableResizeContainerCheck", js.undefined)
    
    inline def setEnableUTCDates(value: Boolean): Self = StObject.set(x, "enableUTCDates", value.asInstanceOf[js.Any])
    
    inline def setEnableUTCDatesUndefined: Self = StObject.set(x, "enableUTCDates", js.undefined)
    
    inline def setExpandColWidth(value: Double): Self = StObject.set(x, "expandColWidth", value.asInstanceOf[js.Any])
    
    inline def setExpandColWidthUndefined: Self = StObject.set(x, "expandColWidth", js.undefined)
    
    inline def setExpandCollapseAnimations(value: Boolean): Self = StObject.set(x, "expandCollapseAnimations", value.asInstanceOf[js.Any])
    
    inline def setExpandCollapseAnimationsUndefined: Self = StObject.set(x, "expandCollapseAnimations", js.undefined)
    
    inline def setExpandTooltip(value: String): Self = StObject.set(x, "expandTooltip", value.asInstanceOf[js.Any])
    
    inline def setExpandTooltipUndefined: Self = StObject.set(x, "expandTooltip", js.undefined)
    
    inline def setFeatureChooserIconDisplay(value: String): Self = StObject.set(x, "featureChooserIconDisplay", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserIconDisplayUndefined: Self = StObject.set(x, "featureChooserIconDisplay", js.undefined)
    
    inline def setFeatures(value: js.Array[IgHierarchicalGridFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: IgHierarchicalGridFeature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFixedFooters(value: Boolean): Self = StObject.set(x, "fixedFooters", value.asInstanceOf[js.Any])
    
    inline def setFixedFootersUndefined: Self = StObject.set(x, "fixedFooters", js.undefined)
    
    inline def setFixedHeaders(value: Boolean): Self = StObject.set(x, "fixedHeaders", value.asInstanceOf[js.Any])
    
    inline def setFixedHeadersUndefined: Self = StObject.set(x, "fixedHeaders", js.undefined)
    
    inline def setFooterRendered(value: (/* event */ Event, /* ui */ FooterRenderedEventUIParam) => Callback): Self = StObject.set(x, "footerRendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FooterRenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFooterRenderedUndefined: Self = StObject.set(x, "footerRendered", js.undefined)
    
    inline def setFooterRendering(value: (/* event */ Event, /* ui */ FooterRenderingEventUIParam) => Callback): Self = StObject.set(x, "footerRendering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FooterRenderingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFooterRenderingUndefined: Self = StObject.set(x, "footerRendering", js.undefined)
    
    inline def setHeaderCellRendered(value: (/* event */ Event, /* ui */ HeaderCellRenderedEventUIParam) => Callback): Self = StObject.set(x, "headerCellRendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ HeaderCellRenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setHeaderCellRenderedUndefined: Self = StObject.set(x, "headerCellRendered", js.undefined)
    
    inline def setHeaderRendered(value: (/* event */ Event, /* ui */ HeaderRenderedEventUIParam) => Callback): Self = StObject.set(x, "headerRendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ HeaderRenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setHeaderRenderedUndefined: Self = StObject.set(x, "headerRendered", js.undefined)
    
    inline def setHeaderRendering(value: (/* event */ Event, /* ui */ HeaderRenderingEventUIParam) => Callback): Self = StObject.set(x, "headerRendering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ HeaderRenderingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setHeaderRenderingUndefined: Self = StObject.set(x, "headerRendering", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInitialDataBindDepth(value: Double): Self = StObject.set(x, "initialDataBindDepth", value.asInstanceOf[js.Any])
    
    inline def setInitialDataBindDepthUndefined: Self = StObject.set(x, "initialDataBindDepth", js.undefined)
    
    inline def setInitialExpandDepth(value: Double): Self = StObject.set(x, "initialExpandDepth", value.asInstanceOf[js.Any])
    
    inline def setInitialExpandDepthUndefined: Self = StObject.set(x, "initialExpandDepth", js.undefined)
    
    inline def setJsonpRequest(value: Boolean): Self = StObject.set(x, "jsonpRequest", value.asInstanceOf[js.Any])
    
    inline def setJsonpRequestUndefined: Self = StObject.set(x, "jsonpRequest", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocalSchemaTransform(value: Boolean): Self = StObject.set(x, "localSchemaTransform", value.asInstanceOf[js.Any])
    
    inline def setLocalSchemaTransformUndefined: Self = StObject.set(x, "localSchemaTransform", js.undefined)
    
    inline def setLocale(value: IgHierarchicalGridLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxDataBindDepth(value: Double): Self = StObject.set(x, "maxDataBindDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDataBindDepthUndefined: Self = StObject.set(x, "maxDataBindDepth", js.undefined)
    
    inline def setMergeUnboundColumns(value: Boolean): Self = StObject.set(x, "mergeUnboundColumns", value.asInstanceOf[js.Any])
    
    inline def setMergeUnboundColumnsUndefined: Self = StObject.set(x, "mergeUnboundColumns", js.undefined)
    
    inline def setOdata(value: Boolean): Self = StObject.set(x, "odata", value.asInstanceOf[js.Any])
    
    inline def setOdataUndefined: Self = StObject.set(x, "odata", js.undefined)
    
    inline def setPathSeparator(value: String): Self = StObject.set(x, "pathSeparator", value.asInstanceOf[js.Any])
    
    inline def setPathSeparatorUndefined: Self = StObject.set(x, "pathSeparator", js.undefined)
    
    inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRenderCheckboxes(value: Boolean): Self = StObject.set(x, "renderCheckboxes", value.asInstanceOf[js.Any])
    
    inline def setRenderCheckboxesUndefined: Self = StObject.set(x, "renderCheckboxes", js.undefined)
    
    inline def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Callback): Self = StObject.set(x, "rendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ RenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Callback): Self = StObject.set(x, "rendering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ RenderingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    inline def setRequestError(value: (/* event */ Event, /* ui */ RequestErrorEventUIParam) => Callback): Self = StObject.set(x, "requestError", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ RequestErrorEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setRequestErrorUndefined: Self = StObject.set(x, "requestError", js.undefined)
    
    inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    
    inline def setResponseContentType(value: String): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
    
    inline def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    inline def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    inline def setResponseTotalRecCountKey(value: String): Self = StObject.set(x, "responseTotalRecCountKey", value.asInstanceOf[js.Any])
    
    inline def setResponseTotalRecCountKeyUndefined: Self = StObject.set(x, "responseTotalRecCountKey", js.undefined)
    
    inline def setRest(value: Boolean): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestSettings(value: IgHierarchicalGridRestSettings): Self = StObject.set(x, "restSettings", value.asInstanceOf[js.Any])
    
    inline def setRestSettingsUndefined: Self = StObject.set(x, "restSettings", js.undefined)
    
    inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    inline def setRowCollapsed(value: (/* event */ Event, /* ui */ RowCollapsedEventUIParam) => Callback): Self = StObject.set(x, "rowCollapsed", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ RowCollapsedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setRowCollapsedUndefined: Self = StObject.set(x, "rowCollapsed", js.undefined)
    
    inline def setRowCollapsing(value: (/* event */ Event, /* ui */ RowCollapsingEventUIParam) => Callback): Self = StObject.set(x, "rowCollapsing", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ RowCollapsingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setRowCollapsingUndefined: Self = StObject.set(x, "rowCollapsing", js.undefined)
    
    inline def setRowExpanded(value: (/* event */ Event, /* ui */ RowExpandedEventUIParam) => Callback): Self = StObject.set(x, "rowExpanded", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ RowExpandedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setRowExpandedUndefined: Self = StObject.set(x, "rowExpanded", js.undefined)
    
    inline def setRowExpanding(value: (/* event */ Event, /* ui */ RowExpandingEventUIParam) => Callback): Self = StObject.set(x, "rowExpanding", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ RowExpandingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setRowExpandingUndefined: Self = StObject.set(x, "rowExpanding", js.undefined)
    
    inline def setRowVirtualization(value: Boolean): Self = StObject.set(x, "rowVirtualization", value.asInstanceOf[js.Any])
    
    inline def setRowVirtualizationUndefined: Self = StObject.set(x, "rowVirtualization", js.undefined)
    
    inline def setRowsRendered(value: (/* event */ Event, /* ui */ RowsRenderedEventUIParam) => Callback): Self = StObject.set(x, "rowsRendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ RowsRenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setRowsRenderedUndefined: Self = StObject.set(x, "rowsRendered", js.undefined)
    
    inline def setRowsRendering(value: (/* event */ Event, /* ui */ RowsRenderingEventUIParam) => Callback): Self = StObject.set(x, "rowsRendering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ RowsRenderingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setRowsRenderingUndefined: Self = StObject.set(x, "rowsRendering", js.undefined)
    
    inline def setSchemaGenerated(value: (/* event */ Event, /* ui */ SchemaGeneratedEventUIParam) => Callback): Self = StObject.set(x, "schemaGenerated", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ SchemaGeneratedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setSchemaGeneratedUndefined: Self = StObject.set(x, "schemaGenerated", js.undefined)
    
    inline def setScrollSettings(value: IgHierarchicalGridScrollSettings): Self = StObject.set(x, "scrollSettings", value.asInstanceOf[js.Any])
    
    inline def setScrollSettingsUndefined: Self = StObject.set(x, "scrollSettings", js.undefined)
    
    inline def setSerializeTransactionLog(value: Boolean): Self = StObject.set(x, "serializeTransactionLog", value.asInstanceOf[js.Any])
    
    inline def setSerializeTransactionLogUndefined: Self = StObject.set(x, "serializeTransactionLog", js.undefined)
    
    inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
    
    inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    
    inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTemplatingEngine(value: String): Self = StObject.set(x, "templatingEngine", value.asInstanceOf[js.Any])
    
    inline def setTemplatingEngineUndefined: Self = StObject.set(x, "templatingEngine", js.undefined)
    
    inline def setUpdateUrl(value: String): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
    
    inline def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
    
    inline def setVirtualization(value: Boolean): Self = StObject.set(x, "virtualization", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationMode(value: String): Self = StObject.set(x, "virtualizationMode", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationModeUndefined: Self = StObject.set(x, "virtualizationMode", js.undefined)
    
    inline def setVirtualizationMouseWheelStep(value: Double): Self = StObject.set(x, "virtualizationMouseWheelStep", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationMouseWheelStepUndefined: Self = StObject.set(x, "virtualizationMouseWheelStep", js.undefined)
    
    inline def setVirtualizationUndefined: Self = StObject.set(x, "virtualization", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
