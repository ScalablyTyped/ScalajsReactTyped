package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentVersionResponse extends js.Object {
  var SegmentResponse: typingsJapgolly.awsSdk.pinpointMod.SegmentResponse = js.native
}

object GetSegmentVersionResponse {
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): GetSegmentVersionResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSegmentVersionResponse]
  }
}

