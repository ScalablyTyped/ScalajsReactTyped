package typingsJapgolly.k6.httpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinedParams[RT /* <: js.UndefOr[ResponseType] */] extends Params {
  @JSName("responseType")
  var responseType_RefinedParams: js.UndefOr[RT] = js.undefined
}

object RefinedParams {
  @scala.inline
  def apply[RT /* <: js.UndefOr[ResponseType] */](
    auth: AuthMethod = null,
    compression: String = null,
    cookies: StringDictionary[ParamsCookieValue] = null,
    headers: StringDictionary[String] = null,
    jar: CookieJar_ = null,
    redirects: Int | Double = null,
    responseType: RT = null,
    tags: StringDictionary[String] = null,
    timeout: Int | Double = null
  ): RefinedParams[RT] = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (jar != null) __obj.updateDynamic("jar")(jar.asInstanceOf[js.Any])
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinedParams[RT]]
  }
}

