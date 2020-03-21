package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.AnonCallback
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupedList
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupedListStyleProps
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupedListStyles
import typingsJapgolly.officeUiFabricReact.listTypesMod.IListProps
import typingsJapgolly.officeUiFabricReact.withViewportMod.IViewport
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupedListBase {
  def apply(
    items: js.Array[_],
    onRenderCell: (js.UndefOr[Double], js.UndefOr[js.Any], js.UndefOr[Double]) => CallbackTo[Node],
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[IGroupedList] = null,
    dragDropEvents: IDragDropEvents = null,
    dragDropHelper: IDragDropHelper = null,
    eventsToRegister: js.Array[AnonCallback] = null,
    getGroupHeight: (/* group */ IGroup, /* groupIndex */ Double) => CallbackTo[Double] = null,
    groupProps: IGroupRenderProps = null,
    groups: js.Array[IGroup] = null,
    listProps: IListProps[_] = null,
    onGroupExpandStateChanged: /* isSomeGroupExpanded */ Boolean => Callback = null,
    onShouldVirtualize: /* props */ IListProps[js.Any] => CallbackTo[Boolean] = null,
    selection: ISelection[IObjectWithKey] = null,
    selectionMode: SelectionMode = null,
    styles: IStyleFunctionOrObject[IGroupedListStyleProps, IGroupedListStyles] = null,
    theme: ITheme = null,
    usePageCache: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IGroupedListProps, 
    typingsJapgolly.officeUiFabricReact.mod.GroupedListBase, 
    Unit, 
    IGroupedListProps
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onRenderCell")(js.Any.fromFunction3((t0: js.UndefOr[scala.Double], t1: js.UndefOr[js.Any], t2: js.UndefOr[scala.Double]) => onRenderCell(t0, t1, t2).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dragDropEvents != null) __obj.updateDynamic("dragDropEvents")(dragDropEvents.asInstanceOf[js.Any])
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper.asInstanceOf[js.Any])
    if (eventsToRegister != null) __obj.updateDynamic("eventsToRegister")(eventsToRegister.asInstanceOf[js.Any])
    if (getGroupHeight != null) __obj.updateDynamic("getGroupHeight")(js.Any.fromFunction2((t0: /* group */ typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroup, t1: /* groupIndex */ scala.Double) => getGroupHeight(t0, t1).runNow()))
    if (groupProps != null) __obj.updateDynamic("groupProps")(groupProps.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (onGroupExpandStateChanged != null) __obj.updateDynamic("onGroupExpandStateChanged")(js.Any.fromFunction1((t0: /* isSomeGroupExpanded */ scala.Boolean) => onGroupExpandStateChanged(t0).runNow()))
    if (onShouldVirtualize != null) __obj.updateDynamic("onShouldVirtualize")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.listTypesMod.IListProps[js.Any]) => onShouldVirtualize(t0).runNow()))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(usePageCache)) __obj.updateDynamic("usePageCache")(usePageCache.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupedListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.GroupedListBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupedListProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "GroupedListBase")
  @js.native
  object componentImport extends js.Object
  
}

