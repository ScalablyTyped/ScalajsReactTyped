package typingsJapgolly.tablesorter

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.jquery.JQuery_.Selector
import typingsJapgolly.tablesorter.coreThemeMod.CoreTheme
import typingsJapgolly.tablesorter.emptySortingMod.EmptySorting
import typingsJapgolly.tablesorter.globalizeSettingsMod.GlobalizeSettings
import typingsJapgolly.tablesorter.initializationEventHandlerMod.InitializationEventHandler
import typingsJapgolly.tablesorter.mappedSettingsMod.MappedSettings
import typingsJapgolly.tablesorter.mod._Global_.HTMLElement
import typingsJapgolly.tablesorter.mod._Global_.JQuery
import typingsJapgolly.tablesorter.numberSorterMod.NumberSorter
import typingsJapgolly.tablesorter.pagerConfigurationStoreMod.PagerConfigurationStore
import typingsJapgolly.tablesorter.parserMod.Parser
import typingsJapgolly.tablesorter.relativeSortDefinitionMod.RelativeSortDefinition
import typingsJapgolly.tablesorter.renderHeaderEventHandlerMod.RenderHeaderEventHandler
import typingsJapgolly.tablesorter.renderTemplateEventHandlerMod.RenderTemplateEventHandler
import typingsJapgolly.tablesorter.sortDefinitionMod.SortDefinition
import typingsJapgolly.tablesorter.sortOrderMod.SortOrder
import typingsJapgolly.tablesorter.stringSortingMod.StringSorting
import typingsJapgolly.tablesorter.tableSortingMod.TableSorting
import typingsJapgolly.tablesorter.tablesorterCacheMod.TablesorterCache
import typingsJapgolly.tablesorter.tablesorterHeadingMod.TablesorterHeading
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
import typingsJapgolly.tablesorter.textExtractorMod.TextExtractor
import typingsJapgolly.tablesorter.textSorterMod.TextSorter
import typingsJapgolly.tablesorter.widgetOptionStoreMod.WidgetOptionStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/TablesorterConfigurationStore", JSImport.Namespace)
@js.native
object tablesorterConfigurationStoreMod extends js.Object {
  /* Inlined parent std.Required<tablesorter.tablesorter/System/TablesorterConfiguration.TablesorterConfiguration<TElement>> */
  @js.native
  trait TablesorterConfigurationStore[TElement] extends js.Object {
    /**
      * A jQuery-object which contains all filter-cells.
      */
    @JSName("$filters")
    var $filters: JQuery[HTMLElement] = js.native
    /**
      * The headers of the table.
      */
    @JSName("$headerIndexed")
    var $headerIndexed: js.Array[JQuery[HTMLElement]] = js.native
    /**
      * A jQuery-object containing all headers of the table.
      */
    @JSName("$headers")
    var $headers: JQuery[HTMLElement] = js.native
    /**
      * A jQuery-object containing the table itself.
      */
    @JSName("$table")
    var $table: JQuery[TElement] = js.native
    /**
      * A jQuery-object containing all sortable table-bodies.
      */
    @JSName("$tbodies")
    var $tbodies: JQuery[HTMLElement] = js.native
    /**
      * The cache of the tablesorter.
      */
    var cache: TablesorterCache = js.native
    var cancelSelection: Boolean = js.native
    var cehckboxVisible: Boolean = js.native
    var checkboxClass: String = js.native
    /**
      * The number of columns of the table.
      */
    var columns: Double = js.native
    var cssAsc: String = js.native
    var cssChildRow: String = js.native
    var cssDesc: String = js.native
    var cssHeader: String = js.native
    var cssHeaderRow: String = js.native
    var cssIcon: String = js.native
    var cssIconAsc: String = js.native
    var cssIconDesc: String = js.native
    var cssIconDisabled: String = js.native
    var cssIconNone: String = js.native
    var cssIgnoreRow: String = js.native
    var cssInfoBlock: String = js.native
    var cssNoSort: String = js.native
    var cssNone: String = js.native
    var cssProcessing: String = js.native
    var data: js.Object | js.Array[js.Array[_]] = js.native
    var dateFormat: String = js.native
    var dateRange: Double = js.native
    var debug: Boolean | String = js.native
    var delayInit: Boolean = js.native
    var duplicateSpan: Boolean = js.native
    var emptyTo: EmptySorting = js.native
    /**
      * The amount of filtered rows.
      */
    var filteredRows: Double = js.native
    var globalize: GlobalizeSettings | NumberDictionary[GlobalizeSettings] = js.native
    /**
      * The initial content of the headers.
      */
    var headerContent: js.Array[String] = js.native
    /**
      * The headers of the table.
      */
    var headerList: js.Array[HTMLElement] = js.native
    var headerTemplate: String = js.native
    var headers: NumberDictionary[TablesorterHeading] = js.native
    var ignoreCase: Boolean = js.native
    var ignoreChildRow: Boolean = js.native
    var imgAttr: String = js.native
    var initWidgets: Boolean = js.native
    @JSName("initialized")
    var initialized_Original: InitializationEventHandler[TElement] = js.native
    var namespace: String = js.native
    @JSName("numberSorter")
    var numberSorter_Original: NumberSorter = js.native
    @JSName("onRenderHeader")
    var onRenderHeader_Original: RenderHeaderEventHandler[TElement] = js.native
    @JSName("onRenderTemplate")
    var onRenderTemplate_Original: RenderTemplateEventHandler = js.native
    /**
      * Provides methods and settings for the `pager`-widget.
      */
    var pager: PagerConfigurationStore[TElement] = js.native
    /**
      * The parsers of the table.
      */
    var parsers: js.Array[Parser[TElement]] = js.native
    var pointerClick: String = js.native
    var pointerDown: String = js.native
    var pointerUp: String = js.native
    var resort: Boolean = js.native
    var selectorHeaders: Selector = js.native
    var selectorRemove: Selector = js.native
    var selectorSort: Selector = js.native
    var serverSideSorting: Boolean = js.native
    var showProcessing: Boolean = js.native
    var sortAppend: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]] = js.native
    var sortForce: js.Array[SortDefinition] = js.native
    var sortInitialOrder: SortOrder = js.native
    var sortList: js.Array[SortDefinition] = js.native
    var sortLocaleCompare: Boolean = js.native
    var sortMultiSortKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y = js.native
    var sortReset: Boolean = js.native
    var sortResetKey: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y = js.native
    var sortRestart: Boolean = js.native
    var sortStable: Boolean = js.native
    /**
      * The sortings of the tablesorter.
      */
    var sortVars: js.Array[TableSorting] = js.native
    var stringTo: StringSorting = js.native
    var tabIndex: Boolean = js.native
    /**
      * The html-representation of the table.
      */
    var table: TElement = js.native
    var tableClass: String = js.native
    var textAttribute: String = js.native
    var textExtraction: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]]) = js.native
    var textSorter: TextSorter[TElement] | MappedSettings[TextSorter[TElement]] = js.native
    var theme: CoreTheme | String = js.native
    /**
      * The total amount of rows.
      */
    var totalRows: Double = js.native
    var usNumberFormat: Boolean = js.native
    var widgetClass: String = js.native
    var widgetOptions: WidgetOptionStore[TElement] = js.native
    var widgets: js.Array[String] = js.native
    var widthFixed: Boolean = js.native
    def initialized(table: TElement): Unit = js.native
    def numberSorter(x: Double, y: Double, ascending: Boolean, maxValue: Double): Double = js.native
    def onRenderHeader(index: Double, config: TablesorterConfigurationStore[TElement], table: JQuery[TElement]): Unit = js.native
    def onRenderTemplate(index: Double, template: String): String = js.native
  }
  
}

