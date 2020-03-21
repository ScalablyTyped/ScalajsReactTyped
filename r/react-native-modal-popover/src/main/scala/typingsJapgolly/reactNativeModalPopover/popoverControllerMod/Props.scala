package typingsJapgolly.reactNativeModalPopover.popoverControllerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  def children(props: PopoverControllerRenderProps): Element
}

object Props {
  @scala.inline
  def apply(children: PopoverControllerRenderProps => CallbackTo[Element]): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeModalPopover.popoverControllerMod.PopoverControllerRenderProps) => children(t0).runNow()))
    __obj.asInstanceOf[Props]
  }
}

