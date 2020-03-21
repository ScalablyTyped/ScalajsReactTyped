package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Omit<react-calendar-timeline.react-calendar-timeline.ItemRendererGetItemPropsReturnType, 'key' | 'ref'>> */
trait GetItemsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onContextMenu: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GetItemsProps {
  @scala.inline
  def apply(
    className: String = null,
    onContextMenu: ReactEventFrom[Element] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[Element] => Callback = null,
    style: CSSProperties = null
  ): GetItemsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemsProps]
  }
}

