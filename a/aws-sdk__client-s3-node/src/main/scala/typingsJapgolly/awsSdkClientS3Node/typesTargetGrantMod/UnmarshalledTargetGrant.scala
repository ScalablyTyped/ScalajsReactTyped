package typingsJapgolly.awsSdkClientS3Node.typesTargetGrantMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.FULL_CONTROL
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE
import typingsJapgolly.awsSdkClientS3Node.typesGranteeMod.UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTargetGrant extends TargetGrant {
  /**
    * _Grantee shape
    */
  @JSName("Grantee")
  var Grantee_UnmarshalledTargetGrant: js.UndefOr[UnmarshalledGrantee] = js.undefined
}

object UnmarshalledTargetGrant {
  @scala.inline
  def apply(Grantee: UnmarshalledGrantee = null, Permission: FULL_CONTROL | READ | WRITE | String = null): UnmarshalledTargetGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTargetGrant]
  }
}

