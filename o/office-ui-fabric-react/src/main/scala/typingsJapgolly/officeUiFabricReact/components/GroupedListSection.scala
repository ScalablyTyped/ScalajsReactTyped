package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.AnonCallback
import typingsJapgolly.officeUiFabricReact.IClassNamesIGroupedListSt
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typingsJapgolly.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsJapgolly.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typingsJapgolly.officeUiFabricReact.groupedListSectionMod.IGroupedListSectionProps
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typingsJapgolly.officeUiFabricReact.listTypesMod.IListProps
import typingsJapgolly.officeUiFabricReact.withViewportMod.IViewport
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupedListSection {
  def apply(
    items: js.Array[_],
    onRenderCell: (js.UndefOr[Double], js.UndefOr[js.Any], js.UndefOr[Double]) => CallbackTo[Node],
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: js.UndefOr[Callback] = js.undefined,
    dragDropEvents: IDragDropEvents = null,
    dragDropHelper: IDragDropHelper = null,
    eventsToRegister: js.Array[AnonCallback] = null,
    footerProps: IGroupFooterProps = null,
    getGroupItemLimit: /* group */ IGroup => CallbackTo[Double] = null,
    group: IGroup = null,
    groupIndex: Int | Double = null,
    groupNestingDepth: Int | Double = null,
    groupProps: IGroupRenderProps = null,
    groupedListClassNames: IClassNamesIGroupedListSt = null,
    groups: js.Array[IGroup] = null,
    headerProps: IGroupHeaderProps = null,
    listProps: IListProps[_] = null,
    onRenderGroupFooter: (/* props */ js.UndefOr[IGroupFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupFooterProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderGroupHeader: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderGroupShowAll: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupShowAllProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onShouldVirtualize: /* props */ IListProps[js.Any] => CallbackTo[Boolean] = null,
    selection: ISelection[IObjectWithKey] = null,
    selectionMode: SelectionMode = null,
    showAllProps: IGroupShowAllProps = null,
    viewport: IViewport = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IGroupedListSectionProps, 
    typingsJapgolly.officeUiFabricReact.groupedListSectionMod.GroupedListSection, 
    Unit, 
    IGroupedListSectionProps
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onRenderCell")(js.Any.fromFunction3((t0: js.UndefOr[scala.Double], t1: js.UndefOr[js.Any], t2: js.UndefOr[scala.Double]) => onRenderCell(t0, t1, t2).runNow()))
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    componentRef.foreach(p => __obj.updateDynamic("componentRef")(p.toJsFn))
    if (dragDropEvents != null) __obj.updateDynamic("dragDropEvents")(dragDropEvents.asInstanceOf[js.Any])
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper.asInstanceOf[js.Any])
    if (eventsToRegister != null) __obj.updateDynamic("eventsToRegister")(eventsToRegister.asInstanceOf[js.Any])
    if (footerProps != null) __obj.updateDynamic("footerProps")(footerProps.asInstanceOf[js.Any])
    if (getGroupItemLimit != null) __obj.updateDynamic("getGroupItemLimit")(js.Any.fromFunction1((t0: /* group */ typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup) => getGroupItemLimit(t0).runNow()))
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (groupProps != null) __obj.updateDynamic("groupProps")(groupProps.asInstanceOf[js.Any])
    if (groupedListClassNames != null) __obj.updateDynamic("groupedListClassNames")(groupedListClassNames.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (headerProps != null) __obj.updateDynamic("headerProps")(headerProps.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (onRenderGroupFooter != null) __obj.updateDynamic("onRenderGroupFooter")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderGroupFooter(t0, t1).runNow()))
    if (onRenderGroupHeader != null) __obj.updateDynamic("onRenderGroupHeader")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderGroupHeader(t0, t1).runNow()))
    if (onRenderGroupShowAll != null) __obj.updateDynamic("onRenderGroupShowAll")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderGroupShowAll(t0, t1).runNow()))
    if (onShouldVirtualize != null) __obj.updateDynamic("onShouldVirtualize")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.listTypesMod.IListProps[js.Any]) => onShouldVirtualize(t0).runNow()))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showAllProps != null) __obj.updateDynamic("showAllProps")(showAllProps.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.groupedListSectionMod.IGroupedListSectionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.groupedListSectionMod.GroupedListSection](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.groupedListSectionMod.IGroupedListSectionProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedListSection", "GroupedListSection")
  @js.native
  object componentImport extends js.Object
  
}

