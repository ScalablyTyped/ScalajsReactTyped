package typingsJapgolly.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuggestedkey extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var suggested_key: js.UndefOr[AnonAdditionalProperties] = js.undefined
}

object AnonSuggestedkey {
  @scala.inline
  def apply(description: String = null, suggested_key: AnonAdditionalProperties = null): AnonSuggestedkey = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (suggested_key != null) __obj.updateDynamic("suggested_key")(suggested_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuggestedkey]
  }
}

