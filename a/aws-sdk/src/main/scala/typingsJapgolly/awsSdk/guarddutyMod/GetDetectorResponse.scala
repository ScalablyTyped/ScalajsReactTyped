package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorResponse extends js.Object {
  /**
    * Detector creation timestamp.
    */
  var CreatedAt: js.UndefOr[String] = js.native
  /**
    * Finding publishing frequency.
    */
  var FindingPublishingFrequency: js.UndefOr[typingsJapgolly.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.native
  /**
    * The GuardDuty service role.
    */
  var ServiceRole: String = js.native
  /**
    * The detector status.
    */
  var Status: DetectorStatus = js.native
  /**
    * The tags of the detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * Detector last update timestamp.
    */
  var UpdatedAt: js.UndefOr[String] = js.native
}

object GetDetectorResponse {
  @scala.inline
  def apply(
    ServiceRole: String,
    Status: DetectorStatus,
    CreatedAt: String = null,
    FindingPublishingFrequency: FindingPublishingFrequency = null,
    Tags: TagMap = null,
    UpdatedAt: String = null
  ): GetDetectorResponse = {
    val __obj = js.Dynamic.literal(ServiceRole = ServiceRole.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (FindingPublishingFrequency != null) __obj.updateDynamic("FindingPublishingFrequency")(FindingPublishingFrequency.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorResponse]
  }
}

