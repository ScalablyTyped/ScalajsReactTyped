package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactCalendarTimeline.mod.TimelineHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimelineHeader {
  def apply(
    calendarHeaderClassName: String = null,
    calendarHeaderStyle: CSSProperties = null,
    className: String = null,
    headerRef: Ref = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TimelineHeaderProps, 
    typingsJapgolly.reactCalendarTimeline.mod.TimelineHeader, 
    Unit, 
    TimelineHeaderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (calendarHeaderClassName != null) __obj.updateDynamic("calendarHeaderClassName")(calendarHeaderClassName.asInstanceOf[js.Any])
    if (calendarHeaderStyle != null) __obj.updateDynamic("calendarHeaderStyle")(calendarHeaderStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(headerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCalendarTimeline.mod.TimelineHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCalendarTimeline.mod.TimelineHeader](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCalendarTimeline.mod.TimelineHeaderProps])(children: _*)
  }
  @JSImport("react-calendar-timeline", "TimelineHeader")
  @js.native
  object componentImport extends js.Object
  
}

