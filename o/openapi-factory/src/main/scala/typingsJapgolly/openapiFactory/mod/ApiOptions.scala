package typingsJapgolly.openapiFactory.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiOptions extends js.Object {
  var errorMiddleware: js.UndefOr[js.Function0[_]] = js.undefined
  var requestMiddleware: js.UndefOr[js.Function0[_]] = js.undefined
  var responseMiddleware: js.UndefOr[js.Function0[_]] = js.undefined
}

object ApiOptions {
  @scala.inline
  def apply(
    errorMiddleware: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    requestMiddleware: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    responseMiddleware: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): ApiOptions = {
    val __obj = js.Dynamic.literal()
    errorMiddleware.foreach(p => __obj.updateDynamic("errorMiddleware")(p.toJsFn))
    requestMiddleware.foreach(p => __obj.updateDynamic("requestMiddleware")(p.toJsFn))
    responseMiddleware.foreach(p => __obj.updateDynamic("responseMiddleware")(p.toJsFn))
    __obj.asInstanceOf[ApiOptions]
  }
}

