package typingsJapgolly.reactWait.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitingContextWaitProps extends js.Object {
  var fallback: Element
}

object WaitingContextWaitProps {
  @scala.inline
  def apply(fallback: VdomElement): WaitingContextWaitProps = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitingContextWaitProps]
  }
}

