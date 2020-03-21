package typingsJapgolly.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateKeyDescriptionRequest extends js.Object {
  /**
    * New description for the CMK.
    */
  var Description: DescriptionType = js.native
  /**
    * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
}

object UpdateKeyDescriptionRequest {
  @scala.inline
  def apply(Description: DescriptionType, KeyId: KeyIdType): UpdateKeyDescriptionRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateKeyDescriptionRequest]
  }
}

