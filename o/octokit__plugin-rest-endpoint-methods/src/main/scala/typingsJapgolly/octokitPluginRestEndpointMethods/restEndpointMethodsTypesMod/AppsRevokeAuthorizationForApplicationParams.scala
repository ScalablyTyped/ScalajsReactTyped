package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsRevokeAuthorizationForApplicationParams extends js.Object {
  var access_token: String
  var client_id: String
}

object AppsRevokeAuthorizationForApplicationParams {
  @scala.inline
  def apply(access_token: String, client_id: String): AppsRevokeAuthorizationForApplicationParams = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsRevokeAuthorizationForApplicationParams]
  }
}

