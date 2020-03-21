package typingsJapgolly.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var URI: js.UndefOr[String] = js.undefined
  var authToken: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var qs: js.UndefOr[String] = js.undefined
  var systemKey: String
  var systemSecret: String
  var useUser: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[APIUser] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    systemKey: String,
    systemSecret: String,
    URI: String = null,
    authToken: String = null,
    body: String = null,
    endpoint: String = null,
    method: String = null,
    qs: String = null,
    useUser: js.UndefOr[Boolean] = js.undefined,
    user: APIUser = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    if (URI != null) __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (!js.isUndefined(useUser)) __obj.updateDynamic("useUser")(useUser.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

