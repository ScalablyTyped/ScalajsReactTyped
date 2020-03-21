package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInstanceProfileRequest extends js.Object {
  /**
    * The name of the instance profile to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType = js.native
}

object DeleteInstanceProfileRequest {
  @scala.inline
  def apply(InstanceProfileName: instanceProfileNameType): DeleteInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteInstanceProfileRequest]
  }
}

