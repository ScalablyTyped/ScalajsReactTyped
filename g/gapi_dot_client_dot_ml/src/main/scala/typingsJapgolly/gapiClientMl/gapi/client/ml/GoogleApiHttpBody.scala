package typingsJapgolly.gapiClientMl.gapi.client.ml

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiHttpBody extends js.Object {
  /** The HTTP Content-Type string representing the content type of the body. */
  var contentType: js.UndefOr[String] = js.undefined
  /** HTTP body binary data. */
  var data: js.UndefOr[String] = js.undefined
  /**
    * Application specific response metadata. Must be set in the first response
    * for streaming APIs.
    */
  var extensions: js.UndefOr[js.Array[Record[String, _]]] = js.undefined
}

object GoogleApiHttpBody {
  @scala.inline
  def apply(contentType: String = null, data: String = null, extensions: js.Array[Record[String, _]] = null): GoogleApiHttpBody = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiHttpBody]
  }
}

