package typingsJapgolly.inversifyExpressUtils.notFoundResultMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotFoundResult extends IHttpActionResult {
  var apiController: js.Any
}

object NotFoundResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: CallbackTo[js.Promise[HttpResponseMessage]]): NotFoundResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any])
    __obj.updateDynamic("executeAsync")(executeAsync.toJsFn)
    __obj.asInstanceOf[NotFoundResult]
  }
}

