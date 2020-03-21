package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.AnonCallback
import typingsJapgolly.officeUiFabricReact.detailsFooterTypesMod.IDetailsFooterProps
import typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderProps
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.ConstrainMode
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsGroupRenderProps
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsList
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListCheckboxProps
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.listTypesMod.IListProps
import typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsJapgolly.officeUiFabricReact.withViewportMod.IViewport
import typingsJapgolly.std.Event_
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DetailsList {
  def apply(
    items: js.Array[_],
    ariaLabel: String = null,
    ariaLabelForGrid: String = null,
    ariaLabelForListHeader: String = null,
    ariaLabelForSelectAllCheckbox: String = null,
    ariaLabelForSelectionColumn: String = null,
    cellStyleProps: ICellStyleProps = null,
    checkButtonAriaLabel: String = null,
    checkboxCellClassName: String = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    columnReorderOptions: IColumnReorderOptions = null,
    columns: js.Array[IColumn] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[IDetailsList] = null,
    constrainMode: ConstrainMode = null,
    disableSelectionZone: js.UndefOr[Boolean] = js.undefined,
    dragDropEvents: IDragDropEvents = null,
    enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined,
    enterModalSelectionOnTouch: js.UndefOr[Boolean] = js.undefined,
    getCellValueKey: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => CallbackTo[String] = null,
    getGroupHeight: (/* group */ IGroup, /* groupIndex */ Double) => CallbackTo[Double] = null,
    getKey: (/* item */ js.Any, /* index */ js.UndefOr[Double]) => CallbackTo[String] = null,
    getRowAriaDescribedBy: /* item */ js.Any => CallbackTo[String] = null,
    getRowAriaLabel: /* item */ js.Any => CallbackTo[String] = null,
    groupProps: IDetailsGroupRenderProps = null,
    groups: js.Array[IGroup] = null,
    indentWidth: Int | Double = null,
    initialFocusedIndex: Int | Double = null,
    isHeaderVisible: js.UndefOr[Boolean] = js.undefined,
    isPlaceholderData: js.UndefOr[Boolean] = js.undefined,
    layoutMode: DetailsListLayoutMode = null,
    listProps: IListProps[_] = null,
    minimumPixelsForDrag: Int | Double = null,
    onActiveItemChanged: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[ReactFocusEventFrom[HTMLElement]]) => Callback = null,
    onColumnHeaderClick: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* column */ js.UndefOr[IColumn]) => Callback = null,
    onColumnHeaderContextMenu: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => Callback = null,
    onColumnResize: (/* column */ js.UndefOr[IColumn], /* newWidth */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback = null,
    onDidUpdate: /* detailsList */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListBaseMod.DetailsListBase] => Callback = null,
    onItemContextMenu: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => CallbackTo[Unit | Boolean] = null,
    onItemInvoked: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => Callback = null,
    onRenderCheckbox: (/* props */ js.UndefOr[IDetailsListCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsListCheckboxProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderDetailsFooter: (/* props */ js.UndefOr[IDetailsFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsFooterProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderDetailsHeader: (/* props */ js.UndefOr[IDetailsHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsHeaderProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderItemColumn: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => CallbackTo[Node] = null,
    onRenderMissingItem: (/* index */ js.UndefOr[Double], /* rowProps */ js.UndefOr[IDetailsRowProps]) => CallbackTo[Node] = null,
    onRenderRow: (/* props */ js.UndefOr[IDetailsRowProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsRowProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRowDidMount: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Callback = null,
    onRowWillUnmount: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Callback = null,
    onShouldVirtualize: /* props */ IListProps[js.Any] => CallbackTo[Boolean] = null,
    rowElementEventMap: js.Array[AnonCallback] = null,
    selection: ISelection[IObjectWithKey] = null,
    selectionMode: SelectionMode = null,
    selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined,
    selectionZoneProps: ISelectionZoneProps = null,
    setKey: String = null,
    shouldApplyApplicationRole: js.UndefOr[Boolean] = js.undefined,
    skipViewportMeasures: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    usePageCache: js.UndefOr[Boolean] = js.undefined,
    useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IDetailsListProps, 
    MountedWithRawType[IDetailsListProps, js.Object, RawMounted[IDetailsListProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelForGrid != null) __obj.updateDynamic("ariaLabelForGrid")(ariaLabelForGrid.asInstanceOf[js.Any])
    if (ariaLabelForListHeader != null) __obj.updateDynamic("ariaLabelForListHeader")(ariaLabelForListHeader.asInstanceOf[js.Any])
    if (ariaLabelForSelectAllCheckbox != null) __obj.updateDynamic("ariaLabelForSelectAllCheckbox")(ariaLabelForSelectAllCheckbox.asInstanceOf[js.Any])
    if (ariaLabelForSelectionColumn != null) __obj.updateDynamic("ariaLabelForSelectionColumn")(ariaLabelForSelectionColumn.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkButtonAriaLabel != null) __obj.updateDynamic("checkButtonAriaLabel")(checkButtonAriaLabel.asInstanceOf[js.Any])
    if (checkboxCellClassName != null) __obj.updateDynamic("checkboxCellClassName")(checkboxCellClassName.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnReorderOptions != null) __obj.updateDynamic("columnReorderOptions")(columnReorderOptions.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (constrainMode != null) __obj.updateDynamic("constrainMode")(constrainMode.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSelectionZone)) __obj.updateDynamic("disableSelectionZone")(disableSelectionZone.asInstanceOf[js.Any])
    if (dragDropEvents != null) __obj.updateDynamic("dragDropEvents")(dragDropEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations.asInstanceOf[js.Any])
    if (!js.isUndefined(enterModalSelectionOnTouch)) __obj.updateDynamic("enterModalSelectionOnTouch")(enterModalSelectionOnTouch.asInstanceOf[js.Any])
    if (getCellValueKey != null) __obj.updateDynamic("getCellValueKey")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* column */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn]) => getCellValueKey(t0, t1, t2).runNow()))
    if (getGroupHeight != null) __obj.updateDynamic("getGroupHeight")(js.Any.fromFunction2((t0: /* group */ typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup, t1: /* groupIndex */ scala.Double) => getGroupHeight(t0, t1).runNow()))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => getKey(t0, t1).runNow()))
    if (getRowAriaDescribedBy != null) __obj.updateDynamic("getRowAriaDescribedBy")(js.Any.fromFunction1((t0: /* item */ js.Any) => getRowAriaDescribedBy(t0).runNow()))
    if (getRowAriaLabel != null) __obj.updateDynamic("getRowAriaLabel")(js.Any.fromFunction1((t0: /* item */ js.Any) => getRowAriaLabel(t0).runNow()))
    if (groupProps != null) __obj.updateDynamic("groupProps")(groupProps.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (initialFocusedIndex != null) __obj.updateDynamic("initialFocusedIndex")(initialFocusedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeaderVisible)) __obj.updateDynamic("isHeaderVisible")(isHeaderVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlaceholderData)) __obj.updateDynamic("isPlaceholderData")(isPlaceholderData.asInstanceOf[js.Any])
    if (layoutMode != null) __obj.updateDynamic("layoutMode")(layoutMode.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (minimumPixelsForDrag != null) __obj.updateDynamic("minimumPixelsForDrag")(minimumPixelsForDrag.asInstanceOf[js.Any])
    if (onActiveItemChanged != null) __obj.updateDynamic("onActiveItemChanged")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onActiveItemChanged(t0, t1, t2).runNow()))
    if (onColumnHeaderClick != null) __obj.updateDynamic("onColumnHeaderClick")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: /* column */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn]) => onColumnHeaderClick(t0, t1).runNow()))
    if (onColumnHeaderContextMenu != null) __obj.updateDynamic("onColumnHeaderContextMenu")(js.Any.fromFunction2((t0: /* column */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn], t1: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onColumnHeaderContextMenu(t0, t1).runNow()))
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(js.Any.fromFunction3((t0: /* column */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn], t1: /* newWidth */ js.UndefOr[scala.Double], t2: /* columnIndex */ js.UndefOr[scala.Double]) => onColumnResize(t0, t1, t2).runNow()))
    if (onDidUpdate != null) __obj.updateDynamic("onDidUpdate")(js.Any.fromFunction1((t0: /* detailsList */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListBaseMod.DetailsListBase]) => onDidUpdate(t0).runNow()))
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* ev */ js.UndefOr[typingsJapgolly.std.Event_]) => onItemContextMenu(t0, t1, t2).runNow()))
    if (onItemInvoked != null) __obj.updateDynamic("onItemInvoked")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* ev */ js.UndefOr[typingsJapgolly.std.Event_]) => onItemInvoked(t0, t1, t2).runNow()))
    if (onRenderCheckbox != null) __obj.updateDynamic("onRenderCheckbox")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListCheckboxProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListCheckboxProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderCheckbox(t0, t1).runNow()))
    if (onRenderDetailsFooter != null) __obj.updateDynamic("onRenderDetailsFooter")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsFooterTypesMod.IDetailsFooterProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsFooterTypesMod.IDetailsFooterProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderDetailsFooter(t0, t1).runNow()))
    if (onRenderDetailsHeader != null) __obj.updateDynamic("onRenderDetailsHeader")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderDetailsHeader(t0, t1).runNow()))
    if (onRenderItemColumn != null) __obj.updateDynamic("onRenderItemColumn")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* column */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn]) => onRenderItemColumn(t0, t1, t2).runNow()))
    if (onRenderMissingItem != null) __obj.updateDynamic("onRenderMissingItem")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* rowProps */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps]) => onRenderMissingItem(t0, t1).runNow()))
    if (onRenderRow != null) __obj.updateDynamic("onRenderRow")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderRow(t0, t1).runNow()))
    if (onRowDidMount != null) __obj.updateDynamic("onRowDidMount")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double]) => onRowDidMount(t0, t1).runNow()))
    if (onRowWillUnmount != null) __obj.updateDynamic("onRowWillUnmount")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double]) => onRowWillUnmount(t0, t1).runNow()))
    if (onShouldVirtualize != null) __obj.updateDynamic("onShouldVirtualize")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.listTypesMod.IListProps[js.Any]) => onShouldVirtualize(t0).runNow()))
    if (rowElementEventMap != null) __obj.updateDynamic("rowElementEventMap")(rowElementEventMap.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionPreservedOnEmptyClick)) __obj.updateDynamic("selectionPreservedOnEmptyClick")(selectionPreservedOnEmptyClick.asInstanceOf[js.Any])
    if (selectionZoneProps != null) __obj.updateDynamic("selectionZoneProps")(selectionZoneProps.asInstanceOf[js.Any])
    if (setKey != null) __obj.updateDynamic("setKey")(setKey.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldApplyApplicationRole)) __obj.updateDynamic("shouldApplyApplicationRole")(shouldApplyApplicationRole.asInstanceOf[js.Any])
    if (!js.isUndefined(skipViewportMeasures)) __obj.updateDynamic("skipViewportMeasures")(skipViewportMeasures.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    if (!js.isUndefined(usePageCache)) __obj.updateDynamic("usePageCache")(usePageCache.asInstanceOf[js.Any])
    if (!js.isUndefined(useReducedRowRenderer)) __obj.updateDynamic("useReducedRowRenderer")(useReducedRowRenderer.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "DetailsList")
  @js.native
  object componentImport extends js.Object
  
}

