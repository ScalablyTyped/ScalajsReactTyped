package typingsJapgolly.reactBigCalendar.dragAndDropMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactDragEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactBigCalendar.AnonAllDay
import typingsJapgolly.reactBigCalendar.AnonAllDayEnd
import typingsJapgolly.reactBigCalendar.AnonDirection
import typingsJapgolly.reactBigCalendar.mod.Components_
import typingsJapgolly.reactBigCalendar.reactBigCalendarBooleans.`false`
import typingsJapgolly.reactBigCalendar.reactBigCalendarBooleans.`true`
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait withDragAndDropProps[TEvent /* <: js.Object */] extends js.Object {
  var components: js.UndefOr[Components_[TEvent]] = js.undefined
  var dragFromOutsideItem: js.UndefOr[js.Function0[String | (js.Function1[/* event */ TEvent, js.Date])]] = js.undefined
  var draggableAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[Element], Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* args */ AnonDirection[TEvent], Unit]] = js.undefined
  var onDropFromOutside: js.UndefOr[js.Function1[/* args */ AnonAllDayEnd, Unit]] = js.undefined
  var onEventDrop: js.UndefOr[js.Function1[/* args */ AnonAllDay[TEvent], Unit]] = js.undefined
  var onEventResize: js.UndefOr[js.Function1[/* args */ AnonAllDay[TEvent], Unit]] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var resizableAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var selectable: js.UndefOr[`true` | `false` | ignoreEvents] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object withDragAndDropProps {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    components: Components_[TEvent] = null,
    dragFromOutsideItem: js.UndefOr[CallbackTo[String | (js.Function1[/* event */ TEvent, js.Date])]] = js.undefined,
    draggableAccessor: String | (js.Function1[/* event */ TEvent, Boolean]) = null,
    elementProps: HTMLAttributes[HTMLElement] = null,
    onDragOver: /* event */ ReactDragEventFrom[Element] => Callback = null,
    onDragStart: /* args */ AnonDirection[TEvent] => Callback = null,
    onDropFromOutside: /* args */ AnonAllDayEnd => Callback = null,
    onEventDrop: /* args */ AnonAllDay[TEvent] => Callback = null,
    onEventResize: /* args */ AnonAllDay[TEvent] => Callback = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resizableAccessor: String | (js.Function1[/* event */ TEvent, Boolean]) = null,
    selectable: `true` | `false` | ignoreEvents = null,
    step: Int | Double = null
  ): withDragAndDropProps[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    dragFromOutsideItem.foreach(p => __obj.updateDynamic("dragFromOutsideItem")(p.toJsFn))
    if (draggableAccessor != null) __obj.updateDynamic("draggableAccessor")(draggableAccessor.asInstanceOf[js.Any])
    if (elementProps != null) __obj.updateDynamic("elementProps")(elementProps.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactBigCalendar.AnonDirection[TEvent]) => onDragStart(t0).runNow()))
    if (onDropFromOutside != null) __obj.updateDynamic("onDropFromOutside")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactBigCalendar.AnonAllDayEnd) => onDropFromOutside(t0).runNow()))
    if (onEventDrop != null) __obj.updateDynamic("onEventDrop")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactBigCalendar.AnonAllDay[TEvent]) => onEventDrop(t0).runNow()))
    if (onEventResize != null) __obj.updateDynamic("onEventResize")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactBigCalendar.AnonAllDay[TEvent]) => onEventResize(t0).runNow()))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (resizableAccessor != null) __obj.updateDynamic("resizableAccessor")(resizableAccessor.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[withDragAndDropProps[TEvent]]
  }
}

