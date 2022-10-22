package typingsJapgolly.primereact.columnColumnMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnProps extends StObject {
  
  var align: js.UndefOr[ColumnAlignType] = js.undefined
  
  var alignFrozen: js.UndefOr[ColumnAlignFrozenType] = js.undefined
  
  var alignHeader: js.UndefOr[ColumnAlignType] = js.undefined
  
  var body: js.UndefOr[ColumnBodyType] = js.undefined
  
  var bodyClassName: js.UndefOr[String] = js.undefined
  
  var bodyStyle: js.UndefOr[js.Object] = js.undefined
  
  var cellEditValidator: js.UndefOr[js.Function1[/* e */ ColumnEventParams, Boolean]] = js.undefined
  
  var cellEditValidatorEvent: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var columnKey: js.UndefOr[String] = js.undefined
  
  var dataType: js.UndefOr[ColumnDataType] = js.undefined
  
  var editor: js.UndefOr[ColumnEditorType] = js.undefined
  
  var excludeGlobalFilter: js.UndefOr[Boolean] = js.undefined
  
  var expander: js.UndefOr[Boolean] = js.undefined
  
  var exportable: js.UndefOr[Boolean] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[Boolean] = js.undefined
  
  var filterApply: js.UndefOr[ColumnFilterApplyType] = js.undefined
  
  var filterClear: js.UndefOr[ColumnFilterClearType] = js.undefined
  
  var filterElement: js.UndefOr[ColumnFilterElementType] = js.undefined
  
  var filterField: js.UndefOr[String] = js.undefined
  
  var filterFooter: js.UndefOr[ColumnFilterFooterType] = js.undefined
  
  var filterFunction: js.UndefOr[
    js.Function4[
      /* value */ Any, 
      /* filter */ Any, 
      /* filterLocale */ String, 
      /* params */ ColumnFilterParams, 
      Unit
    ]
  ] = js.undefined
  
  var filterHeader: js.UndefOr[ColumnFilterHeaderType] = js.undefined
  
  var filterHeaderClassName: js.UndefOr[String] = js.undefined
  
  var filterHeaderStyle: js.UndefOr[js.Object] = js.undefined
  
  var filterMatchMode: js.UndefOr[ColumnFilterMatchModeType] = js.undefined
  
  var filterMatchModeOptions: js.UndefOr[js.Array[ColumnFilterMatchModeOptions]] = js.undefined
  
  var filterMaxLength: js.UndefOr[Double] = js.undefined
  
  var filterMenuClassName: js.UndefOr[String] = js.undefined
  
  var filterMenuStyle: js.UndefOr[js.Object] = js.undefined
  
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  
  var filterType: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[ColumnFooterType] = js.undefined
  
  var footerClassName: js.UndefOr[String] = js.undefined
  
  var footerStyle: js.UndefOr[js.Object] = js.undefined
  
  var frozen: js.UndefOr[Boolean] = js.undefined
  
  var header: js.UndefOr[ColumnHeaderType] = js.undefined
  
  var headerClassName: js.UndefOr[String] = js.undefined
  
  var headerStyle: js.UndefOr[js.Object] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var maxConstraints: js.UndefOr[Double] = js.undefined
  
  var onBeforeCellEditHide: js.UndefOr[js.Function1[/* e */ ColumnEventParams, Unit]] = js.undefined
  
  var onBeforeCellEditShow: js.UndefOr[js.Function1[/* e */ ColumnEventParams, Unit]] = js.undefined
  
  var onCellEditCancel: js.UndefOr[js.Function1[/* e */ ColumnEventParams, Unit]] = js.undefined
  
  var onCellEditComplete: js.UndefOr[js.Function1[/* e */ ColumnEventParams, Unit]] = js.undefined
  
  var onCellEditInit: js.UndefOr[js.Function1[/* e */ ColumnEventParams, Unit]] = js.undefined
  
  var onFilterApplyClick: js.UndefOr[js.Function1[/* e */ ColumnFilterApplyClickParams, Unit]] = js.undefined
  
  var onFilterClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onFilterConstraintAdd: js.UndefOr[js.Function1[/* e */ ColumnFilterConstraintAddParams, Unit]] = js.undefined
  
  var onFilterConstraintRemove: js.UndefOr[js.Function1[/* e */ ColumnFilterConstraintRemoveParams, Unit]] = js.undefined
  
  var onFilterMatchModeChange: js.UndefOr[js.Function1[/* e */ ColumnFilterMatchModeChangeParams, Unit]] = js.undefined
  
  var onFilterOperatorChange: js.UndefOr[js.Function1[/* e */ ColumnFilterOperatorChangeParams, Unit]] = js.undefined
  
  var reorderable: js.UndefOr[Boolean] = js.undefined
  
  var resizeable: js.UndefOr[Boolean] = js.undefined
  
  var rowEditor: js.UndefOr[Boolean] = js.undefined
  
  var rowReorder: js.UndefOr[Boolean] = js.undefined
  
  var rowReorderIcon: js.UndefOr[String] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  var selectionMode: js.UndefOr[ColumnSelectionModeType] = js.undefined
  
  var showAddButton: js.UndefOr[Boolean] = js.undefined
  
  var showApplyButton: js.UndefOr[Boolean] = js.undefined
  
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  
  var showFilterMatchModes: js.UndefOr[Boolean] = js.undefined
  
  var showFilterMenu: js.UndefOr[Boolean] = js.undefined
  
  var showFilterMenuOptions: js.UndefOr[Boolean] = js.undefined
  
  var showFilterOperator: js.UndefOr[Boolean] = js.undefined
  
  var sortField: js.UndefOr[String] = js.undefined
  
  var sortFunction: js.UndefOr[js.Function1[/* e */ ColumnSortParams, Unit]] = js.undefined
  
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  var sortableDisabled: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
}
object ColumnProps {
  
