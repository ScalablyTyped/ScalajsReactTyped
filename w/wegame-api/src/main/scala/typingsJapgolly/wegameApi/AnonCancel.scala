package typingsJapgolly.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var confirm: js.UndefOr[Boolean] = js.undefined
}

object AnonCancel {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, confirm: js.UndefOr[Boolean] = js.undefined): AnonCancel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}

