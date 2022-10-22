package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.react.mod.Ref
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCalendarTimeline {
  
  inline def apply[CustomItem /* <: TimelineItemBase[Any] */, CustomGroup /* <: TimelineGroupBase */](groups: js.Array[CustomGroup], items: js.Array[CustomItem]): Builder[CustomItem, CustomGroup] = {
    val __props = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    new Builder[CustomItem, CustomGroup](js.Array(this.component, __props.asInstanceOf[ReactCalendarTimelineProps[CustomItem, CustomGroup]]))
  }
  
  @JSImport("react-calendar-timeline", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[CustomItem /* <: TimelineItemBase[Any] */, CustomGroup /* <: TimelineGroupBase */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[CustomItem, CustomGroup]] {
    
    inline def buffer(value: Double): this.type = set("buffer", value.asInstanceOf[js.Any])
    
    inline def canChangeGroup(value: Boolean): this.type = set("canChangeGroup", value.asInstanceOf[js.Any])
    
    inline def canMove(value: Boolean): this.type = set("canMove", value.asInstanceOf[js.Any])
    
    inline def canResize(value: `false` | `true` | left | right | both): this.type = set("canResize", value.asInstanceOf[js.Any])
    
    inline def clickTolerance(value: Double): this.type = set("clickTolerance", value.asInstanceOf[js.Any])
    
    inline def defaultTimeEnd(value: js.Date | Moment): this.type = set("defaultTimeEnd", value.asInstanceOf[js.Any])
    
    inline def defaultTimeStart(value: js.Date | Moment): this.type = set("defaultTimeStart", value.asInstanceOf[js.Any])
    
    inline def dragSnap(value: Double): this.type = set("dragSnap", value.asInstanceOf[js.Any])
    
    inline def groupRenderer(value: /* props */ ReactCalendarGroupRendererProps[CustomGroup] => Node): this.type = set("groupRenderer", js.Any.fromFunction1(value))
    
    inline def headerRef(value: Ref[Any]): this.type = set("headerRef", value.asInstanceOf[js.Any])
    
    inline def headerRefFunction1(value: Any | Null => Callback): this.type = set("headerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def headerRefNull: this.type = set("headerRef", null)
    
    inline def horizontalLineClassNamesForGroup(value: CustomGroup => js.Array[String]): this.type = set("horizontalLineClassNamesForGroup", js.Any.fromFunction1(value))
    
    inline def itemHeightRatio(value: Double): this.type = set("itemHeightRatio", value.asInstanceOf[js.Any])
    
    inline def itemRenderer(value: /* props */ ReactCalendarItemRendererProps[CustomItem] => Node): this.type = set("itemRenderer", js.Any.fromFunction1(value))
    
    inline def itemTouchSendsClick(value: Boolean): this.type = set("itemTouchSendsClick", value.asInstanceOf[js.Any])
    
    inline def keys(value: TimelineKeys): this.type = set("keys", value.asInstanceOf[js.Any])
    
    inline def lineHeight(value: Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    inline def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
    
    inline def minResizeWidth(value: Double): this.type = set("minResizeWidth", value.asInstanceOf[js.Any])
    
    inline def minZoom(value: Double): this.type = set("minZoom", value.asInstanceOf[js.Any])
    
    inline def moveResizeValidator(
      value: (/* action */ move | resize, /* itemId */ Id, /* time */ Double, /* resizeEdge */ left | right) => Double
    ): this.type = set("moveResizeValidator", js.Any.fromFunction4(value))
    
    inline def onBoundsChange(value: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => Any): this.type = set("onBoundsChange", js.Any.fromFunction2(value))
    
    inline def onCanvasClick(value: (/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element]) => Callback): this.type = set("onCanvasClick", js.Any.fromFunction3((t0: /* groupId */ Id, t1: /* time */ Double, t2: /* e */ ReactEventFrom[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onCanvasContextMenu(value: (/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element]) => Callback): this.type = set("onCanvasContextMenu", js.Any.fromFunction3((t0: /* groupId */ Id, t1: /* time */ Double, t2: /* e */ ReactEventFrom[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onCanvasDoubleClick(value: (/* groupId */ Id, /* time */ Double, /* e */ ReactEventFrom[Element]) => Callback): this.type = set("onCanvasDoubleClick", js.Any.fromFunction3((t0: /* groupId */ Id, t1: /* time */ Double, t2: /* e */ ReactEventFrom[Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def onItemClick(value: (/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double) => Callback): this.type = set("onItemClick", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* e */ ReactEventFrom[Element], t2: /* time */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onItemContextMenu(value: (/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double) => Callback): this.type = set("onItemContextMenu", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* e */ ReactEventFrom[Element], t2: /* time */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onItemDeselect(value: /* e */ ReactEventFrom[Element] => Callback): this.type = set("onItemDeselect", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onItemDoubleClick(value: (/* itemId */ Id, /* e */ ReactEventFrom[Element], /* time */ Double) => Callback): this.type = set("onItemDoubleClick", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* e */ ReactEventFrom[Element], t2: /* time */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onItemDrag(value: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize => Callback): this.type = set("onItemDrag", js.Any.fromFunction1((t0: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize) => value(t0).runNow()))
    
    inline def onItemMove(value: (/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double) => Callback): this.type = set("onItemMove", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* dragTime */ Double, t2: /* newGroupOrder */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onItemResize(value: (/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right) => Callback): this.type = set("onItemResize", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* endTimeOrStartTime */ Double, t2: /* edge */ left | right) => (value(t0, t1, t2)).runNow()))
    
    inline def onItemSelect(value: (/* itemId */ Id, /* e */ Any, /* time */ Double) => Callback): this.type = set("onItemSelect", js.Any.fromFunction3((t0: /* itemId */ Id, t1: /* e */ Any, t2: /* time */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onTimeChange(
      value: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, Unit]) => Any
    ): this.type = set("onTimeChange", js.Any.fromFunction3(value))
    
    inline def onZoom(value: /* timelineContext */ TimelineContext => Callback): this.type = set("onZoom", js.Any.fromFunction1((t0: /* timelineContext */ TimelineContext) => value(t0).runNow()))
    
    inline def resizeDetector(value: /* containerResizeDetector */ Any => Callback): this.type = set("resizeDetector", js.Any.fromFunction1((t0: /* containerResizeDetector */ Any) => value(t0).runNow()))
    
    inline def rightSidebarContent(value: VdomNode): this.type = set("rightSidebarContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def rightSidebarContentNull: this.type = set("rightSidebarContent", null)
    
    inline def rightSidebarContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("rightSidebarContent", js.Array(value*))
    
    inline def rightSidebarContentVdomElement(value: VdomElement): this.type = set("rightSidebarContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def rightSidebarWidth(value: Double): this.type = set("rightSidebarWidth", value.asInstanceOf[js.Any])
    
    inline def scrollRef(value: Ref[Any]): this.type = set("scrollRef", value.asInstanceOf[js.Any])
    
    inline def scrollRefFunction1(value: Any | Null => Callback): this.type = set("scrollRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def scrollRefNull: this.type = set("scrollRef", null)
    
    inline def selected(value: js.Array[Double]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectedVarargs(value: Double*): this.type = set("selected", js.Array(value*))
    
    inline def sidebarContent(value: VdomNode): this.type = set("sidebarContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def sidebarContentNull: this.type = set("sidebarContent", null)
    
    inline def sidebarContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("sidebarContent", js.Array(value*))
    
    inline def sidebarContentVdomElement(value: VdomElement): this.type = set("sidebarContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def sidebarWidth(value: Double): this.type = set("sidebarWidth", value.asInstanceOf[js.Any])
    
    inline def stackItems(value: Boolean): this.type = set("stackItems", value.asInstanceOf[js.Any])
    
    inline def timeSteps(value: TimelineTimeSteps): this.type = set("timeSteps", value.asInstanceOf[js.Any])
    
    inline def traditionalZoom(value: Boolean): this.type = set("traditionalZoom", value.asInstanceOf[js.Any])
    
    inline def useResizeHandle(value: Boolean): this.type = set("useResizeHandle", value.asInstanceOf[js.Any])
    
    inline def verticalLineClassNamesForTime(value: (/* start */ Double, /* end */ Double) => js.UndefOr[js.Array[String]]): this.type = set("verticalLineClassNamesForTime", js.Any.fromFunction2(value))
    
    inline def visibleTimeEnd(value: js.Date | Moment | Double): this.type = set("visibleTimeEnd", value.asInstanceOf[js.Any])
    
    inline def visibleTimeStart(value: js.Date | Moment | Double): this.type = set("visibleTimeStart", value.asInstanceOf[js.Any])
  }
  
  def withProps[CustomItem /* <: TimelineItemBase[Any] */, CustomGroup /* <: TimelineGroupBase */](p: ReactCalendarTimelineProps[CustomItem, CustomGroup]): Builder[CustomItem, CustomGroup] = new Builder[CustomItem, CustomGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
}
