package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBootstrapTable.AnonFilter
import typingsJapgolly.reactBootstrapTable.mod.BootstrapTableProps
import typingsJapgolly.reactBootstrapTable.mod.BootstrapVersion
import typingsJapgolly.reactBootstrapTable.mod.CellEdit
import typingsJapgolly.reactBootstrapTable.mod.ExpandColumnOptions
import typingsJapgolly.reactBootstrapTable.mod.FetchInfo
import typingsJapgolly.reactBootstrapTable.mod.FooterData
import typingsJapgolly.reactBootstrapTable.mod.KeyboardNavigation
import typingsJapgolly.reactBootstrapTable.mod.Options
import typingsJapgolly.reactBootstrapTable.mod.RemoteObjSpec
import typingsJapgolly.reactBootstrapTable.mod.ScrollPosition
import typingsJapgolly.reactBootstrapTable.mod.SelectRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BootstrapTable {
  def apply(
    data: js.Array[js.Object],
    autoCollapse: AnonFilter = null,
    bodyContainerClass: String = null,
    bodyStyle: CSSProperties = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    cellEdit: CellEdit[_] = null,
    columnFilter: js.UndefOr[Boolean] = js.undefined,
    condensed: js.UndefOr[Boolean] = js.undefined,
    containerClass: String = null,
    containerStyle: CSSProperties = null,
    csvFileName: String | js.Function0[String] = null,
    deleteRow: js.UndefOr[Boolean] = js.undefined,
    excludeCSVHeader: js.UndefOr[Boolean] = js.undefined,
    expandColumnOptions: ExpandColumnOptions = null,
    expandComponent: /* row */ js.Any => CallbackTo[String | Element] = null,
    expandableRow: /* row */ js.Any => CallbackTo[Boolean] = null,
    exportCSV: js.UndefOr[Boolean] = js.undefined,
    fetchInfo: FetchInfo = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    footerData: js.Array[js.Array[FooterData]] = null,
    headerContainerClass: String = null,
    headerStyle: CSSProperties = null,
    height: String = null,
    hover: js.UndefOr[Boolean] = js.undefined,
    ignoreSinglePage: js.UndefOr[Boolean] = js.undefined,
    insertRow: js.UndefOr[Boolean] = js.undefined,
    keyBoardNav: Boolean | KeyboardNavigation = null,
    keyField: String = null,
    maxHeight: String = null,
    multiColumnSearch: js.UndefOr[Boolean] = js.undefined,
    multiColumnSort: Int | Double = null,
    options: Options[_] = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    remote: Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec]) = null,
    renderAlert: js.UndefOr[Boolean] = js.undefined,
    scrollTop: Double | ScrollPosition = null,
    search: js.UndefOr[Boolean] = js.undefined,
    searchPlaceholder: String = null,
    selectRow: SelectRow[_] = null,
    strictSearch: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined,
    tableBodyClass: String = null,
    tableContainerClass: String = null,
    tableFooterClass: String = null,
    tableHeaderClass: String = null,
    tableStyle: CSSProperties = null,
    trClassName: String | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, String]) = null,
    trStyle: CSSProperties | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, CSSProperties]) = null,
    version: BootstrapVersion = null,
    withoutTabIndex: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BootstrapTableProps, 
    typingsJapgolly.reactBootstrapTable.mod.BootstrapTable, 
    Unit, 
    BootstrapTableProps
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (autoCollapse != null) __obj.updateDynamic("autoCollapse")(autoCollapse.asInstanceOf[js.Any])
    if (bodyContainerClass != null) __obj.updateDynamic("bodyContainerClass")(bodyContainerClass.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (cellEdit != null) __obj.updateDynamic("cellEdit")(cellEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(columnFilter)) __obj.updateDynamic("columnFilter")(columnFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(condensed)) __obj.updateDynamic("condensed")(condensed.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (csvFileName != null) __obj.updateDynamic("csvFileName")(csvFileName.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteRow)) __obj.updateDynamic("deleteRow")(deleteRow.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeCSVHeader)) __obj.updateDynamic("excludeCSVHeader")(excludeCSVHeader.asInstanceOf[js.Any])
    if (expandColumnOptions != null) __obj.updateDynamic("expandColumnOptions")(expandColumnOptions.asInstanceOf[js.Any])
    if (expandComponent != null) __obj.updateDynamic("expandComponent")(js.Any.fromFunction1((t0: /* row */ js.Any) => expandComponent(t0).runNow()))
    if (expandableRow != null) __obj.updateDynamic("expandableRow")(js.Any.fromFunction1((t0: /* row */ js.Any) => expandableRow(t0).runNow()))
    if (!js.isUndefined(exportCSV)) __obj.updateDynamic("exportCSV")(exportCSV.asInstanceOf[js.Any])
    if (fetchInfo != null) __obj.updateDynamic("fetchInfo")(fetchInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerData != null) __obj.updateDynamic("footerData")(footerData.asInstanceOf[js.Any])
    if (headerContainerClass != null) __obj.updateDynamic("headerContainerClass")(headerContainerClass.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSinglePage)) __obj.updateDynamic("ignoreSinglePage")(ignoreSinglePage.asInstanceOf[js.Any])
    if (!js.isUndefined(insertRow)) __obj.updateDynamic("insertRow")(insertRow.asInstanceOf[js.Any])
    if (keyBoardNav != null) __obj.updateDynamic("keyBoardNav")(keyBoardNav.asInstanceOf[js.Any])
    if (keyField != null) __obj.updateDynamic("keyField")(keyField.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(multiColumnSearch)) __obj.updateDynamic("multiColumnSearch")(multiColumnSearch.asInstanceOf[js.Any])
    if (multiColumnSort != null) __obj.updateDynamic("multiColumnSort")(multiColumnSort.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAlert)) __obj.updateDynamic("renderAlert")(renderAlert.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (selectRow != null) __obj.updateDynamic("selectRow")(selectRow.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSearch)) __obj.updateDynamic("strictSearch")(strictSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    if (tableBodyClass != null) __obj.updateDynamic("tableBodyClass")(tableBodyClass.asInstanceOf[js.Any])
    if (tableContainerClass != null) __obj.updateDynamic("tableContainerClass")(tableContainerClass.asInstanceOf[js.Any])
    if (tableFooterClass != null) __obj.updateDynamic("tableFooterClass")(tableFooterClass.asInstanceOf[js.Any])
    if (tableHeaderClass != null) __obj.updateDynamic("tableHeaderClass")(tableHeaderClass.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (trClassName != null) __obj.updateDynamic("trClassName")(trClassName.asInstanceOf[js.Any])
    if (trStyle != null) __obj.updateDynamic("trStyle")(trStyle.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutTabIndex)) __obj.updateDynamic("withoutTabIndex")(withoutTabIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTable.mod.BootstrapTableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTable.mod.BootstrapTable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.BootstrapTableProps])(children: _*)
  }
  @JSImport("react-bootstrap-table", "BootstrapTable")
  @js.native
  object componentImport extends js.Object
  
}

