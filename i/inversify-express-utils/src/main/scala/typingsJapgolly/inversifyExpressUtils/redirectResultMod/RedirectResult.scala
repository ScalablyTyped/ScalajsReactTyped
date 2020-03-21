package typingsJapgolly.inversifyExpressUtils.redirectResultMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectResult extends IHttpActionResult {
  var apiController: js.Any
  var location: js.Any
}

object RedirectResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: CallbackTo[js.Promise[HttpResponseMessage]], location: js.Any): RedirectResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("executeAsync")(executeAsync.toJsFn)
    __obj.asInstanceOf[RedirectResult]
  }
}

