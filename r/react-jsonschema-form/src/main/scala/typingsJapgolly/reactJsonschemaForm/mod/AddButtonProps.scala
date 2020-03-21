package typingsJapgolly.reactJsonschemaForm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddButtonProps extends js.Object {
  var className: String
  var disabled: Boolean
  def onClick(e: ReactMouseEventFrom[HTMLButtonElement]): Unit
}

object AddButtonProps {
  @scala.inline
  def apply(className: String, disabled: Boolean, onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClick(t0).runNow()))
    __obj.asInstanceOf[AddButtonProps]
  }
}

