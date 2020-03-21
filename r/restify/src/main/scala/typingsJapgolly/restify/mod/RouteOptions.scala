package typingsJapgolly.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var contentType: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String | js.RegExp] = js.undefined
  var url: js.UndefOr[String | js.RegExp] = js.undefined
  var urlParamPattern: js.UndefOr[js.RegExp] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var versions: js.UndefOr[js.Array[String]] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(
    contentType: String | js.Array[String] = null,
    name: String = null,
    path: String | js.RegExp = null,
    url: String | js.RegExp = null,
    urlParamPattern: js.RegExp = null,
    version: String = null,
    versions: js.Array[String] = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlParamPattern != null) __obj.updateDynamic("urlParamPattern")(urlParamPattern.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
}

