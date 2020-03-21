package typingsJapgolly.awsSdkClientS3Node.typesRuleMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typingsJapgolly.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
import typingsJapgolly.awsSdkClientS3Node.typesLifecycleExpirationMod.LifecycleExpiration
import typingsJapgolly.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
import typingsJapgolly.awsSdkClientS3Node.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
import typingsJapgolly.awsSdkClientS3Node.typesTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[
    typingsJapgolly.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
  ] = js.undefined
  /**
    * _LifecycleExpiration shape
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.undefined
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionExpiration: js.UndefOr[
    typingsJapgolly.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
  ] = js.undefined
  /**
    * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionTransition: js.UndefOr[
    typingsJapgolly.awsSdkClientS3Node.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
  ] = js.undefined
  /**
    * <p>Prefix identifying one or more objects to which the rule applies.</p>
    */
  var Prefix: String
  /**
    * <p>If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.</p>
    */
  var Status: Enabled | Disabled | String
  /**
    * _Transition shape
    */
  var Transition: js.UndefOr[typingsJapgolly.awsSdkClientS3Node.typesTransitionMod.Transition] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    Prefix: String,
    Status: Enabled | Disabled | String,
    AbortIncompleteMultipartUpload: AbortIncompleteMultipartUpload = null,
    Expiration: LifecycleExpiration = null,
    ID: String = null,
    NoncurrentVersionExpiration: NoncurrentVersionExpiration = null,
    NoncurrentVersionTransition: NoncurrentVersionTransition = null,
    Transition: Transition = null
  ): Rule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (AbortIncompleteMultipartUpload != null) __obj.updateDynamic("AbortIncompleteMultipartUpload")(AbortIncompleteMultipartUpload.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (NoncurrentVersionExpiration != null) __obj.updateDynamic("NoncurrentVersionExpiration")(NoncurrentVersionExpiration.asInstanceOf[js.Any])
    if (NoncurrentVersionTransition != null) __obj.updateDynamic("NoncurrentVersionTransition")(NoncurrentVersionTransition.asInstanceOf[js.Any])
    if (Transition != null) __obj.updateDynamic("Transition")(Transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

