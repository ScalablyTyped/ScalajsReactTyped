package typingsJapgolly.reactOverlays.dropdownToggleMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleProps extends js.Object {
  /**
    * A render prop that returns a Toggle element. The `props`
    * argument should spread through to **a component that can accept a ref**. Use
    * the `onToggle` argument to toggle the menu open or closed
    */
  def children(renderProps: DropdownToggleRenderProps): Element
}

object DropdownToggleProps {
  @scala.inline
  def apply(children: DropdownToggleRenderProps => CallbackTo[Element]): DropdownToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactOverlays.dropdownToggleMod.DropdownToggleRenderProps) => children(t0).runNow()))
    __obj.asInstanceOf[DropdownToggleProps]
  }
}

