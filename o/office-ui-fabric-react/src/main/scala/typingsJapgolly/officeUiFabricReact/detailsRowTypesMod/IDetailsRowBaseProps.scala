package typingsJapgolly.officeUiFabricReact.detailsRowTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.AnonEventName
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase
import typingsJapgolly.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typingsJapgolly.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typingsJapgolly.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typingsJapgolly.officeUiFabricReact.withViewportMod.IViewport
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'onRenderItemColumn' | 'getCellValueKey'> */
/* Inlined parent office-ui-fabric-react.office-ui-fabric-react/lib/Utilities.IBaseProps<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRow> */
/* Inlined parent office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsItemProps */
trait IDetailsRowBaseProps extends js.Object {
  /**
    * Rules for rendering column cells.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /**
    * Optional pre-rendered content per column. Preferred over onRender or onRenderItemColumn if provided.
    */
  var cellsByColumn: js.UndefOr[StringDictionary[Node]] = js.undefined
  /**
    * Check button's aria label
    */
  var checkButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Class name for the checkbox cell
    */
  var checkboxCellClassName: js.UndefOr[String] = js.undefined
  /**
    * Checkbox visibility
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.undefined
  /**
    * Overriding class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Collapse all visibility
    */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.undefined
  /**
    * Column metadata
    */
  var columns: js.UndefOr[js.Array[IColumn]] = js.undefined
  /**
    * Whether to render in compact mode
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  /**
    * Ref of the component
    */
  var componentRef: js.UndefOr[IRefObject[IDetailsRow]] = js.undefined
  /**
    * Handling drag and drop events
    */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.undefined
  /**
    * Helper for the drag and drop
    */
  var dragDropHelper: js.UndefOr[IDragDropHelper] = js.undefined
  /** Whether to animate updates */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of events to register
    */
  var eventsToRegister: js.UndefOr[js.Array[AnonEventName]] = js.undefined
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.undefined
  /**
    * Callback for getting the row aria-describedby
    */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  /**
    * Callback for getting the row aria label
    */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  /**
    * Nesting depth of a grouping
    */
  var groupNestingDepth: js.UndefOr[Double] = js.undefined
  /**
    * How much to indent
    */
  var indentWidth: js.UndefOr[Double] = js.undefined
  /**
    * Data source for this component
    */
  var item: js.Any
  /**
    * Index of the collection of items of the DetailsList
    */
  var itemIndex: Double
  /**
    * Callback for did mount for parent
    */
  var onDidMount: js.UndefOr[js.Function1[/* row */ js.UndefOr[DetailsRowBase], Unit]] = js.undefined
  /**
    * Callback for rendering a checkbox
    */
  var onRenderCheck: js.UndefOr[js.Function1[/* props */ IDetailsRowCheckProps, Element]] = js.undefined
  /**
    * If provided, can be used to render a custom checkbox
    */
  var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.undefined
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      Node
    ]
  ] = js.undefined
  /**
    * Callback for will mount for parent
    */
  var onWillUnmount: js.UndefOr[js.Function1[/* row */ js.UndefOr[DetailsRowBase], Unit]] = js.undefined
  /**
    * DOM element into which to render row field
    */
  var rowFieldsAs: js.UndefOr[ComponentType[IDetailsRowFieldsProps]] = js.undefined
  /**
    * Minimum width of the row.
    *
    * @defaultvalue 0
    */
  var rowWidth: js.UndefOr[Double] = js.undefined
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.undefined
  /**
    * Selection mode
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  /**
    * Overriding styles to this row
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]] = js.undefined
  /**
    * Theme provided by styled() function
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
  /**
    * Rerender DetailsRow only when props changed. Might cause regression when depending on external updates.
    * @defaultvalue false
    */
  var useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined
  /**
    * View port of the virtualized list
    *
    * @deprecated use rowWidth instead
    */
  var viewport: js.UndefOr[IViewport] = js.undefined
}

