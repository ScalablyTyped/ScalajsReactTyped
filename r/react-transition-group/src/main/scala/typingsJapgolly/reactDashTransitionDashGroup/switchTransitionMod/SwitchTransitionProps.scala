package typingsJapgolly.reactDashTransitionDashGroup.switchTransitionMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactDashTransitionDashGroup.reactDashTransitionDashGroupStrings.`in-out`
import typingsJapgolly.reactDashTransitionDashGroup.reactDashTransitionDashGroupStrings.`out-in`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchTransitionProps extends js.Object {
  /**
    * Any `Transition` or `CSSTransition` component
    */
  var children: Element
  /**
    * Transition modes.
    * `out-in`: Current element transitions out first, then when complete, the new element transitions in.
    * `in-out`: New element transitions in first, then when complete, the current element transitions out.
    */
  var mode: js.UndefOr[`out-in` | `in-out`] = js.undefined
}

object SwitchTransitionProps {
  @scala.inline
  def apply(children: VdomElement, mode: `out-in` | `in-out` = null): SwitchTransitionProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchTransitionProps]
  }
}

