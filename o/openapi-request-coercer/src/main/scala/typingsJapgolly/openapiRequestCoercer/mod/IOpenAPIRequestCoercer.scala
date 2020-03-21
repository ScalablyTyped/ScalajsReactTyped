package typingsJapgolly.openapiRequestCoercer.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPIRequestCoercer extends js.Object {
  def coerce(request: Request): Unit
}

object IOpenAPIRequestCoercer {
  @scala.inline
  def apply(coerce: Request => Callback): IOpenAPIRequestCoercer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: typingsJapgolly.openapiTypes.mod.OpenAPI.Request) => coerce(t0).runNow()))
    __obj.asInstanceOf[IOpenAPIRequestCoercer]
  }
}

