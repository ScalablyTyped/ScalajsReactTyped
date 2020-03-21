package typingsJapgolly.openapiDefaultSetter.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPIDefaultSetter extends js.Object {
  def handle(request: Request): Unit
}

object IOpenAPIDefaultSetter {
  @scala.inline
  def apply(handle: Request => Callback): IOpenAPIDefaultSetter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(js.Any.fromFunction1((t0: typingsJapgolly.openapiTypes.mod.OpenAPI.Request) => handle(t0).runNow()))
    __obj.asInstanceOf[IOpenAPIDefaultSetter]
  }
}

