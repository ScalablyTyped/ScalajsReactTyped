package typingsJapgolly.reactPlacesAutocomplete

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var key: Double
  var onClick: MouseEventHandler[Element]
  var onMouseDown: MouseEventHandler[Element]
  var onMouseEnter: MouseEventHandler[Element]
  var onMouseLeave: MouseEventHandler[Element]
  var onMouseUp: MouseEventHandler[Element]
  var onTouchEnd: TouchEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
  var role: option
}

object AnonId {
  @scala.inline
  def apply(
    key: Double,
    onClick: ReactMouseEventFrom[Element] => Callback,
    onMouseDown: ReactMouseEventFrom[Element] => Callback,
    onMouseEnter: ReactMouseEventFrom[Element] => Callback,
    onMouseLeave: ReactMouseEventFrom[Element] => Callback,
    onMouseUp: ReactMouseEventFrom[Element] => Callback,
    onTouchEnd: ReactTouchEventFrom[Element] => Callback,
    onTouchStart: ReactTouchEventFrom[Element] => Callback,
    role: option,
    id: String = null
  ): AnonId = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

