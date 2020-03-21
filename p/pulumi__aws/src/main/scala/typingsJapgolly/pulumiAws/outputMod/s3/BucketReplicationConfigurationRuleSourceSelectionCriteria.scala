package typingsJapgolly.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRuleSourceSelectionCriteria extends js.Object {
  /**
    * Match SSE-KMS encrypted objects (documented below). If specified, `replicaKmsKeyId`
    * in `destination` must be specified as well.
    */
  var sseKmsEncryptedObjects: js.UndefOr[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects] = js.native
}

object BucketReplicationConfigurationRuleSourceSelectionCriteria {
  @scala.inline
  def apply(
    sseKmsEncryptedObjects: BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = null
  ): BucketReplicationConfigurationRuleSourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (sseKmsEncryptedObjects != null) __obj.updateDynamic("sseKmsEncryptedObjects")(sseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteria]
  }
}