  inline def apply(): ColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnProps]
  }
  
  extension [Self <: ColumnProps](x: Self) {
    
    inline def setAlign(value: ColumnAlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignFrozen(value: ColumnAlignFrozenType): Self = StObject.set(x, "alignFrozen", value.asInstanceOf[js.Any])
    
    inline def setAlignFrozenUndefined: Self = StObject.set(x, "alignFrozen", js.undefined)
    
    inline def setAlignHeader(value: ColumnAlignType): Self = StObject.set(x, "alignHeader", value.asInstanceOf[js.Any])
    
    inline def setAlignHeaderNull: Self = StObject.set(x, "alignHeader", null)
    
    inline def setAlignHeaderUndefined: Self = StObject.set(x, "alignHeader", js.undefined)
    
    inline def setAlignNull: Self = StObject.set(x, "align", null)
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBody(value: ColumnBodyType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyClassName(value: String): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
    
    inline def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
    
    inline def setBodyFunction2(value: (/* data */ Any, /* options */ ColumnBodyOptions) => Node): Self = StObject.set(x, "body", js.Any.fromFunction2(value))
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyStyle(value: js.Object): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBodyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setBodyVdomElement(value: VdomElement): Self = StObject.set(x, "body", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCellEditValidator(value: /* e */ ColumnEventParams => Boolean): Self = StObject.set(x, "cellEditValidator", js.Any.fromFunction1(value))
    
    inline def setCellEditValidatorEvent(value: String): Self = StObject.set(x, "cellEditValidatorEvent", value.asInstanceOf[js.Any])
    
    inline def setCellEditValidatorEventUndefined: Self = StObject.set(x, "cellEditValidatorEvent", js.undefined)
    
    inline def setCellEditValidatorUndefined: Self = StObject.set(x, "cellEditValidator", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setDataType(value: ColumnDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setEditor(value: ColumnEditorType): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorFunction1(value: /* options */ ColumnEditorOptions => Node): Self = StObject.set(x, "editor", js.Any.fromFunction1(value))
    
    inline def setEditorNull: Self = StObject.set(x, "editor", null)
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setEditorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "editor", js.Array(value*))
    
    inline def setEditorVdomElement(value: VdomElement): Self = StObject.set(x, "editor", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExcludeGlobalFilter(value: Boolean): Self = StObject.set(x, "excludeGlobalFilter", value.asInstanceOf[js.Any])
    
    inline def setExcludeGlobalFilterUndefined: Self = StObject.set(x, "excludeGlobalFilter", js.undefined)
    
    inline def setExpander(value: Boolean): Self = StObject.set(x, "expander", value.asInstanceOf[js.Any])
    
    inline def setExpanderUndefined: Self = StObject.set(x, "expander", js.undefined)
    
    inline def setExportable(value: Boolean): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterApply(value: ColumnFilterApplyType): Self = StObject.set(x, "filterApply", value.asInstanceOf[js.Any])
    
    inline def setFilterApplyFunction1(value: /* options */ ColumnFilterApplyTemplateOptions => Node): Self = StObject.set(x, "filterApply", js.Any.fromFunction1(value))
    
    inline def setFilterApplyNull: Self = StObject.set(x, "filterApply", null)
    
    inline def setFilterApplyUndefined: Self = StObject.set(x, "filterApply", js.undefined)
    
    inline def setFilterApplyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterApply", js.Array(value*))
    
    inline def setFilterApplyVdomElement(value: VdomElement): Self = StObject.set(x, "filterApply", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterClear(value: ColumnFilterClearType): Self = StObject.set(x, "filterClear", value.asInstanceOf[js.Any])
    
    inline def setFilterClearFunction1(value: /* options */ ColumnFilterClearTemplateOptions => Node): Self = StObject.set(x, "filterClear", js.Any.fromFunction1(value))
    
    inline def setFilterClearNull: Self = StObject.set(x, "filterClear", null)
    
    inline def setFilterClearUndefined: Self = StObject.set(x, "filterClear", js.undefined)
    
    inline def setFilterClearVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterClear", js.Array(value*))
    
    inline def setFilterClearVdomElement(value: VdomElement): Self = StObject.set(x, "filterClear", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterElement(value: ColumnFilterElementType): Self = StObject.set(x, "filterElement", value.asInstanceOf[js.Any])
    
    inline def setFilterElementFunction1(value: /* options */ ColumnFilterElementTemplateOptions => Node): Self = StObject.set(x, "filterElement", js.Any.fromFunction1(value))
    
    inline def setFilterElementNull: Self = StObject.set(x, "filterElement", null)
    
    inline def setFilterElementUndefined: Self = StObject.set(x, "filterElement", js.undefined)
    
    inline def setFilterElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterElement", js.Array(value*))
    
    inline def setFilterElementVdomElement(value: VdomElement): Self = StObject.set(x, "filterElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterField(value: String): Self = StObject.set(x, "filterField", value.asInstanceOf[js.Any])
    
    inline def setFilterFieldUndefined: Self = StObject.set(x, "filterField", js.undefined)
    
    inline def setFilterFooter(value: ColumnFilterFooterType): Self = StObject.set(x, "filterFooter", value.asInstanceOf[js.Any])
    
    inline def setFilterFooterFunction1(value: /* options */ ColumnFilterFooterTemplateOptions => Node): Self = StObject.set(x, "filterFooter", js.Any.fromFunction1(value))
    
    inline def setFilterFooterNull: Self = StObject.set(x, "filterFooter", null)
    
    inline def setFilterFooterUndefined: Self = StObject.set(x, "filterFooter", js.undefined)
    
    inline def setFilterFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterFooter", js.Array(value*))
    
    inline def setFilterFooterVdomElement(value: VdomElement): Self = StObject.set(x, "filterFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterFunction(
      value: (/* value */ Any, /* filter */ Any, /* filterLocale */ String, /* params */ ColumnFilterParams) => Callback
    ): Self = StObject.set(x, "filterFunction", js.Any.fromFunction4((t0: /* value */ Any, t1: /* filter */ Any, t2: /* filterLocale */ String, t3: /* params */ ColumnFilterParams) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setFilterFunctionUndefined: Self = StObject.set(x, "filterFunction", js.undefined)
    
    inline def setFilterHeader(value: ColumnFilterHeaderType): Self = StObject.set(x, "filterHeader", value.asInstanceOf[js.Any])
    
    inline def setFilterHeaderClassName(value: String): Self = StObject.set(x, "filterHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def setFilterHeaderClassNameUndefined: Self = StObject.set(x, "filterHeaderClassName", js.undefined)
    
    inline def setFilterHeaderFunction1(value: /* options */ ColumnFilterHeaderTemplateOptions => Node): Self = StObject.set(x, "filterHeader", js.Any.fromFunction1(value))
    
    inline def setFilterHeaderNull: Self = StObject.set(x, "filterHeader", null)
    
    inline def setFilterHeaderStyle(value: js.Object): Self = StObject.set(x, "filterHeaderStyle", value.asInstanceOf[js.Any])
    
    inline def setFilterHeaderStyleUndefined: Self = StObject.set(x, "filterHeaderStyle", js.undefined)
    
    inline def setFilterHeaderUndefined: Self = StObject.set(x, "filterHeader", js.undefined)
    
    inline def setFilterHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "filterHeader", js.Array(value*))
    
    inline def setFilterHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "filterHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterMatchMode(value: ColumnFilterMatchModeType): Self = StObject.set(x, "filterMatchMode", value.asInstanceOf[js.Any])
    
    inline def setFilterMatchModeOptions(value: js.Array[ColumnFilterMatchModeOptions]): Self = StObject.set(x, "filterMatchModeOptions", value.asInstanceOf[js.Any])
    
    inline def setFilterMatchModeOptionsUndefined: Self = StObject.set(x, "filterMatchModeOptions", js.undefined)
    
    inline def setFilterMatchModeOptionsVarargs(value: ColumnFilterMatchModeOptions*): Self = StObject.set(x, "filterMatchModeOptions", js.Array(value*))
    
    inline def setFilterMatchModeUndefined: Self = StObject.set(x, "filterMatchMode", js.undefined)
    
    inline def setFilterMaxLength(value: Double): Self = StObject.set(x, "filterMaxLength", value.asInstanceOf[js.Any])
    
    inline def setFilterMaxLengthUndefined: Self = StObject.set(x, "filterMaxLength", js.undefined)
    
    inline def setFilterMenuClassName(value: String): Self = StObject.set(x, "filterMenuClassName", value.asInstanceOf[js.Any])
    
    inline def setFilterMenuClassNameUndefined: Self = StObject.set(x, "filterMenuClassName", js.undefined)
    
    inline def setFilterMenuStyle(value: js.Object): Self = StObject.set(x, "filterMenuStyle", value.asInstanceOf[js.Any])
    
    inline def setFilterMenuStyleUndefined: Self = StObject.set(x, "filterMenuStyle", js.undefined)
    
    inline def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
    
    inline def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFooter(value: ColumnFooterType): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterClassName(value: String): Self = StObject.set(x, "footerClassName", value.asInstanceOf[js.Any])
    
    inline def setFooterClassNameUndefined: Self = StObject.set(x, "footerClassName", js.undefined)
    
    inline def setFooterFunction1(value: /* options */ ColumnFooterOptions => Node): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFooterStyle(value: js.Object): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
    
    inline def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
    
    inline def setHeader(value: ColumnHeaderType): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    inline def setHeaderFunction1(value: /* options */ ColumnHeaderOptions => Node): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderStyle(value: js.Object): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setMaxConstraints(value: Double): Self = StObject.set(x, "maxConstraints", value.asInstanceOf[js.Any])
    
    inline def setMaxConstraintsUndefined: Self = StObject.set(x, "maxConstraints", js.undefined)
    
    inline def setOnBeforeCellEditHide(value: /* e */ ColumnEventParams => Callback): Self = StObject.set(x, "onBeforeCellEditHide", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def setOnBeforeCellEditHideUndefined: Self = StObject.set(x, "onBeforeCellEditHide", js.undefined)
    
    inline def setOnBeforeCellEditShow(value: /* e */ ColumnEventParams => Callback): Self = StObject.set(x, "onBeforeCellEditShow", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def setOnBeforeCellEditShowUndefined: Self = StObject.set(x, "onBeforeCellEditShow", js.undefined)
    
    inline def setOnCellEditCancel(value: /* e */ ColumnEventParams => Callback): Self = StObject.set(x, "onCellEditCancel", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def setOnCellEditCancelUndefined: Self = StObject.set(x, "onCellEditCancel", js.undefined)
    
    inline def setOnCellEditComplete(value: /* e */ ColumnEventParams => Callback): Self = StObject.set(x, "onCellEditComplete", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def setOnCellEditCompleteUndefined: Self = StObject.set(x, "onCellEditComplete", js.undefined)
    
    inline def setOnCellEditInit(value: /* e */ ColumnEventParams => Callback): Self = StObject.set(x, "onCellEditInit", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def setOnCellEditInitUndefined: Self = StObject.set(x, "onCellEditInit", js.undefined)
    
    inline def setOnFilterApplyClick(value: /* e */ ColumnFilterApplyClickParams => Callback): Self = StObject.set(x, "onFilterApplyClick", js.Any.fromFunction1((t0: /* e */ ColumnFilterApplyClickParams) => value(t0).runNow()))
    
    inline def setOnFilterApplyClickUndefined: Self = StObject.set(x, "onFilterApplyClick", js.undefined)
    
    inline def setOnFilterClear(value: Callback): Self = StObject.set(x, "onFilterClear", value.toJsFn)
    
    inline def setOnFilterClearUndefined: Self = StObject.set(x, "onFilterClear", js.undefined)
    
    inline def setOnFilterConstraintAdd(value: /* e */ ColumnFilterConstraintAddParams => Callback): Self = StObject.set(x, "onFilterConstraintAdd", js.Any.fromFunction1((t0: /* e */ ColumnFilterConstraintAddParams) => value(t0).runNow()))
    
    inline def setOnFilterConstraintAddUndefined: Self = StObject.set(x, "onFilterConstraintAdd", js.undefined)
    
    inline def setOnFilterConstraintRemove(value: /* e */ ColumnFilterConstraintRemoveParams => Callback): Self = StObject.set(x, "onFilterConstraintRemove", js.Any.fromFunction1((t0: /* e */ ColumnFilterConstraintRemoveParams) => value(t0).runNow()))
    
    inline def setOnFilterConstraintRemoveUndefined: Self = StObject.set(x, "onFilterConstraintRemove", js.undefined)
    
    inline def setOnFilterMatchModeChange(value: /* e */ ColumnFilterMatchModeChangeParams => Callback): Self = StObject.set(x, "onFilterMatchModeChange", js.Any.fromFunction1((t0: /* e */ ColumnFilterMatchModeChangeParams) => value(t0).runNow()))
    
    inline def setOnFilterMatchModeChangeUndefined: Self = StObject.set(x, "onFilterMatchModeChange", js.undefined)
    
    inline def setOnFilterOperatorChange(value: /* e */ ColumnFilterOperatorChangeParams => Callback): Self = StObject.set(x, "onFilterOperatorChange", js.Any.fromFunction1((t0: /* e */ ColumnFilterOperatorChangeParams) => value(t0).runNow()))
    
    inline def setOnFilterOperatorChangeUndefined: Self = StObject.set(x, "onFilterOperatorChange", js.undefined)
    
    inline def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    inline def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
    
    inline def setResizeable(value: Boolean): Self = StObject.set(x, "resizeable", value.asInstanceOf[js.Any])
    
    inline def setResizeableUndefined: Self = StObject.set(x, "resizeable", js.undefined)
    
    inline def setRowEditor(value: Boolean): Self = StObject.set(x, "rowEditor", value.asInstanceOf[js.Any])
    
    inline def setRowEditorUndefined: Self = StObject.set(x, "rowEditor", js.undefined)
    
    inline def setRowReorder(value: Boolean): Self = StObject.set(x, "rowReorder", value.asInstanceOf[js.Any])
    
    inline def setRowReorderIcon(value: String): Self = StObject.set(x, "rowReorderIcon", value.asInstanceOf[js.Any])
    
    inline def setRowReorderIconUndefined: Self = StObject.set(x, "rowReorderIcon", js.undefined)
    
    inline def setRowReorderUndefined: Self = StObject.set(x, "rowReorder", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setSelectionMode(value: ColumnSelectionModeType): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setShowAddButton(value: Boolean): Self = StObject.set(x, "showAddButton", value.asInstanceOf[js.Any])
    
    inline def setShowAddButtonUndefined: Self = StObject.set(x, "showAddButton", js.undefined)
    
    inline def setShowApplyButton(value: Boolean): Self = StObject.set(x, "showApplyButton", value.asInstanceOf[js.Any])
    
    inline def setShowApplyButtonUndefined: Self = StObject.set(x, "showApplyButton", js.undefined)
    
    inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
    
    inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
    
    inline def setShowFilterMatchModes(value: Boolean): Self = StObject.set(x, "showFilterMatchModes", value.asInstanceOf[js.Any])
    
    inline def setShowFilterMatchModesUndefined: Self = StObject.set(x, "showFilterMatchModes", js.undefined)
    
    inline def setShowFilterMenu(value: Boolean): Self = StObject.set(x, "showFilterMenu", value.asInstanceOf[js.Any])
    
    inline def setShowFilterMenuOptions(value: Boolean): Self = StObject.set(x, "showFilterMenuOptions", value.asInstanceOf[js.Any])
    
    inline def setShowFilterMenuOptionsUndefined: Self = StObject.set(x, "showFilterMenuOptions", js.undefined)
    
    inline def setShowFilterMenuUndefined: Self = StObject.set(x, "showFilterMenu", js.undefined)
    
    inline def setShowFilterOperator(value: Boolean): Self = StObject.set(x, "showFilterOperator", value.asInstanceOf[js.Any])
    
    inline def setShowFilterOperatorUndefined: Self = StObject.set(x, "showFilterOperator", js.undefined)
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortFunction(value: /* e */ ColumnSortParams => Callback): Self = StObject.set(x, "sortFunction", js.Any.fromFunction1((t0: /* e */ ColumnSortParams) => value(t0).runNow()))
    
    inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableDisabled(value: Boolean): Self = StObject.set(x, "sortableDisabled", value.asInstanceOf[js.Any])
    
    inline def setSortableDisabledUndefined: Self = StObject.set(x, "sortableDisabled", js.undefined)
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
