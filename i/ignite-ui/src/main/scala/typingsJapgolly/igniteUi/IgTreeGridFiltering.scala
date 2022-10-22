package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridFiltering
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Defines whether to render editors in advanced [mode](ui.iggridfiltering#options:mode). If false, no editors will be rendered in the advanced [mode](ui.iggridfiltering#options:mode).
    *
    */
  var advancedModeEditorsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Location of the advanced filtering button when [advancedModeEditorsVisible](ui.iggridfiltering#options:advancedModeEditorsVisible) is false (i.e. when the button is rendered in the header).
    *
    *
    * Valid values:
    * "left"
    * "right"
    */
  var advancedModeHeaderButtonLocation: js.UndefOr[String] = js.undefined
  
  /**
    * Enables or disables the filtering case sensitivity. Works only for local filtering. If true, it case sensitive filtering is performed. If false, filtering is case insensitive.
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of column settings that specifies custom filtering options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridFilteringColumnSetting]] = js.undefined
  
  /**
    * Event fired after the filtering has been executed and results are rendered.
    */
  var dataFiltered: js.UndefOr[DataFilteredEvent] = js.undefined
  
  /**
    * Event fired before a filtering operation is executed (remote request or local).
    * Return false in order to cancel filtering operation.
    */
  var dataFiltering: js.UndefOr[DataFilteringEvent] = js.undefined
  
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.undefined
  
  /**
    * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don"t match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don"t match filtering conditions
    *
    */
  var displayMode: js.UndefOr[Any] = js.undefined
  
  /**
    * Event fired after a filter column dropdown is completely closed.
    */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.undefined
  
  /**
    * Event fired before the filter dropdown starts closing.
    * Return false in order to cancel dropdown closing.
    */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.undefined
  
  /**
    * Event fired after the filter dropdown is opened for a specific column.
    */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.undefined
  
  /**
    * Event fired before the filter dropdown is opened for a specific column.
    * Return false in order to cancel dropdown opening.
    */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Feature chooser text when filter is shown and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserText](ui.iggridfiltering#options:locale.featureChooserText).
    */
  var featureChooserText: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Feature chooser text when filter [mode](ui.iggridfiltering#options:mode) is advanced. Use option [locale.featureChooserTextAdvancedFilter](ui.iggridfiltering#options:locale.featureChooserTextAdvancedFilter).
    */
  var featureChooserTextAdvancedFilter: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Feature chooser text when filter is hidden and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserTextHide](ui.iggridfiltering#options:locale.featureChooserTextHide).
    */
  var featureChooserTextHide: js.UndefOr[String] = js.undefined
  
  /**
    * The filtering button for filter dropdowns can be rendered either on the left of the filter editor, or on the right.
    *
    *
    * Valid values:
    * "left" The button is rendered on the left.
    * "right" The button is rendered on the right.
    */
  var filterButtonLocation: js.UndefOr[String] = js.undefined
  
  /**
    * Time in milliseconds for which widget will wait between keystrokes before sending filtering requests.
    *
    */
  var filterDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Add button width - in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The dialog Add button width in pixels (100px).
    * "number" The dialog Add button width in pixels as a number (100).
    */
  var filterDialogAddButtonWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Custom template for options in dropdown in add condition area in the filter dialog. The default template is "<option value='${value}'>${text}</option>"
    * and it is used when [filterDialogAddConditionTemplate](ui.iggridfiltering#options:filterDialogAddConditionTemplate) is applied
    *
    */
  var filterDialogAddConditionDropDownTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Custom template for add condition area in the filter dialog. The default template is "<div><span>${label1}</span><div><input></input></div><span>${label2}</span></div>".
    *
    */
  var filterDialogAddConditionTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after the advanced filter dialog has been closed.
    */
  var filterDialogClosed: js.UndefOr[FilterDialogClosedEvent] = js.undefined
  
  /**
    * Event fired before the advanced filter dialog is closed.
    * Return false in order to cancel filtering dialog closing.
    */
  var filterDialogClosing: js.UndefOr[FilterDialogClosingEvent] = js.undefined
  
  /**
    * Width of the column chooser dropdowns in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The column chooser dropdowns width in pixels (80px).
    * "number" The column chooser dropdowns width in pixels  as a number (80).
    */
  var filterDialogColumnDropDownDefaultWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Controls containment behavior.
    *
    * owner  The filter dialog will be draggable only within the grid area.
    * window  The filter dialog will be draggable within the whole window area.
    */
  var filterDialogContainment: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after the contents of the advanced filter dialog are rendered.
    */
  var filterDialogContentsRendered: js.UndefOr[FilterDialogContentsRenderedEvent] = js.undefined
  
  /**
    * Event fired before the contents of the advanced filter dialog are rendered.
    * Return false in order to cancel filtering dialog rendering.
    */
  var filterDialogContentsRendering: js.UndefOr[FilterDialogContentsRenderingEvent] = js.undefined
  
  /**
    * Width of the filtering expression input boxes in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The filtering expression input boxes width in pixels (80px).
    * "number" The filtering expression input boxes width in pixels as a number (80).
    */
  var filterDialogExprInputDefaultWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Event fired after a filter row is added to the advanced filter dialog.
    */
  var filterDialogFilterAdded: js.UndefOr[FilterDialogFilterAddedEvent] = js.undefined
  
  /**
    * Event fired before a filter row is added to the advanced filter dialog.
    * Return false in order to cancel filter adding to the advanced filtering dialog.
    */
  var filterDialogFilterAdding: js.UndefOr[FilterDialogFilterAddingEvent] = js.undefined
  
  /**
    * Custom template for options in condition list in filter dialog. The default template is "<option value='${condition}'>${text}</option>"
    * and it is used for custimizing DOM elemenent with attribute "data-af-cond".
    *
    */
  var filterDialogFilterConditionTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Width of the filtering condition dropdowns in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The filtering condition dropdowns width in pixels (80px).
    * "number" The filtering condition dropdowns width in pixels as a number (80).
    */
  var filterDialogFilterDropDownDefaultWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Custom template for filter dialog.
    * Each DOM element which is used for selecting filter conditions/columns/filter expressions has "data-*" attribute.
    * E.g.: DOM element used for selecting column has attribute "data-af-col", for selecting filter condition - "data-af-cond", for filter expression- "data-af-expr".
    * NOTE: The template is supported only with <tr />.
    * The default template is "<tr data-af-row><td><input data-af-col/></td><td><input data-af-cond/></td><td><input data-af-expr /> </td><td><span data-af-rmv></span></td></tr>".
    *
    */
  var filterDialogFilterTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired when the OK button in the advanced filter dialog is pressed.
    */
  var filterDialogFiltering: js.UndefOr[FilterDialogFilteringEvent] = js.undefined
  
  /**
    * default filter dialog height (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
    *
    *
    * Valid values:
    * "string" The dialog window height in pixels (350px).
    * "number" The dialog window height in pixels as a number (350).
    */
  var filterDialogHeight: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Maximum number of filter rows in the advanced filtering dialog. If this number is exceeded, an error message will be rendered.
    *
    */
  var filterDialogMaxFilterCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Event fired every time the advanced filter dialog changes its position.
    */
  var filterDialogMoving: js.UndefOr[FilterDialogMovingEvent] = js.undefined
  
  /**
    * Width of the Ok and Cancel buttons in the advanced filtering dialogs.
    *
    *
    * Valid values:
    * "string" The advanced filter dialog Ok and Cancel buttons width in pixels (120px).
    * "number" The advanced filter dialog Ok and Cancel buttons width in pixels as a number (120).
    */
  var filterDialogOkCancelButtonWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Event fired after the advanced filter dialog is already opened.
    */
  var filterDialogOpened: js.UndefOr[FilterDialogOpenedEvent] = js.undefined
  
  /**
    * Event fired before the advanced filtering dialog is opened.
    * Return false in order to cancel filter dialog opening.
    */
  var filterDialogOpening: js.UndefOr[FilterDialogOpeningEvent] = js.undefined
  
  /**
    * Default filter dialog width (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
    *
    *
    * Valid values:
    * "string" The dialog window width in pixels (500px).
    * "number" The dialog window width in pixels as a number (500).
    */
  var filterDialogWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Animation duration in milliseconds for the [filterDropDownAnimations](ui.iggridfiltering#options:filterDropDownAnimations).
    *
    */
  var filterDropDownAnimationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Type of animations for the column filter dropdowns.
    *
    *
    * Valid values:
    * "linear" The column filtering drop downs are shown with a linear animation.
    * "none" No animation is used when showing the filtering drop downs.
    */
  var filterDropDownAnimations: js.UndefOr[String] = js.undefined
  
  /**
    * Height of the column filter dropdowns.
    *
    * string  The height of the column filter dropdowns in pixels (0px).
    * number  The height of the column filter dropdowns in pixels as a number (0).
    */
  var filterDropDownHeight: js.UndefOr[Any] = js.undefined
  
  /**
    * Enable/disable filter icons visibility.
    *
    *
    * Valid values:
    * "true" All predefined filters in the filter dropdowns will have icons rendered in front of the text.
    * "false" No icons will be rendered.
    */
  var filterDropDownItemIcons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Width of the column filter dropdowns.
    *
    *
    * Valid values:
    * "string" The width in pixels (0px)
    * "number" The width in pixels as a number (0)
    */
  var filterDropDownWidth: js.UndefOr[String | Double] = js.undefined
  
  /**
    * URL key name that specifies how the filtering expressions will be encoded for remote requests, e.g. &filter('col') = startsWith. Default is OData.
    *
    */
  var filterExprUrlKey: js.UndefOr[String] = js.undefined
  
  /**
    * Enable/disable footer visibility with summary info about the filter.
    * When false, the filter summary row (in the footer) will only be visible when paging is enabled (or some other feature that renders a footer).
    * When true, the filter summary row will only be visible when a filter is applied i.e. it's not visible by default.
    *
    */
  var filterSummaryAlwaysVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Template that is used when filtering is applied and paging is enabled and user goes to another page. It takes precedence over the pagerRecordsLabelTemplate(option from igTreeGridPaging). If it is set to null then it is taken option from igTreeGridPaging.
    * Supported options:
    * ${currentPageMatches} (filtering)
    * ${totalMatches} (filtering)
    * ${startRecord} (paging)
    * ${endRecord} (paging)
    * ${recordCount} (paging)
    * Use option [locale.collapseTooltipText](ui.igtreegrid#options:locale.collapseTooltipText).
    */
  var filterSummaryInPagerTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Summary template that will appear in the bottom left corner of the footer. Has the format '${matches} matching records'. Use option [locale.filterSummaryTemplate](ui.iggridfiltering#options:locale.filterSummaryTemplate).
    */
  var filterSummaryTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies from which data bound level to be applied filtering - 0 is the first level
    *
    */
  var fromLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * A list of configurable and localized labels that are used for the predefined filtering conditions in the filter dropdowns. Use option [locale](ui.iggridfiltering#options:locale).
    */
  var labels: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[IgTreeGridFilteringLocale] = js.undefined
  
  /**
    * Specifies the name of a boolean property in the dataRecord object that indicates whether the dataRow matches the filtering conditions.
    * When filtering a boolean flag  with the specified name is added on each data record object with a value of true if it matches the condition or false if it doesn"t.
    * This is used mainly for internal purposes.
    *
    */
  var matchFiltering: js.UndefOr[String] = js.undefined
  
  /**
    * Default is 'simple' for non-virtualized grids, and 'advanced' when [virtualization](ui.iggrid#options:virtualization) is enabled.
    *
    *
    * Valid values:
    * "simple" Renders just a filter row.
    * "advanced" Allows to configure multiple filters from a dialog - Excel style.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * List of configurable and localized null texts that will be used for the filter editors. Use option [locale](ui.iggridfiltering#options:locale).
    */
  var nullTexts: js.UndefOr[String] = js.undefined
  
  /**
    * Enables/disables filtering persistence between states.
    *
    */
  var persist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The property in the response that will hold the total number of records in the data source
    *
    */
  var recordCountKey: js.UndefOr[String] = js.undefined
  
  /**
    * Render in [Feature Chooser](http://www.igniteui.com/help/iggrid-feature-chooser)
    *
    */
  var renderFC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable/disable filter button visibility. If false, no filter dropdown buttons will be rendered and a predefined list of filters will not be rendered for the columns.
    *
    */
  var renderFilterButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable/disable empty condition visibility in the filter. If true, shows empty and not empty filtering conditions in the dropdowns.
    *
    */
  var showEmptyConditions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable/disable visibility of null and not null filtering conditions in the dropdowns. If true, shows null and not null filtering conditions in the dropdowns.
    *
    */
  var showNullConditions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
    *
    */
  var toLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Custom tooltip template for the filter button, when a filter is applied. Use option [locale.tooltipTemplate](ui.iggridfiltering#options:locale.tooltipTemplate).
    */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Type of filtering. Delegates all filtering functionality to the [$.ig.DataSource](ig.datasource).
    *
    *
    * Valid values:
    * "remote" Filtering is performed by a remote end-point.
    * "local" Filtering is performed locally by the [$.ig.DataSource](ig.datasource).
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object IgTreeGridFiltering {
  
  inline def apply(): IgTreeGridFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridFiltering]
  }
  
  extension [Self <: IgTreeGridFiltering](x: Self) {
    
    inline def setAdvancedModeEditorsVisible(value: Boolean): Self = StObject.set(x, "advancedModeEditorsVisible", value.asInstanceOf[js.Any])
    
    inline def setAdvancedModeEditorsVisibleUndefined: Self = StObject.set(x, "advancedModeEditorsVisible", js.undefined)
    
    inline def setAdvancedModeHeaderButtonLocation(value: String): Self = StObject.set(x, "advancedModeHeaderButtonLocation", value.asInstanceOf[js.Any])
    
    inline def setAdvancedModeHeaderButtonLocationUndefined: Self = StObject.set(x, "advancedModeHeaderButtonLocation", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setColumnSettings(value: js.Array[IgGridFilteringColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setColumnSettingsVarargs(value: IgGridFilteringColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value*))
    
    inline def setDataFiltered(value: (/* event */ Event, /* ui */ DataFilteredEventUIParam) => Callback): Self = StObject.set(x, "dataFiltered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DataFilteredEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDataFilteredUndefined: Self = StObject.set(x, "dataFiltered", js.undefined)
    
    inline def setDataFiltering(value: (/* event */ Event, /* ui */ DataFilteringEventUIParam) => Callback): Self = StObject.set(x, "dataFiltering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DataFilteringEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDataFilteringUndefined: Self = StObject.set(x, "dataFiltering", js.undefined)
    
    inline def setDialogWidget(value: String): Self = StObject.set(x, "dialogWidget", value.asInstanceOf[js.Any])
    
    inline def setDialogWidgetUndefined: Self = StObject.set(x, "dialogWidget", js.undefined)
    
    inline def setDisplayMode(value: Any): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setDropDownClosed(value: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Callback): Self = StObject.set(x, "dropDownClosed", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DropDownClosedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDropDownClosedUndefined: Self = StObject.set(x, "dropDownClosed", js.undefined)
    
    inline def setDropDownClosing(value: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Callback): Self = StObject.set(x, "dropDownClosing", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DropDownClosingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDropDownClosingUndefined: Self = StObject.set(x, "dropDownClosing", js.undefined)
    
    inline def setDropDownOpened(value: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Callback): Self = StObject.set(x, "dropDownOpened", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DropDownOpenedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDropDownOpenedUndefined: Self = StObject.set(x, "dropDownOpened", js.undefined)
    
    inline def setDropDownOpening(value: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Callback): Self = StObject.set(x, "dropDownOpening", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DropDownOpeningEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setDropDownOpeningUndefined: Self = StObject.set(x, "dropDownOpening", js.undefined)
    
    inline def setFeatureChooserText(value: String): Self = StObject.set(x, "featureChooserText", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserTextAdvancedFilter(value: String): Self = StObject.set(x, "featureChooserTextAdvancedFilter", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserTextAdvancedFilterUndefined: Self = StObject.set(x, "featureChooserTextAdvancedFilter", js.undefined)
    
    inline def setFeatureChooserTextHide(value: String): Self = StObject.set(x, "featureChooserTextHide", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserTextHideUndefined: Self = StObject.set(x, "featureChooserTextHide", js.undefined)
    
    inline def setFeatureChooserTextUndefined: Self = StObject.set(x, "featureChooserText", js.undefined)
    
    inline def setFilterButtonLocation(value: String): Self = StObject.set(x, "filterButtonLocation", value.asInstanceOf[js.Any])
    
    inline def setFilterButtonLocationUndefined: Self = StObject.set(x, "filterButtonLocation", js.undefined)
    
    inline def setFilterDelay(value: Double): Self = StObject.set(x, "filterDelay", value.asInstanceOf[js.Any])
    
    inline def setFilterDelayUndefined: Self = StObject.set(x, "filterDelay", js.undefined)
    
    inline def setFilterDialogAddButtonWidth(value: String | Double): Self = StObject.set(x, "filterDialogAddButtonWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogAddButtonWidthUndefined: Self = StObject.set(x, "filterDialogAddButtonWidth", js.undefined)
    
    inline def setFilterDialogAddConditionDropDownTemplate(value: String): Self = StObject.set(x, "filterDialogAddConditionDropDownTemplate", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogAddConditionDropDownTemplateUndefined: Self = StObject.set(x, "filterDialogAddConditionDropDownTemplate", js.undefined)
    
    inline def setFilterDialogAddConditionTemplate(value: String): Self = StObject.set(x, "filterDialogAddConditionTemplate", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogAddConditionTemplateUndefined: Self = StObject.set(x, "filterDialogAddConditionTemplate", js.undefined)
    
    inline def setFilterDialogClosed(value: (/* event */ Event, /* ui */ FilterDialogClosedEventUIParam) => Callback): Self = StObject.set(x, "filterDialogClosed", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogClosedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogClosedUndefined: Self = StObject.set(x, "filterDialogClosed", js.undefined)
    
    inline def setFilterDialogClosing(value: (/* event */ Event, /* ui */ FilterDialogClosingEventUIParam) => Callback): Self = StObject.set(x, "filterDialogClosing", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogClosingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogClosingUndefined: Self = StObject.set(x, "filterDialogClosing", js.undefined)
    
    inline def setFilterDialogColumnDropDownDefaultWidth(value: String | Double): Self = StObject.set(x, "filterDialogColumnDropDownDefaultWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogColumnDropDownDefaultWidthUndefined: Self = StObject.set(x, "filterDialogColumnDropDownDefaultWidth", js.undefined)
    
    inline def setFilterDialogContainment(value: String): Self = StObject.set(x, "filterDialogContainment", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogContainmentUndefined: Self = StObject.set(x, "filterDialogContainment", js.undefined)
    
    inline def setFilterDialogContentsRendered(value: (/* event */ Event, /* ui */ FilterDialogContentsRenderedEventUIParam) => Callback): Self = StObject.set(x, "filterDialogContentsRendered", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogContentsRenderedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogContentsRenderedUndefined: Self = StObject.set(x, "filterDialogContentsRendered", js.undefined)
    
    inline def setFilterDialogContentsRendering(value: (/* event */ Event, /* ui */ FilterDialogContentsRenderingEventUIParam) => Callback): Self = StObject.set(x, "filterDialogContentsRendering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogContentsRenderingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogContentsRenderingUndefined: Self = StObject.set(x, "filterDialogContentsRendering", js.undefined)
    
    inline def setFilterDialogExprInputDefaultWidth(value: String | Double): Self = StObject.set(x, "filterDialogExprInputDefaultWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogExprInputDefaultWidthUndefined: Self = StObject.set(x, "filterDialogExprInputDefaultWidth", js.undefined)
    
    inline def setFilterDialogFilterAdded(value: (/* event */ Event, /* ui */ FilterDialogFilterAddedEventUIParam) => Callback): Self = StObject.set(x, "filterDialogFilterAdded", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogFilterAddedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogFilterAddedUndefined: Self = StObject.set(x, "filterDialogFilterAdded", js.undefined)
    
    inline def setFilterDialogFilterAdding(value: (/* event */ Event, /* ui */ FilterDialogFilterAddingEventUIParam) => Callback): Self = StObject.set(x, "filterDialogFilterAdding", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogFilterAddingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogFilterAddingUndefined: Self = StObject.set(x, "filterDialogFilterAdding", js.undefined)
    
    inline def setFilterDialogFilterConditionTemplate(value: String): Self = StObject.set(x, "filterDialogFilterConditionTemplate", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogFilterConditionTemplateUndefined: Self = StObject.set(x, "filterDialogFilterConditionTemplate", js.undefined)
    
    inline def setFilterDialogFilterDropDownDefaultWidth(value: String | Double): Self = StObject.set(x, "filterDialogFilterDropDownDefaultWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogFilterDropDownDefaultWidthUndefined: Self = StObject.set(x, "filterDialogFilterDropDownDefaultWidth", js.undefined)
    
    inline def setFilterDialogFilterTemplate(value: String): Self = StObject.set(x, "filterDialogFilterTemplate", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogFilterTemplateUndefined: Self = StObject.set(x, "filterDialogFilterTemplate", js.undefined)
    
    inline def setFilterDialogFiltering(value: (/* event */ Event, /* ui */ FilterDialogFilteringEventUIParam) => Callback): Self = StObject.set(x, "filterDialogFiltering", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogFilteringEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogFilteringUndefined: Self = StObject.set(x, "filterDialogFiltering", js.undefined)
    
    inline def setFilterDialogHeight(value: String | Double): Self = StObject.set(x, "filterDialogHeight", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogHeightUndefined: Self = StObject.set(x, "filterDialogHeight", js.undefined)
    
    inline def setFilterDialogMaxFilterCount(value: Double): Self = StObject.set(x, "filterDialogMaxFilterCount", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogMaxFilterCountUndefined: Self = StObject.set(x, "filterDialogMaxFilterCount", js.undefined)
    
    inline def setFilterDialogMoving(value: (/* event */ Event, /* ui */ FilterDialogMovingEventUIParam) => Callback): Self = StObject.set(x, "filterDialogMoving", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogMovingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogMovingUndefined: Self = StObject.set(x, "filterDialogMoving", js.undefined)
    
    inline def setFilterDialogOkCancelButtonWidth(value: String | Double): Self = StObject.set(x, "filterDialogOkCancelButtonWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogOkCancelButtonWidthUndefined: Self = StObject.set(x, "filterDialogOkCancelButtonWidth", js.undefined)
    
    inline def setFilterDialogOpened(value: (/* event */ Event, /* ui */ FilterDialogOpenedEventUIParam) => Callback): Self = StObject.set(x, "filterDialogOpened", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogOpenedEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogOpenedUndefined: Self = StObject.set(x, "filterDialogOpened", js.undefined)
    
    inline def setFilterDialogOpening(value: (/* event */ Event, /* ui */ FilterDialogOpeningEventUIParam) => Callback): Self = StObject.set(x, "filterDialogOpening", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ FilterDialogOpeningEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setFilterDialogOpeningUndefined: Self = StObject.set(x, "filterDialogOpening", js.undefined)
    
    inline def setFilterDialogWidth(value: String | Double): Self = StObject.set(x, "filterDialogWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterDialogWidthUndefined: Self = StObject.set(x, "filterDialogWidth", js.undefined)
    
    inline def setFilterDropDownAnimationDuration(value: Double): Self = StObject.set(x, "filterDropDownAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def setFilterDropDownAnimationDurationUndefined: Self = StObject.set(x, "filterDropDownAnimationDuration", js.undefined)
    
    inline def setFilterDropDownAnimations(value: String): Self = StObject.set(x, "filterDropDownAnimations", value.asInstanceOf[js.Any])
    
    inline def setFilterDropDownAnimationsUndefined: Self = StObject.set(x, "filterDropDownAnimations", js.undefined)
    
    inline def setFilterDropDownHeight(value: Any): Self = StObject.set(x, "filterDropDownHeight", value.asInstanceOf[js.Any])
    
    inline def setFilterDropDownHeightUndefined: Self = StObject.set(x, "filterDropDownHeight", js.undefined)
    
    inline def setFilterDropDownItemIcons(value: Boolean): Self = StObject.set(x, "filterDropDownItemIcons", value.asInstanceOf[js.Any])
    
    inline def setFilterDropDownItemIconsUndefined: Self = StObject.set(x, "filterDropDownItemIcons", js.undefined)
    
    inline def setFilterDropDownWidth(value: String | Double): Self = StObject.set(x, "filterDropDownWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterDropDownWidthUndefined: Self = StObject.set(x, "filterDropDownWidth", js.undefined)
    
    inline def setFilterExprUrlKey(value: String): Self = StObject.set(x, "filterExprUrlKey", value.asInstanceOf[js.Any])
    
    inline def setFilterExprUrlKeyUndefined: Self = StObject.set(x, "filterExprUrlKey", js.undefined)
    
    inline def setFilterSummaryAlwaysVisible(value: Boolean): Self = StObject.set(x, "filterSummaryAlwaysVisible", value.asInstanceOf[js.Any])
    
    inline def setFilterSummaryAlwaysVisibleUndefined: Self = StObject.set(x, "filterSummaryAlwaysVisible", js.undefined)
    
    inline def setFilterSummaryInPagerTemplate(value: String): Self = StObject.set(x, "filterSummaryInPagerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFilterSummaryInPagerTemplateUndefined: Self = StObject.set(x, "filterSummaryInPagerTemplate", js.undefined)
    
    inline def setFilterSummaryTemplate(value: String): Self = StObject.set(x, "filterSummaryTemplate", value.asInstanceOf[js.Any])
    
    inline def setFilterSummaryTemplateUndefined: Self = StObject.set(x, "filterSummaryTemplate", js.undefined)
    
    inline def setFromLevel(value: Double): Self = StObject.set(x, "fromLevel", value.asInstanceOf[js.Any])
    
    inline def setFromLevelUndefined: Self = StObject.set(x, "fromLevel", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    inline def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocale(value: IgTreeGridFilteringLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMatchFiltering(value: String): Self = StObject.set(x, "matchFiltering", value.asInstanceOf[js.Any])
    
    inline def setMatchFilteringUndefined: Self = StObject.set(x, "matchFiltering", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNullTexts(value: String): Self = StObject.set(x, "nullTexts", value.asInstanceOf[js.Any])
    
    inline def setNullTextsUndefined: Self = StObject.set(x, "nullTexts", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setRecordCountKey(value: String): Self = StObject.set(x, "recordCountKey", value.asInstanceOf[js.Any])
    
    inline def setRecordCountKeyUndefined: Self = StObject.set(x, "recordCountKey", js.undefined)
    
    inline def setRenderFC(value: Boolean): Self = StObject.set(x, "renderFC", value.asInstanceOf[js.Any])
    
    inline def setRenderFCUndefined: Self = StObject.set(x, "renderFC", js.undefined)
    
    inline def setRenderFilterButton(value: Boolean): Self = StObject.set(x, "renderFilterButton", value.asInstanceOf[js.Any])
    
    inline def setRenderFilterButtonUndefined: Self = StObject.set(x, "renderFilterButton", js.undefined)
    
    inline def setShowEmptyConditions(value: Boolean): Self = StObject.set(x, "showEmptyConditions", value.asInstanceOf[js.Any])
    
    inline def setShowEmptyConditionsUndefined: Self = StObject.set(x, "showEmptyConditions", js.undefined)
    
    inline def setShowNullConditions(value: Boolean): Self = StObject.set(x, "showNullConditions", value.asInstanceOf[js.Any])
    
    inline def setShowNullConditionsUndefined: Self = StObject.set(x, "showNullConditions", js.undefined)
    
    inline def setToLevel(value: Double): Self = StObject.set(x, "toLevel", value.asInstanceOf[js.Any])
    
    inline def setToLevelUndefined: Self = StObject.set(x, "toLevel", js.undefined)
    
    inline def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
