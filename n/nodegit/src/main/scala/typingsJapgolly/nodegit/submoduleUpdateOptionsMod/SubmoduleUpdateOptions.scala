package typingsJapgolly.nodegit.submoduleUpdateOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
import typingsJapgolly.nodegit.fetchOptionsMod.FetchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmoduleUpdateOptions
  extends /* key */ StringDictionary[js.Any] {
  var checkoutOpts: js.UndefOr[CheckoutOptions] = js.undefined
  var cloneCheckoutStrategy: js.UndefOr[Double] = js.undefined
  var fetchOpts: js.UndefOr[FetchOptions] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object SubmoduleUpdateOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    checkoutOpts: CheckoutOptions = null,
    cloneCheckoutStrategy: Int | Double = null,
    fetchOpts: FetchOptions = null,
    version: Int | Double = null
  ): SubmoduleUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkoutOpts != null) __obj.updateDynamic("checkoutOpts")(checkoutOpts.asInstanceOf[js.Any])
    if (cloneCheckoutStrategy != null) __obj.updateDynamic("cloneCheckoutStrategy")(cloneCheckoutStrategy.asInstanceOf[js.Any])
    if (fetchOpts != null) __obj.updateDynamic("fetchOpts")(fetchOpts.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmoduleUpdateOptions]
  }
}

