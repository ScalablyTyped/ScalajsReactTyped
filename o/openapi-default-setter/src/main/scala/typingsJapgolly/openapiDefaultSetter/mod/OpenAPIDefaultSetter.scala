package typingsJapgolly.openapiDefaultSetter.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIDefaultSetter extends IOpenAPIDefaultSetter {
  var headersDefaults: js.Any
  var queryDefaults: js.Any
}

object OpenAPIDefaultSetter {
  @scala.inline
  def apply(handle: Request => Callback, headersDefaults: js.Any, queryDefaults: js.Any): OpenAPIDefaultSetter = {
    val __obj = js.Dynamic.literal(headersDefaults = headersDefaults.asInstanceOf[js.Any], queryDefaults = queryDefaults.asInstanceOf[js.Any])
    __obj.updateDynamic("handle")(js.Any.fromFunction1((t0: typingsJapgolly.openapiTypes.mod.OpenAPI.Request) => handle(t0).runNow()))
    __obj.asInstanceOf[OpenAPIDefaultSetter]
  }
}

