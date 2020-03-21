package typingsJapgolly.inversifyExpressUtils.jsonResultMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonResult extends IHttpActionResult {
  var apiController: js.Any
  val json: js.Any
  val statusCode: Double
}

object JsonResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: CallbackTo[js.Promise[HttpResponseMessage]],
    json: js.Any,
    statusCode: Double
  ): JsonResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.updateDynamic("executeAsync")(executeAsync.toJsFn)
    __obj.asInstanceOf[JsonResult]
  }
}

