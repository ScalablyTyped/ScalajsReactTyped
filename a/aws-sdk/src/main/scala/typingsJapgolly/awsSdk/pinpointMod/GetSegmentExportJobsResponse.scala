package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentExportJobsResponse extends js.Object {
  var ExportJobsResponse: typingsJapgolly.awsSdk.pinpointMod.ExportJobsResponse = js.native
}

object GetSegmentExportJobsResponse {
  @scala.inline
  def apply(ExportJobsResponse: ExportJobsResponse): GetSegmentExportJobsResponse = {
    val __obj = js.Dynamic.literal(ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSegmentExportJobsResponse]
  }
}

