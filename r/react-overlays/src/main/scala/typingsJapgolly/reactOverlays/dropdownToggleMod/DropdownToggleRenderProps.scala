package typingsJapgolly.reactOverlays.dropdownToggleMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactOverlays.AnonAriaexpanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleRenderProps extends js.Object {
  var props: AnonAriaexpanded
  var show: Boolean
  def toggle(show: Boolean): Unit
}

object DropdownToggleRenderProps {
  @scala.inline
  def apply(props: AnonAriaexpanded, show: Boolean, toggle: Boolean => Callback): DropdownToggleRenderProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: scala.Boolean) => toggle(t0).runNow()))
    __obj.asInstanceOf[DropdownToggleRenderProps]
  }
}

