package typingsJapgolly.openapiSecurityHandler.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPISecurityHandler extends js.Object {
  def handle(request: Request): js.Promise[Unit]
}

object IOpenAPISecurityHandler {
  @scala.inline
  def apply(handle: Request => CallbackTo[js.Promise[Unit]]): IOpenAPISecurityHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(js.Any.fromFunction1((t0: typingsJapgolly.openapiTypes.mod.OpenAPI.Request) => handle(t0).runNow()))
    __obj.asInstanceOf[IOpenAPISecurityHandler]
  }
}

