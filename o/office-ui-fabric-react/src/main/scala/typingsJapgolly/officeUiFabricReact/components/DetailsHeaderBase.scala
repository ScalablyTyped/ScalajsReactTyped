package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IColumnReorderHeaderProps
import typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeader
import typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps
import typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderStyleProps
import typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderStyles
import typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typingsJapgolly.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typingsJapgolly.officeUiFabricReact.withViewportMod.IViewport
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DetailsHeaderBase {
  def apply(
    layoutMode: DetailsListLayoutMode,
    ariaLabel: String = null,
    ariaLabelForSelectAllCheckbox: String = null,
    ariaLabelForSelectionColumn: String = null,
    ariaLabelForToggleAllGroupsButton: String = null,
    cellStyleProps: ICellStyleProps = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    collapseAllVisibility: CollapseAllVisibility = null,
    columnReorderOptions: IColumnReorderOptions = null,
    columnReorderProps: IColumnReorderHeaderProps = null,
    columns: js.Array[IColumn] = null,
    componentRef: IRefObject[IDetailsHeader] = null,
    groupNestingDepth: Int | Double = null,
    indentWidth: Int | Double = null,
    isAllCollapsed: js.UndefOr[Boolean] = js.undefined,
    minimumPixelsForDrag: Int | Double = null,
    onColumnAutoResized: (/* column */ IColumn, /* columnIndex */ Double) => Callback = null,
    onColumnClick: (/* ev */ ReactMouseEventFrom[HTMLElement], /* column */ IColumn) => Callback = null,
    onColumnContextMenu: (/* column */ IColumn, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onColumnIsSizingChanged: (/* column */ IColumn, /* isSizing */ Boolean) => Callback = null,
    onColumnResized: (/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double) => Callback = null,
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
    ]) => CallbackTo[Element | Null] = null,
    onRenderDetailsCheckbox: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onToggleCollapseAll: /* isAllCollapsed */ Boolean => Callback = null,
    rowWidth: Int | Double = null,
    selectAllVisibility: SelectAllVisibility = null,
    selection: ISelection[IObjectWithKey] = null,
    selectionMode: SelectionMode = null,
    styles: IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDetailsHeaderBaseProps, 
    typingsJapgolly.officeUiFabricReact.mod.DetailsHeaderBase, 
    Unit, 
    IDetailsHeaderBaseProps
  ] = {
    val __obj = js.Dynamic.literal(layoutMode = layoutMode.asInstanceOf[js.Any])
  
      if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelForSelectAllCheckbox != null) __obj.updateDynamic("ariaLabelForSelectAllCheckbox")(ariaLabelForSelectAllCheckbox.asInstanceOf[js.Any])
    if (ariaLabelForSelectionColumn != null) __obj.updateDynamic("ariaLabelForSelectionColumn")(ariaLabelForSelectionColumn.asInstanceOf[js.Any])
    if (ariaLabelForToggleAllGroupsButton != null) __obj.updateDynamic("ariaLabelForToggleAllGroupsButton")(ariaLabelForToggleAllGroupsButton.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility.asInstanceOf[js.Any])
    if (columnReorderOptions != null) __obj.updateDynamic("columnReorderOptions")(columnReorderOptions.asInstanceOf[js.Any])
    if (columnReorderProps != null) __obj.updateDynamic("columnReorderProps")(columnReorderProps.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllCollapsed)) __obj.updateDynamic("isAllCollapsed")(isAllCollapsed.asInstanceOf[js.Any])
    if (minimumPixelsForDrag != null) __obj.updateDynamic("minimumPixelsForDrag")(minimumPixelsForDrag.asInstanceOf[js.Any])
    if (onColumnAutoResized != null) __obj.updateDynamic("onColumnAutoResized")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn, t1: /* columnIndex */ scala.Double) => onColumnAutoResized(t0, t1).runNow()))
    if (onColumnClick != null) __obj.updateDynamic("onColumnClick")(js.Any.fromFunction2((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* column */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn) => onColumnClick(t0, t1).runNow()))
    if (onColumnContextMenu != null) __obj.updateDynamic("onColumnContextMenu")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onColumnContextMenu(t0, t1).runNow()))
    if (onColumnIsSizingChanged != null) __obj.updateDynamic("onColumnIsSizingChanged")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn, t1: /* isSizing */ scala.Boolean) => onColumnIsSizingChanged(t0, t1).runNow()))
    if (onColumnResized != null) __obj.updateDynamic("onColumnResized")(js.Any.fromFunction3((t0: /* column */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn, t1: /* newWidth */ scala.Double, t2: /* columnIndex */ scala.Double) => onColumnResized(t0, t1, t2).runNow()))
    if (onRenderColumnHeaderTooltip != null) __obj.updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderColumnHeaderTooltip(t0, t1).runNow()))
    if (onRenderDetailsCheckbox != null) __obj.updateDynamic("onRenderDetailsCheckbox")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderDetailsCheckbox(t0, t1).runNow()))
    if (onToggleCollapseAll != null) __obj.updateDynamic("onToggleCollapseAll")(js.Any.fromFunction1((t0: /* isAllCollapsed */ scala.Boolean) => onToggleCollapseAll(t0).runNow()))
    if (rowWidth != null) __obj.updateDynamic("rowWidth")(rowWidth.asInstanceOf[js.Any])
    if (selectAllVisibility != null) __obj.updateDynamic("selectAllVisibility")(selectAllVisibility.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.DetailsHeaderBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "DetailsHeaderBase")
  @js.native
  object componentImport extends js.Object
  
}

