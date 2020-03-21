package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIPSetRequest extends js.Object {
  /**
    * The unique ID of the detector the ipSet is associated with.
    */
  var DetectorId: typingsJapgolly.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The unique ID of the IPSet to retrieve.
    */
  var IpSetId: String = js.native
}

object GetIPSetRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, IpSetId: String): GetIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], IpSetId = IpSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIPSetRequest]
  }
}

