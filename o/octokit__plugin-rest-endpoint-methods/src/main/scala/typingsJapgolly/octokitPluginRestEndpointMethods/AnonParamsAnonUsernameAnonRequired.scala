package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonUsernameAnonRequired extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonUsernameAnonRequired
  var url: String
}

object AnonParamsAnonUsernameAnonRequired {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonUsernameAnonRequired, url: String): AnonParamsAnonUsernameAnonRequired = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonUsernameAnonRequired]
  }
}

