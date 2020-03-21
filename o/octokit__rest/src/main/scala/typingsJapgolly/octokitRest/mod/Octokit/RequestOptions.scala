package typingsJapgolly.octokitRest.mod.Octokit

import typingsJapgolly.octokitRest.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[RequestHeaders] = js.undefined
  /**
    * Media type options, see {@link https://developer.github.com/v3/media/|GitHub Developer Guide}
    */
  var mediaType: js.UndefOr[AnonFormat] = js.undefined
  var method: js.UndefOr[RequestMethod] = js.undefined
  var request: js.UndefOr[OctokitRequestOptions] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: RequestHeaders = null,
    mediaType: AnonFormat = null,
    method: RequestMethod = null,
    request: OctokitRequestOptions = null,
    url: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

