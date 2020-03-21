package typingsJapgolly.minappEnv.WXNS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUploadFileParam extends IAPIParam[IUploadFileSuccessResult] {
  var filePath: String
  var header: js.UndefOr[AnyObject] = js.undefined
  var name: String
  var url: String
}

object IUploadFileParam {
  @scala.inline
  def apply(
    filePath: String,
    name: String,
    url: String,
    complete: /* val */ IUploadFileSuccessResult | IAPIError => Callback = null,
    fail: /* err */ IAPIError => Callback = null,
    header: AnyObject = null,
    success: IUploadFileSuccessResult => Callback = null
  ): IUploadFileParam = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ typingsJapgolly.minappEnv.WXNS.IUploadFileSuccessResult | typingsJapgolly.minappEnv.WXNS.IAPIError) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.WXNS.IAPIError) => fail(t0).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.WXNS.IUploadFileSuccessResult) => success(t0).runNow()))
    __obj.asInstanceOf[IUploadFileParam]
  }
}

