package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorRequest extends js.Object {
  /**
    * The unique ID of the detector that you want to get.
    */
  var DetectorId: typingsJapgolly.awsSdk.guarddutyMod.DetectorId = js.native
}

object GetDetectorRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): GetDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDetectorRequest]
  }
}

