package typingsJapgolly.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends js.Object {
  var content: js.UndefOr[StringDictionary[MediaTypeObject]] = js.undefined
  var description: String
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.undefined
}

object ResponseObject {
  @scala.inline
  def apply(
    description: String,
    content: StringDictionary[MediaTypeObject] = null,
    headers: StringDictionary[ReferenceObject | HeaderObject] = null,
    links: StringDictionary[ReferenceObject | LinkObject] = null
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
}

