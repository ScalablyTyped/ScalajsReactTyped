package typingsJapgolly.reactBigCalendar.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactBigCalendar.AnonDayProp
import typingsJapgolly.reactBigCalendar.AnonEnd
import typingsJapgolly.reactBigCalendar.CSSPropertiesxOffsetnumbe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventWrapperProps[TEvent /* <: js.Object */] extends js.Object {
  var accessors: AnonEnd[TEvent]
  var className: String
  var continuesEarlier: Boolean
  var continuesLater: Boolean
  var event: TEvent
  var getters: AnonDayProp[TEvent]
  var isRtl: Boolean
  var label: String
  var selected: Boolean
  // https://github.com/intljusticemission/react-big-calendar/blob/27a2656b40ac8729634d24376dff8ea781a66d50/src/TimeGridEvent.js#L28
  var style: js.UndefOr[CSSPropertiesxOffsetnumbe] = js.undefined
  def onClick(e: ReactMouseEventFrom[HTMLElement]): Unit
  def onDoubleClick(e: ReactMouseEventFrom[HTMLElement]): Unit
}

object EventWrapperProps {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    accessors: AnonEnd[TEvent],
    className: String,
    continuesEarlier: Boolean,
    continuesLater: Boolean,
    event: TEvent,
    getters: AnonDayProp[TEvent],
    isRtl: Boolean,
    label: String,
    onClick: ReactMouseEventFrom[HTMLElement] => Callback,
    onDoubleClick: ReactMouseEventFrom[HTMLElement] => Callback,
    selected: Boolean,
    style: CSSPropertiesxOffsetnumbe = null
  ): EventWrapperProps[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], continuesEarlier = continuesEarlier.asInstanceOf[js.Any], continuesLater = continuesLater.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], getters = getters.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDoubleClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventWrapperProps[TEvent]]
  }
}

