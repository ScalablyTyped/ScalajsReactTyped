package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteResource extends OnenoteEntityBaseModel {
  // The content stream
  var content: js.UndefOr[js.Any] = js.undefined
  // The URL for downloading the content
  var contentUrl: js.UndefOr[String] = js.undefined
}

object OnenoteResource {
  @scala.inline
  def apply(content: js.Any = null, contentUrl: String = null, id: String = null, self: String = null): OnenoteResource = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnenoteResource]
  }
}

