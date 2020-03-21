package typingsJapgolly.googleCloudCommon.utilMod

import typingsJapgolly.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHttpRespMessage extends js.Object {
  var err: js.UndefOr[ApiError] = js.undefined
  var resp: Response[_]
}

object ParsedHttpRespMessage {
  @scala.inline
  def apply(resp: Response[_], err: ApiError = null): ParsedHttpRespMessage = {
    val __obj = js.Dynamic.literal(resp = resp.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHttpRespMessage]
  }
}

