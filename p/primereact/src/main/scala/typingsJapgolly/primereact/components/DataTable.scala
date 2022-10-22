package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.datatableDatatableMod.DataTableAppendToType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableCellClassNameOptions
import typingsJapgolly.primereact.datatableDatatableMod.DataTableCellClickEventParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableColReorderParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableColumnResizeEndParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableColumnResizeModeType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableColumnResizerClickParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableCompareSelectionByType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableDataSelectableParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableEditingRows
import typingsJapgolly.primereact.datatableDatatableMod.DataTableEmptyMessageType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableExpandedRows
import typingsJapgolly.primereact.datatableDatatableMod.DataTableExportFunctionParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableFilterDisplayType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableFilterMeta
import typingsJapgolly.primereact.datatableDatatableMod.DataTableFooterTemplateOptions
import typingsJapgolly.primereact.datatableDatatableMod.DataTableFooterTemplateType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableGlobalFilterType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableHeaderTemplateOptions
import typingsJapgolly.primereact.datatableDatatableMod.DataTableHeaderTemplateType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableMultiSortMetaType
import typingsJapgolly.primereact.datatableDatatableMod.DataTablePFSEvent
import typingsJapgolly.primereact.datatableDatatableMod.DataTablePaginatorPositionType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableProps
import typingsJapgolly.primereact.datatableDatatableMod.DataTableResponsiveLayoutType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowClassNameOptions
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowClickEventParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowEditCompleteParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowEditParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowEditSaveParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowEditValidatorOptions
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowEventParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowExpansionTemplate
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowGroupFooterTemplateOptions
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowGroupFooterTemplateType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowGroupHeaderTemplateOptions
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowGroupHeaderTemplateType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowReorderParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableRowToggleParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableScrollDirectionType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableSelectAllChangeParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableSelectParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableSelectionChangeParams
import typingsJapgolly.primereact.datatableDatatableMod.DataTableSelectionModeType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableShowRowReorderElementOptions
import typingsJapgolly.primereact.datatableDatatableMod.DataTableShowSelectionElementOptions
import typingsJapgolly.primereact.datatableDatatableMod.DataTableSizeType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableSortMeta
import typingsJapgolly.primereact.datatableDatatableMod.DataTableSortModeType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableSortOrderType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableStateStorageType
import typingsJapgolly.primereact.datatableDatatableMod.DataTableUnselectParams
import typingsJapgolly.primereact.primereactStrings.`additions removals`
import typingsJapgolly.primereact.primereactStrings.`additions text`
import typingsJapgolly.primereact.primereactStrings.`inline`
import typingsJapgolly.primereact.primereactStrings.`removals additions`
import typingsJapgolly.primereact.primereactStrings.`removals text`
import typingsJapgolly.primereact.primereactStrings.`text additions`
import typingsJapgolly.primereact.primereactStrings.`text removals`
import typingsJapgolly.primereact.primereactStrings.additions
import typingsJapgolly.primereact.primereactStrings.all
import typingsJapgolly.primereact.primereactStrings.ascending
import typingsJapgolly.primereact.primereactStrings.assertive
import typingsJapgolly.primereact.primereactStrings.both
import typingsJapgolly.primereact.primereactStrings.copy
import typingsJapgolly.primereact.primereactStrings.date
import typingsJapgolly.primereact.primereactStrings.decimal
import typingsJapgolly.primereact.primereactStrings.descending
import typingsJapgolly.primereact.primereactStrings.dialog
import typingsJapgolly.primereact.primereactStrings.done
import typingsJapgolly.primereact.primereactStrings.email
import typingsJapgolly.primereact.primereactStrings.enter
import typingsJapgolly.primereact.primereactStrings.environment
import typingsJapgolly.primereact.primereactStrings.execute
import typingsJapgolly.primereact.primereactStrings.go
import typingsJapgolly.primereact.primereactStrings.grammar
import typingsJapgolly.primereact.primereactStrings.grid
import typingsJapgolly.primereact.primereactStrings.horizontal
import typingsJapgolly.primereact.primereactStrings.inherit
import typingsJapgolly.primereact.primereactStrings.link
import typingsJapgolly.primereact.primereactStrings.list
import typingsJapgolly.primereact.primereactStrings.listbox
import typingsJapgolly.primereact.primereactStrings.location
import typingsJapgolly.primereact.primereactStrings.menu
import typingsJapgolly.primereact.primereactStrings.mixed
import typingsJapgolly.primereact.primereactStrings.move
import typingsJapgolly.primereact.primereactStrings.next
import typingsJapgolly.primereact.primereactStrings.no
import typingsJapgolly.primereact.primereactStrings.none
import typingsJapgolly.primereact.primereactStrings.numeric
import typingsJapgolly.primereact.primereactStrings.off
import typingsJapgolly.primereact.primereactStrings.on
import typingsJapgolly.primereact.primereactStrings.other
import typingsJapgolly.primereact.primereactStrings.page
import typingsJapgolly.primereact.primereactStrings.polite
import typingsJapgolly.primereact.primereactStrings.popup
import typingsJapgolly.primereact.primereactStrings.previous
import typingsJapgolly.primereact.primereactStrings.removals
import typingsJapgolly.primereact.primereactStrings.search
import typingsJapgolly.primereact.primereactStrings.send
import typingsJapgolly.primereact.primereactStrings.spelling
import typingsJapgolly.primereact.primereactStrings.step
import typingsJapgolly.primereact.primereactStrings.tel
import typingsJapgolly.primereact.primereactStrings.text
import typingsJapgolly.primereact.primereactStrings.time
import typingsJapgolly.primereact.primereactStrings.tree
import typingsJapgolly.primereact.primereactStrings.url
import typingsJapgolly.primereact.primereactStrings.user
import typingsJapgolly.primereact.primereactStrings.vertical
import typingsJapgolly.primereact.primereactStrings.yes
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerProps
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.HTMLInputTypeAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTable {
  
  @JSImport("primereact", "DataTable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.DataTable] {
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def alwaysShowPaginator(value: Boolean): this.type = set("alwaysShowPaginator", value.asInstanceOf[js.Any])
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoLayout(value: Boolean): this.type = set("autoLayout", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def breakpoint(value: String): this.type = set("breakpoint", value.asInstanceOf[js.Any])
    
    inline def capture(value: Boolean | user | environment): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def cellClassName(value: (/* value */ Any, /* options */ DataTableCellClassNameOptions) => js.Object | String): this.type = set("cellClassName", js.Any.fromFunction2(value))
    
    inline def cellSelection(value: Boolean): this.type = set("cellSelection", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapsedRowIcon(value: String): this.type = set("collapsedRowIcon", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def columnResizeMode(value: DataTableColumnResizeModeType): this.type = set("columnResizeMode", value.asInstanceOf[js.Any])
    
    inline def compareSelectionBy(value: DataTableCompareSelectionByType): this.type = set("compareSelectionBy", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def contextMenuSelection(value: js.Object): this.type = set("contextMenuSelection", value.asInstanceOf[js.Any])
    
    inline def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def csvSeparator(value: String): this.type = set("csvSeparator", value.asInstanceOf[js.Any])
    
    inline def currentPageReportTemplate(value: String): this.type = set("currentPageReportTemplate", value.asInstanceOf[js.Any])
    
    inline def customRestoreState(value: CallbackTo[js.Object]): this.type = set("customRestoreState", value.toJsFn)
    
    inline def customSaveState(value: /* state */ js.Object => Callback): this.type = set("customSaveState", js.Any.fromFunction1((t0: /* state */ js.Object) => value(t0).runNow()))
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def dataKey(value: String): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultSortOrder(value: DataTableSortOrderType): this.type = set("defaultSortOrder", value.asInstanceOf[js.Any])
    
    inline def defaultSortOrderNull: this.type = set("defaultSortOrder", null)
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dragSelection(value: Boolean): this.type = set("dragSelection", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def editMode(value: String): this.type = set("editMode", value.asInstanceOf[js.Any])
    
    inline def editingRows(value: js.Array[Any] | DataTableEditingRows): this.type = set("editingRows", value.asInstanceOf[js.Any])
    
    inline def editingRowsVarargs(value: Any*): this.type = set("editingRows", js.Array(value*))
    
    inline def emptyMessage(value: DataTableEmptyMessageType): this.type = set("emptyMessage", value.asInstanceOf[js.Any])
    
    inline def emptyMessageFunction1(value: /* frozen */ Boolean => Node): this.type = set("emptyMessage", js.Any.fromFunction1(value))
    
    inline def emptyMessageNull: this.type = set("emptyMessage", null)
    
    inline def emptyMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyMessage", js.Array(value*))
    
    inline def emptyMessageVdomElement(value: VdomElement): this.type = set("emptyMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def enterKeyHint(value: enter | done | go | next | previous | search | send): this.type = set("enterKeyHint", value.asInstanceOf[js.Any])
    
    inline def expandableRowGroups(value: Boolean): this.type = set("expandableRowGroups", value.asInstanceOf[js.Any])
    
    inline def expandedRowIcon(value: String): this.type = set("expandedRowIcon", value.asInstanceOf[js.Any])
    
    inline def expandedRows(value: js.Array[Any] | DataTableExpandedRows): this.type = set("expandedRows", value.asInstanceOf[js.Any])
    
    inline def expandedRowsVarargs(value: Any*): this.type = set("expandedRows", js.Array(value*))
    
    inline def exportFilename(value: String): this.type = set("exportFilename", value.asInstanceOf[js.Any])
    
    inline def exportFunction(value: /* e */ DataTableExportFunctionParams => Any): this.type = set("exportFunction", js.Any.fromFunction1(value))
    
    inline def filterDelay(value: Double): this.type = set("filterDelay", value.asInstanceOf[js.Any])
    
    inline def filterDisplay(value: DataTableFilterDisplayType): this.type = set("filterDisplay", value.asInstanceOf[js.Any])
    
    inline def filterLocale(value: String): this.type = set("filterLocale", value.asInstanceOf[js.Any])
    
    inline def filters(value: DataTableFilterMeta): this.type = set("filters", value.asInstanceOf[js.Any])
    
    inline def first(value: Double): this.type = set("first", value.asInstanceOf[js.Any])
    
    inline def footer(value: DataTableFooterTemplateType): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerColumnGroup(value: VdomNode): this.type = set("footerColumnGroup", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerColumnGroupNull: this.type = set("footerColumnGroup", null)
    
    inline def footerColumnGroupVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footerColumnGroup", js.Array(value*))
    
    inline def footerColumnGroupVdomElement(value: VdomElement): this.type = set("footerColumnGroup", value.rawElement.asInstanceOf[js.Any])
    
    inline def footerFunction1(value: /* options */ DataTableFooterTemplateOptions => Node): this.type = set("footer", js.Any.fromFunction1(value))
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    
    inline def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
    
    inline def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    
    inline def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    
    inline def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    
    inline def frozenValue(value: js.Array[Any]): this.type = set("frozenValue", value.asInstanceOf[js.Any])
    
    inline def frozenValueVarargs(value: Any*): this.type = set("frozenValue", js.Array(value*))
    
    inline def frozenWidth(value: String): this.type = set("frozenWidth", value.asInstanceOf[js.Any])
    
    inline def globalFilter(value: DataTableGlobalFilterType): this.type = set("globalFilter", value.asInstanceOf[js.Any])
    
    inline def globalFilterFields(value: js.Array[String]): this.type = set("globalFilterFields", value.asInstanceOf[js.Any])
    
    inline def globalFilterFieldsVarargs(value: String*): this.type = set("globalFilterFields", js.Array(value*))
    
    inline def globalFilterNull: this.type = set("globalFilter", null)
    
    inline def groupRowsBy(value: String): this.type = set("groupRowsBy", value.asInstanceOf[js.Any])
    
    inline def header(value: DataTableHeaderTemplateType): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerColumnGroup(value: VdomNode): this.type = set("headerColumnGroup", value.rawNode.asInstanceOf[js.Any])
    
    inline def headerColumnGroupNull: this.type = set("headerColumnGroup", null)
    
    inline def headerColumnGroupVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("headerColumnGroup", js.Array(value*))
    
    inline def headerColumnGroupVdomElement(value: VdomElement): this.type = set("headerColumnGroup", value.rawElement.asInstanceOf[js.Any])
    
    inline def headerFunction1(value: /* options */ DataTableHeaderTemplateOptions => Node): this.type = set("header", js.Any.fromFunction1(value))
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def isDataSelectable(value: /* e */ DataTableDataSelectableParams => js.UndefOr[Boolean | Null]): this.type = set("isDataSelectable", js.Any.fromFunction1(value))
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    inline def list(value: String): this.type = set("list", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingIcon(value: String): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
    
    inline def max(value: Double | String): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def metaKeySelection(value: Boolean): this.type = set("metaKeySelection", value.asInstanceOf[js.Any])
    
    inline def min(value: Double | String): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    inline def multiSortMeta(value: DataTableMultiSortMetaType): this.type = set("multiSortMeta", value.asInstanceOf[js.Any])
    
    inline def multiSortMetaNull: this.type = set("multiSortMeta", null)
    
    inline def multiSortMetaVarargs(value: DataTableSortMeta*): this.type = set("multiSortMeta", js.Array(value*))
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAllRowsSelect(value: /* e */ DataTableSelectParams => Callback): this.type = set("onAllRowsSelect", js.Any.fromFunction1((t0: /* e */ DataTableSelectParams) => value(t0).runNow()))
    
    inline def onAllRowsUnselect(value: /* e */ DataTableUnselectParams => Callback): this.type = set("onAllRowsUnselect", js.Any.fromFunction1((t0: /* e */ DataTableUnselectParams) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAuxClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onBeforeInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCellClick(value: /* e */ DataTableCellClickEventParams => Callback): this.type = set("onCellClick", js.Any.fromFunction1((t0: /* e */ DataTableCellClickEventParams) => value(t0).runNow()))
    
    inline def onCellSelect(value: /* e */ DataTableSelectParams => Callback): this.type = set("onCellSelect", js.Any.fromFunction1((t0: /* e */ DataTableSelectParams) => value(t0).runNow()))
    
    inline def onCellUnselect(value: /* e */ DataTableUnselectParams => Callback): this.type = set("onCellUnselect", js.Any.fromFunction1((t0: /* e */ DataTableUnselectParams) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onColReorder(value: /* e */ DataTableColReorderParams => Callback): this.type = set("onColReorder", js.Any.fromFunction1((t0: /* e */ DataTableColReorderParams) => value(t0).runNow()))
    
    inline def onColumnResizeEnd(value: /* e */ DataTableColumnResizeEndParams => Callback): this.type = set("onColumnResizeEnd", js.Any.fromFunction1((t0: /* e */ DataTableColumnResizeEndParams) => value(t0).runNow()))
    
    inline def onColumnResizerClick(value: /* e */ DataTableColumnResizerClickParams => Callback): this.type = set("onColumnResizerClick", js.Any.fromFunction1((t0: /* e */ DataTableColumnResizerClickParams) => value(t0).runNow()))
    
    inline def onColumnResizerDoubleClick(value: /* e */ DataTableColumnResizerClickParams => Callback): this.type = set("onColumnResizerDoubleClick", js.Any.fromFunction1((t0: /* e */ DataTableColumnResizerClickParams) => value(t0).runNow()))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: /* e */ DataTableRowEventParams => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: /* e */ DataTableRowEventParams) => value(t0).runNow()))
    
    inline def onContextMenuSelectionChange(value: /* e */ DataTableSelectionChangeParams => Callback): this.type = set("onContextMenuSelectionChange", js.Any.fromFunction1((t0: /* e */ DataTableSelectionChangeParams) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onError(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onFilter(value: /* e */ DataTablePFSEvent => Callback): this.type = set("onFilter", js.Any.fromFunction1((t0: /* e */ DataTablePFSEvent) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onInvalid(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPage(value: /* e */ DataTablePFSEvent => Callback): this.type = set("onPage", js.Any.fromFunction1((t0: /* e */ DataTablePFSEvent) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerOut(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerOver(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onProgress(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onReset(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onRowClick(value: /* e */ DataTableRowClickEventParams => Callback): this.type = set("onRowClick", js.Any.fromFunction1((t0: /* e */ DataTableRowClickEventParams) => value(t0).runNow()))
    
    inline def onRowCollapse(value: /* e */ DataTableRowEventParams => Callback): this.type = set("onRowCollapse", js.Any.fromFunction1((t0: /* e */ DataTableRowEventParams) => value(t0).runNow()))
    
    inline def onRowDoubleClick(value: /* e */ DataTableRowClickEventParams => Callback): this.type = set("onRowDoubleClick", js.Any.fromFunction1((t0: /* e */ DataTableRowClickEventParams) => value(t0).runNow()))
    
    inline def onRowEditCancel(value: /* e */ DataTableRowEditParams => Callback): this.type = set("onRowEditCancel", js.Any.fromFunction1((t0: /* e */ DataTableRowEditParams) => value(t0).runNow()))
    
    inline def onRowEditChange(value: /* e */ DataTableRowEditParams => Callback): this.type = set("onRowEditChange", js.Any.fromFunction1((t0: /* e */ DataTableRowEditParams) => value(t0).runNow()))
    
    inline def onRowEditComplete(value: /* e */ DataTableRowEditCompleteParams => Callback): this.type = set("onRowEditComplete", js.Any.fromFunction1((t0: /* e */ DataTableRowEditCompleteParams) => value(t0).runNow()))
    
    inline def onRowEditInit(value: /* e */ DataTableRowEditParams => Callback): this.type = set("onRowEditInit", js.Any.fromFunction1((t0: /* e */ DataTableRowEditParams) => value(t0).runNow()))
    
    inline def onRowEditSave(value: /* e */ DataTableRowEditSaveParams => Callback): this.type = set("onRowEditSave", js.Any.fromFunction1((t0: /* e */ DataTableRowEditSaveParams) => value(t0).runNow()))
    
    inline def onRowExpand(value: /* e */ DataTableRowEventParams => Callback): this.type = set("onRowExpand", js.Any.fromFunction1((t0: /* e */ DataTableRowEventParams) => value(t0).runNow()))
    
    inline def onRowReorder(value: /* e */ DataTableRowReorderParams => Callback): this.type = set("onRowReorder", js.Any.fromFunction1((t0: /* e */ DataTableRowReorderParams) => value(t0).runNow()))
    
    inline def onRowSelect(value: /* e */ DataTableSelectParams => Callback): this.type = set("onRowSelect", js.Any.fromFunction1((t0: /* e */ DataTableSelectParams) => value(t0).runNow()))
    
    inline def onRowToggle(value: /* e */ DataTableRowToggleParams => Callback): this.type = set("onRowToggle", js.Any.fromFunction1((t0: /* e */ DataTableRowToggleParams) => value(t0).runNow()))
    
    inline def onRowUnselect(value: /* e */ DataTableUnselectParams => Callback): this.type = set("onRowUnselect", js.Any.fromFunction1((t0: /* e */ DataTableUnselectParams) => value(t0).runNow()))
    
    inline def onScroll(value: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSelect(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSelectAllChange(value: /* e */ DataTableSelectAllChangeParams => Callback): this.type = set("onSelectAllChange", js.Any.fromFunction1((t0: /* e */ DataTableSelectAllChangeParams) => value(t0).runNow()))
    
    inline def onSelectionChange(value: /* e */ DataTableSelectionChangeParams => Callback): this.type = set("onSelectionChange", js.Any.fromFunction1((t0: /* e */ DataTableSelectionChangeParams) => value(t0).runNow()))
    
    inline def onSort(value: /* e */ DataTablePFSEvent => Callback): this.type = set("onSort", js.Any.fromFunction1((t0: /* e */ DataTablePFSEvent) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onStateRestore(value: /* state */ js.Object => Callback): this.type = set("onStateRestore", js.Any.fromFunction1((t0: /* state */ js.Object) => value(t0).runNow()))
    
    inline def onStateSave(value: /* state */ js.Object => Callback): this.type = set("onStateSave", js.Any.fromFunction1((t0: /* state */ js.Object) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onValueChange(value: /* value */ js.Array[Any] => Callback): this.type = set("onValueChange", js.Any.fromFunction1((t0: /* value */ js.Array[Any]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def pageLinkSize(value: Double): this.type = set("pageLinkSize", value.asInstanceOf[js.Any])
    
    inline def paginator(value: Boolean): this.type = set("paginator", value.asInstanceOf[js.Any])
    
    inline def paginatorClassName(value: String): this.type = set("paginatorClassName", value.asInstanceOf[js.Any])
    
    inline def paginatorDropdownAppendTo(value: DataTableAppendToType): this.type = set("paginatorDropdownAppendTo", value.asInstanceOf[js.Any])
    
    inline def paginatorDropdownAppendToNull: this.type = set("paginatorDropdownAppendTo", null)
    
    inline def paginatorLeft(value: VdomNode): this.type = set("paginatorLeft", value.rawNode.asInstanceOf[js.Any])
    
    inline def paginatorLeftNull: this.type = set("paginatorLeft", null)
    
    inline def paginatorLeftVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("paginatorLeft", js.Array(value*))
    
    inline def paginatorLeftVdomElement(value: VdomElement): this.type = set("paginatorLeft", value.rawElement.asInstanceOf[js.Any])
    
    inline def paginatorPosition(value: DataTablePaginatorPositionType): this.type = set("paginatorPosition", value.asInstanceOf[js.Any])
    
    inline def paginatorRight(value: VdomNode): this.type = set("paginatorRight", value.rawNode.asInstanceOf[js.Any])
    
    inline def paginatorRightNull: this.type = set("paginatorRight", null)
    
    inline def paginatorRightVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("paginatorRight", js.Array(value*))
    
    inline def paginatorRightVdomElement(value: VdomElement): this.type = set("paginatorRight", value.rawElement.asInstanceOf[js.Any])
    
    inline def paginatorTemplate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaginatorTemplate */ Any
    ): this.type = set("paginatorTemplate", value.asInstanceOf[js.Any])
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def removableSort(value: Boolean): this.type = set("removableSort", value.asInstanceOf[js.Any])
    
    inline def reorderableColumns(value: Boolean): this.type = set("reorderableColumns", value.asInstanceOf[js.Any])
    
    inline def reorderableRows(value: Boolean): this.type = set("reorderableRows", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def resizableColumns(value: Boolean): this.type = set("resizableColumns", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def responsiveLayout(value: DataTableResponsiveLayoutType): this.type = set("responsiveLayout", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rowClassName(value: (/* data */ Any, /* options */ DataTableRowClassNameOptions) => js.Object | String): this.type = set("rowClassName", js.Any.fromFunction2(value))
    
    inline def rowEditValidator(value: (/* data */ Any, /* options */ DataTableRowEditValidatorOptions) => Boolean): this.type = set("rowEditValidator", js.Any.fromFunction2(value))
    
    inline def rowExpansionTemplate(value: (/* data */ Any, /* options */ DataTableRowExpansionTemplate) => Node): this.type = set("rowExpansionTemplate", js.Any.fromFunction2(value))
    
    inline def rowGroupFooterTemplate(value: DataTableRowGroupFooterTemplateType): this.type = set("rowGroupFooterTemplate", value.asInstanceOf[js.Any])
    
    inline def rowGroupFooterTemplateFunction2(value: (/* data */ Any, /* options */ DataTableRowGroupFooterTemplateOptions) => Node): this.type = set("rowGroupFooterTemplate", js.Any.fromFunction2(value))
    
    inline def rowGroupFooterTemplateNull: this.type = set("rowGroupFooterTemplate", null)
    
    inline def rowGroupFooterTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rowGroupFooterTemplate", js.Array(value*))
    
    inline def rowGroupFooterTemplateVdomElement(value: VdomElement): this.type = set("rowGroupFooterTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def rowGroupHeaderTemplate(value: DataTableRowGroupHeaderTemplateType): this.type = set("rowGroupHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def rowGroupHeaderTemplateFunction2(value: (/* data */ Any, /* options */ DataTableRowGroupHeaderTemplateOptions) => Node): this.type = set("rowGroupHeaderTemplate", js.Any.fromFunction2(value))
    
    inline def rowGroupHeaderTemplateNull: this.type = set("rowGroupHeaderTemplate", null)
    
    inline def rowGroupHeaderTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rowGroupHeaderTemplate", js.Array(value*))
    
    inline def rowGroupHeaderTemplateVdomElement(value: VdomElement): this.type = set("rowGroupHeaderTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def rowGroupMode(value: String): this.type = set("rowGroupMode", value.asInstanceOf[js.Any])
    
    inline def rowHover(value: Boolean): this.type = set("rowHover", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def rowsPerPageOptions(value: js.Array[Double]): this.type = set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    inline def rowsPerPageOptionsVarargs(value: Double*): this.type = set("rowsPerPageOptions", js.Array(value*))
    
    inline def scrollDirection(value: DataTableScrollDirectionType): this.type = set("scrollDirection", value.asInstanceOf[js.Any])
    
    inline def scrollHeight(value: String): this.type = set("scrollHeight", value.asInstanceOf[js.Any])
    
    inline def scrollable(value: Boolean): this.type = set("scrollable", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def selectAll(value: Boolean): this.type = set("selectAll", value.asInstanceOf[js.Any])
    
    inline def selectOnEdit(value: Boolean): this.type = set("selectOnEdit", value.asInstanceOf[js.Any])
    
    inline def selection(value: Any | js.Array[Any]): this.type = set("selection", value.asInstanceOf[js.Any])
    
    inline def selectionAriaLabel(value: String): this.type = set("selectionAriaLabel", value.asInstanceOf[js.Any])
    
    inline def selectionAutoFocus(value: Boolean): this.type = set("selectionAutoFocus", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: DataTableSelectionModeType): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def selectionPageOnly(value: Boolean): this.type = set("selectionPageOnly", value.asInstanceOf[js.Any])
    
    inline def selectionVarargs(value: Any*): this.type = set("selection", js.Array(value*))
    
    inline def showGridlines(value: Boolean): this.type = set("showGridlines", value.asInstanceOf[js.Any])
    
    inline def showRowReorderElement(
      value: (/* data */ Any, /* options */ DataTableShowRowReorderElementOptions) => js.UndefOr[Boolean | Null]
    ): this.type = set("showRowReorderElement", js.Any.fromFunction2(value))
    
    inline def showSelectAll(value: Boolean): this.type = set("showSelectAll", value.asInstanceOf[js.Any])
    
    inline def showSelectionElement(
      value: (/* data */ Any, /* options */ DataTableShowSelectionElementOptions) => js.UndefOr[Boolean | Null]
    ): this.type = set("showSelectionElement", js.Any.fromFunction2(value))
    
    inline def size(value: DataTableSizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def sortField(value: String): this.type = set("sortField", value.asInstanceOf[js.Any])
    
    inline def sortMode(value: DataTableSortModeType): this.type = set("sortMode", value.asInstanceOf[js.Any])
    
    inline def sortOrder(value: DataTableSortOrderType): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    
    inline def sortOrderNull: this.type = set("sortOrder", null)
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def stateKey(value: String): this.type = set("stateKey", value.asInstanceOf[js.Any])
    
    inline def stateStorage(value: DataTableStateStorageType): this.type = set("stateStorage", value.asInstanceOf[js.Any])
    
    inline def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def stripedRows(value: Boolean): this.type = set("stripedRows", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tableClassName(value: String): this.type = set("tableClassName", value.asInstanceOf[js.Any])
    
    inline def tableStyle(value: js.Object): this.type = set("tableStyle", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def totalRecords(value: Double): this.type = set("totalRecords", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def `type`(value: HTMLInputTypeAttribute): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[Any]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: Any*): this.type = set("value", js.Array(value*))
    
    inline def virtualScrollerOptions(value: VirtualScrollerProps): this.type = set("virtualScrollerOptions", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DataTable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DataTableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
