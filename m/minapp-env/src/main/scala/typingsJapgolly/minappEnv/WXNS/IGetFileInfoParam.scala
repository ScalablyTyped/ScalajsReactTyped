package typingsJapgolly.minappEnv.WXNS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetFileInfoParam extends IAPIParam[IGetFileInfoSuccessResult] {
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  var filePath: String
}

object IGetFileInfoParam {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* val */ IGetFileInfoSuccessResult | IAPIError => Callback = null,
    digestAlgorithm: String = null,
    fail: /* err */ IAPIError => Callback = null,
    success: IGetFileInfoSuccessResult => Callback = null
  ): IGetFileInfoParam = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ typingsJapgolly.minappEnv.WXNS.IGetFileInfoSuccessResult | typingsJapgolly.minappEnv.WXNS.IAPIError) => complete(t0).runNow()))
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.WXNS.IAPIError) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.WXNS.IGetFileInfoSuccessResult) => success(t0).runNow()))
    __obj.asInstanceOf[IGetFileInfoParam]
  }
}

