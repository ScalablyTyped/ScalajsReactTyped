package typingsJapgolly.gijgo.Types

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSettings[Entity] extends js.Object {
  //Configuration options
  var autoGenerateColumns: js.UndefOr[Boolean] = js.undefined
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  //Events
  var beforeEmptyRowInsert: js.UndefOr[js.Function2[/* e */ js.Any, /* $row */ JQuery, _]] = js.undefined
  var bodyRowHeight: js.UndefOr[String] = js.undefined
  var cellDataBound: js.UndefOr[
    js.Function5[
      /* e */ js.Any, 
      /* $wrapper */ JQuery, 
      /* id */ String, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      _
    ]
  ] = js.undefined
  var cellDataChanged: js.UndefOr[
    js.Function6[
      /* e */ js.Any, 
      /* $cell */ JQuery, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      /* oldValue */ js.Any, 
      /* newValue */ js.Any, 
      _
    ]
  ] = js.undefined
  var columnHide: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, _]] = js.undefined
  var columnReorder: js.UndefOr[Boolean] = js.undefined
  var columnShow: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, _]] = js.undefined
  var columns: js.UndefOr[js.Array[GridColumn]] = js.undefined
  var dataBinding: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], _]] = js.undefined
  var dataBound: js.UndefOr[
    js.Function3[/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ Double, _]
  ] = js.undefined
  var dataFiltered: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], _]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var defaultColumnSettings: js.UndefOr[GridColumn] = js.undefined
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var detailCollapse: js.UndefOr[js.Function3[/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String, _]] = js.undefined
  var detailExpand: js.UndefOr[js.Function3[/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String, _]] = js.undefined
  var detailTemplate: js.UndefOr[String] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
  var grouping: js.UndefOr[GridGrouping] = js.undefined
  var headerFilter: js.UndefOr[GridHeaderFilter] = js.undefined
  var headerRowHeight: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[GridIcons] = js.undefined
  var iconsLibrary: js.UndefOr[String] = js.undefined
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var inlineEditing: js.UndefOr[GridInlineEditing] = js.undefined
  var keepExpandedRows: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var mapping: js.UndefOr[js.Any] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var notFoundText: js.UndefOr[String] = js.undefined
  var optimisticPersistence: js.UndefOr[GridOptimisticPersistence] = js.undefined
  var orderNumberField: js.UndefOr[String] = js.undefined
  var pageChanging: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ Double, _]] = js.undefined
  var pageSizeChange: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ Double, _]] = js.undefined
  var pager: js.UndefOr[GridPager] = js.undefined
  var paramNames: js.UndefOr[GridParamNames] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var primaryKey: js.UndefOr[String] = js.undefined
  var resizableColumns: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[js.Function3[/* e */ js.Any, /* newWidth */ Double, /* oldWidth */ Double, _]] = js.undefined
  var resizeCheckInterval: js.UndefOr[Double] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var rowDataBound: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.undefined
  var rowDataChanged: js.UndefOr[js.Function3[/* e */ js.Any, /* id */ String, /* record */ Entity, _]] = js.undefined
  var rowRemoving: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.undefined
  var rowReorder: js.UndefOr[Boolean] = js.undefined
  var rowReorderColumn: js.UndefOr[String] = js.undefined
  var rowSelect: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.undefined
  var rowUnselect: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.undefined
  var selectionMethod: js.UndefOr[String] = js.undefined
  var selectionType: js.UndefOr[String] = js.undefined
  var showHiddenColumnsAsDetails: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toolbarTemplate: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object GridSettings {
  @scala.inline
  def apply[Entity](
    autoGenerateColumns: js.UndefOr[Boolean] = js.undefined,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    beforeEmptyRowInsert: (/* e */ js.Any, /* $row */ JQuery) => CallbackTo[js.Any] = null,
    bodyRowHeight: String = null,
    cellDataBound: (/* e */ js.Any, /* $wrapper */ JQuery, /* id */ String, /* column */ GridColumn, /* record */ Entity) => CallbackTo[js.Any] = null,
    cellDataChanged: (/* e */ js.Any, /* $cell */ JQuery, /* column */ GridColumn, /* record */ Entity, /* oldValue */ js.Any, /* newValue */ js.Any) => CallbackTo[js.Any] = null,
    columnHide: (/* e */ js.Any, /* column */ GridColumn) => CallbackTo[js.Any] = null,
    columnReorder: js.UndefOr[Boolean] = js.undefined,
    columnShow: (/* e */ js.Any, /* column */ GridColumn) => CallbackTo[js.Any] = null,
    columns: js.Array[GridColumn] = null,
    dataBinding: (/* e */ js.Any, /* records */ js.Array[Entity]) => CallbackTo[js.Any] = null,
    dataBound: (/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ Double) => CallbackTo[js.Any] = null,
    dataFiltered: (/* e */ js.Any, /* records */ js.Array[Entity]) => CallbackTo[js.Any] = null,
    dataSource: js.Any = null,
    defaultColumnSettings: GridColumn = null,
    destroying: /* e */ js.Any => CallbackTo[js.Any] = null,
    detailCollapse: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => CallbackTo[js.Any] = null,
    detailExpand: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => CallbackTo[js.Any] = null,
    detailTemplate: String = null,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    fontSize: String = null,
    grouping: GridGrouping = null,
    headerFilter: GridHeaderFilter = null,
    headerRowHeight: String = null,
    icons: GridIcons = null,
    iconsLibrary: String = null,
    initialized: /* e */ js.Any => CallbackTo[js.Any] = null,
    inlineEditing: GridInlineEditing = null,
    keepExpandedRows: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    mapping: js.Any = null,
    minWidth: Int | Double = null,
    notFoundText: String = null,
    optimisticPersistence: GridOptimisticPersistence = null,
    orderNumberField: String = null,
    pageChanging: (/* e */ js.Any, /* newPage */ Double) => CallbackTo[js.Any] = null,
    pageSizeChange: (/* e */ js.Any, /* newPage */ Double) => CallbackTo[js.Any] = null,
    pager: GridPager = null,
    paramNames: GridParamNames = null,
    params: js.Any = null,
    primaryKey: String = null,
    resizableColumns: js.UndefOr[Boolean] = js.undefined,
    resize: (/* e */ js.Any, /* newWidth */ Double, /* oldWidth */ Double) => CallbackTo[js.Any] = null,
    resizeCheckInterval: Int | Double = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    rowDataBound: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => CallbackTo[js.Any] = null,
    rowDataChanged: (/* e */ js.Any, /* id */ String, /* record */ Entity) => CallbackTo[js.Any] = null,
    rowRemoving: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => CallbackTo[js.Any] = null,
    rowReorder: js.UndefOr[Boolean] = js.undefined,
    rowReorderColumn: String = null,
    rowSelect: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => CallbackTo[js.Any] = null,
    rowUnselect: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => CallbackTo[js.Any] = null,
    selectionMethod: String = null,
    selectionType: String = null,
    showHiddenColumnsAsDetails: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    toolbarTemplate: String = null,
    uiLibrary: String = null,
    width: Int | Double = null
  ): GridSettings[Entity] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoGenerateColumns)) __obj.updateDynamic("autoGenerateColumns")(autoGenerateColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (beforeEmptyRowInsert != null) __obj.updateDynamic("beforeEmptyRowInsert")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* $row */ typingsJapgolly.gijgo.JQuery) => beforeEmptyRowInsert(t0, t1).runNow()))
    if (bodyRowHeight != null) __obj.updateDynamic("bodyRowHeight")(bodyRowHeight.asInstanceOf[js.Any])
    if (cellDataBound != null) __obj.updateDynamic("cellDataBound")(js.Any.fromFunction5((t0: /* e */ js.Any, t1: /* $wrapper */ typingsJapgolly.gijgo.JQuery, t2: /* id */ java.lang.String, t3: /* column */ typingsJapgolly.gijgo.Types.GridColumn, t4: /* record */ Entity) => cellDataBound(t0, t1, t2, t3, t4).runNow()))
    if (cellDataChanged != null) __obj.updateDynamic("cellDataChanged")(js.Any.fromFunction6((t0: /* e */ js.Any, t1: /* $cell */ typingsJapgolly.gijgo.JQuery, t2: /* column */ typingsJapgolly.gijgo.Types.GridColumn, t3: /* record */ Entity, t4: /* oldValue */ js.Any, t5: /* newValue */ js.Any) => cellDataChanged(t0, t1, t2, t3, t4, t5).runNow()))
    if (columnHide != null) __obj.updateDynamic("columnHide")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* column */ typingsJapgolly.gijgo.Types.GridColumn) => columnHide(t0, t1).runNow()))
    if (!js.isUndefined(columnReorder)) __obj.updateDynamic("columnReorder")(columnReorder.asInstanceOf[js.Any])
    if (columnShow != null) __obj.updateDynamic("columnShow")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* column */ typingsJapgolly.gijgo.Types.GridColumn) => columnShow(t0, t1).runNow()))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* records */ js.Array[Entity]) => dataBinding(t0, t1).runNow()))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* records */ js.Array[Entity], t2: /* totalRecords */ scala.Double) => dataBound(t0, t1, t2).runNow()))
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* records */ js.Array[Entity]) => dataFiltered(t0, t1).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (defaultColumnSettings != null) __obj.updateDynamic("defaultColumnSettings")(defaultColumnSettings.asInstanceOf[js.Any])
    if (destroying != null) __obj.updateDynamic("destroying")(js.Any.fromFunction1((t0: /* e */ js.Any) => destroying(t0).runNow()))
    if (detailCollapse != null) __obj.updateDynamic("detailCollapse")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* detailWrapper */ typingsJapgolly.gijgo.JQuery, t2: /* id */ java.lang.String) => detailCollapse(t0, t1, t2).runNow()))
    if (detailExpand != null) __obj.updateDynamic("detailExpand")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* detailWrapper */ typingsJapgolly.gijgo.JQuery, t2: /* id */ java.lang.String) => detailExpand(t0, t1, t2).runNow()))
    if (detailTemplate != null) __obj.updateDynamic("detailTemplate")(detailTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary.asInstanceOf[js.Any])
    if (initialized != null) __obj.updateDynamic("initialized")(js.Any.fromFunction1((t0: /* e */ js.Any) => initialized(t0).runNow()))
    if (inlineEditing != null) __obj.updateDynamic("inlineEditing")(inlineEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(keepExpandedRows)) __obj.updateDynamic("keepExpandedRows")(keepExpandedRows.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (notFoundText != null) __obj.updateDynamic("notFoundText")(notFoundText.asInstanceOf[js.Any])
    if (optimisticPersistence != null) __obj.updateDynamic("optimisticPersistence")(optimisticPersistence.asInstanceOf[js.Any])
    if (orderNumberField != null) __obj.updateDynamic("orderNumberField")(orderNumberField.asInstanceOf[js.Any])
    if (pageChanging != null) __obj.updateDynamic("pageChanging")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* newPage */ scala.Double) => pageChanging(t0, t1).runNow()))
    if (pageSizeChange != null) __obj.updateDynamic("pageSizeChange")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* newPage */ scala.Double) => pageSizeChange(t0, t1).runNow()))
    if (pager != null) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* newWidth */ scala.Double, t2: /* oldWidth */ scala.Double) => resize(t0, t1, t2).runNow()))
    if (resizeCheckInterval != null) __obj.updateDynamic("resizeCheckInterval")(resizeCheckInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (rowDataBound != null) __obj.updateDynamic("rowDataBound")(js.Any.fromFunction4((t0: /* e */ js.Any, t1: /* $row */ typingsJapgolly.gijgo.JQuery, t2: /* id */ java.lang.String, t3: /* record */ Entity) => rowDataBound(t0, t1, t2, t3).runNow()))
    if (rowDataChanged != null) __obj.updateDynamic("rowDataChanged")(js.Any.fromFunction3((t0: /* e */ js.Any, t1: /* id */ java.lang.String, t2: /* record */ Entity) => rowDataChanged(t0, t1, t2).runNow()))
    if (rowRemoving != null) __obj.updateDynamic("rowRemoving")(js.Any.fromFunction4((t0: /* e */ js.Any, t1: /* $row */ typingsJapgolly.gijgo.JQuery, t2: /* id */ java.lang.String, t3: /* record */ Entity) => rowRemoving(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(rowReorder)) __obj.updateDynamic("rowReorder")(rowReorder.asInstanceOf[js.Any])
    if (rowReorderColumn != null) __obj.updateDynamic("rowReorderColumn")(rowReorderColumn.asInstanceOf[js.Any])
    if (rowSelect != null) __obj.updateDynamic("rowSelect")(js.Any.fromFunction4((t0: /* e */ js.Any, t1: /* $row */ typingsJapgolly.gijgo.JQuery, t2: /* id */ java.lang.String, t3: /* record */ Entity) => rowSelect(t0, t1, t2, t3).runNow()))
    if (rowUnselect != null) __obj.updateDynamic("rowUnselect")(js.Any.fromFunction4((t0: /* e */ js.Any, t1: /* $row */ typingsJapgolly.gijgo.JQuery, t2: /* id */ java.lang.String, t3: /* record */ Entity) => rowUnselect(t0, t1, t2, t3).runNow()))
    if (selectionMethod != null) __obj.updateDynamic("selectionMethod")(selectionMethod.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showHiddenColumnsAsDetails)) __obj.updateDynamic("showHiddenColumnsAsDetails")(showHiddenColumnsAsDetails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toolbarTemplate != null) __obj.updateDynamic("toolbarTemplate")(toolbarTemplate.asInstanceOf[js.Any])
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSettings[Entity]]
  }
}

