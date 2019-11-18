package typingsJapgolly.reactDashBigDashCalendar.libAddonsDragAndDropMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactDragEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.HTMLAttributes
import typingsJapgolly.reactDashBigDashCalendar.Anon_ActionDOWN
import typingsJapgolly.reactDashBigDashCalendar.Anon_AllDay
import typingsJapgolly.reactDashBigDashCalendar.Anon_AllDayEnd
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Components
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarNumbers.`false`
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarNumbers.`true`
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.ignoreEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait withDragAndDropProps[TEvent /* <: js.Object */] extends js.Object {
  var components: js.UndefOr[Components[TEvent]] = js.undefined
  var dragFromOutsideItem: js.UndefOr[js.Function0[String | (js.Function1[/* event */ TEvent, js.Date])]] = js.undefined
  var draggableAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[Element], Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* args */ Anon_ActionDOWN[TEvent], Unit]] = js.undefined
  var onDropFromOutside: js.UndefOr[js.Function1[/* args */ Anon_AllDayEnd, Unit]] = js.undefined
  var onEventDrop: js.UndefOr[js.Function1[/* args */ Anon_AllDay[TEvent], Unit]] = js.undefined
  var onEventResize: js.UndefOr[js.Function1[/* args */ Anon_AllDay[TEvent], Unit]] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var resizableAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var selectable: js.UndefOr[`true` | `false` | ignoreEvents] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object withDragAndDropProps {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    components: Components[TEvent] = null,
    dragFromOutsideItem: js.UndefOr[CallbackTo[String | (js.Function1[/* event */ TEvent, js.Date])]] = js.undefined,
    draggableAccessor: String | (js.Function1[/* event */ TEvent, Boolean]) = null,
    elementProps: HTMLAttributes[HTMLElement] = null,
    onDragOver: /* event */ ReactDragEventFrom[Element] => Callback = null,
    onDragStart: /* args */ Anon_ActionDOWN[TEvent] => Callback = null,
    onDropFromOutside: /* args */ Anon_AllDayEnd => Callback = null,
    onEventDrop: /* args */ Anon_AllDay[TEvent] => Callback = null,
    onEventResize: /* args */ Anon_AllDay[TEvent] => Callback = null,
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
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactDashBigDashCalendar.Anon_ActionDOWN[TEvent]) => onDragStart(t0).runNow()))
    if (onDropFromOutside != null) __obj.updateDynamic("onDropFromOutside")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactDashBigDashCalendar.Anon_AllDayEnd) => onDropFromOutside(t0).runNow()))
    if (onEventDrop != null) __obj.updateDynamic("onEventDrop")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactDashBigDashCalendar.Anon_AllDay[TEvent]) => onEventDrop(t0).runNow()))
    if (onEventResize != null) __obj.updateDynamic("onEventResize")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactDashBigDashCalendar.Anon_AllDay[TEvent]) => onEventResize(t0).runNow()))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (resizableAccessor != null) __obj.updateDynamic("resizableAccessor")(resizableAccessor.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[withDragAndDropProps[TEvent]]
  }
}

