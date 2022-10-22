package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineBooleans.`false`
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineBooleans.`true`
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.both
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.move
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactCalendarTimelineProps[CustomItem /* <: TimelineItemBase[Any] */, CustomGroup /* <: TimelineGroupBase */] extends StObject {
  
  var buffer: js.UndefOr[Double] = js.undefined
  
  var canChangeGroup: js.UndefOr[Boolean] = js.undefined
  
  var canMove: js.UndefOr[Boolean] = js.undefined
  
  var canResize: js.UndefOr[`false` | `true` | left | right | both] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var clickTolerance: js.UndefOr[Double] = js.undefined
  
  var defaultTimeEnd: js.UndefOr[js.Date | Moment] = js.undefined
  
  var defaultTimeStart: js.UndefOr[js.Date | Moment] = js.undefined
  
  var dragSnap: js.UndefOr[Double] = js.undefined
  
  var groupRenderer: js.UndefOr[js.Function1[/* props */ ReactCalendarGroupRendererProps[CustomGroup], Node]] = js.undefined
  
  var groups: js.Array[CustomGroup]
  
  // Fields that are in propTypes but not documented
  var headerRef: js.UndefOr[Ref[Any]] = js.undefined
  
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
  
  var onBoundsChange: js.UndefOr[js.Function2[/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double, Any]] = js.undefined
  
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
  
  var onItemSelect: js.UndefOr[js.Function3[/* itemId */ Id, /* e */ Any, /* time */ Double, scala.Unit]] = js.undefined
  
  var onTimeChange: js.UndefOr[
    js.Function3[
      /* visibleTimeStart */ Double, 
      /* visibleTimeEnd */ Double, 
      /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit], 
      Any
    ]
  ] = js.undefined
  
  var onZoom: js.UndefOr[js.Function1[/* timelineContext */ TimelineContext, scala.Unit]] = js.undefined
  
  var resizeDetector: js.UndefOr[js.Function1[/* containerResizeDetector */ Any, scala.Unit]] = js.undefined
  
  var rightSidebarContent: js.UndefOr[Node] = js.undefined
  
  var rightSidebarWidth: js.UndefOr[Double] = js.undefined
  
  var scrollRef: js.UndefOr[Ref[Any]] = js.undefined
  
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
  
  inline def apply[CustomItem /* <: TimelineItemBase[Any] */, CustomGroup /* <: TimelineGroupBase */](groups: js.Array[CustomGroup], items: js.Array[CustomItem]): ReactCalendarTimelineProps[CustomItem, CustomGroup] = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCalendarTimelineProps[CustomItem, CustomGroup]]
  }
  
  extension [Self <: ReactCalendarTimelineProps[?, ?], CustomItem /* <: TimelineItemBase[Any] */, CustomGroup /* <: TimelineGroupBase */](x: Self & (ReactCalendarTimelineProps[CustomItem, CustomGroup])) {
    
    inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setCanChangeGroup(value: Boolean): Self = StObject.set(x, "canChangeGroup", value.asInstanceOf[js.Any])
    
    inline def setCanChangeGroupUndefined: Self = StObject.set(x, "canChangeGroup", js.undefined)
    
    inline def setCanMove(value: Boolean): Self = StObject.set(x, "canMove", value.asInstanceOf[js.Any])
    
    inline def setCanMoveUndefined: Self = StObject.set(x, "canMove", js.undefined)
    
    inline def setCanResize(value: `false` | `true` | left | right | both): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
    
    inline def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    inline def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
    
    inline def setDefaultTimeEnd(value: js.Date | Moment): Self = StObject.set(x, "defaultTimeEnd", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeEndUndefined: Self = StObject.set(x, "defaultTimeEnd", js.undefined)
    
    inline def setDefaultTimeStart(value: js.Date | Moment): Self = StObject.set(x, "defaultTimeStart", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeStartUndefined: Self = StObject.set(x, "defaultTimeStart", js.undefined)
    
    inline def setDragSnap(value: Double): Self = StObject.set(x, "dragSnap", value.asInstanceOf[js.Any])
    
    inline def setDragSnapUndefined: Self = StObject.set(x, "dragSnap", js.undefined)
    
    inline def setGroupRenderer(value: /* props */ ReactCalendarGroupRendererProps[CustomGroup] => Node): Self = StObject.set(x, "groupRenderer", js.Any.fromFunction1(value))
    
    inline def setGroupRendererUndefined: Self = StObject.set(x, "groupRenderer", js.undefined)
    
    inline def setGroups(value: js.Array[CustomGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: CustomGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setHeaderRef(value: Ref[Any]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
    
    inline def setHeaderRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "headerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setHeaderRefNull: Self = StObject.set(x, "headerRef", null)
    
    inline def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
    
    inline def setHorizontalLineClassNamesForGroup(value: /* group */ CustomGroup => js.Array[String]): Self = StObject.set(x, "horizontalLineClassNamesForGroup", js.Any.fromFunction1(value))
    
    inline def setHorizontalLineClassNamesForGroupUndefined: Self = StObject.set(x, "horizontalLineClassNamesForGroup", js.undefined)
    
    inline def setItemHeightRatio(value: Double): Self = StObject.set(x, "itemHeightRatio", value.asInstanceOf[js.Any])
    
    inline def setItemHeightRatioUndefined: Self = StObject.set(x, "itemHeightRatio", js.undefined)
    
    inline def setItemRenderer(value: /* props */ ReactCalendarItemRendererProps[CustomItem] => Node): Self = StObject.set(x, "itemRenderer", js.Any.fromFunction1(value))
    
    inline def setItemRendererUndefined: Self = StObject.set(x, "itemRenderer", js.undefined)
    
    inline def setItemTouchSendsClick(value: Boolean): Self = StObject.set(x, "itemTouchSendsClick", value.asInstanceOf[js.Any])
    
    inline def setItemTouchSendsClickUndefined: Self = StObject.set(x, "itemTouchSendsClick", js.undefined)
    
    inline def setItems(value: js.Array[CustomItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CustomItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeys(value: TimelineKeys): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinResizeWidth(value: Double): Self = StObject.set(x, "minResizeWidth", value.asInstanceOf[js.Any])
    
    inline def setMinResizeWidthUndefined: Self = StObject.set(x, "minResizeWidth", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setMoveResizeValidator(
      value: (/* action */ move | resize, /* itemId */ Id, /* time */ Double, /* resizeEdge */ left | right) => Double
    ): Self = StObject.set(x, "moveResizeValidator", js.Any.fromFunction4(value))
    
    inline def setMoveResizeValidatorUndefined: Self = StObject.set(x, "moveResizeValidator", js.undefined)
    
    inline def setOnBoundsChange(value: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => Any): Self = StObject.set(x, "onBoundsChange", js.Any.fromFunction2(value))
    
    inline def setOnBoundsChangeUndefined: Self = StObject.set(x, "onBoundsChange", js.undefined)
    
    inline def setOnCanvasClick(value: (/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element]) => Callback): Self = StObject.set(x, "onCanvasClick", js.Any.fromFunction3((t0: /* groupId */ Id, t1: /* time */ Double, t2: /* e */ ReactEventFrom[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnCanvasClickUndefined: Self = StObject.set(x, "onCanvasClick", js.undefined)
    
    inline def setOnCanvasContextMenu(value: (/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element]) => Callback): Self = StObject.set(x, "onCanvasContextMenu", js.Any.fromFunction3((t0: /* groupId */ Id, t1: /* time */ Double, t2: /* e */ ReactEventFrom[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnCanvasContextMenuUndefined: Self = StObject.set(x, "onCanvasContextMenu", js.undefined)
    
    inline def setOnCanvasDoubleClick(value: (/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element]) => Callback): Self = StObject.set(x, "onCanvasDoubleClick", js.Any.fromFunction3((t0: /* groupId */ Id, t1: /* time */ Double, t2: /* e */ ReactEventFrom[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnCanvasDoubleClickUndefined: Self = StObject.set(x, "onCanvasDoubleClick", js.undefined)
    
    inline def setOnItemClick(value: (/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double) => Callback): Self = StObject.set(x, "onItemClick", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* e */ ReactEventFrom[Element], t2: /* time */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnItemContextMenu(value: (/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double) => Callback): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* e */ ReactEventFrom[Element], t2: /* time */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
    
    inline def setOnItemDeselect(value: /* e */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onItemDeselect", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def setOnItemDeselectUndefined: Self = StObject.set(x, "onItemDeselect", js.undefined)
    
    inline def setOnItemDoubleClick(value: (/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double) => Callback): Self = StObject.set(x, "onItemDoubleClick", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* e */ ReactEventFrom[Element], t2: /* time */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnItemDoubleClickUndefined: Self = StObject.set(x, "onItemDoubleClick", js.undefined)
    
    inline def setOnItemDrag(value: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize => Callback): Self = StObject.set(x, "onItemDrag", js.Any.fromFunction1((t0: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize) => value(t0).runNow()))
    
    inline def setOnItemDragUndefined: Self = StObject.set(x, "onItemDrag", js.undefined)
    
    inline def setOnItemMove(value: (/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double) => Callback): Self = StObject.set(x, "onItemMove", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* dragTime */ Double, t2: /* newGroupOrder */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnItemMoveUndefined: Self = StObject.set(x, "onItemMove", js.undefined)
    
    inline def setOnItemResize(value: (/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right) => Callback): Self = StObject.set(x, "onItemResize", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* endTimeOrStartTime */ Double, t2: /* edge */ left | right) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnItemResizeUndefined: Self = StObject.set(x, "onItemResize", js.undefined)
    
    inline def setOnItemSelect(value: (/* itemId */ Id, /* e */ Any, /* time */ Double) => Callback): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* e */ Any, t2: /* time */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
    
    inline def setOnTimeChange(
      value: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit]) => Any
    ): Self = StObject.set(x, "onTimeChange", js.Any.fromFunction3(value))
    
    inline def setOnTimeChangeUndefined: Self = StObject.set(x, "onTimeChange", js.undefined)
    
    inline def setOnZoom(value: /* timelineContext */ TimelineContext => Callback): Self = StObject.set(x, "onZoom", js.Any.fromFunction1((t0: /* timelineContext */ TimelineContext) => value(t0).runNow()))
    
    inline def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
    
    inline def setResizeDetector(value: /* containerResizeDetector */ Any => Callback): Self = StObject.set(x, "resizeDetector", js.Any.fromFunction1((t0: /* containerResizeDetector */ Any) => value(t0).runNow()))
    
    inline def setResizeDetectorUndefined: Self = StObject.set(x, "resizeDetector", js.undefined)
    
    inline def setRightSidebarContent(value: VdomNode): Self = StObject.set(x, "rightSidebarContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setRightSidebarContentNull: Self = StObject.set(x, "rightSidebarContent", null)
    
    inline def setRightSidebarContentUndefined: Self = StObject.set(x, "rightSidebarContent", js.undefined)
    
    inline def setRightSidebarContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "rightSidebarContent", js.Array(value*))
    
    inline def setRightSidebarContentVdomElement(value: VdomElement): Self = StObject.set(x, "rightSidebarContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRightSidebarWidth(value: Double): Self = StObject.set(x, "rightSidebarWidth", value.asInstanceOf[js.Any])
    
    inline def setRightSidebarWidthUndefined: Self = StObject.set(x, "rightSidebarWidth", js.undefined)
    
    inline def setScrollRef(value: Ref[Any]): Self = StObject.set(x, "scrollRef", value.asInstanceOf[js.Any])
    
    inline def setScrollRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "scrollRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setScrollRefNull: Self = StObject.set(x, "scrollRef", null)
    
    inline def setScrollRefUndefined: Self = StObject.set(x, "scrollRef", js.undefined)
    
    inline def setSelected(value: js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setSidebarContent(value: VdomNode): Self = StObject.set(x, "sidebarContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSidebarContentNull: Self = StObject.set(x, "sidebarContent", null)
    
    inline def setSidebarContentUndefined: Self = StObject.set(x, "sidebarContent", js.undefined)
    
    inline def setSidebarContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "sidebarContent", js.Array(value*))
    
    inline def setSidebarContentVdomElement(value: VdomElement): Self = StObject.set(x, "sidebarContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSidebarWidth(value: Double): Self = StObject.set(x, "sidebarWidth", value.asInstanceOf[js.Any])
    
    inline def setSidebarWidthUndefined: Self = StObject.set(x, "sidebarWidth", js.undefined)
    
    inline def setStackItems(value: Boolean): Self = StObject.set(x, "stackItems", value.asInstanceOf[js.Any])
    
    inline def setStackItemsUndefined: Self = StObject.set(x, "stackItems", js.undefined)
    
    inline def setTimeSteps(value: TimelineTimeSteps): Self = StObject.set(x, "timeSteps", value.asInstanceOf[js.Any])
    
    inline def setTimeStepsUndefined: Self = StObject.set(x, "timeSteps", js.undefined)
    
    inline def setTraditionalZoom(value: Boolean): Self = StObject.set(x, "traditionalZoom", value.asInstanceOf[js.Any])
    
    inline def setTraditionalZoomUndefined: Self = StObject.set(x, "traditionalZoom", js.undefined)
    
    inline def setUseResizeHandle(value: Boolean): Self = StObject.set(x, "useResizeHandle", value.asInstanceOf[js.Any])
    
    inline def setUseResizeHandleUndefined: Self = StObject.set(x, "useResizeHandle", js.undefined)
    
    inline def setVerticalLineClassNamesForTime(value: (/* start */ Double, /* end */ Double) => js.UndefOr[js.Array[String]]): Self = StObject.set(x, "verticalLineClassNamesForTime", js.Any.fromFunction2(value))
    
    inline def setVerticalLineClassNamesForTimeUndefined: Self = StObject.set(x, "verticalLineClassNamesForTime", js.undefined)
    
    inline def setVisibleTimeEnd(value: js.Date | Moment | Double): Self = StObject.set(x, "visibleTimeEnd", value.asInstanceOf[js.Any])
    
    inline def setVisibleTimeEndUndefined: Self = StObject.set(x, "visibleTimeEnd", js.undefined)
    
    inline def setVisibleTimeStart(value: js.Date | Moment | Double): Self = StObject.set(x, "visibleTimeStart", value.asInstanceOf[js.Any])
    
    inline def setVisibleTimeStartUndefined: Self = StObject.set(x, "visibleTimeStart", js.undefined)
  }
}
