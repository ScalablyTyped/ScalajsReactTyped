package typingsJapgolly.loadableComponent

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFallback extends js.Object {
  var fallback: js.UndefOr[Element] = js.undefined
}

object AnonFallback {
  @scala.inline
  def apply(fallback: VdomElement = null): AnonFallback = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFallback]
  }
}

