package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateIamInstanceProfileRequest extends js.Object {
  /**
    * The ID of the IAM instance profile association.
    */
  var AssociationId: String = js.native
}

object DisassociateIamInstanceProfileRequest {
  @scala.inline
  def apply(AssociationId: String): DisassociateIamInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateIamInstanceProfileRequest]
  }
}

