package typingsJapgolly.minappEnv.WXNS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDownloadFileParam extends IAPIParam[IDownloadFileSuccessResult] {
  var header: js.UndefOr[AnyObject] = js.undefined
  var url: String
}

object IDownloadFileParam {
  @scala.inline
  def apply(
    url: String,
    complete: /* val */ IDownloadFileSuccessResult | IAPIError => Callback = null,
    fail: /* err */ IAPIError => Callback = null,
    header: AnyObject = null,
    success: IDownloadFileSuccessResult => Callback = null
  ): IDownloadFileParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ typingsJapgolly.minappEnv.WXNS.IDownloadFileSuccessResult | typingsJapgolly.minappEnv.WXNS.IAPIError) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.WXNS.IAPIError) => fail(t0).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.WXNS.IDownloadFileSuccessResult) => success(t0).runNow()))
    __obj.asInstanceOf[IDownloadFileParam]
  }
}

