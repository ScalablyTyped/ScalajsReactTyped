package typingsJapgolly.minappEnv.ICloud

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.IAPIError
import typingsJapgolly.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallFunctionParam extends ICloudAPIParam[CallFunctionResult] {
  var data: js.UndefOr[CallFunctionData] = js.undefined
  var name: String
  var slow: js.UndefOr[Boolean] = js.undefined
}

object CallFunctionParam {
  @scala.inline
  def apply(
    name: String,
    complete: /* val */ CallFunctionResult | IAPIError => Callback = null,
    config: ICloudConfig = null,
    data: CallFunctionData = null,
    fail: /* err */ IAPIError => Callback = null,
    slow: js.UndefOr[Boolean] = js.undefined,
    success: CallFunctionResult => Callback = null
  ): CallFunctionParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ typingsJapgolly.minappEnv.ICloud.CallFunctionResult | typingsJapgolly.minappEnv.IAPIError) => complete(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.IAPIError) => fail(t0).runNow()))
    if (!js.isUndefined(slow)) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.ICloud.CallFunctionResult) => success(t0).runNow()))
    __obj.asInstanceOf[CallFunctionParam]
  }
}

