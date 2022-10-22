package typingsJapgolly.tablesorter

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.Element
import typingsJapgolly.jquery.JQuery.Selector
import typingsJapgolly.tablesorter.designCoreThemeMod.CoreTheme
import typingsJapgolly.tablesorter.globalizationGlobalizeSettingsMod.GlobalizeSettings
import typingsJapgolly.tablesorter.mod.global.JQuery
import typingsJapgolly.tablesorter.parsingTextExtractorMod.TextExtractor
import typingsJapgolly.tablesorter.sortingEmptySortingMod.EmptySorting
import typingsJapgolly.tablesorter.sortingNumberSorterMod.NumberSorter
import typingsJapgolly.tablesorter.sortingRelativeSortDefinitionMod.RelativeSortDefinition
import typingsJapgolly.tablesorter.sortingSortDefinitionMod.SortDefinition
import typingsJapgolly.tablesorter.sortingStringSortingMod.StringSorting
import typingsJapgolly.tablesorter.sortingTextSorterMod.TextSorter
import typingsJapgolly.tablesorter.systemInitializationEventHandlerMod.InitializationEventHandler
import typingsJapgolly.tablesorter.systemMappedSettingsMod.MappedSettings
import typingsJapgolly.tablesorter.systemRenderHeaderEventHandlerMod.RenderHeaderEventHandler
import typingsJapgolly.tablesorter.systemRenderTemplateEventHandlerMod.RenderTemplateEventHandler
import typingsJapgolly.tablesorter.systemTablesorterConfigBaseMod.TablesorterConfigBase
import typingsJapgolly.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typingsJapgolly.tablesorter.systemTablesorterHeadingMod.TablesorterHeading
import typingsJapgolly.tablesorter.tablesorterStrings.altKey
import typingsJapgolly.tablesorter.tablesorterStrings.basic
import typingsJapgolly.tablesorter.tablesorterStrings.button
import typingsJapgolly.tablesorter.tablesorterStrings.buttons
import typingsJapgolly.tablesorter.tablesorterStrings.clientX
import typingsJapgolly.tablesorter.tablesorterStrings.clientY
import typingsJapgolly.tablesorter.tablesorterStrings.ctrlKey
import typingsJapgolly.tablesorter.tablesorterStrings.metaKey
import typingsJapgolly.tablesorter.tablesorterStrings.movementX
import typingsJapgolly.tablesorter.tablesorterStrings.movementY
import typingsJapgolly.tablesorter.tablesorterStrings.offsetX
import typingsJapgolly.tablesorter.tablesorterStrings.offsetY
import typingsJapgolly.tablesorter.tablesorterStrings.pageX
import typingsJapgolly.tablesorter.tablesorterStrings.pageY
import typingsJapgolly.tablesorter.tablesorterStrings.relatedTarget
import typingsJapgolly.tablesorter.tablesorterStrings.screenX
import typingsJapgolly.tablesorter.tablesorterStrings.screenY
import typingsJapgolly.tablesorter.tablesorterStrings.shiftKey
import typingsJapgolly.tablesorter.tablesorterStrings.x
import typingsJapgolly.tablesorter.tablesorterStrings.y
import typingsJapgolly.tablesorter.widgetsWidgetOptionsMod.WidgetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTablesorterConfigurationMod {
  
  trait TablesorterConfiguration[TElement]
    extends StObject
       with TablesorterConfigBase {
    
    /**
      * A value indicating whether the selection of the text in the table headers should be disabled.
      */
    var cancelSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether only visible rows should be affected by the checkbox located in the header.
      */
    var cehckboxVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A class to add to checked rows.
      */
    var checkboxClass: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to table headers with ascending sort.
      */
    var cssAsc: js.UndefOr[String] = js.undefined
    
    /**
      * A class for indicating rows which should be attached to the above row.
      */
    var cssChildRow: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to table headers with descending sort.
      */
    var cssDesc: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to the table headers.
      */
    var cssHeader: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to the header-row.
      */
    var cssHeaderRow: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to the sort-icons.
      */
    var cssIcon: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to sort-icons for with ascending sorting.
      */
    var cssIconAsc: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to sort-icons with descending sorting.
      */
    var cssIconDesc: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to sort-icons with disabled sorting.
      */
    var cssIconDisabled: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to sort-icons without sorting.
      */
    var cssIconNone: js.UndefOr[String] = js.undefined
    
    /**
      * A class for indicating rows which should be ignored.
      */
    var cssIgnoreRow: js.UndefOr[String] = js.undefined
    
    /**
      * A class for indicating `tbody`s which should not be sortable.
      */
    var cssInfoBlock: js.UndefOr[String] = js.undefined
    
    /**
      * A class for indicating elements which don't cause a sort when clicking on them.
      */
    var cssNoSort: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to headers when no sort is applied.
      */
    var cssNone: js.UndefOr[String] = js.undefined
    
    /**
      * A class to add to the header-row while applying a processing the table.
      */
    var cssProcessing: js.UndefOr[String] = js.undefined
    
    /**
      * The storage for the `build-table` widget.
      */
    var data: js.UndefOr[js.Object | js.Array[js.Array[Any]]] = js.undefined
    
    /**
      * The date-range for two-digit years.
      */
    var dateRange: js.UndefOr[Double] = js.undefined
    
    /**
      * Either value indicating whether debug-information should be printed or a set of plugin-names to print debug-information from.
      */
    var debug: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * A value indicating whether the table should be initialized upon the initial sort-action.
      */
    var delayInit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether contents of spanned cells should be sortable and filterable in all table headers.
      */
    var duplicateSpan: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sorting to apply for empty cells.
      */
    var emptyTo: js.UndefOr[EmptySorting] = js.undefined
    
    /**
      * Either global `Globalize`-settings or per-column `Globalize`-settings to apply.
      */
    var globalize: js.UndefOr[GlobalizeSettings | NumberDictionary[GlobalizeSettings]] = js.undefined
    
    /**
      * A template for generating headers.
      *
      * ***Note:***
      *   * `{content}` is replaced by the actual content of the header
      *   * If `cssIcon` is set, `{icon}` is replaced by a tag for the icon
      *
      * This template may also contain html-code.
      */
    var headerTemplate: js.UndefOr[String] = js.undefined
    
    /**
      * Specific configurations for separate headers.
      */
    var headers: js.UndefOr[NumberDictionary[TablesorterHeading]] = js.undefined
    
    /**
      * A value indicating whether letter-case should be considered while sorting.
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether changes to child-rows are ignored by the table-sorter.
      */
    var ignoreChildRow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The attribute to read the text-value from `img`-tags.
      */
    var imgAttr: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether widgets should be initialized.
      */
    var initWidgets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Processes the table after the initialization.
      */
    var initialized: js.UndefOr[InitializationEventHandler[TElement]] = js.undefined
    
    /**
      * The namespace of the table.
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * The number-sorting to apply.
      */
    var numberSorter: js.UndefOr[NumberSorter] = js.undefined
    
    /**
      * A function to execute after the content of the header is processed.
      *
      * @param index
      * The zero-based index of the current table header cell.
      *
      * @param config
      * The current configuration of the table.
      *
      * @param table
      * The jQuery-object of the table.
      */
    var onRenderHeader: js.UndefOr[RenderHeaderEventHandler[TElement]] = js.undefined
    
    /**
      * A function for processing the header.
      *
      * @param index
      * The zero-based index of the header.
      *
      * @param template
      * The rendered content of the header.
      *
      * @return
      * A manipulated version of the content of the header.
      */
    var onRenderTemplate: js.UndefOr[RenderTemplateEventHandler] = js.undefined
    
    /**
      * One or more events which should be considered as a `click`-event.
      */
    var pointerClick: js.UndefOr[String] = js.undefined
    
    /**
      * One or more events which should be considered as a `mousedown`-event.
      */
    var pointerDown: js.UndefOr[String] = js.undefined
    
    /**
      * One or more events which should be considered as a `mouseup`-event.
      */
    var pointerUp: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether the sorting should be reapplied after an update of the table-data.
      */
    var resort: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A jQuery-selector for finding cells in the header-row.
      */
    var selectorHeaders: js.UndefOr[Selector] = js.undefined
    
    /**
      * A jQuery-selector for finding rows to remove prior to a table-update.
      */
    var selectorRemove: js.UndefOr[Selector] = js.undefined
    
    /**
      * A jQuery-selector to find clickable elements inside the result of `selectorHeaders` for triggering a sort.
      */
    var selectorSort: js.UndefOr[Selector] = js.undefined
    
    /**
      * A value indicating whether the sorting is performed by the server.
      */
    var serverSideSorting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether a timer icon should be shown while applying sorting and filtering.
      */
    var showProcessing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sortings to append to the current sorting.
      */
    var sortAppend: js.UndefOr[js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]] = js.undefined
    
    /**
      * Sortings to prepend to the current sorting.
      */
    var sortForce: js.UndefOr[js.Array[SortDefinition]] = js.undefined
    
    /**
      * The initial sorting after the initialization of the table.
      */
    var sortList: js.UndefOr[js.Array[SortDefinition]] = js.undefined
    
    /**
      * A value indicating whether accent character should be converted to their equivalent characters during sort.
      */
    var sortLocaleCompare: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key which is used for selecting multiple columns.
      */
    var sortMultiSortKey: js.UndefOr[
        altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
      ] = js.undefined
    
    /**
      * A value indicating whether the user can reset a sorting of a column by clicking on it a third time.
      */
    var sortReset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key to hold while clicking on a heading for reseting the sorting for the whole table.
      */
    var sortResetKey: js.UndefOr[
        altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
      ] = js.undefined
    
    /**
      * A value indicating whether sortings other than the ones in the `sortList` should be prevented.
      */
    var sortRestart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether to apply the original sorting when two cells have the same value.
      */
    var sortStable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sorting to apply to text cells in numeric columns.
      */
    var stringTo: js.UndefOr[StringSorting] = js.undefined
    
    /**
      * A value indicating whether tabbing through table headings is enabled.
      */
    var tabIndex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A class to add to the table.
      */
    var tableClass: js.UndefOr[String] = js.undefined
    
    /**
      * The `data-attribute` to automatically read text from cells.
      */
    var textAttribute: js.UndefOr[String] = js.undefined
    
    /**
      * The methods for extracting text from cells.
      */
    var textExtraction: js.UndefOr[
        basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])
      ] = js.undefined
    
    /**
      * The text-sorting to apply.
      */
    var textSorter: js.UndefOr[TextSorter[TElement] | MappedSettings[TextSorter[TElement]]] = js.undefined
    
    /**
      * The theme to use.
      */
    var theme: js.UndefOr[CoreTheme | String] = js.undefined
    
    /**
      * A value indicating whether to use `en-US`-flavored numbers.
      */
    var usNumberFormat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The format of the class-names for automatically loading the widget with the id `{name}`.
      *
      * The default setting is `widget-{name}`.
      */
    var widgetClass: js.UndefOr[String] = js.undefined
    
    /**
      * The options for the widgets.
      */
    var widgetOptions: js.UndefOr[WidgetOptions[TElement]] = js.undefined
    
    /**
      * The widgets to initialize.
      */
    var widgets: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A value indicating whether the width of the columns should be fixed.
      */
    var widthFixed: js.UndefOr[Boolean] = js.undefined
  }
  object TablesorterConfiguration {
    
    inline def apply[TElement](): TablesorterConfiguration[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablesorterConfiguration[TElement]]
    }
    
    extension [Self <: TablesorterConfiguration[?], TElement](x: Self & TablesorterConfiguration[TElement]) {
      
      inline def setCancelSelection(value: Boolean): Self = StObject.set(x, "cancelSelection", value.asInstanceOf[js.Any])
      
      inline def setCancelSelectionUndefined: Self = StObject.set(x, "cancelSelection", js.undefined)
      
      inline def setCehckboxVisible(value: Boolean): Self = StObject.set(x, "cehckboxVisible", value.asInstanceOf[js.Any])
      
      inline def setCehckboxVisibleUndefined: Self = StObject.set(x, "cehckboxVisible", js.undefined)
      
      inline def setCheckboxClass(value: String): Self = StObject.set(x, "checkboxClass", value.asInstanceOf[js.Any])
      
      inline def setCheckboxClassUndefined: Self = StObject.set(x, "checkboxClass", js.undefined)
      
      inline def setCssAsc(value: String): Self = StObject.set(x, "cssAsc", value.asInstanceOf[js.Any])
      
      inline def setCssAscUndefined: Self = StObject.set(x, "cssAsc", js.undefined)
      
      inline def setCssChildRow(value: String): Self = StObject.set(x, "cssChildRow", value.asInstanceOf[js.Any])
      
      inline def setCssChildRowUndefined: Self = StObject.set(x, "cssChildRow", js.undefined)
      
      inline def setCssDesc(value: String): Self = StObject.set(x, "cssDesc", value.asInstanceOf[js.Any])
      
      inline def setCssDescUndefined: Self = StObject.set(x, "cssDesc", js.undefined)
      
      inline def setCssHeader(value: String): Self = StObject.set(x, "cssHeader", value.asInstanceOf[js.Any])
      
      inline def setCssHeaderRow(value: String): Self = StObject.set(x, "cssHeaderRow", value.asInstanceOf[js.Any])
      
      inline def setCssHeaderRowUndefined: Self = StObject.set(x, "cssHeaderRow", js.undefined)
      
      inline def setCssHeaderUndefined: Self = StObject.set(x, "cssHeader", js.undefined)
      
      inline def setCssIcon(value: String): Self = StObject.set(x, "cssIcon", value.asInstanceOf[js.Any])
      
      inline def setCssIconAsc(value: String): Self = StObject.set(x, "cssIconAsc", value.asInstanceOf[js.Any])
      
      inline def setCssIconAscUndefined: Self = StObject.set(x, "cssIconAsc", js.undefined)
      
      inline def setCssIconDesc(value: String): Self = StObject.set(x, "cssIconDesc", value.asInstanceOf[js.Any])
      
      inline def setCssIconDescUndefined: Self = StObject.set(x, "cssIconDesc", js.undefined)
      
      inline def setCssIconDisabled(value: String): Self = StObject.set(x, "cssIconDisabled", value.asInstanceOf[js.Any])
      
      inline def setCssIconDisabledUndefined: Self = StObject.set(x, "cssIconDisabled", js.undefined)
      
      inline def setCssIconNone(value: String): Self = StObject.set(x, "cssIconNone", value.asInstanceOf[js.Any])
      
      inline def setCssIconNoneUndefined: Self = StObject.set(x, "cssIconNone", js.undefined)
      
      inline def setCssIconUndefined: Self = StObject.set(x, "cssIcon", js.undefined)
      
      inline def setCssIgnoreRow(value: String): Self = StObject.set(x, "cssIgnoreRow", value.asInstanceOf[js.Any])
      
      inline def setCssIgnoreRowUndefined: Self = StObject.set(x, "cssIgnoreRow", js.undefined)
      
      inline def setCssInfoBlock(value: String): Self = StObject.set(x, "cssInfoBlock", value.asInstanceOf[js.Any])
      
      inline def setCssInfoBlockUndefined: Self = StObject.set(x, "cssInfoBlock", js.undefined)
      
      inline def setCssNoSort(value: String): Self = StObject.set(x, "cssNoSort", value.asInstanceOf[js.Any])
      
      inline def setCssNoSortUndefined: Self = StObject.set(x, "cssNoSort", js.undefined)
      
      inline def setCssNone(value: String): Self = StObject.set(x, "cssNone", value.asInstanceOf[js.Any])
      
      inline def setCssNoneUndefined: Self = StObject.set(x, "cssNone", js.undefined)
      
      inline def setCssProcessing(value: String): Self = StObject.set(x, "cssProcessing", value.asInstanceOf[js.Any])
      
      inline def setCssProcessingUndefined: Self = StObject.set(x, "cssProcessing", js.undefined)
      
      inline def setData(value: js.Object | js.Array[js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Array[Any]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDateRange(value: Double): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
      
      inline def setDebug(value: Boolean | String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDelayInit(value: Boolean): Self = StObject.set(x, "delayInit", value.asInstanceOf[js.Any])
      
      inline def setDelayInitUndefined: Self = StObject.set(x, "delayInit", js.undefined)
      
      inline def setDuplicateSpan(value: Boolean): Self = StObject.set(x, "duplicateSpan", value.asInstanceOf[js.Any])
      
      inline def setDuplicateSpanUndefined: Self = StObject.set(x, "duplicateSpan", js.undefined)
      
      inline def setEmptyTo(value: EmptySorting): Self = StObject.set(x, "emptyTo", value.asInstanceOf[js.Any])
      
      inline def setEmptyToUndefined: Self = StObject.set(x, "emptyTo", js.undefined)
      
      inline def setGlobalize(value: GlobalizeSettings | NumberDictionary[GlobalizeSettings]): Self = StObject.set(x, "globalize", value.asInstanceOf[js.Any])
      
      inline def setGlobalizeUndefined: Self = StObject.set(x, "globalize", js.undefined)
      
      inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setHeaders(value: NumberDictionary[TablesorterHeading]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setIgnoreChildRow(value: Boolean): Self = StObject.set(x, "ignoreChildRow", value.asInstanceOf[js.Any])
      
      inline def setIgnoreChildRowUndefined: Self = StObject.set(x, "ignoreChildRow", js.undefined)
      
      inline def setImgAttr(value: String): Self = StObject.set(x, "imgAttr", value.asInstanceOf[js.Any])
      
      inline def setImgAttrUndefined: Self = StObject.set(x, "imgAttr", js.undefined)
      
      inline def setInitWidgets(value: Boolean): Self = StObject.set(x, "initWidgets", value.asInstanceOf[js.Any])
      
      inline def setInitWidgetsUndefined: Self = StObject.set(x, "initWidgets", js.undefined)
      
      inline def setInitialized(value: TElement => Callback): Self = StObject.set(x, "initialized", js.Any.fromFunction1((t0: TElement) => value(t0).runNow()))
      
      inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setNumberSorter(value: (/* x */ Double, /* y */ Double, /* ascending */ Boolean, /* maxValue */ Double) => Double): Self = StObject.set(x, "numberSorter", js.Any.fromFunction4(value))
      
      inline def setNumberSorterUndefined: Self = StObject.set(x, "numberSorter", js.undefined)
      
      inline def setOnRenderHeader(
        value: (/* index */ Double, /* config */ TablesorterConfigurationStore[TElement], /* table */ JQuery[TElement]) => Callback
      ): Self = StObject.set(x, "onRenderHeader", js.Any.fromFunction3((t0: /* index */ Double, t1: /* config */ TablesorterConfigurationStore[TElement], t2: /* table */ JQuery[TElement]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnRenderHeaderUndefined: Self = StObject.set(x, "onRenderHeader", js.undefined)
      
      inline def setOnRenderTemplate(value: (/* index */ Double, /* template */ String) => String): Self = StObject.set(x, "onRenderTemplate", js.Any.fromFunction2(value))
      
      inline def setOnRenderTemplateUndefined: Self = StObject.set(x, "onRenderTemplate", js.undefined)
      
      inline def setPointerClick(value: String): Self = StObject.set(x, "pointerClick", value.asInstanceOf[js.Any])
      
      inline def setPointerClickUndefined: Self = StObject.set(x, "pointerClick", js.undefined)
      
      inline def setPointerDown(value: String): Self = StObject.set(x, "pointerDown", value.asInstanceOf[js.Any])
      
      inline def setPointerDownUndefined: Self = StObject.set(x, "pointerDown", js.undefined)
      
      inline def setPointerUp(value: String): Self = StObject.set(x, "pointerUp", value.asInstanceOf[js.Any])
      
      inline def setPointerUpUndefined: Self = StObject.set(x, "pointerUp", js.undefined)
      
      inline def setResort(value: Boolean): Self = StObject.set(x, "resort", value.asInstanceOf[js.Any])
      
      inline def setResortUndefined: Self = StObject.set(x, "resort", js.undefined)
      
      inline def setSelectorHeaders(value: Selector): Self = StObject.set(x, "selectorHeaders", value.asInstanceOf[js.Any])
      
      inline def setSelectorHeadersUndefined: Self = StObject.set(x, "selectorHeaders", js.undefined)
      
      inline def setSelectorRemove(value: Selector): Self = StObject.set(x, "selectorRemove", value.asInstanceOf[js.Any])
      
      inline def setSelectorRemoveUndefined: Self = StObject.set(x, "selectorRemove", js.undefined)
      
      inline def setSelectorSort(value: Selector): Self = StObject.set(x, "selectorSort", value.asInstanceOf[js.Any])
      
      inline def setSelectorSortUndefined: Self = StObject.set(x, "selectorSort", js.undefined)
      
      inline def setServerSideSorting(value: Boolean): Self = StObject.set(x, "serverSideSorting", value.asInstanceOf[js.Any])
      
      inline def setServerSideSortingUndefined: Self = StObject.set(x, "serverSideSorting", js.undefined)
      
      inline def setShowProcessing(value: Boolean): Self = StObject.set(x, "showProcessing", value.asInstanceOf[js.Any])
      
      inline def setShowProcessingUndefined: Self = StObject.set(x, "showProcessing", js.undefined)
      
      inline def setSortAppend(value: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]): Self = StObject.set(x, "sortAppend", value.asInstanceOf[js.Any])
      
      inline def setSortAppendUndefined: Self = StObject.set(x, "sortAppend", js.undefined)
      
      inline def setSortAppendVarargs(value: SortDefinition*): Self = StObject.set(x, "sortAppend", js.Array(value*))
      
      inline def setSortForce(value: js.Array[SortDefinition]): Self = StObject.set(x, "sortForce", value.asInstanceOf[js.Any])
      
      inline def setSortForceUndefined: Self = StObject.set(x, "sortForce", js.undefined)
      
      inline def setSortForceVarargs(value: SortDefinition*): Self = StObject.set(x, "sortForce", js.Array(value*))
      
      inline def setSortList(value: js.Array[SortDefinition]): Self = StObject.set(x, "sortList", value.asInstanceOf[js.Any])
      
      inline def setSortListUndefined: Self = StObject.set(x, "sortList", js.undefined)
      
      inline def setSortListVarargs(value: SortDefinition*): Self = StObject.set(x, "sortList", js.Array(value*))
      
      inline def setSortLocaleCompare(value: Boolean): Self = StObject.set(x, "sortLocaleCompare", value.asInstanceOf[js.Any])
      
      inline def setSortLocaleCompareUndefined: Self = StObject.set(x, "sortLocaleCompare", js.undefined)
      
      inline def setSortMultiSortKey(
        value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typingsJapgolly.tablesorter.tablesorterStrings.x | y
      ): Self = StObject.set(x, "sortMultiSortKey", value.asInstanceOf[js.Any])
      
      inline def setSortMultiSortKeyUndefined: Self = StObject.set(x, "sortMultiSortKey", js.undefined)
      
      inline def setSortReset(value: Boolean): Self = StObject.set(x, "sortReset", value.asInstanceOf[js.Any])
      
      inline def setSortResetKey(
        value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typingsJapgolly.tablesorter.tablesorterStrings.x | y
      ): Self = StObject.set(x, "sortResetKey", value.asInstanceOf[js.Any])
      
      inline def setSortResetKeyUndefined: Self = StObject.set(x, "sortResetKey", js.undefined)
      
      inline def setSortResetUndefined: Self = StObject.set(x, "sortReset", js.undefined)
      
      inline def setSortRestart(value: Boolean): Self = StObject.set(x, "sortRestart", value.asInstanceOf[js.Any])
      
      inline def setSortRestartUndefined: Self = StObject.set(x, "sortRestart", js.undefined)
      
      inline def setSortStable(value: Boolean): Self = StObject.set(x, "sortStable", value.asInstanceOf[js.Any])
      
      inline def setSortStableUndefined: Self = StObject.set(x, "sortStable", js.undefined)
      
      inline def setStringTo(value: StringSorting): Self = StObject.set(x, "stringTo", value.asInstanceOf[js.Any])
      
      inline def setStringToUndefined: Self = StObject.set(x, "stringTo", js.undefined)
      
      inline def setTabIndex(value: Boolean): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTableClass(value: String): Self = StObject.set(x, "tableClass", value.asInstanceOf[js.Any])
      
      inline def setTableClassUndefined: Self = StObject.set(x, "tableClass", js.undefined)
      
      inline def setTextAttribute(value: String): Self = StObject.set(x, "textAttribute", value.asInstanceOf[js.Any])
      
      inline def setTextAttributeUndefined: Self = StObject.set(x, "textAttribute", js.undefined)
      
      inline def setTextExtraction(value: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])): Self = StObject.set(x, "textExtraction", value.asInstanceOf[js.Any])
      
      inline def setTextExtractionFunction3(value: (/* cell */ Element, TElement, /* index */ Double) => String): Self = StObject.set(x, "textExtraction", js.Any.fromFunction3(value))
      
      inline def setTextExtractionUndefined: Self = StObject.set(x, "textExtraction", js.undefined)
      
      inline def setTextSorter(value: TextSorter[TElement] | MappedSettings[TextSorter[TElement]]): Self = StObject.set(x, "textSorter", value.asInstanceOf[js.Any])
      
      inline def setTextSorterFunction5(
        value: (/* x */ String, /* y */ String, /* ascending */ Boolean, /* index */ Double, TElement) => Double
      ): Self = StObject.set(x, "textSorter", js.Any.fromFunction5(value))
      
      inline def setTextSorterUndefined: Self = StObject.set(x, "textSorter", js.undefined)
      
      inline def setTheme(value: CoreTheme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUsNumberFormat(value: Boolean): Self = StObject.set(x, "usNumberFormat", value.asInstanceOf[js.Any])
      
      inline def setUsNumberFormatUndefined: Self = StObject.set(x, "usNumberFormat", js.undefined)
      
      inline def setWidgetClass(value: String): Self = StObject.set(x, "widgetClass", value.asInstanceOf[js.Any])
      
      inline def setWidgetClassUndefined: Self = StObject.set(x, "widgetClass", js.undefined)
      
      inline def setWidgetOptions(value: WidgetOptions[TElement]): Self = StObject.set(x, "widgetOptions", value.asInstanceOf[js.Any])
      
      inline def setWidgetOptionsUndefined: Self = StObject.set(x, "widgetOptions", js.undefined)
      
      inline def setWidgets(value: js.Array[String]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
      
      inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
      
      inline def setWidgetsVarargs(value: String*): Self = StObject.set(x, "widgets", js.Array(value*))
      
      inline def setWidthFixed(value: Boolean): Self = StObject.set(x, "widthFixed", value.asInstanceOf[js.Any])
      
      inline def setWidthFixedUndefined: Self = StObject.set(x, "widthFixed", js.undefined)
    }
  }
}
