package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSampleFindingsRequest extends js.Object {
  /**
    * The ID of the detector to create sample findings for.
    */
  var DetectorId: typingsJapgolly.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * Types of sample findings to generate.
    */
  var FindingTypes: js.UndefOr[typingsJapgolly.awsSdk.guarddutyMod.FindingTypes] = js.native
}

object CreateSampleFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingTypes: FindingTypes = null): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    if (FindingTypes != null) __obj.updateDynamic("FindingTypes")(FindingTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
}

