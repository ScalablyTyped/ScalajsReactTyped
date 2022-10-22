package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnRenderTooltipProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IColumnReorderHeaderProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeader
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderBaseProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.SelectAllVisibility
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.DetailsListLayoutMode
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumnReorderOptions
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsCheckboxProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithViewportMod.IViewport
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

object DetailsHeader {
  
  inline def apply(layoutMode: DetailsListLayoutMode): Builder = {
    val __props = js.Dynamic.literal(layoutMode = layoutMode.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsHeaderBaseProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DetailsHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDotbaseMod.DetailsHeaderBase
        ] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelForSelectAllCheckbox(value: String): this.type = set("ariaLabelForSelectAllCheckbox", value.asInstanceOf[js.Any])
    
    inline def ariaLabelForSelectionColumn(value: String): this.type = set("ariaLabelForSelectionColumn", value.asInstanceOf[js.Any])
    
    inline def ariaLabelForToggleAllGroupsButton(value: String): this.type = set("ariaLabelForToggleAllGroupsButton", value.asInstanceOf[js.Any])
    
    inline def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    
    inline def checkboxVisibility(value: CheckboxVisibility): this.type = set("checkboxVisibility", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapseAllVisibility(value: CollapseAllVisibility): this.type = set("collapseAllVisibility", value.asInstanceOf[js.Any])
    
    inline def columnReorderOptions(value: IColumnReorderOptions): this.type = set("columnReorderOptions", value.asInstanceOf[js.Any])
    
    inline def columnReorderProps(value: IColumnReorderHeaderProps): this.type = set("columnReorderProps", value.asInstanceOf[js.Any])
    
    inline def columns(value: js.Array[IColumn]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: IColumn*): this.type = set("columns", js.Array(value*))
    
    inline def componentRef(value: IRefObject[IDetailsHeader]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDetailsHeader | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDetailsHeader | Null) => value(t0).runNow()))
    
    inline def groupNestingDepth(value: Double): this.type = set("groupNestingDepth", value.asInstanceOf[js.Any])
    
    inline def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    
    inline def isAllCollapsed(value: Boolean): this.type = set("isAllCollapsed", value.asInstanceOf[js.Any])
    
    inline def minimumPixelsForDrag(value: Double): this.type = set("minimumPixelsForDrag", value.asInstanceOf[js.Any])
    
    inline def onColumnAutoResized(value: (/* column */ IColumn, /* columnIndex */ Double) => Callback): this.type = set("onColumnAutoResized", js.Any.fromFunction2((t0: /* column */ IColumn, t1: /* columnIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onColumnClick(value: (/* ev */ ReactMouseEventFrom[HTMLElement], /* column */ IColumn) => Callback): this.type = set("onColumnClick", js.Any.fromFunction2((t0: /* ev */ ReactMouseEventFrom[HTMLElement], t1: /* column */ IColumn) => (value(t0, t1)).runNow()))
    
    inline def onColumnContextMenu(value: (/* column */ IColumn, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onColumnContextMenu", js.Any.fromFunction2((t0: /* column */ IColumn, t1: /* ev */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onColumnIsSizingChanged(value: (/* column */ IColumn, /* isSizing */ Boolean) => Callback): this.type = set("onColumnIsSizingChanged", js.Any.fromFunction2((t0: /* column */ IColumn, t1: /* isSizing */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def onColumnResized(value: (/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double) => Callback): this.type = set("onColumnResized", js.Any.fromFunction3((t0: /* column */ IColumn, t1: /* newWidth */ Double, t2: /* columnIndex */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onRenderColumnHeaderTooltip(
      value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
        ]) => Element | Null
    ): this.type = set("onRenderColumnHeaderTooltip", js.Any.fromFunction2(value))
    
    inline def onRenderDetailsCheckbox(
      value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderDetailsCheckbox", js.Any.fromFunction2(value))
    
    inline def onToggleCollapseAll(value: /* isAllCollapsed */ Boolean => Callback): this.type = set("onToggleCollapseAll", js.Any.fromFunction1((t0: /* isAllCollapsed */ Boolean) => value(t0).runNow()))
    
    inline def rowWidth(value: Double): this.type = set("rowWidth", value.asInstanceOf[js.Any])
    
    inline def selectAllVisibility(value: SelectAllVisibility): this.type = set("selectAllVisibility", value.asInstanceOf[js.Any])
    
    inline def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDetailsHeaderStyleProps => DeepPartial[IDetailsHeaderStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
    
    inline def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDetailsHeaderBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
