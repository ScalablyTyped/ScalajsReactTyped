package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonOrganizationpermission extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonOrganizationpermission
  var url: String
}

object AnonParamsAnonOrganizationpermission {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonOrganizationpermission, url: String): AnonParamsAnonOrganizationpermission = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonOrganizationpermission]
  }
}

