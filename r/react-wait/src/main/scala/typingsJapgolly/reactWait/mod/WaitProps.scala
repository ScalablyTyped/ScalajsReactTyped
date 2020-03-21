package typingsJapgolly.reactWait.mod

import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitProps extends WaitingContextWaitProps {
  var on: String
}

object WaitProps {
  @scala.inline
  def apply(fallback: VdomElement, on: String): WaitProps = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitProps]
  }
}

