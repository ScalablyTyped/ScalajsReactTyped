package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleFeedbackProps extends js.Object {
  var borderless: js.UndefOr[Boolean] = js.undefined
  var children: Element
  var color: js.UndefOr[String] = js.undefined
}

object RippleFeedbackProps {
  @scala.inline
  def apply(children: VdomElement, borderless: js.UndefOr[Boolean] = js.undefined, color: String = null): RippleFeedbackProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleFeedbackProps]
  }
}

