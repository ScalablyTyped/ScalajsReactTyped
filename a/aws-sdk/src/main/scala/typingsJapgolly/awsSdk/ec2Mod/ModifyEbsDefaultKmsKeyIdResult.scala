package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyEbsDefaultKmsKeyIdResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the default CMK for encryption by default.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
}

object ModifyEbsDefaultKmsKeyIdResult {
  @scala.inline
  def apply(KmsKeyId: String = null): ModifyEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEbsDefaultKmsKeyIdResult]
  }
}

