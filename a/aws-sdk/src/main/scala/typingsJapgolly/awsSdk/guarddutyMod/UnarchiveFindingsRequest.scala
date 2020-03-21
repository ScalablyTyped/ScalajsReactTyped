package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnarchiveFindingsRequest extends js.Object {
  /**
    * The ID of the detector associated with the findings to unarchive.
    */
  var DetectorId: typingsJapgolly.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * IDs of the findings to unarchive.
    */
  var FindingIds: typingsJapgolly.awsSdk.guarddutyMod.FindingIds = js.native
}

object UnarchiveFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds): UnarchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnarchiveFindingsRequest]
  }
}

