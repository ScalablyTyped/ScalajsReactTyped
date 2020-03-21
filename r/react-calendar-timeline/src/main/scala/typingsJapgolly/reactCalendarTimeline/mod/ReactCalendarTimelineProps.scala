package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.moment.mod.Moment
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

trait ReactCalendarTimelineProps[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] extends js.Object {
  var canChangeGroup: js.UndefOr[Boolean] = js.undefined
  var canMove: js.UndefOr[Boolean] = js.undefined
  var canResize: js.UndefOr[`false` | `true` | left | right | both] = js.undefined
  var clickTolerance: js.UndefOr[Double] = js.undefined
  var defaultTimeEnd: js.UndefOr[js.Date | Moment] = js.undefined
  var defaultTimeStart: js.UndefOr[js.Date | Moment] = js.undefined
  var dragSnap: js.UndefOr[Double] = js.undefined
  var groupRenderer: js.UndefOr[js.Function1[/* props */ ReactCalendarGroupRendererProps[CustomGroup], Node]] = js.undefined
  var groups: js.Array[CustomGroup]
  // Fields that are in propTypes but not documented
  var headerRef: js.UndefOr[Ref] = js.undefined
  var horizontalLineClassNamesForGroup: js.UndefOr[js.Function1[/* group */ CustomGroup, js.Array[String]]] = js.undefined
  var itemHeightRatio: js.UndefOr[Double] = js.undefined
  var itemRenderer: js.UndefOr[js.Function1[/* props */ ReactCalendarItemRendererProps[CustomItem], Node]] = js.undefined
  var itemTouchSendsClick: js.UndefOr[Boolean] = js.undefined
  var items: js.Array[CustomItem]
  var keys: js.UndefOr[TimelineKeys] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResizeWidth: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var moveResizeValidator: js.UndefOr[
    js.Function4[
      /* action */ move | resize, 
      /* itemId */ Id, 
      /* time */ Double, 
      /* resizeEdge */ left | right, 
      Double
    ]
  ] = js.undefined
  var onBoundsChange: js.UndefOr[js.Function2[/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double, _]] = js.undefined
  var onCanvasClick: js.UndefOr[
    js.Function3[/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element], scala.Unit]
  ] = js.undefined
  var onCanvasContextMenu: js.UndefOr[
    js.Function3[/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element], scala.Unit]
  ] = js.undefined
  var onCanvasDoubleClick: js.UndefOr[
    js.Function3[/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element], scala.Unit]
  ] = js.undefined
  var onItemClick: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double, scala.Unit]
  ] = js.undefined
  var onItemContextMenu: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double, scala.Unit]
  ] = js.undefined
  var onItemDeselect: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], scala.Unit]] = js.undefined
  var onItemDoubleClick: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double, scala.Unit]
  ] = js.undefined
  var onItemDrag: js.UndefOr[
    js.Function1[/* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize, scala.Unit]
  ] = js.undefined
  var onItemMove: js.UndefOr[
    js.Function3[/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double, scala.Unit]
  ] = js.undefined
  var onItemResize: js.UndefOr[
    js.Function3[/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right, scala.Unit]
  ] = js.undefined
  var onItemSelect: js.UndefOr[js.Function3[/* itemId */ Id, /* e */ js.Any, /* time */ Double, scala.Unit]] = js.undefined
  var onTimeChange: js.UndefOr[
    js.Function3[
      /* visibleTimeStart */ Double, 
      /* visibleTimeEnd */ Double, 
      /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit], 
      _
    ]
  ] = js.undefined
  var onZoom: js.UndefOr[js.Function1[/* timelineContext */ TimelineContext, scala.Unit]] = js.undefined
  var resizeDetector: js.UndefOr[js.Function1[/* containerResizeDetector */ js.Any, scala.Unit]] = js.undefined
  var rightSidebarContent: js.UndefOr[Node] = js.undefined
  var rightSidebarWidth: js.UndefOr[Double] = js.undefined
  var scrollRef: js.UndefOr[Ref] = js.undefined
  var selected: js.UndefOr[js.Array[Double]] = js.undefined
  var sidebarContent: js.UndefOr[Node] = js.undefined
  var sidebarWidth: js.UndefOr[Double] = js.undefined
  var stackItems: js.UndefOr[Boolean] = js.undefined
  var timeSteps: js.UndefOr[TimelineTimeSteps] = js.undefined
  var traditionalZoom: js.UndefOr[Boolean] = js.undefined
  var useResizeHandle: js.UndefOr[Boolean] = js.undefined
  var verticalLineClassNamesForTime: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, js.UndefOr[js.Array[String]]]] = js.undefined
  var visibleTimeEnd: js.UndefOr[js.Date | Moment | Double] = js.undefined
  var visibleTimeStart: js.UndefOr[js.Date | Moment | Double] = js.undefined
}

object ReactCalendarTimelineProps {
  @scala.inline
  def apply[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */](
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
    horizontalLineClassNamesForGroup: /* group */ CustomGroup => CallbackTo[js.Array[String]] = null,
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
    onTimeChange: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit]) => CallbackTo[js.Any] = null,
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
    visibleTimeStart: js.Date | Moment | Double = null
  ): ReactCalendarTimelineProps[CustomItem, CustomGroup] = {
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
    if (horizontalLineClassNamesForGroup != null) __obj.updateDynamic("horizontalLineClassNamesForGroup")(js.Any.fromFunction1((t0: /* group */ CustomGroup) => horizontalLineClassNamesForGroup(t0).runNow()))
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
    __obj.asInstanceOf[ReactCalendarTimelineProps[CustomItem, CustomGroup]]
  }
}

