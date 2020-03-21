package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFacesResponse extends js.Object {
  /**
    * An array of faces that matched the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.native
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  /**
    * ID of the face that was searched for matches in a collection.
    */
  var SearchedFaceId: js.UndefOr[FaceId] = js.native
}

object SearchFacesResponse {
  @scala.inline
  def apply(FaceMatches: FaceMatchList = null, FaceModelVersion: String = null, SearchedFaceId: FaceId = null): SearchFacesResponse = {
    val __obj = js.Dynamic.literal()
    if (FaceMatches != null) __obj.updateDynamic("FaceMatches")(FaceMatches.asInstanceOf[js.Any])
    if (FaceModelVersion != null) __obj.updateDynamic("FaceModelVersion")(FaceModelVersion.asInstanceOf[js.Any])
    if (SearchedFaceId != null) __obj.updateDynamic("SearchedFaceId")(SearchedFaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFacesResponse]
  }
}

