package typingsJapgolly.reactReduxToastr.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmToastrCustomOptions extends js.Object {
  var component: Element
}

object ConfirmToastrCustomOptions {
  @scala.inline
  def apply(component: VdomElement): ConfirmToastrCustomOptions = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmToastrCustomOptions]
  }
}

