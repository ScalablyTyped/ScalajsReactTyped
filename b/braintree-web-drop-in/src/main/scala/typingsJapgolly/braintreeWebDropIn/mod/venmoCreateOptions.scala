package typingsJapgolly.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait venmoCreateOptions extends js.Object {
  var allowNewBrowserTab: js.UndefOr[Boolean] = js.undefined
}

object venmoCreateOptions {
  @scala.inline
  def apply(allowNewBrowserTab: js.UndefOr[Boolean] = js.undefined): venmoCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNewBrowserTab)) __obj.updateDynamic("allowNewBrowserTab")(allowNewBrowserTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[venmoCreateOptions]
  }
}

