package typingsJapgolly.inversifyExpressUtils.statusCodeResultMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeResult extends IHttpActionResult {
  var apiController: js.Any
  var statusCode: js.Any
}

object StatusCodeResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: CallbackTo[js.Promise[HttpResponseMessage]],
    statusCode: js.Any
  ): StatusCodeResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.updateDynamic("executeAsync")(executeAsync.toJsFn)
    __obj.asInstanceOf[StatusCodeResult]
  }
}

