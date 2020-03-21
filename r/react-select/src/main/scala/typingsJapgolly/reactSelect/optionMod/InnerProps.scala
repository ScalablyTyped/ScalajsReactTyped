package typingsJapgolly.reactSelect.optionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerProps extends js.Object {
  var id: String
  var key: String
  var onClick: MouseEventHandler[HTMLDivElement]
  var onMouseMove: MouseEventHandler[HTMLDivElement]
  var onMouseOver: MouseEventHandler[HTMLDivElement]
  var tabIndex: Double
}

object InnerProps {
  @scala.inline
  def apply(
    id: String,
    key: String,
    onClick: ReactMouseEventFrom[HTMLDivElement] => Callback,
    onMouseMove: ReactMouseEventFrom[HTMLDivElement] => Callback,
    onMouseOver: ReactMouseEventFrom[HTMLDivElement] => Callback,
    tabIndex: Double
  ): InnerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseMove(t0).runNow()))
    __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseOver(t0).runNow()))
    __obj.asInstanceOf[InnerProps]
  }
}

