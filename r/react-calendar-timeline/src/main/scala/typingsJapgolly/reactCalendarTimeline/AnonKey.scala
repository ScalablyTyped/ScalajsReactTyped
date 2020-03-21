package typingsJapgolly.reactCalendarTimeline

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.raw.React.Ref
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.reactCalendarTimeline.mod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var className: String
  var key: Id
  var onContextMenu: ReactEventHandler[Element]
  var onDoubleClick: MouseEventHandler[Element]
  var onMouseDown: MouseEventHandler[Element]
  var onMouseUp: MouseEventHandler[Element]
  var onTouchEnd: TouchEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
  var ref: Ref
  var style: CSSProperties
}

object AnonKey {
  @scala.inline
  def apply(
    className: String,
    key: Id,
    onContextMenu: ReactEventFrom[Element] => Callback,
    onDoubleClick: ReactMouseEventFrom[Element] => Callback,
    onMouseDown: ReactMouseEventFrom[Element] => Callback,
    onMouseUp: ReactMouseEventFrom[Element] => Callback,
    onTouchEnd: ReactTouchEventFrom[Element] => Callback,
    onTouchStart: ReactTouchEventFrom[Element] => Callback,
    style: CSSProperties,
    ref: Ref = null
  ): AnonKey = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

