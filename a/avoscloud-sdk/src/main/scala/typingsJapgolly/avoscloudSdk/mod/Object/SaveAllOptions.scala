package typingsJapgolly.avoscloudSdk.mod.Object

import typingsJapgolly.avoscloudSdk.mod.ErrorOption
import typingsJapgolly.avoscloudSdk.mod.SuccessOption
import typingsJapgolly.avoscloudSdk.mod.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveAllOptions
  extends SuccessOption
     with ErrorOption
     with UseMasterKeyOption

object SaveAllOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): SaveAllOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAllOptions]
  }
}

