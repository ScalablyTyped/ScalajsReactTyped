package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactCalendarTimeline.mod.DateHeaderProps
import typingsJapgolly.reactCalendarTimeline.mod.IntervalRenderer
import typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderChildrenFnProps
import typingsJapgolly.reactCalendarTimeline.mod.Unit
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.primaryHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateHeader {
  def apply[Data](
    className: String = null,
    headerData: Data = null,
    height: Int | Double = null,
    intervalRenderer: /* props */ js.UndefOr[IntervalRenderer[Data]] => CallbackTo[Node] = null,
    labelFormat: String | (js.Function3[
      /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
      /* unit */ Unit, 
      /* labelWidth */ Double, 
      String
    ]) = null,
    style: CSSProperties = null,
    unit: Unit | primaryHeader = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* props */ SidebarHeaderChildrenFnProps[Data] => CallbackTo[Node] = null
  ): UnmountedWithRoot[
    DateHeaderProps[Data], 
    typingsJapgolly.reactCalendarTimeline.mod.DateHeader[Data], 
    scala.Unit, 
    DateHeaderProps[Data]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderChildrenFnProps[Data]) => children(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headerData != null) __obj.updateDynamic("headerData")(headerData.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (intervalRenderer != null) __obj.updateDynamic("intervalRenderer")(js.Any.fromFunction1((t0: /* props */ js.UndefOr[typingsJapgolly.reactCalendarTimeline.mod.IntervalRenderer[Data]]) => intervalRenderer(t0).runNow()))
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCalendarTimeline.mod.DateHeaderProps[Data], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactCalendarTimeline.mod.DateHeader[Data]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCalendarTimeline.mod.DateHeaderProps[Data]])
  }
  @JSImport("react-calendar-timeline", "DateHeader")
  @js.native
  object componentImport extends js.Object
  
}

