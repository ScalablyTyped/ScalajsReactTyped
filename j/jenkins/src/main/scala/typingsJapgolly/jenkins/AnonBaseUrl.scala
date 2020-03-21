package typingsJapgolly.jenkins

import typingsJapgolly.jenkins.jenkinsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var crumbIssuer: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var promisify: js.UndefOr[`false`] = js.undefined
}

object AnonBaseUrl {
  @scala.inline
  def apply(
    baseUrl: String = null,
    crumbIssuer: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    promisify: `false` = null
  ): AnonBaseUrl = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(crumbIssuer)) __obj.updateDynamic("crumbIssuer")(crumbIssuer.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (promisify != null) __obj.updateDynamic("promisify")(promisify.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseUrl]
  }
}

