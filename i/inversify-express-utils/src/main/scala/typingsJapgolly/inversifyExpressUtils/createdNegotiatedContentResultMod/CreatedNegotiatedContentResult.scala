package typingsJapgolly.inversifyExpressUtils.createdNegotiatedContentResultMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatedNegotiatedContentResult[T] extends IHttpActionResult {
  var apiController: js.Any
  var content: js.Any
  var location: js.Any
}

object CreatedNegotiatedContentResult {
  @scala.inline
  def apply[T](
    apiController: js.Any,
    content: js.Any,
    executeAsync: CallbackTo[js.Promise[HttpResponseMessage]],
    location: js.Any
  ): CreatedNegotiatedContentResult[T] = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("executeAsync")(executeAsync.toJsFn)
    __obj.asInstanceOf[CreatedNegotiatedContentResult[T]]
  }
}

