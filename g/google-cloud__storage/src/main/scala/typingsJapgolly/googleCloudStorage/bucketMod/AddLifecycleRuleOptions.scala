package typingsJapgolly.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddLifecycleRuleOptions extends js.Object {
  var append: js.UndefOr[Boolean] = js.undefined
}

object AddLifecycleRuleOptions {
  @scala.inline
  def apply(append: js.UndefOr[Boolean] = js.undefined): AddLifecycleRuleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddLifecycleRuleOptions]
  }
}

