package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonContentOwner extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonContentOwner
  var url: String
}

object AnonParamsAnonContentOwner {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonContentOwner, url: String): AnonParamsAnonContentOwner = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonContentOwner]
  }
}

