package typingsJapgolly.minappEnv.ICloud

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.IAPIError
import typingsJapgolly.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileParam extends ICloudAPIParam[DownloadFileResult] {
  var cloudPath: js.UndefOr[String] = js.undefined
  var fileID: String
}

object DownloadFileParam {
  @scala.inline
  def apply(
    fileID: String,
    cloudPath: String = null,
    complete: /* val */ DownloadFileResult | IAPIError => Callback = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Callback = null,
    success: DownloadFileResult => Callback = null
  ): DownloadFileParam = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    if (cloudPath != null) __obj.updateDynamic("cloudPath")(cloudPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ typingsJapgolly.minappEnv.ICloud.DownloadFileResult | typingsJapgolly.minappEnv.IAPIError) => complete(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.IAPIError) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.ICloud.DownloadFileResult) => success(t0).runNow()))
    __obj.asInstanceOf[DownloadFileParam]
  }
}

