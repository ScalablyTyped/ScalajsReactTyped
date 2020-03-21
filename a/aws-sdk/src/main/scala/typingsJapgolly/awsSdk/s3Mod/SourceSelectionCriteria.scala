package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSelectionCriteria extends js.Object {
  /**
    *  A container for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If you include SourceSelectionCriteria in the replication configuration, this element is required. 
    */
  var SseKmsEncryptedObjects: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.SseKmsEncryptedObjects] = js.native
}

object SourceSelectionCriteria {
  @scala.inline
  def apply(SseKmsEncryptedObjects: SseKmsEncryptedObjects = null): SourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (SseKmsEncryptedObjects != null) __obj.updateDynamic("SseKmsEncryptedObjects")(SseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSelectionCriteria]
  }
}

