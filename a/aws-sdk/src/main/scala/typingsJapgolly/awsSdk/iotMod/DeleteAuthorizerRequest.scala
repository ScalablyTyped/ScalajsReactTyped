package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAuthorizerRequest extends js.Object {
  /**
    * The name of the authorizer to delete.
    */
  var authorizerName: AuthorizerName = js.native
}

object DeleteAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): DeleteAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAuthorizerRequest]
  }
}

