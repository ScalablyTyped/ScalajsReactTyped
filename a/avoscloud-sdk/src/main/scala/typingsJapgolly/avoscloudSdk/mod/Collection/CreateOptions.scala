package typingsJapgolly.avoscloudSdk.mod.Collection

import typingsJapgolly.avoscloudSdk.mod.ErrorOption
import typingsJapgolly.avoscloudSdk.mod.SilentOption
import typingsJapgolly.avoscloudSdk.mod.SuccessOption
import typingsJapgolly.avoscloudSdk.mod.UseMasterKeyOption
import typingsJapgolly.avoscloudSdk.mod.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions
  extends SuccessOption
     with ErrorOption
     with WaitOption
     with SilentOption
     with UseMasterKeyOption

object CreateOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
}

