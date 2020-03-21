package typingsJapgolly.swaggerizeExpress.mod.Swagger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends Response {
  var description: String
  var examples: js.UndefOr[ExampleObject] = js.undefined
  var headers: js.UndefOr[HeadersObject] = js.undefined
  var schema: js.UndefOr[SchemaObject] = js.undefined
}

object ResponseObject {
  @scala.inline
  def apply(
    description: String,
    examples: ExampleObject = null,
    headers: HeadersObject = null,
    schema: SchemaObject = null
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
}

