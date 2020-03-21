package typingsJapgolly.minappEnv.ICloud

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.IAPIError
import typingsJapgolly.minappEnv.IAPIParam
import typingsJapgolly.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloudAPIParam[T] extends IAPIParam[T]

object ICloudAPIParam {
  @scala.inline
  def apply[T](
    complete: /* val */ T | IAPIError => Callback = null,
    config: ICloudConfig = null,
    fail: /* err */ IAPIError => Callback = null,
    success: T => Callback = null
  ): ICloudAPIParam[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ T | typingsJapgolly.minappEnv.IAPIError) => complete(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.IAPIError) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: T) => success(t0).runNow()))
    __obj.asInstanceOf[ICloudAPIParam[T]]
  }
}

