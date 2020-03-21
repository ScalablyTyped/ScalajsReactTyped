package typingsJapgolly.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiUrl extends js.Object {
  var apiUrl: js.UndefOr[String] = js.native
  var browserUrl: js.UndefOr[String] = js.native
}

object AnonApiUrl {
  @scala.inline
  def apply(apiUrl: String = null, browserUrl: String = null): AnonApiUrl = {
    val __obj = js.Dynamic.literal()
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl.asInstanceOf[js.Any])
    if (browserUrl != null) __obj.updateDynamic("browserUrl")(browserUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiUrl]
  }
}

