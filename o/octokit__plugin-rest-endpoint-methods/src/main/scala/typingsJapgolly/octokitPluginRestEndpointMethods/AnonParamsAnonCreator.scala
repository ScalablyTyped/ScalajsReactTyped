package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonCreator extends js.Object {
  var method: String
  var params: AnonCreator
  var url: String
}

object AnonParamsAnonCreator {
  @scala.inline
  def apply(method: String, params: AnonCreator, url: String): AnonParamsAnonCreator = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonCreator]
  }
}

