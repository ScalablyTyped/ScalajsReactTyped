package typingsJapgolly.inversifyExpressUtils.responseMessageResultMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseMessageResult extends IHttpActionResult {
  var apiController: js.Any
  var message: js.Any
}

object ResponseMessageResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: CallbackTo[js.Promise[HttpResponseMessage]], message: js.Any): ResponseMessageResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("executeAsync")(executeAsync.toJsFn)
    __obj.asInstanceOf[ResponseMessageResult]
  }
}

