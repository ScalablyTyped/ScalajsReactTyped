package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.load
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsGeneral extends js.Object {
  // Not listed in options--------------------
  /** Tabulator will automatically attempt to redraw the data contained in the table if the containing element for the table is resized. To disable this functionality, set the autoResize property to false */
  var autoResize: js.UndefOr[Boolean] = js.undefined
  /** Prevent actions from riggering an update of the Virtual DOM: */
  var blockRedraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** The dataEdited callback is triggered whenever the table data is changed by the user. Triggers for this include editing any cell in the table, adding a row and deleting a row. */
  var dataEdited: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  /** The dataLoaded callback is triggered when a new set of data is loaded into the table. */
  var dataLoaded: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  /** The dataLoading callback is triggered whenever new data is loaded into the table. */
  var dataLoading: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  /** The dataSorted callback is triggered after the table dataset is sorted. */
  var dataSorted: js.UndefOr[
    js.Function2[/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent], Unit]
  ] = js.undefined
  /** The dataSorting callback is triggered whenever a sort event occurs, before sorting happens. */
  var dataSorting: js.UndefOr[js.Function1[/* sorters */ js.Array[Sorter], Unit]] = js.undefined
  /** Footer  element to display for the table	 */
  var footerElement: js.UndefOr[String | HTMLElement] = js.undefined
  /** Sets the height of the containing element, can be set to any valid height css value. If set to false (the default), the height of the table will resize to fit the table data.	 */
  var height: js.UndefOr[String | Double | `false`] = js.undefined
  /** The htmlImported callback is triggered when Tabulator finishes importing data from an HTML table. */
  var htmlImported: js.UndefOr[EmptyCallback] = js.undefined
  /** The htmlImporting callback is triggered when Tabulator starts importing data from an HTML table. */
  var htmlImporting: js.UndefOr[EmptyCallback] = js.undefined
  /** Setting the invalidOptionWarnings option to false will disable console warning messages for invalid properties in the table constructor and column definition object */
  var invalidOptionWarnings: js.UndefOr[Boolean] = js.undefined
  /** Keybinding configuration object	 */
  var keybindings: js.UndefOr[`false` | KeyBinding] = js.undefined
  /** Whenever a page has been loaded, the pageLoaded callback is called, passing the current page number as an argument. */
  var pageLoaded: js.UndefOr[js.Function1[/* pageno */ Double, Unit]] = js.undefined
  /** placeholder element to display on empty table	 */
  var placeholder: js.UndefOr[String | HTMLElement] = js.undefined
  /** * The reactivity systems allow Tabulator to watch arrays and objects passed into the table for changes and then automatically update the table.
    This approach means you no longer need to worry about calling a number of different functions on the table to make changes, you simply update the array or object you originally passed into the table and Tabulator will take care of the rest.
    You can enable reactive data by setting the reactiveData option to true in the table constructor, and then passing your data array to the data option.
    Once the table is built any changes to the array will automatically be replicated to the table without needing to call any functions on the table itself*/
  var reactiveData: js.UndefOr[Boolean] = js.undefined
  /** The renderComplete callback is triggered after the table has been rendered */
  var renderComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** The renderStarted callback is triggered whenever all the rows in the table are about to be rendered. This can include:
    Data is loaded into the table when setData is called
    A page is loaded through any form of pagination
    Rows are added to the table during progressive rendering
    Columns are changed by setColumns
    The data is filtered
    The data is sorted
    The redraw function is called */
  var renderStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** This will restore automatic table redrawing and trigger an appropriate redraw if one was needed as a result of any actions that happened while the redraw was blocked. */
  var restoreRedraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Callback is triggered when the table is horizontally scrolled. */
  var scrollHorizontal: js.UndefOr[js.Function1[/* left */ js.Any, Unit]] = js.undefined
  /** Callback is triggered when the table is vertically scrolled. */
  var scrollVertical: js.UndefOr[js.Function1[/* top */ js.Any, Unit]] = js.undefined
  /** When a the tabulator constructor is called, the tableBuilding callback will triggered */
  var tableBuilding: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** When a the tabulator constructor is called and the table has finished being rendered, the tableBuilt callback will triggered: */
  var tableBuilt: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** When to regenerate cell tooltip value	 */
  var tooltipGenerationMode: js.UndefOr[load] = js.undefined
  /** Function to generate tooltips for cells	 */
  var tooltips: js.UndefOr[GlobalTooltipOption] = js.undefined
  /** Enable rendering using the Virtual DOM engine	 */
  var virtualDom: js.UndefOr[Boolean] = js.undefined
  /** Manually set the size of the virtual DOM buffer	 */
  var virtualDomBuffer: js.UndefOr[Boolean] = js.undefined
}

