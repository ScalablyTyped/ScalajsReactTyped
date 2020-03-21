package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFilterRequest extends js.Object {
  /**
    * The unique ID of the detector the filter is associated with.
    */
  var DetectorId: typingsJapgolly.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The name of the filter you want to get.
    */
  var FilterName: String = js.native
}

object GetFilterRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): GetFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFilterRequest]
  }
}

