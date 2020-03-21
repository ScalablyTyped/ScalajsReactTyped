package typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpActionResult extends js.Object {
  def executeAsync(): js.Promise[HttpResponseMessage]
}

object IHttpActionResult {
  @scala.inline
  def apply(executeAsync: CallbackTo[js.Promise[HttpResponseMessage]]): IHttpActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("executeAsync")(executeAsync.toJsFn)
    __obj.asInstanceOf[IHttpActionResult]
  }
}

