package typingsJapgolly.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequestBody extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: js.UndefOr[String] = js.undefined
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.undefined
}

object AnonRequestBody {
  @scala.inline
  def apply(RequestBody: String = null, fields: String = null): AnonRequestBody = {
    val __obj = js.Dynamic.literal()
    if (RequestBody != null) __obj.updateDynamic("RequestBody")(RequestBody.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequestBody]
  }
}

