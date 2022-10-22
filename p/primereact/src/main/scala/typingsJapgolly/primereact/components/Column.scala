package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.columnColumnMod.ColumnAlignFrozenType
import typingsJapgolly.primereact.columnColumnMod.ColumnAlignType
import typingsJapgolly.primereact.columnColumnMod.ColumnBodyOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnBodyType
import typingsJapgolly.primereact.columnColumnMod.ColumnDataType
import typingsJapgolly.primereact.columnColumnMod.ColumnEditorOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnEditorType
import typingsJapgolly.primereact.columnColumnMod.ColumnEventParams
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterApplyClickParams
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterApplyTemplateOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterApplyType
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterClearTemplateOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterClearType
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterConstraintAddParams
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterConstraintRemoveParams
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterElementTemplateOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterElementType
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterFooterTemplateOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterFooterType
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterHeaderTemplateOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterHeaderType
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterMatchModeChangeParams
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterMatchModeOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterMatchModeType
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterOperatorChangeParams
import typingsJapgolly.primereact.columnColumnMod.ColumnFilterParams
import typingsJapgolly.primereact.columnColumnMod.ColumnFooterOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnFooterType
import typingsJapgolly.primereact.columnColumnMod.ColumnHeaderOptions
import typingsJapgolly.primereact.columnColumnMod.ColumnHeaderType
import typingsJapgolly.primereact.columnColumnMod.ColumnProps
import typingsJapgolly.primereact.columnColumnMod.ColumnSelectionModeType
import typingsJapgolly.primereact.columnColumnMod.ColumnSortParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Column {
  
  @JSImport("primereact", "Column")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.Column] {
    
    inline def align(value: ColumnAlignType): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def alignFrozen(value: ColumnAlignFrozenType): this.type = set("alignFrozen", value.asInstanceOf[js.Any])
    
    inline def alignHeader(value: ColumnAlignType): this.type = set("alignHeader", value.asInstanceOf[js.Any])
    
    inline def alignHeaderNull: this.type = set("alignHeader", null)
    
    inline def alignNull: this.type = set("align", null)
    
    inline def body(value: ColumnBodyType): this.type = set("body", value.asInstanceOf[js.Any])
    
    inline def bodyClassName(value: String): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
    
    inline def bodyFunction2(value: (/* data */ Any, /* options */ ColumnBodyOptions) => Node): this.type = set("body", js.Any.fromFunction2(value))
    
    inline def bodyNull: this.type = set("body", null)
    
    inline def bodyStyle(value: js.Object): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    inline def bodyVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("body", js.Array(value*))
    
    inline def bodyVdomElement(value: VdomElement): this.type = set("body", value.rawElement.asInstanceOf[js.Any])
    
    inline def cellEditValidator(value: /* e */ ColumnEventParams => Boolean): this.type = set("cellEditValidator", js.Any.fromFunction1(value))
    
    inline def cellEditValidatorEvent(value: String): this.type = set("cellEditValidatorEvent", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    inline def columnKey(value: String): this.type = set("columnKey", value.asInstanceOf[js.Any])
    
    inline def dataType(value: ColumnDataType): this.type = set("dataType", value.asInstanceOf[js.Any])
    
    inline def editor(value: ColumnEditorType): this.type = set("editor", value.asInstanceOf[js.Any])
    
    inline def editorFunction1(value: /* options */ ColumnEditorOptions => Node): this.type = set("editor", js.Any.fromFunction1(value))
    
    inline def editorNull: this.type = set("editor", null)
    
    inline def editorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("editor", js.Array(value*))
    
    inline def editorVdomElement(value: VdomElement): this.type = set("editor", value.rawElement.asInstanceOf[js.Any])
    
    inline def excludeGlobalFilter(value: Boolean): this.type = set("excludeGlobalFilter", value.asInstanceOf[js.Any])
    
    inline def expander(value: Boolean): this.type = set("expander", value.asInstanceOf[js.Any])
    
    inline def exportable(value: Boolean): this.type = set("exportable", value.asInstanceOf[js.Any])
    
    inline def field(value: String): this.type = set("field", value.asInstanceOf[js.Any])
    
    inline def filter(value: Boolean): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def filterApply(value: ColumnFilterApplyType): this.type = set("filterApply", value.asInstanceOf[js.Any])
    
    inline def filterApplyFunction1(value: /* options */ ColumnFilterApplyTemplateOptions => Node): this.type = set("filterApply", js.Any.fromFunction1(value))
    
    inline def filterApplyNull: this.type = set("filterApply", null)
    
    inline def filterApplyVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("filterApply", js.Array(value*))
    
    inline def filterApplyVdomElement(value: VdomElement): this.type = set("filterApply", value.rawElement.asInstanceOf[js.Any])
    
    inline def filterClear(value: ColumnFilterClearType): this.type = set("filterClear", value.asInstanceOf[js.Any])
    
    inline def filterClearFunction1(value: /* options */ ColumnFilterClearTemplateOptions => Node): this.type = set("filterClear", js.Any.fromFunction1(value))
    
    inline def filterClearNull: this.type = set("filterClear", null)
    
    inline def filterClearVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("filterClear", js.Array(value*))
    
    inline def filterClearVdomElement(value: VdomElement): this.type = set("filterClear", value.rawElement.asInstanceOf[js.Any])
    
    inline def filterElement(value: ColumnFilterElementType): this.type = set("filterElement", value.asInstanceOf[js.Any])
    
    inline def filterElementFunction1(value: /* options */ ColumnFilterElementTemplateOptions => Node): this.type = set("filterElement", js.Any.fromFunction1(value))
    
    inline def filterElementNull: this.type = set("filterElement", null)
    
    inline def filterElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("filterElement", js.Array(value*))
    
    inline def filterElementVdomElement(value: VdomElement): this.type = set("filterElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def filterField(value: String): this.type = set("filterField", value.asInstanceOf[js.Any])
    
    inline def filterFooter(value: ColumnFilterFooterType): this.type = set("filterFooter", value.asInstanceOf[js.Any])
    
    inline def filterFooterFunction1(value: /* options */ ColumnFilterFooterTemplateOptions => Node): this.type = set("filterFooter", js.Any.fromFunction1(value))
    
    inline def filterFooterNull: this.type = set("filterFooter", null)
    
    inline def filterFooterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("filterFooter", js.Array(value*))
    
    inline def filterFooterVdomElement(value: VdomElement): this.type = set("filterFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def filterFunction(
      value: (/* value */ Any, /* filter */ Any, /* filterLocale */ String, /* params */ ColumnFilterParams) => Callback
    ): this.type = set("filterFunction", js.Any.fromFunction4((t0: /* value */ Any, t1: /* filter */ Any, t2: /* filterLocale */ String, t3: /* params */ ColumnFilterParams) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def filterHeader(value: ColumnFilterHeaderType): this.type = set("filterHeader", value.asInstanceOf[js.Any])
    
    inline def filterHeaderClassName(value: String): this.type = set("filterHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def filterHeaderFunction1(value: /* options */ ColumnFilterHeaderTemplateOptions => Node): this.type = set("filterHeader", js.Any.fromFunction1(value))
    
    inline def filterHeaderNull: this.type = set("filterHeader", null)
    
    inline def filterHeaderStyle(value: js.Object): this.type = set("filterHeaderStyle", value.asInstanceOf[js.Any])
    
    inline def filterHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("filterHeader", js.Array(value*))
    
    inline def filterHeaderVdomElement(value: VdomElement): this.type = set("filterHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def filterMatchMode(value: ColumnFilterMatchModeType): this.type = set("filterMatchMode", value.asInstanceOf[js.Any])
    
    inline def filterMatchModeOptions(value: js.Array[ColumnFilterMatchModeOptions]): this.type = set("filterMatchModeOptions", value.asInstanceOf[js.Any])
    
    inline def filterMatchModeOptionsVarargs(value: ColumnFilterMatchModeOptions*): this.type = set("filterMatchModeOptions", js.Array(value*))
    
    inline def filterMaxLength(value: Double): this.type = set("filterMaxLength", value.asInstanceOf[js.Any])
    
    inline def filterMenuClassName(value: String): this.type = set("filterMenuClassName", value.asInstanceOf[js.Any])
    
    inline def filterMenuStyle(value: js.Object): this.type = set("filterMenuStyle", value.asInstanceOf[js.Any])
    
    inline def filterPlaceholder(value: String): this.type = set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def filterType(value: String): this.type = set("filterType", value.asInstanceOf[js.Any])
    
    inline def footer(value: ColumnFooterType): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerClassName(value: String): this.type = set("footerClassName", value.asInstanceOf[js.Any])
    
    inline def footerFunction1(value: /* options */ ColumnFooterOptions => Node): this.type = set("footer", js.Any.fromFunction1(value))
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerStyle(value: js.Object): this.type = set("footerStyle", value.asInstanceOf[js.Any])
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def frozen(value: Boolean): this.type = set("frozen", value.asInstanceOf[js.Any])
    
    inline def header(value: ColumnHeaderType): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    
    inline def headerFunction1(value: /* options */ ColumnHeaderOptions => Node): this.type = set("header", js.Any.fromFunction1(value))
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerStyle(value: js.Object): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def maxConstraints(value: Double): this.type = set("maxConstraints", value.asInstanceOf[js.Any])
    
    inline def onBeforeCellEditHide(value: /* e */ ColumnEventParams => Callback): this.type = set("onBeforeCellEditHide", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def onBeforeCellEditShow(value: /* e */ ColumnEventParams => Callback): this.type = set("onBeforeCellEditShow", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def onCellEditCancel(value: /* e */ ColumnEventParams => Callback): this.type = set("onCellEditCancel", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def onCellEditComplete(value: /* e */ ColumnEventParams => Callback): this.type = set("onCellEditComplete", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def onCellEditInit(value: /* e */ ColumnEventParams => Callback): this.type = set("onCellEditInit", js.Any.fromFunction1((t0: /* e */ ColumnEventParams) => value(t0).runNow()))
    
    inline def onFilterApplyClick(value: /* e */ ColumnFilterApplyClickParams => Callback): this.type = set("onFilterApplyClick", js.Any.fromFunction1((t0: /* e */ ColumnFilterApplyClickParams) => value(t0).runNow()))
    
    inline def onFilterClear(value: Callback): this.type = set("onFilterClear", value.toJsFn)
    
    inline def onFilterConstraintAdd(value: /* e */ ColumnFilterConstraintAddParams => Callback): this.type = set("onFilterConstraintAdd", js.Any.fromFunction1((t0: /* e */ ColumnFilterConstraintAddParams) => value(t0).runNow()))
    
    inline def onFilterConstraintRemove(value: /* e */ ColumnFilterConstraintRemoveParams => Callback): this.type = set("onFilterConstraintRemove", js.Any.fromFunction1((t0: /* e */ ColumnFilterConstraintRemoveParams) => value(t0).runNow()))
    
    inline def onFilterMatchModeChange(value: /* e */ ColumnFilterMatchModeChangeParams => Callback): this.type = set("onFilterMatchModeChange", js.Any.fromFunction1((t0: /* e */ ColumnFilterMatchModeChangeParams) => value(t0).runNow()))
    
    inline def onFilterOperatorChange(value: /* e */ ColumnFilterOperatorChangeParams => Callback): this.type = set("onFilterOperatorChange", js.Any.fromFunction1((t0: /* e */ ColumnFilterOperatorChangeParams) => value(t0).runNow()))
    
    inline def reorderable(value: Boolean): this.type = set("reorderable", value.asInstanceOf[js.Any])
    
    inline def resizeable(value: Boolean): this.type = set("resizeable", value.asInstanceOf[js.Any])
    
    inline def rowEditor(value: Boolean): this.type = set("rowEditor", value.asInstanceOf[js.Any])
    
    inline def rowReorder(value: Boolean): this.type = set("rowReorder", value.asInstanceOf[js.Any])
    
    inline def rowReorderIcon(value: String): this.type = set("rowReorderIcon", value.asInstanceOf[js.Any])
    
    inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: ColumnSelectionModeType): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def showAddButton(value: Boolean): this.type = set("showAddButton", value.asInstanceOf[js.Any])
    
    inline def showApplyButton(value: Boolean): this.type = set("showApplyButton", value.asInstanceOf[js.Any])
    
    inline def showClearButton(value: Boolean): this.type = set("showClearButton", value.asInstanceOf[js.Any])
    
    inline def showFilterMatchModes(value: Boolean): this.type = set("showFilterMatchModes", value.asInstanceOf[js.Any])
    
    inline def showFilterMenu(value: Boolean): this.type = set("showFilterMenu", value.asInstanceOf[js.Any])
    
    inline def showFilterMenuOptions(value: Boolean): this.type = set("showFilterMenuOptions", value.asInstanceOf[js.Any])
    
    inline def showFilterOperator(value: Boolean): this.type = set("showFilterOperator", value.asInstanceOf[js.Any])
    
    inline def sortField(value: String): this.type = set("sortField", value.asInstanceOf[js.Any])
    
    inline def sortFunction(value: /* e */ ColumnSortParams => Callback): this.type = set("sortFunction", js.Any.fromFunction1((t0: /* e */ ColumnSortParams) => value(t0).runNow()))
    
    inline def sortable(value: Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
    
    inline def sortableDisabled(value: Boolean): this.type = set("sortableDisabled", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Column.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
