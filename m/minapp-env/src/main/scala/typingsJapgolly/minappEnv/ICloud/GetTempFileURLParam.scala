package typingsJapgolly.minappEnv.ICloud

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.Array
import typingsJapgolly.minappEnv.IAPIError
import typingsJapgolly.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTempFileURLParam extends ICloudAPIParam[GetTempFileURLResult] {
  var fileList: Array[String]
}

object GetTempFileURLParam {
  @scala.inline
  def apply(
    fileList: Array[String],
    complete: /* val */ GetTempFileURLResult | IAPIError => Callback = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Callback = null,
    success: GetTempFileURLResult => Callback = null
  ): GetTempFileURLParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ typingsJapgolly.minappEnv.ICloud.GetTempFileURLResult | typingsJapgolly.minappEnv.IAPIError) => complete(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.IAPIError) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.ICloud.GetTempFileURLResult) => success(t0).runNow()))
    __obj.asInstanceOf[GetTempFileURLParam]
  }
}

