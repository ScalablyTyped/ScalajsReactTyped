package typingsJapgolly.minappEnv.DB

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.IAPIError
import typingsJapgolly.minappEnv.IAPIParam
import typingsJapgolly.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddDocumentOptions
  extends IAPIParam[js.Any] {
  var data: IDocumentData
}

object IAddDocumentOptions {
  @scala.inline
  def apply(
    data: IDocumentData,
    complete: /* val */ js.Any | IAPIError => Callback = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Callback = null,
    success: js.Any => Callback = null
  ): IAddDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ js.Any | typingsJapgolly.minappEnv.IAPIError) => complete(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.IAPIError) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[IAddDocumentOptions]
  }
}

