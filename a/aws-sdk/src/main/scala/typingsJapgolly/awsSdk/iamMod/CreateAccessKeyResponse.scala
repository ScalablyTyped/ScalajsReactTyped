package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessKeyResponse extends js.Object {
  /**
    * A structure with details about the access key.
    */
  var AccessKey: typingsJapgolly.awsSdk.iamMod.AccessKey = js.native
}

object CreateAccessKeyResponse {
  @scala.inline
  def apply(AccessKey: AccessKey): CreateAccessKeyResponse = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAccessKeyResponse]
  }
}

