package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFaceDetectionResponse extends js.Object {
  /**
    * An array of faces detected in the video. Each element contains a detected face's details and the time, in milliseconds from the start of the video, the face was detected. 
    */
  var Faces: js.UndefOr[FaceDetections] = js.native
  /**
    * The current status of the face detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  /**
    * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to retrieve the next set of faces. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition video operation.
    */
  var VideoMetadata: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.VideoMetadata] = js.native
}

object GetFaceDetectionResponse {
  @scala.inline
  def apply(
    Faces: FaceDetections = null,
    JobStatus: VideoJobStatus = null,
    NextToken: PaginationToken = null,
    StatusMessage: StatusMessage = null,
    VideoMetadata: VideoMetadata = null
  ): GetFaceDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Faces != null) __obj.updateDynamic("Faces")(Faces.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (VideoMetadata != null) __obj.updateDynamic("VideoMetadata")(VideoMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFaceDetectionResponse]
  }
}

