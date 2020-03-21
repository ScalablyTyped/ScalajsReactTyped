package typingsJapgolly.inversifyExpressUtils.exceptionResultMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionResult extends IHttpActionResult {
  var apiController: js.Any
  var error: js.Any
}

object ExceptionResult {
  @scala.inline
  def apply(apiController: js.Any, error: js.Any, executeAsync: CallbackTo[js.Promise[HttpResponseMessage]]): ExceptionResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("executeAsync")(executeAsync.toJsFn)
    __obj.asInstanceOf[ExceptionResult]
  }
}

