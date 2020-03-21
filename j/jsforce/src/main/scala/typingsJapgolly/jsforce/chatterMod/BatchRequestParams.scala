package typingsJapgolly.jsforce.chatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRequestParams extends RequestParams {
  var richInput: js.UndefOr[String] = js.undefined
}

object BatchRequestParams {
  @scala.inline
  def apply(method: String, url: String, body: String = null, richInput: String = null): BatchRequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (richInput != null) __obj.updateDynamic("richInput")(richInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequestParams]
  }
}

