package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeprecated extends js.Object {
  var deprecated: String
  var method: String
  var params: AnonAccesstoken
  var url: String
}

object AnonDeprecated {
  @scala.inline
  def apply(deprecated: String, method: String, params: AnonAccesstoken, url: String): AnonDeprecated = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeprecated]
  }
}

