package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.IFocusZoneProps
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupRenderProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedList
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedListProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedListStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedListStyles
import typingsJapgolly.officeUiFabricReact.libComponentsListListDottypesMod.IListProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GroupedListBase {
  
  inline def apply(
    items: js.Array[Any],
    onRenderCell: (js.UndefOr[Double | Unit], js.UndefOr[Any | Unit], js.UndefOr[Double]) => Node
  ): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onRenderCell = js.Any.fromFunction3(onRenderCell))
    new Builder(js.Array(this.component, __props.asInstanceOf[IGroupedListProps]))
  }
  
  @JSImport("office-ui-fabric-react", "GroupedListBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.GroupedListBase] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IGroupedList]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IGroupedList | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IGroupedList | Null) => value(t0).runNow()))
    
    inline def dragDropEvents(value: IDragDropEvents): this.type = set("dragDropEvents", value.asInstanceOf[js.Any])
    
    inline def dragDropHelper(value: IDragDropHelper): this.type = set("dragDropHelper", value.asInstanceOf[js.Any])
    
    inline def eventsToRegister(value: js.Array[typingsJapgolly.officeUiFabricReact.anon.Callback]): this.type = set("eventsToRegister", value.asInstanceOf[js.Any])
    
    inline def eventsToRegisterVarargs(value: typingsJapgolly.officeUiFabricReact.anon.Callback*): this.type = set("eventsToRegister", js.Array(value*))
    
    inline def focusZoneProps(value: IFocusZoneProps): this.type = set("focusZoneProps", value.asInstanceOf[js.Any])
    
    inline def getGroupHeight(value: (/* group */ IGroup, /* groupIndex */ Double) => Double): this.type = set("getGroupHeight", js.Any.fromFunction2(value))
    
    inline def groupProps(value: IGroupRenderProps): this.type = set("groupProps", value.asInstanceOf[js.Any])
    
    inline def groups(value: js.Array[IGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
    
    inline def groupsVarargs(value: IGroup*): this.type = set("groups", js.Array(value*))
    
    inline def listProps(value: IListProps[Any]): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    inline def onGroupExpandStateChanged(value: /* isSomeGroupExpanded */ Boolean => Callback): this.type = set("onGroupExpandStateChanged", js.Any.fromFunction1((t0: /* isSomeGroupExpanded */ Boolean) => value(t0).runNow()))
    
    inline def onShouldVirtualize(value: /* props */ IListProps[Any] => Boolean): this.type = set("onShouldVirtualize", js.Any.fromFunction1(value))
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rootListProps(value: IListProps[Any]): this.type = set("rootListProps", value.asInstanceOf[js.Any])
    
    inline def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IGroupedListStyleProps, IGroupedListStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IGroupedListStyleProps => DeepPartial[IGroupedListStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def usePageCache(value: Boolean): this.type = set("usePageCache", value.asInstanceOf[js.Any])
    
    inline def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGroupedListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
