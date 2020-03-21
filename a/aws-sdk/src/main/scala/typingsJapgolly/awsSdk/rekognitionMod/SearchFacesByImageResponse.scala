package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFacesByImageResponse extends js.Object {
  /**
    * An array of faces that match the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.native
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  /**
    * The bounding box around the face in the input image that Amazon Rekognition used for the search.
    */
  var SearchedFaceBoundingBox: js.UndefOr[BoundingBox] = js.native
  /**
    * The level of confidence that the searchedFaceBoundingBox, contains a face.
    */
  var SearchedFaceConfidence: js.UndefOr[Percent] = js.native
}

object SearchFacesByImageResponse {
  @scala.inline
  def apply(
    FaceMatches: FaceMatchList = null,
    FaceModelVersion: String = null,
    SearchedFaceBoundingBox: BoundingBox = null,
    SearchedFaceConfidence: Int | Double = null
  ): SearchFacesByImageResponse = {
    val __obj = js.Dynamic.literal()
    if (FaceMatches != null) __obj.updateDynamic("FaceMatches")(FaceMatches.asInstanceOf[js.Any])
    if (FaceModelVersion != null) __obj.updateDynamic("FaceModelVersion")(FaceModelVersion.asInstanceOf[js.Any])
    if (SearchedFaceBoundingBox != null) __obj.updateDynamic("SearchedFaceBoundingBox")(SearchedFaceBoundingBox.asInstanceOf[js.Any])
    if (SearchedFaceConfidence != null) __obj.updateDynamic("SearchedFaceConfidence")(SearchedFaceConfidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFacesByImageResponse]
  }
}