object IDetailsRowBaseProps {
  @scala.inline
  def apply(
    item: js.Any,
    itemIndex: Double,
    cellStyleProps: ICellStyleProps = null,
    cellsByColumn: StringDictionary[Node] = null,
    checkButtonAriaLabel: String = null,
    checkboxCellClassName: String = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    collapseAllVisibility: CollapseAllVisibility = null,
    columns: js.Array[IColumn] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[IDetailsRow] = null,
    dragDropEvents: IDragDropEvents = null,
    dragDropHelper: IDragDropHelper = null,
    enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined,
    eventsToRegister: js.Array[AnonEventName] = null,
    getCellValueKey: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => CallbackTo[String] = null,
    getRowAriaDescribedBy: /* item */ js.Any => CallbackTo[String] = null,
    getRowAriaLabel: /* item */ js.Any => CallbackTo[String] = null,
    groupNestingDepth: Int | Double = null,
    indentWidth: Int | Double = null,
    onDidMount: /* row */ js.UndefOr[DetailsRowBase] => Callback = null,
    onRenderCheck: /* props */ IDetailsRowCheckProps => CallbackTo[Element] = null,
    onRenderDetailsCheckbox: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderItemColumn: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => CallbackTo[Node] = null,
    onWillUnmount: /* row */ js.UndefOr[DetailsRowBase] => Callback = null,
    rowFieldsAs: ComponentType[IDetailsRowFieldsProps] = null,
    rowWidth: Int | Double = null,
    selection: ISelection[IObjectWithKey] = null,
    selectionMode: SelectionMode = null,
    styles: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null
  ): IDetailsRowBaseProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (cellsByColumn != null) __obj.updateDynamic("cellsByColumn")(cellsByColumn.asInstanceOf[js.Any])
    if (checkButtonAriaLabel != null) __obj.updateDynamic("checkButtonAriaLabel")(checkButtonAriaLabel.asInstanceOf[js.Any])
    if (checkboxCellClassName != null) __obj.updateDynamic("checkboxCellClassName")(checkboxCellClassName.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dragDropEvents != null) __obj.updateDynamic("dragDropEvents")(dragDropEvents.asInstanceOf[js.Any])
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations.asInstanceOf[js.Any])
    if (eventsToRegister != null) __obj.updateDynamic("eventsToRegister")(eventsToRegister.asInstanceOf[js.Any])
    if (getCellValueKey != null) __obj.updateDynamic("getCellValueKey")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* column */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn]) => getCellValueKey(t0, t1, t2).runNow()))
    if (getRowAriaDescribedBy != null) __obj.updateDynamic("getRowAriaDescribedBy")(js.Any.fromFunction1((t0: /* item */ js.Any) => getRowAriaDescribedBy(t0).runNow()))
    if (getRowAriaLabel != null) __obj.updateDynamic("getRowAriaLabel")(js.Any.fromFunction1((t0: /* item */ js.Any) => getRowAriaLabel(t0).runNow()))
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (onDidMount != null) __obj.updateDynamic("onDidMount")(js.Any.fromFunction1((t0: /* row */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase]) => onDidMount(t0).runNow()))
    if (onRenderCheck != null) __obj.updateDynamic("onRenderCheck")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps) => onRenderCheck(t0).runNow()))
    if (onRenderDetailsCheckbox != null) __obj.updateDynamic("onRenderDetailsCheckbox")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderDetailsCheckbox(t0, t1).runNow()))
    if (onRenderItemColumn != null) __obj.updateDynamic("onRenderItemColumn")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* column */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn]) => onRenderItemColumn(t0, t1, t2).runNow()))
    if (onWillUnmount != null) __obj.updateDynamic("onWillUnmount")(js.Any.fromFunction1((t0: /* row */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase]) => onWillUnmount(t0).runNow()))
    if (rowFieldsAs != null) __obj.updateDynamic("rowFieldsAs")(rowFieldsAs.asInstanceOf[js.Any])
    if (rowWidth != null) __obj.updateDynamic("rowWidth")(rowWidth.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    if (!js.isUndefined(useReducedRowRenderer)) __obj.updateDynamic("useReducedRowRenderer")(useReducedRowRenderer.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowBaseProps]
  }
}

