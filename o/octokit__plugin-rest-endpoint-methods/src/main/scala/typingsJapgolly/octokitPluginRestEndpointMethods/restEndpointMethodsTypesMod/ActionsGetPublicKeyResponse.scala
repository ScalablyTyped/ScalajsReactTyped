package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetPublicKeyResponse extends js.Object {
  var key: String
  var key_id: String
}

object ActionsGetPublicKeyResponse {
  @scala.inline
  def apply(key: String, key_id: String): ActionsGetPublicKeyResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsGetPublicKeyResponse]
  }
}

