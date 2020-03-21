package typingsJapgolly.minappEnv.ICloud

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.AnyObject
import typingsJapgolly.minappEnv.IAPIError
import typingsJapgolly.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileParam extends ICloudAPIParam[UploadFileResult] {
  var cloudPath: String
  var filePath: String
  var header: js.UndefOr[AnyObject] = js.undefined
}

object UploadFileParam {
  @scala.inline
  def apply(
    cloudPath: String,
    filePath: String,
    complete: /* val */ UploadFileResult | IAPIError => Callback = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Callback = null,
    header: AnyObject = null,
    success: UploadFileResult => Callback = null
  ): UploadFileParam = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ typingsJapgolly.minappEnv.ICloud.UploadFileResult | typingsJapgolly.minappEnv.IAPIError) => complete(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.IAPIError) => fail(t0).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.ICloud.UploadFileResult) => success(t0).runNow()))
    __obj.asInstanceOf[UploadFileParam]
  }
}

