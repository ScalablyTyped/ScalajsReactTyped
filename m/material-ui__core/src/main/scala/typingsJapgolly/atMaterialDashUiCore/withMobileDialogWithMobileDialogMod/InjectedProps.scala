package typingsJapgolly.atMaterialDashUiCore.withMobileDialogWithMobileDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedProps extends js.Object {
  var fullScreen: js.UndefOr[Boolean] = js.undefined
}

object InjectedProps {
  @scala.inline
  def apply(fullScreen: js.UndefOr[Boolean] = js.undefined): InjectedProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedProps]
  }
}

