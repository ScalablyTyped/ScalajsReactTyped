package typingsJapgolly.nodemailer.xoauth2Mod

import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams extends js.Object {
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
}

object RequestParams {
  @scala.inline
  def apply(customHeaders: OutgoingHttpHeaders = null): RequestParams = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParams]
  }
}

