package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineHeaderProps extends js.Object {
  var calendarHeaderClassName: js.UndefOr[String] = js.undefined
  var calendarHeaderStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var headerRef: js.UndefOr[Ref] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TimelineHeaderProps {
  @scala.inline
  def apply(
    calendarHeaderClassName: String = null,
    calendarHeaderStyle: CSSProperties = null,
    className: String = null,
    headerRef: Ref = null,
    style: CSSProperties = null
  ): TimelineHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (calendarHeaderClassName != null) __obj.updateDynamic("calendarHeaderClassName")(calendarHeaderClassName.asInstanceOf[js.Any])
    if (calendarHeaderStyle != null) __obj.updateDynamic("calendarHeaderStyle")(calendarHeaderStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(headerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineHeaderProps]
  }
}

