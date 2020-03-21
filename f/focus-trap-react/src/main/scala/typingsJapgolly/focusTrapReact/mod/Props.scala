package typingsJapgolly.focusTrapReact.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.focusTrap.mod.Options
import typingsJapgolly.react.mod.AllHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[js.Any] {
  var active: js.UndefOr[Boolean] = js.undefined
  @JSName("children")
  var children_Props: Element
  var focusTrapOptions: js.UndefOr[Options] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: VdomElement,
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    focusTrapOptions: Options = null,
    paused: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (focusTrapOptions != null) __obj.updateDynamic("focusTrapOptions")(focusTrapOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

