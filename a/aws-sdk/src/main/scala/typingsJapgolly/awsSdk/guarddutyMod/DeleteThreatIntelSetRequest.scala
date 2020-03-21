package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteThreatIntelSetRequest extends js.Object {
  /**
    * The unique ID of the detector the threatIntelSet is associated with.
    */
  var DetectorId: typingsJapgolly.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The unique ID of the threatIntelSet you want to delete.
    */
  var ThreatIntelSetId: String = js.native
}

object DeleteThreatIntelSetRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, ThreatIntelSetId: String): DeleteThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteThreatIntelSetRequest]
  }
}