object OptionsGeneral {
  @scala.inline
  def apply(
    autoResize: js.UndefOr[Boolean] = js.undefined,
    blockRedraw: js.UndefOr[Callback] = js.undefined,
    dataEdited: /* data */ js.Any => Callback = null,
    dataLoaded: /* data */ js.Any => Callback = null,
    dataLoading: /* data */ js.Any => Callback = null,
    dataSorted: (/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent]) => Callback = null,
    dataSorting: /* sorters */ js.Array[Sorter] => Callback = null,
    footerElement: String | HTMLElement = null,
    height: String | Double | `false` = null,
    htmlImported: /* callback */ js.Function0[Unit] => Callback = null,
    htmlImporting: /* callback */ js.Function0[Unit] => Callback = null,
    invalidOptionWarnings: js.UndefOr[Boolean] = js.undefined,
    keybindings: `false` | KeyBinding = null,
    pageLoaded: /* pageno */ Double => Callback = null,
    placeholder: String | HTMLElement = null,
    reactiveData: js.UndefOr[Boolean] = js.undefined,
    renderComplete: js.UndefOr[Callback] = js.undefined,
    renderStarted: js.UndefOr[Callback] = js.undefined,
    restoreRedraw: js.UndefOr[Callback] = js.undefined,
    scrollHorizontal: /* left */ js.Any => Callback = null,
    scrollVertical: /* top */ js.Any => Callback = null,
    tableBuilding: js.UndefOr[Callback] = js.undefined,
    tableBuilt: js.UndefOr[Callback] = js.undefined,
    tooltipGenerationMode: load = null,
    tooltips: GlobalTooltipOption = null,
    virtualDom: js.UndefOr[Boolean] = js.undefined,
    virtualDomBuffer: js.UndefOr[Boolean] = js.undefined
  ): OptionsGeneral = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    blockRedraw.foreach(p => __obj.updateDynamic("blockRedraw")(p.toJsFn))
    if (dataEdited != null) __obj.updateDynamic("dataEdited")(js.Any.fromFunction1((t0: /* data */ js.Any) => dataEdited(t0).runNow()))
    if (dataLoaded != null) __obj.updateDynamic("dataLoaded")(js.Any.fromFunction1((t0: /* data */ js.Any) => dataLoaded(t0).runNow()))
    if (dataLoading != null) __obj.updateDynamic("dataLoading")(js.Any.fromFunction1((t0: /* data */ js.Any) => dataLoading(t0).runNow()))
    if (dataSorted != null) __obj.updateDynamic("dataSorted")(js.Any.fromFunction2((t0: /* sorters */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.Sorter], t1: /* rows */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.RowComponent]) => dataSorted(t0, t1).runNow()))
    if (dataSorting != null) __obj.updateDynamic("dataSorting")(js.Any.fromFunction1((t0: /* sorters */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.Sorter]) => dataSorting(t0).runNow()))
    if (footerElement != null) __obj.updateDynamic("footerElement")(footerElement.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlImported != null) __obj.updateDynamic("htmlImported")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => htmlImported(t0).runNow()))
    if (htmlImporting != null) __obj.updateDynamic("htmlImporting")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => htmlImporting(t0).runNow()))
    if (!js.isUndefined(invalidOptionWarnings)) __obj.updateDynamic("invalidOptionWarnings")(invalidOptionWarnings.asInstanceOf[js.Any])
    if (keybindings != null) __obj.updateDynamic("keybindings")(keybindings.asInstanceOf[js.Any])
    if (pageLoaded != null) __obj.updateDynamic("pageLoaded")(js.Any.fromFunction1((t0: /* pageno */ scala.Double) => pageLoaded(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(reactiveData)) __obj.updateDynamic("reactiveData")(reactiveData.asInstanceOf[js.Any])
    renderComplete.foreach(p => __obj.updateDynamic("renderComplete")(p.toJsFn))
    renderStarted.foreach(p => __obj.updateDynamic("renderStarted")(p.toJsFn))
    restoreRedraw.foreach(p => __obj.updateDynamic("restoreRedraw")(p.toJsFn))
    if (scrollHorizontal != null) __obj.updateDynamic("scrollHorizontal")(js.Any.fromFunction1((t0: /* left */ js.Any) => scrollHorizontal(t0).runNow()))
    if (scrollVertical != null) __obj.updateDynamic("scrollVertical")(js.Any.fromFunction1((t0: /* top */ js.Any) => scrollVertical(t0).runNow()))
    tableBuilding.foreach(p => __obj.updateDynamic("tableBuilding")(p.toJsFn))
    tableBuilt.foreach(p => __obj.updateDynamic("tableBuilt")(p.toJsFn))
    if (tooltipGenerationMode != null) __obj.updateDynamic("tooltipGenerationMode")(tooltipGenerationMode.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualDom)) __obj.updateDynamic("virtualDom")(virtualDom.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualDomBuffer)) __obj.updateDynamic("virtualDomBuffer")(virtualDomBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsGeneral]
  }
}

