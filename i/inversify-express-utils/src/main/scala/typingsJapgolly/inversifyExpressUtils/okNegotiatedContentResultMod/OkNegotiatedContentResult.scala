package typingsJapgolly.inversifyExpressUtils.okNegotiatedContentResultMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OkNegotiatedContentResult[T] extends IHttpActionResult {
  var apiController: js.Any
  var content: js.Any
}

object OkNegotiatedContentResult {
  @scala.inline
  def apply[T](apiController: js.Any, content: js.Any, executeAsync: CallbackTo[js.Promise[HttpResponseMessage]]): OkNegotiatedContentResult[T] = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("executeAsync")(executeAsync.toJsFn)
    __obj.asInstanceOf[OkNegotiatedContentResult[T]]
  }
}

