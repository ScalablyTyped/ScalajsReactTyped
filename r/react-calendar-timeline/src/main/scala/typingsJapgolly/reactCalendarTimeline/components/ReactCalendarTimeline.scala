package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.reactCalendarTimeline.mod.Id
import typingsJapgolly.reactCalendarTimeline.mod.OnItemDragObjectMove
import typingsJapgolly.reactCalendarTimeline.mod.OnItemDragObjectResize
import typingsJapgolly.reactCalendarTimeline.mod.ReactCalendarGroupRendererProps
import typingsJapgolly.reactCalendarTimeline.mod.ReactCalendarItemRendererProps
import typingsJapgolly.reactCalendarTimeline.mod.ReactCalendarTimelineProps
import typingsJapgolly.reactCalendarTimeline.mod.TimelineContext
import typingsJapgolly.reactCalendarTimeline.mod.TimelineGroupBase
import typingsJapgolly.reactCalendarTimeline.mod.TimelineItemBase
import typingsJapgolly.reactCalendarTimeline.mod.TimelineKeys
import typingsJapgolly.reactCalendarTimeline.mod.TimelineTimeSteps
import typingsJapgolly.reactCalendarTimeline.mod.default
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineBooleans.`false`
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineBooleans.`true`
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.both
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.move
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCalendarTimeline {
  def apply[CustomItem /* <: TimelineItemBase[js.Any] */, CustomGroup /* <: TimelineGroupBase */](
    groups: js.Array[CustomGroup],
    items: js.Array[CustomItem],
    canChangeGroup: js.UndefOr[Boolean] = js.undefined,
    canMove: js.UndefOr[Boolean] = js.undefined,
    canResize: `false` | `true` | left | right | both = null,
    clickTolerance: Int | Double = null,
    defaultTimeEnd: js.Date | Moment = null,
    defaultTimeStart: js.Date | Moment = null,
    dragSnap: Int | Double = null,
    groupRenderer: /* props */ ReactCalendarGroupRendererProps[CustomGroup] => CallbackTo[Node] = null,
    headerRef: Ref = null,
    horizontalLineClassNamesForGroup: CustomGroup => CallbackTo[js.Array[String]] = null,
    itemHeightRatio: Int | Double = null,
    itemRenderer: /* props */ ReactCalendarItemRendererProps[CustomItem] => CallbackTo[Node] = null,
    itemTouchSendsClick: js.UndefOr[Boolean] = js.undefined,
    keys: TimelineKeys = null,
    lineHeight: Int | Double = null,
    maxZoom: Int | Double = null,
    minResizeWidth: Int | Double = null,
    minZoom: Int | Double = null,
    moveResizeValidator: (/* action */ move | resize, /* itemId */ Id, /* time */ Double, /* resizeEdge */ left | right) => CallbackTo[Double] = null,
    onBoundsChange: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => CallbackTo[js.Any] = null,
    onCanvasClick: (/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element]) => Callback = null,
    onCanvasContextMenu: (/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element]) => Callback = null,
    onCanvasDoubleClick: (/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element]) => Callback = null,
    onItemClick: (/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double) => Callback = null,
    onItemContextMenu: (/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double) => Callback = null,
    onItemDeselect: /* e */ ReactEventFrom[Element] => Callback = null,
    onItemDoubleClick: (/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double) => Callback = null,
    onItemDrag: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize => Callback = null,
    onItemMove: (/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double) => Callback = null,
    onItemResize: (/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right) => Callback = null,
    onItemSelect: (/* itemId */ Id, /* e */ js.Any, /* time */ Double) => Callback = null,
    onTimeChange: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, Unit]) => CallbackTo[js.Any] = null,
    onZoom: /* timelineContext */ TimelineContext => Callback = null,
    resizeDetector: /* containerResizeDetector */ js.Any => Callback = null,
    rightSidebarContent: VdomNode = null,
    rightSidebarWidth: Int | Double = null,
    scrollRef: Ref = null,
    selected: js.Array[Double] = null,
    sidebarContent: VdomNode = null,
    sidebarWidth: Int | Double = null,
    stackItems: js.UndefOr[Boolean] = js.undefined,
    timeSteps: TimelineTimeSteps = null,
    traditionalZoom: js.UndefOr[Boolean] = js.undefined,
    useResizeHandle: js.UndefOr[Boolean] = js.undefined,
    verticalLineClassNamesForTime: (/* start */ Double, /* end */ Double) => CallbackTo[js.UndefOr[js.Array[String]]] = null,
    visibleTimeEnd: js.Date | Moment | Double = null,
    visibleTimeStart: js.Date | Moment | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ReactCalendarTimelineProps[CustomItem, CustomGroup], 
    default[CustomItem, CustomGroup], 
    Unit, 
    ReactCalendarTimelineProps[CustomItem, CustomGroup]
  ] = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
  
      if (!js.isUndefined(canChangeGroup)) __obj.updateDynamic("canChangeGroup")(canChangeGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(canMove)) __obj.updateDynamic("canMove")(canMove.asInstanceOf[js.Any])
    if (canResize != null) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (clickTolerance != null) __obj.updateDynamic("clickTolerance")(clickTolerance.asInstanceOf[js.Any])
    if (defaultTimeEnd != null) __obj.updateDynamic("defaultTimeEnd")(defaultTimeEnd.asInstanceOf[js.Any])
    if (defaultTimeStart != null) __obj.updateDynamic("defaultTimeStart")(defaultTimeStart.asInstanceOf[js.Any])
    if (dragSnap != null) __obj.updateDynamic("dragSnap")(dragSnap.asInstanceOf[js.Any])
    if (groupRenderer != null) __obj.updateDynamic("groupRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactCalendarTimeline.mod.ReactCalendarGroupRendererProps[CustomGroup]) => groupRenderer(t0).runNow()))
    if (headerRef != null) __obj.updateDynamic("headerRef")(headerRef.asInstanceOf[js.Any])
    if (horizontalLineClassNamesForGroup != null) __obj.updateDynamic("horizontalLineClassNamesForGroup")(js.Any.fromFunction1((t0: CustomGroup) => horizontalLineClassNamesForGroup(t0).runNow()))
    if (itemHeightRatio != null) __obj.updateDynamic("itemHeightRatio")(itemHeightRatio.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactCalendarTimeline.mod.ReactCalendarItemRendererProps[CustomItem]) => itemRenderer(t0).runNow()))
    if (!js.isUndefined(itemTouchSendsClick)) __obj.updateDynamic("itemTouchSendsClick")(itemTouchSendsClick.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minResizeWidth != null) __obj.updateDynamic("minResizeWidth")(minResizeWidth.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (moveResizeValidator != null) __obj.updateDynamic("moveResizeValidator")(js.Any.fromFunction4((t0: /* action */ typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.move | typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.resize, t1: /* itemId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t2: /* time */ scala.Double, t3: /* resizeEdge */ typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left | typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right) => moveResizeValidator(t0, t1, t2, t3).runNow()))
    if (onBoundsChange != null) __obj.updateDynamic("onBoundsChange")(js.Any.fromFunction2((t0: /* canvasTimeStart */ scala.Double, t1: /* canvasTimeEnd */ scala.Double) => onBoundsChange(t0, t1).runNow()))
    if (onCanvasClick != null) __obj.updateDynamic("onCanvasClick")(js.Any.fromFunction3((t0: /* groupId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t1: /* time */ scala.Double, t2: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onCanvasClick(t0, t1, t2).runNow()))
    if (onCanvasContextMenu != null) __obj.updateDynamic("onCanvasContextMenu")(js.Any.fromFunction3((t0: /* groupId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t1: /* time */ scala.Double, t2: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onCanvasContextMenu(t0, t1, t2).runNow()))
    if (onCanvasDoubleClick != null) __obj.updateDynamic("onCanvasDoubleClick")(js.Any.fromFunction3((t0: /* groupId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t1: /* time */ scala.Double, t2: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onCanvasDoubleClick(t0, t1, t2).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction3((t0: /* itemId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t1: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t2: /* time */ scala.Double) => onItemClick(t0, t1, t2).runNow()))
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction3((t0: /* itemId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t1: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t2: /* time */ scala.Double) => onItemContextMenu(t0, t1, t2).runNow()))
    if (onItemDeselect != null) __obj.updateDynamic("onItemDeselect")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onItemDeselect(t0).runNow()))
    if (onItemDoubleClick != null) __obj.updateDynamic("onItemDoubleClick")(js.Any.fromFunction3((t0: /* itemId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t1: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t2: /* time */ scala.Double) => onItemDoubleClick(t0, t1, t2).runNow()))
    if (onItemDrag != null) __obj.updateDynamic("onItemDrag")(js.Any.fromFunction1((t0: /* itemDragObject */ typingsJapgolly.reactCalendarTimeline.mod.OnItemDragObjectMove | typingsJapgolly.reactCalendarTimeline.mod.OnItemDragObjectResize) => onItemDrag(t0).runNow()))
    if (onItemMove != null) __obj.updateDynamic("onItemMove")(js.Any.fromFunction3((t0: /* itemId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t1: /* dragTime */ scala.Double, t2: /* newGroupOrder */ scala.Double) => onItemMove(t0, t1, t2).runNow()))
    if (onItemResize != null) __obj.updateDynamic("onItemResize")(js.Any.fromFunction3((t0: /* itemId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t1: /* endTimeOrStartTime */ scala.Double, t2: /* edge */ typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left | typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right) => onItemResize(t0, t1, t2).runNow()))
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction3((t0: /* itemId */ typingsJapgolly.reactCalendarTimeline.mod.Id, t1: /* e */ js.Any, t2: /* time */ scala.Double) => onItemSelect(t0, t1, t2).runNow()))
    if (onTimeChange != null) __obj.updateDynamic("onTimeChange")(js.Any.fromFunction3((t0: /* visibleTimeStart */ scala.Double, t1: /* visibleTimeEnd */ scala.Double, t2: /* updateScrollCanvas */ js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]) => onTimeChange(t0, t1, t2).runNow()))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1((t0: /* timelineContext */ typingsJapgolly.reactCalendarTimeline.mod.TimelineContext) => onZoom(t0).runNow()))
    if (resizeDetector != null) __obj.updateDynamic("resizeDetector")(js.Any.fromFunction1((t0: /* containerResizeDetector */ js.Any) => resizeDetector(t0).runNow()))
    if (rightSidebarContent != null) __obj.updateDynamic("rightSidebarContent")(rightSidebarContent.rawNode.asInstanceOf[js.Any])
    if (rightSidebarWidth != null) __obj.updateDynamic("rightSidebarWidth")(rightSidebarWidth.asInstanceOf[js.Any])
    if (scrollRef != null) __obj.updateDynamic("scrollRef")(scrollRef.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (sidebarContent != null) __obj.updateDynamic("sidebarContent")(sidebarContent.rawNode.asInstanceOf[js.Any])
    if (sidebarWidth != null) __obj.updateDynamic("sidebarWidth")(sidebarWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(stackItems)) __obj.updateDynamic("stackItems")(stackItems.asInstanceOf[js.Any])
    if (timeSteps != null) __obj.updateDynamic("timeSteps")(timeSteps.asInstanceOf[js.Any])
    if (!js.isUndefined(traditionalZoom)) __obj.updateDynamic("traditionalZoom")(traditionalZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(useResizeHandle)) __obj.updateDynamic("useResizeHandle")(useResizeHandle.asInstanceOf[js.Any])
    if (verticalLineClassNamesForTime != null) __obj.updateDynamic("verticalLineClassNamesForTime")(js.Any.fromFunction2((t0: /* start */ scala.Double, t1: /* end */ scala.Double) => verticalLineClassNamesForTime(t0, t1).runNow()))
    if (visibleTimeEnd != null) __obj.updateDynamic("visibleTimeEnd")(visibleTimeEnd.asInstanceOf[js.Any])
    if (visibleTimeStart != null) __obj.updateDynamic("visibleTimeStart")(visibleTimeStart.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCalendarTimeline.mod.ReactCalendarTimelineProps[CustomItem, CustomGroup], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCalendarTimeline.mod.default[CustomItem, CustomGroup]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCalendarTimeline.mod.ReactCalendarTimelineProps[CustomItem, CustomGroup]])(children: _*)
  }
  @JSImport("react-calendar-timeline", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

