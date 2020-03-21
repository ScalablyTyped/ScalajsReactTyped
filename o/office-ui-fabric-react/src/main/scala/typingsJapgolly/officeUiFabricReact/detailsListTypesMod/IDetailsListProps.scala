package typingsJapgolly.officeUiFabricReact.detailsListTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.AnonCallback
import typingsJapgolly.officeUiFabricReact.detailsFooterTypesMod.IDetailsFooterProps
import typingsJapgolly.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderProps
import typingsJapgolly.officeUiFabricReact.detailsListBaseMod.DetailsListBase
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.listTypesMod.IListProps
import typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsJapgolly.officeUiFabricReact.withViewportMod.IViewport
import typingsJapgolly.officeUiFabricReact.withViewportMod.IWithViewportProps
import typingsJapgolly.std.Event_
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListProps
  extends IBaseProps[IDetailsList]
     with IWithViewportProps {
  /** A text summary of the table set via aria-label. */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /** Aria label for grid in details list. */
  var ariaLabelForGrid: js.UndefOr[String] = js.undefined
  /** The aria-label attribute to stamp out on the list header */
  var ariaLabelForListHeader: js.UndefOr[String] = js.undefined
  /** The aria-label attribute to stamp out on select all checkbox for the list */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.undefined
  /**
    * An ARIA label for the name of the selection column, for localization.
    */
  var ariaLabelForSelectionColumn: js.UndefOr[String] = js.undefined
  /**
    * Props impacting the render style of cells. Since these have an impact on calculated column widths, they are
    * handled separately from normal theme styling, but they are passed to the styling system.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /** Check button aria label for details list. */
  var checkButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Optional class name to add to the cell of a checkbox
    */
  var checkboxCellClassName: js.UndefOr[String] = js.undefined
  /**
    * Controls the visibility of selection check box.
    * @defaultvalue CheckboxVisibility.onHover
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
  /** Optional class name to add to the root element. */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Options for column re-order using drag and drop
    */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.undefined
  /** Given column defitions. If none are provided, default columns will be created based on the item's properties. */
  var columns: js.UndefOr[js.Array[IColumn]] = js.undefined
  /** Boolean value to indicate if the component should render in compact mode. Set to false by default */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Controls how the list contrains overflow. */
  var constrainMode: js.UndefOr[ConstrainMode] = js.undefined
  /**
    * Whether or not to disable the built-in SelectionZone, so the host component can provide its own.
    */
  var disableSelectionZone: js.UndefOr[Boolean] = js.undefined
  /** Map of callback functions related to row drag and drop functionality. */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.undefined
  /**
    * Whether to animate updates
    */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the selection zone should enter modal state on touch.
    */
  var enterModalSelectionOnTouch: js.UndefOr[Boolean] = js.undefined
  /**
    * If provided, will be the "default" item column cell value return. column getValueKey can override getCellValue.
    */
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.undefined
  /**
    * Optional function to override default group height calculation used by list virtualization.
    */
  var getGroupHeight: js.UndefOr[js.Function2[/* group */ IGroup, /* groupIndex */ Double, Double]] = js.undefined
  /**
    * Optional callback to get the item key, to be used in the selection and on render.
    * Must be provided if sorting or filtering is enabled.
    */
  var getKey: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]] = js.undefined
  /** Optional callback to get the aria-describedby IDs (space separated strings) of the elements that describe the item. */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  /** Optional callback to get the aria-label string for a given item. */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  /** Optional override properties to render groups. The definition for IGroupRenderProps can be found under the GroupedList component. */
  var groupProps: js.UndefOr[IDetailsGroupRenderProps] = js.undefined
  /** Optional grouping instructions. The definition for IGroup can be found under the GroupedList component. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.undefined
  /** Optional override for the indent width used for group nesting. */
  var indentWidth: js.UndefOr[Double] = js.undefined
  /**
    * Optional default focused index to set focus to once the items have rendered and the index exists.
    */
  var initialFocusedIndex: js.UndefOr[Double] = js.undefined
  /**
    * Controls the visibility of the details header.
    * @defaultvalue true
    */
  var isHeaderVisible: js.UndefOr[Boolean] = js.undefined
  /** Set this to true to indicate that the items being displayed is placeholder data. */
  var isPlaceholderData: js.UndefOr[Boolean] = js.undefined
  /** The items to render. */
  var items: js.Array[_]
  /** Controls how the columns are adjusted. */
  var layoutMode: js.UndefOr[DetailsListLayoutMode] = js.undefined
  /** Optional properties to pass through to the list components being rendered. */
  var listProps: js.UndefOr[IListProps[_]] = js.undefined
  /**
    * The minimum mouse move distance to interpret the action as drag event.
    * @defaultvalue 5
    */
  var minimumPixelsForDrag: js.UndefOr[Double] = js.undefined
  /** Callback for when an item in the list becomes active by clicking anywhere inside the row or navigating to it with keyboard. */
  var onActiveItemChanged: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[ReactFocusEventFrom[HTMLElement]], 
      Unit
    ]
  ] = js.undefined
  /** Callback for when the user clicks on the column header. */
  var onColumnHeaderClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], 
      /* column */ js.UndefOr[IColumn], 
      Unit
    ]
  ] = js.undefined
  /** Callback for when the user asks for a contextual menu (usually via right click) from a column header. */
  var onColumnHeaderContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[IColumn], 
      /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], 
      Unit
    ]
  ] = js.undefined
  /** Callback fired on column resize */
  var onColumnResize: js.UndefOr[
    js.Function3[
      /* column */ js.UndefOr[IColumn], 
      /* newWidth */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** Callback for when the details list has been updated. Useful for telemetry tracking externally. */
  var onDidUpdate: js.UndefOr[js.Function1[/* detailsList */ js.UndefOr[DetailsListBase], Unit]] = js.undefined
  /**
    * Callback for when the context menu of an item has been accessed.
    * If undefined or false are returned, ev.preventDefault() will be called.
    */
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event_], 
      Unit | Boolean
    ]
  ] = js.undefined
  /** Callback for when a given row has been invoked (by pressing enter while it is selected.) */
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event_], 
      Unit
    ]
  ] = js.undefined
  /**
    * If provided, can be used to render a custom checkbox
    */
  var onRenderCheckbox: js.UndefOr[IRenderFunction[IDetailsListCheckboxProps]] = js.undefined
  /**
    * An override to render the details footer.
    */
  var onRenderDetailsFooter: js.UndefOr[IRenderFunction[IDetailsFooterProps]] = js.undefined
  /**
    * An override to render the details header.
    */
  var onRenderDetailsHeader: js.UndefOr[IRenderFunction[IDetailsHeaderProps]] = js.undefined
  /**
    * If provided, will be the "default" item column renderer method. This affects cells within the rows; not the rows themselves.
    * If a column definition provides its own onRender method, that will be used instead of this.
    */
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      Node
    ]
  ] = js.undefined
  /** Callback for what to render when the item is missing. */
  var onRenderMissingItem: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* rowProps */ js.UndefOr[IDetailsRowProps], Node]
  ] = js.undefined
  /**
    *  If provided, will allow the caller to override the default row rendering.
    */
  var onRenderRow: js.UndefOr[IRenderFunction[IDetailsRowProps]] = js.undefined
  /** Callback for when a given row has been mounted. Useful for identifying when a row has been rendered on the page. */
  var onRowDidMount: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** Callback for when a given row has been unmounted. Useful for identifying when a row has been removed from the page. */
  var onRowWillUnmount: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /**
    * Optional callback to determine whether the list should be rendered in full, or virtualized.
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for smaller lists.
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[_], Boolean]] = js.undefined
  /** Event names and corresponding callbacks that will be registered to rendered row elements. */
  var rowElementEventMap: js.UndefOr[js.Array[AnonCallback]] = js.undefined
  /** Optional selection model to track selection state.  */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.undefined
  /** Controls how/if the details list manages selection. Options include none, single, multiple */
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  /**
    * By default, selection is cleared when clicking on an empty (non-focusable) section of the screen. Setting this value to true
    * overrides that behavior and maintains selection.
    * @defaultvalue false
    **/
  var selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Addition props to pass through to the selection zone created by default.
    */
  var selectionZoneProps: js.UndefOr[ISelectionZoneProps] = js.undefined
  /** A key that uniquely identifies the given items. If provided, the selection will be reset when the key changes. */
  var setKey: js.UndefOr[String] = js.undefined
  /** Boolean value to indicate if the role application should be applied on details list. Set to false by default */
  var shouldApplyApplicationRole: js.UndefOr[Boolean] = js.undefined
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]] = js.undefined
  /**
    * Theme provided by the Higher Order Component
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean value to enable render page caching. This is an experimental performance optimization
    * that is off by default.
    * @defaultvalue false
    */
  var usePageCache: js.UndefOr[Boolean] = js.undefined
  /**
    * Rerender DetailsRow only when props changed. Might cause regression when depending on external updates.
    * @defaultvalue false
    */
  var useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined
  /** Viewport, provided by the withViewport decorator. */
  var viewport: js.UndefOr[IViewport] = js.undefined
}

object IDetailsListProps {
  @scala.inline
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
    onDidUpdate: /* detailsList */ js.UndefOr[DetailsListBase] => Callback = null,
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
    viewport: IViewport = null
  ): IDetailsListProps = {
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
    __obj.asInstanceOf[IDetailsListProps]
  }
}

