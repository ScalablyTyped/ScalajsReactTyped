package typingsJapgolly.reactMdl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FABButtonProps extends ButtonProps {
  var mini: js.UndefOr[Boolean] = js.undefined
}

object FABButtonProps {
  @scala.inline
  def apply(ButtonProps: ButtonProps = null, mini: js.UndefOr[Boolean] = js.undefined): FABButtonProps = {
    val __obj = js.Dynamic.literal()
    if (ButtonProps != null) js.Dynamic.global.Object.assign(__obj, ButtonProps)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini.asInstanceOf[js.Any])
    __obj.asInstanceOf[FABButtonProps]
  }
}

