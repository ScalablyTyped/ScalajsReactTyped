package typingsJapgolly.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalDocumentationObject extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var url: String
}

object ExternalDocumentationObject {
  @scala.inline
  def apply(url: String, description: String = null): ExternalDocumentationObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDocumentationObject]
  }
}

