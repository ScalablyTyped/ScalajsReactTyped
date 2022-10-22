package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsFooterDottypesMod.IDetailsFooterProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ConstrainMode
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.DetailsListLayoutMode
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumnReorderOptions
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsGroupRenderProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsList
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListCheckboxProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.libComponentsListListDottypesMod.IListProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DetailsList {
  
  inline def apply(items: js.Array[Any]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsListProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DetailsList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelForGrid(value: String): this.type = set("ariaLabelForGrid", value.asInstanceOf[js.Any])
    
    inline def ariaLabelForListHeader(value: String): this.type = set("ariaLabelForListHeader", value.asInstanceOf[js.Any])
    
    inline def ariaLabelForSelectAllCheckbox(value: String): this.type = set("ariaLabelForSelectAllCheckbox", value.asInstanceOf[js.Any])
    
    inline def ariaLabelForSelectionColumn(value: String): this.type = set("ariaLabelForSelectionColumn", value.asInstanceOf[js.Any])
    
    inline def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    
    inline def checkButtonAriaLabel(value: String): this.type = set("checkButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def checkButtonGroupAriaLabel(value: String): this.type = set("checkButtonGroupAriaLabel", value.asInstanceOf[js.Any])
    
    inline def checkboxCellClassName(value: String): this.type = set("checkboxCellClassName", value.asInstanceOf[js.Any])
    
    inline def checkboxVisibility(value: CheckboxVisibility): this.type = set("checkboxVisibility", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columnReorderOptions(value: IColumnReorderOptions): this.type = set("columnReorderOptions", value.asInstanceOf[js.Any])
    
    inline def columns(value: js.Array[IColumn]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: IColumn*): this.type = set("columns", js.Array(value*))
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDetailsList]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDetailsList | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDetailsList | Null) => value(t0).runNow()))
    
    inline def constrainMode(value: ConstrainMode): this.type = set("constrainMode", value.asInstanceOf[js.Any])
    
    inline def delayFirstMeasure(value: Boolean): this.type = set("delayFirstMeasure", value.asInstanceOf[js.Any])
    
    inline def disableResizeObserver(value: Boolean): this.type = set("disableResizeObserver", value.asInstanceOf[js.Any])
    
    inline def disableSelectionZone(value: Boolean): this.type = set("disableSelectionZone", value.asInstanceOf[js.Any])
    
    inline def dragDropEvents(value: IDragDropEvents): this.type = set("dragDropEvents", value.asInstanceOf[js.Any])
    
    inline def enableUpdateAnimations(value: Boolean): this.type = set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    inline def enterModalSelectionOnTouch(value: Boolean): this.type = set("enterModalSelectionOnTouch", value.asInstanceOf[js.Any])
    
    inline def flexMargin(value: Double): this.type = set("flexMargin", value.asInstanceOf[js.Any])
    
    inline def getCellValueKey(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): this.type = set("getCellValueKey", js.Any.fromFunction3(value))
    
    inline def getGroupHeight(value: (/* group */ IGroup, /* groupIndex */ Double) => Double): this.type = set("getGroupHeight", js.Any.fromFunction2(value))
    
    inline def getKey(value: (/* item */ Any, /* index */ js.UndefOr[Double]) => String): this.type = set("getKey", js.Any.fromFunction2(value))
    
    inline def getRowAriaDescribedBy(value: /* item */ Any => String): this.type = set("getRowAriaDescribedBy", js.Any.fromFunction1(value))
    
    inline def getRowAriaLabel(value: /* item */ Any => String): this.type = set("getRowAriaLabel", js.Any.fromFunction1(value))
    
    inline def groupProps(value: IDetailsGroupRenderProps): this.type = set("groupProps", value.asInstanceOf[js.Any])
    
    inline def groups(value: js.Array[IGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
    
    inline def groupsVarargs(value: IGroup*): this.type = set("groups", js.Array(value*))
    
    inline def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    
    inline def initialFocusedIndex(value: Double): this.type = set("initialFocusedIndex", value.asInstanceOf[js.Any])
    
    inline def isHeaderVisible(value: Boolean): this.type = set("isHeaderVisible", value.asInstanceOf[js.Any])
    
    inline def isPlaceholderData(value: Boolean): this.type = set("isPlaceholderData", value.asInstanceOf[js.Any])
    
    inline def isSelectedOnFocus(value: Boolean): this.type = set("isSelectedOnFocus", value.asInstanceOf[js.Any])
    
    inline def layoutMode(value: DetailsListLayoutMode): this.type = set("layoutMode", value.asInstanceOf[js.Any])
    
    inline def listProps(value: IListProps[Any]): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    inline def minimumPixelsForDrag(value: Double): this.type = set("minimumPixelsForDrag", value.asInstanceOf[js.Any])
    
    inline def onActiveItemChanged(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[ReactFocusEventFrom[HTMLElement]]) => Callback
    ): this.type = set("onActiveItemChanged", js.Any.fromFunction3((t0: /* item */ js.UndefOr[Any], t1: /* index */ js.UndefOr[Double], t2: /* ev */ js.UndefOr[ReactFocusEventFrom[HTMLElement]]) => (value(t0, t1, t2)).runNow()))
    
    inline def onColumnHeaderClick(
      value: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* column */ js.UndefOr[IColumn]) => Callback
    ): this.type = set("onColumnHeaderClick", js.Any.fromFunction2((t0: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], t1: /* column */ js.UndefOr[IColumn]) => (value(t0, t1)).runNow()))
    
    inline def onColumnHeaderContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => Callback
    ): this.type = set("onColumnHeaderContextMenu", js.Any.fromFunction2((t0: /* column */ js.UndefOr[IColumn], t1: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => (value(t0, t1)).runNow()))
    
    inline def onColumnResize(
      value: (/* column */ js.UndefOr[IColumn], /* newWidth */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback
    ): this.type = set("onColumnResize", js.Any.fromFunction3((t0: /* column */ js.UndefOr[IColumn], t1: /* newWidth */ js.UndefOr[Double], t2: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def onDidUpdate(
      value: /* detailsList */ js.UndefOr[
          typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDotbaseMod.DetailsListBase
        ] => Callback
    ): this.type = set("onDidUpdate", js.Any.fromFunction1((t0: /* detailsList */ js.UndefOr[
          typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDotbaseMod.DetailsListBase
        ]) => value(t0).runNow()))
    
    inline def onItemContextMenu(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
    ): this.type = set("onItemContextMenu", js.Any.fromFunction3(value))
    
    inline def onItemInvoked(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Callback
    ): this.type = set("onItemInvoked", js.Any.fromFunction3((t0: /* item */ js.UndefOr[Any], t1: /* index */ js.UndefOr[Double], t2: /* ev */ js.UndefOr[Event]) => (value(t0, t1, t2)).runNow()))
    
    inline def onRenderCheckbox(
      value: (/* props */ js.UndefOr[IDetailsListCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsListCheckboxProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderCheckbox", js.Any.fromFunction2(value))
    
    inline def onRenderDetailsFooter(
      value: (/* props */ js.UndefOr[IDetailsFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsFooterProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderDetailsFooter", js.Any.fromFunction2(value))
    
    inline def onRenderDetailsHeader(
      value: (/* props */ js.UndefOr[IDetailsHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsHeaderProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderDetailsHeader", js.Any.fromFunction2(value))
    
    inline def onRenderItemColumn(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => Node
    ): this.type = set("onRenderItemColumn", js.Any.fromFunction3(value))
    
    inline def onRenderMissingItem(value: (/* index */ js.UndefOr[Double], /* rowProps */ js.UndefOr[IDetailsRowProps]) => Node): this.type = set("onRenderMissingItem", js.Any.fromFunction2(value))
    
    inline def onRenderRow(
      value: (/* props */ js.UndefOr[IDetailsRowProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsRowProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderRow", js.Any.fromFunction2(value))
    
    inline def onRowDidMount(value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double]) => Callback): this.type = set("onRowDidMount", js.Any.fromFunction2((t0: /* item */ js.UndefOr[Any], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def onRowWillUnmount(value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double]) => Callback): this.type = set("onRowWillUnmount", js.Any.fromFunction2((t0: /* item */ js.UndefOr[Any], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def onShouldVirtualize(value: /* props */ IListProps[Any] => Boolean): this.type = set("onShouldVirtualize", js.Any.fromFunction1(value))
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rowElementEventMap(value: js.Array[typingsJapgolly.officeUiFabricReact.anon.Callback]): this.type = set("rowElementEventMap", value.asInstanceOf[js.Any])
    
    inline def rowElementEventMapVarargs(value: typingsJapgolly.officeUiFabricReact.anon.Callback*): this.type = set("rowElementEventMap", js.Array(value*))
    
    inline def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def selectionPreservedOnEmptyClick(value: Boolean): this.type = set("selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
    
    inline def selectionZoneProps(value: ISelectionZoneProps): this.type = set("selectionZoneProps", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): this.type = set("setKey", value.asInstanceOf[js.Any])
    
    inline def shouldApplyApplicationRole(value: Boolean): this.type = set("shouldApplyApplicationRole", value.asInstanceOf[js.Any])
    
    inline def skipViewportMeasures(value: Boolean): this.type = set("skipViewportMeasures", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDetailsListStyleProps => DeepPartial[IDetailsListStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
    
    inline def usePageCache(value: Boolean): this.type = set("usePageCache", value.asInstanceOf[js.Any])
    
    inline def useReducedRowRenderer(value: Boolean): this.type = set("useReducedRowRenderer", value.asInstanceOf[js.Any])
    
    inline def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDetailsListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
