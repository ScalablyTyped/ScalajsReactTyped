package typingsJapgolly.minappEnv.WXNS

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestParam extends IAPIParam[IRequestSuccessResult] {
  var data: js.UndefOr[AnyObject | String | ArrayBuffer] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[AnyObject] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var url: String
}

object IRequestParam {
  @scala.inline
  def apply(
    url: String,
    complete: /* val */ IRequestSuccessResult | IAPIError => Callback = null,
    data: AnyObject | String | ArrayBuffer = null,
    dataType: String = null,
    fail: /* err */ IAPIError => Callback = null,
    header: AnyObject = null,
    method: String = null,
    responseType: String = null,
    success: IRequestSuccessResult => Callback = null
  ): IRequestParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ typingsJapgolly.minappEnv.WXNS.IRequestSuccessResult | typingsJapgolly.minappEnv.WXNS.IAPIError) => complete(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.WXNS.IAPIError) => fail(t0).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.WXNS.IRequestSuccessResult) => success(t0).runNow()))
    __obj.asInstanceOf[IRequestParam]
  }
}

