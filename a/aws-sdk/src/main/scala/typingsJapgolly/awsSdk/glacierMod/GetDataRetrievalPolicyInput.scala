package typingsJapgolly.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataRetrievalPolicyInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String = js.native
}

object GetDataRetrievalPolicyInput {
  @scala.inline
  def apply(accountId: String): GetDataRetrievalPolicyInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDataRetrievalPolicyInput]
  }
}

