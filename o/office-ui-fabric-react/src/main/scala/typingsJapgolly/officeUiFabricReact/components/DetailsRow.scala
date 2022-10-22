package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.anon.EventName
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsCheckboxProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowCheckDottypesMod.IDetailsRowCheckProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRow
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowBaseProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowFieldsDottypesMod.IDetailsRowFieldsProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.CollapseAllVisibility
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.react.mod.ComponentType
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

object DetailsRow {
  
  inline def apply(item: Any, itemIndex: Double): Builder = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsRowBaseProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DetailsRow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    
    inline def checkButtonAriaLabel(value: String): this.type = set("checkButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def checkboxCellClassName(value: String): this.type = set("checkboxCellClassName", value.asInstanceOf[js.Any])
    
    inline def checkboxVisibility(value: CheckboxVisibility): this.type = set("checkboxVisibility", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapseAllVisibility(value: CollapseAllVisibility): this.type = set("collapseAllVisibility", value.asInstanceOf[js.Any])
    
    inline def columns(value: js.Array[IColumn]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: IColumn*): this.type = set("columns", js.Array(value*))
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDetailsRow]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDetailsRow | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDetailsRow | Null) => value(t0).runNow()))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dragDropEvents(value: IDragDropEvents): this.type = set("dragDropEvents", value.asInstanceOf[js.Any])
    
    inline def dragDropHelper(value: IDragDropHelper): this.type = set("dragDropHelper", value.asInstanceOf[js.Any])
    
    inline def enableUpdateAnimations(value: Boolean): this.type = set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    inline def eventsToRegister(value: js.Array[EventName]): this.type = set("eventsToRegister", value.asInstanceOf[js.Any])
    
    inline def eventsToRegisterVarargs(value: EventName*): this.type = set("eventsToRegister", js.Array(value*))
    
    inline def flatIndexOffset(value: Double): this.type = set("flatIndexOffset", value.asInstanceOf[js.Any])
    
    inline def getCellValueKey(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): this.type = set("getCellValueKey", js.Any.fromFunction3(value))
    
    inline def getRowAriaDescribedBy(value: /* item */ Any => String): this.type = set("getRowAriaDescribedBy", js.Any.fromFunction1(value))
    
    inline def getRowAriaDescription(value: /* item */ Any => String): this.type = set("getRowAriaDescription", js.Any.fromFunction1(value))
    
    inline def getRowAriaLabel(value: /* item */ Any => String): this.type = set("getRowAriaLabel", js.Any.fromFunction1(value))
    
    inline def groupNestingDepth(value: Double): this.type = set("groupNestingDepth", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    
    inline def onDidMount(
      value: /* row */ js.UndefOr[
          typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDotbaseMod.DetailsRowBase
        ] => Callback
    ): this.type = set("onDidMount", js.Any.fromFunction1((t0: /* row */ js.UndefOr[
          typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDotbaseMod.DetailsRowBase
        ]) => value(t0).runNow()))
    
    inline def onRenderCheck(value: /* props */ IDetailsRowCheckProps => Element): this.type = set("onRenderCheck", js.Any.fromFunction1(value))
    
    inline def onRenderDetailsCheckbox(
      value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderDetailsCheckbox", js.Any.fromFunction2(value))
    
    inline def onRenderItemColumn(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => Node
    ): this.type = set("onRenderItemColumn", js.Any.fromFunction3(value))
    
    inline def onWillUnmount(
      value: /* row */ js.UndefOr[
          typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDotbaseMod.DetailsRowBase
        ] => Callback
    ): this.type = set("onWillUnmount", js.Any.fromFunction1((t0: /* row */ js.UndefOr[
          typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDotbaseMod.DetailsRowBase
        ]) => value(t0).runNow()))
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rowFieldsAs(value: ComponentType[IDetailsRowFieldsProps]): this.type = set("rowFieldsAs", value.asInstanceOf[js.Any])
    
    inline def rowWidth(value: Double): this.type = set("rowWidth", value.asInstanceOf[js.Any])
    
    inline def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDetailsRowStyleProps => DeepPartial[IDetailsRowStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
    
    inline def useReducedRowRenderer(value: Boolean): this.type = set("useReducedRowRenderer", value.asInstanceOf[js.Any])
    
    inline def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDetailsRowBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
