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
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowProps extends IDetailsRowBaseProps {
  /**
    * Column metadata
    */
  @JSName("columns")
  var columns_IDetailsRowProps: js.Array[IColumn]
  /**
    * Selection mode
    */
  @JSName("selectionMode")
  var selectionMode_IDetailsRowProps: SelectionMode
  /**
    * Selection from utilities
    */
  @JSName("selection")
  var selection_IDetailsRowProps: ISelection[IObjectWithKey]
}

object IDetailsRowProps {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    selection: ISelection[IObjectWithKey],
    selectionMode: SelectionMode,
    cellStyleProps: ICellStyleProps = null,
    cellsByColumn: StringDictionary[Node] = null,
    checkButtonAriaLabel: String = null,
    checkboxCellClassName: String = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    collapseAllVisibility: CollapseAllVisibility = null,
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
    styles: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null
  ): IDetailsRowProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (cellsByColumn != null) __obj.updateDynamic("cellsByColumn")(cellsByColumn.asInstanceOf[js.Any])
    if (checkButtonAriaLabel != null) __obj.updateDynamic("checkButtonAriaLabel")(checkButtonAriaLabel.asInstanceOf[js.Any])
    if (checkboxCellClassName != null) __obj.updateDynamic("checkboxCellClassName")(checkboxCellClassName.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility.asInstanceOf[js.Any])
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
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    if (!js.isUndefined(useReducedRowRenderer)) __obj.updateDynamic("useReducedRowRenderer")(useReducedRowRenderer.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowProps]
  }
}

