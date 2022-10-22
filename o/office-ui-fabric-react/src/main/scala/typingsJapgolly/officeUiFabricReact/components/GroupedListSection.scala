package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupFooterDottypesMod.IGroupFooterProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupHeaderDottypesMod.IGroupHeaderProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupShowAllDottypesMod.IGroupShowAllProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupRenderProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedListStyles
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListSectionMod.IGroupedListSectionProps
import typingsJapgolly.officeUiFabricReact.libComponentsListListDottypesMod.IListProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libIstylesetMod.IProcessedStyleSet
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GroupedListSection {
  
  inline def apply(
    items: js.Array[Any],
    onRenderCell: (js.UndefOr[Double | Unit], js.UndefOr[Any | Unit], js.UndefOr[Double]) => Node
  ): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onRenderCell = js.Any.fromFunction3(onRenderCell))
    new Builder(js.Array(this.component, __props.asInstanceOf[IGroupedListSectionProps]))
  }
  
  @JSImport("office-ui-fabric-react", "GroupedListSection")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.GroupedListSection] {
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: Callback): this.type = set("componentRef", value.toJsFn)
    
    inline def dragDropEvents(value: IDragDropEvents): this.type = set("dragDropEvents", value.asInstanceOf[js.Any])
    
    inline def dragDropHelper(value: IDragDropHelper): this.type = set("dragDropHelper", value.asInstanceOf[js.Any])
    
    inline def eventsToRegister(value: js.Array[typingsJapgolly.officeUiFabricReact.anon.Callback]): this.type = set("eventsToRegister", value.asInstanceOf[js.Any])
    
    inline def eventsToRegisterVarargs(value: typingsJapgolly.officeUiFabricReact.anon.Callback*): this.type = set("eventsToRegister", js.Array(value*))
    
    inline def footerProps(value: IGroupFooterProps): this.type = set("footerProps", value.asInstanceOf[js.Any])
    
    inline def getGroupItemLimit(value: /* group */ IGroup => Double): this.type = set("getGroupItemLimit", js.Any.fromFunction1(value))
    
    inline def group(value: IGroup): this.type = set("group", value.asInstanceOf[js.Any])
    
    inline def groupIndex(value: Double): this.type = set("groupIndex", value.asInstanceOf[js.Any])
    
    inline def groupNestingDepth(value: Double): this.type = set("groupNestingDepth", value.asInstanceOf[js.Any])
    
    inline def groupProps(value: IGroupRenderProps): this.type = set("groupProps", value.asInstanceOf[js.Any])
    
    inline def groupedListClassNames(value: IProcessedStyleSet[IGroupedListStyles]): this.type = set("groupedListClassNames", value.asInstanceOf[js.Any])
    
    inline def groups(value: js.Array[IGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
    
    inline def groupsVarargs(value: IGroup*): this.type = set("groups", js.Array(value*))
    
    inline def headerProps(value: IGroupHeaderProps): this.type = set("headerProps", value.asInstanceOf[js.Any])
    
    inline def listProps(value: IListProps[Any]): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    inline def onRenderGroupFooter(
      value: (/* props */ js.UndefOr[IGroupFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupFooterProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderGroupFooter", js.Any.fromFunction2(value))
    
    inline def onRenderGroupHeader(
      value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderGroupHeader", js.Any.fromFunction2(value))
    
    inline def onRenderGroupShowAll(
      value: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupShowAllProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderGroupShowAll", js.Any.fromFunction2(value))
    
    inline def onShouldVirtualize(value: /* props */ IListProps[Any] => Boolean): this.type = set("onShouldVirtualize", js.Any.fromFunction1(value))
    
    inline def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def showAllProps(value: IGroupShowAllProps): this.type = set("showAllProps", value.asInstanceOf[js.Any])
    
    inline def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGroupedListSectionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
